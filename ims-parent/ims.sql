drop database if exists ims;
create database ims character set utf8;
use ims;


drop table if exists t_check;

drop table if exists t_check_statistics;

drop table if exists t_dept;

drop table if exists t_emp;

drop table if exists t_permission;

drop table if exists t_position;

drop table if exists t_replay;

drop table if exists t_role;

drop table if exists t_permission_role;

drop table if exists t_salary;

drop table if exists t_suggestion;



create table t_check 
(
   id int primary key auto_increment,
   check_in  datetime,                     
   check_out  datetime,
   emp_id int
)CHARSET=UTF8;

create table t_check_statistics 
(
   id                   int primary key auto_increment,
   statistics_year      int,
   statistics_month     int,
   late_count           int,
   leaveearly_count     int,
   absenteeism_count    int,
   absenteeismhalf_count int,
   emp_id               int
)CHARSET=UTF8;

create table t_dept 
(
   id                   int primary key auto_increment,
   name                 varchar(32),
   description          text,
   status               int
)CHARSET=UTF8;

create table t_emp 
(
   id                   int primary key auto_increment,
   name                 varchar(32),
   work_number          varchar(32),
   password             varchar(32),
   birthday             date,
   startday             date,
   gender               boolean,
   marital_status       int,
   phone                varchar(32),
   email                varchar(32),
   birthplace_province  int,
   birthplace_city      int,
   political_outlook    int,
   dept_id              int,
   position_id          int,
   role_id              int,
   status				int
   
)CHARSET=UTF8;

create table t_permission 
(
   id                   int primary key auto_increment,
   name                 varchar(32),
   description          text,
   uri                  text
)CHARSET=UTF8;

create table t_replay 
(
   id                   int primary key auto_increment,
   replay_time          datetime,
   replay_empid         int,
   content              text,
   suggestion_id        int
)CHARSET=UTF8;

create table t_role 
(
   id                   int primary key auto_increment,
   name                 varchar(32),
   description          text
)CHARSET=UTF8;

create table t_permission_role 
(
   role_id              int,
   permission_id        int
)CHARSET=UTF8;

create table t_salary 
(
   id                   int primary key auto_increment,
   salary_year          int,
   salary_month         int,
   base_salary          double,
   insurance            double,
   accumulation_fund    double,
   tax                  double,
   achievements         double,
   really_salary        double,
   emp_id               int
)CHARSET=UTF8;

create table t_suggestion 
(
   id                   int primary key auto_increment,
   title                varchar(32),
   send_time            datetime,
   content              text,
   emp_id               int
)CHARSET=UTF8;

create table t_position 
(
   id                   int primary key auto_increment,
   name                	varchar(32),
   description          text,
   base_salary			double,
   status               int,
   dept_id				int
)CHARSET=UTF8;

