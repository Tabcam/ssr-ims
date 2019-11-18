

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

create table t_check_record 
(
   id                   int not null  auto_increment,
   check_date			date,
   check_in 			time,
   check_out  		    time,
   emp_name				varchar(32),
   emp_id 				int,
   primary key (id)
)CHARSET=utf8;
insert into t_check_record values (1,'2019-10-17','11:0:0','13:0:0','张三',1);
insert into t_check_record values (2,'2019-10-18','10:0:0','14:0:0','张三',1);
insert into t_check_record values (3,'2019-10-19','08:0:0','18:0:0','张三',1);
insert into t_check_record values (4,'2019-10-20','08:0:0','14:0:0','张三',1);
insert into t_check_record values (5,'2019-10-21','08:0:0','14:0:0','张三',1);
insert into t_check_record values (6,'2019-10-22','08:0:0',null,'张三',1);
insert into t_check_record values (7,'2019-10-23',null,'23:0:0','张三',1);
insert into t_check_record values (8,'2019-10-16','08:0:0',null,'李',2);

insert into t_check_record values (9,'2019-9-17','08:0:0','23:0:0','张三',1);
insert into t_check_record values (10,'2019-9-17','11:0:0','13:0:0','张三',1);
insert into t_check_record values (11,'2019-9-18','10:0:0','14:0:0','张三',1);
insert into t_check_record values (12,'2019-9-19','08:0:0','18:0:0','张三',1);
insert into t_check_record values (13,'2019-9-20','08:0:0','14:0:0','张三',1);
insert into t_check_record values (14,'2019-9-21','08:0:0','14:0:0','张三',1);
insert into t_check_record values (15,'2019-9-22','08:0:0',null,'张三',1);
insert into t_check_record values (16,'2019-9-23',null,'23:0:0','张三',1);



create table t_check_statistics 
(
   id                   int not null  auto_increment,
   statistics_year      int,
   statistics_month     int,
   late_count           int,
   leaveearly_count     int,
   absenteeism_count    int,
   absenteeismhalf_count int,
   emp_name				varchar(32),
   emp_id               int,
   primary key (id)
)CHARSET=utf8;

create table t_dept 
(
   id                   int   not null auto_increment,
   name                 varchar(64),
   description          text,
   status               int,
   primary key (id)
)CHARSET=utf8;

insert into t_dept values (1,'人力资源部','负责各部门的协调以及人员调动',1);
insert into t_dept values (2,'java开发部','负责各部门的协调以及人员调动',1);
insert into t_dept values (3,'js开发部','负责各部门的协调以及人员调动',1);
insert into t_dept values (4,'运营部','负责各部门的协调以及人员调动',1);
insert into t_dept values (5,'销售部','负责各部门的协调以及人员调动',1);

commit;

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
  id                   int   not null auto_increment,
 name                 varchar(64),
 description          text,
 base_salary          double,
 statusasd            int,
 dept_id              int,
 status                int,

   primary key (id)
)CHARSET=utf8;
insert into t_position values (1,'java初级工程师','java开发',6000.0,1,2,1);
insert into t_position values (2,'java中级工程师','java开发','8000',1,2,1);
insert into t_position values (3,'java高级工程师','java开发','10000',1,2,1);
insert into t_position values (4,'java实习生','java开发','3000','2',2,1);
insert into t_position values (5,'Java项目经理','java总开发','13000',1,2,1);
insert into t_position values (6,'js初级工程师','js开发','6000',1,3,1);
insert into t_position values (7,'js中级工程师','js开发','8000',1,3,1); 
insert into t_position values (8,'js高级工程师','js开发','10000',1,3,1);
insert into t_position values (9,'js实习生','js开发','3000','1',3,1);
insert into t_position values (10,'js项目经理','js总开发','13000',1,3,1);
insert into t_position values (11,'市场运维组长','市场运维','10000',1,4,1);
insert into t_position values (12,'市场运维组员','市场运维','6000',1,4,1);
insert into t_position values (13,'市场部经理','市场总的运维','1000',1,4,1);
insert into t_position values (14,'java运维组长','java运维','10000',1,4,1);
insert into t_position values (15,'java运维组员','java运维','6000',1,4,1);
insert into t_position values (16,'js运维组长','js运维','10000',1,4,1);
insert into t_position values (17,'js运维组员','js运维','6000',1,4,1);
insert into t_position values (18,'js运维实习生','js运维','3000',1,4,1);
insert into t_position values (19,'销售小组长','产品销售','10000',1,5,1);
insert into t_position values (20,'销售组员','产品销售','6000',1,5,1);
insert into t_position values (21,'销售经理','产品销售','16000',1,5,1);
insert into t_position values (22,'人力经理','人员调动','16000',1,1,1);
insert into t_position values (23,'人力小组长','人员调动','10000',1,1,1);
insert into t_position values (24,'人力组员','人员调动','6000',1,1,1);
insert into t_position values (25,'人力实习生','整理资料','3000',1,1,1);

commit;
