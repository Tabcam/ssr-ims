
package org.ssr.ims.entity;

import java.util.Date;

public class Employee {
private Integer id;
private String name;
private String workNumber;
private String password;
private Date birthday;
private Date starday;
private Boolean gender;
private Integer maritalStatus;
private String phone;
private String email;
private Integer birthplaceProvince;
private Integer birthdayplaceCity;
private Integer politicalOutlook;
private Integer deptId;
private Integer positionId;
private Integer roleId;
private Integer status;
public Employee() {
	super();
	//TODO Auto-generated constructor stub
}
public Employee(Integer id, String name, String workNumber, String password, Date birthday, Date starday,
		Boolean gender, Integer maritalStatus, String phone, String email, Integer birthplaceProvince,
		Integer birthdayplaceCity, Integer politicalOutlook, Integer deptId, Integer positionId, Integer roleId,
		Integer status) {
	super();
	this.id = id;
	this.name = name;
	this.workNumber = workNumber;
	this.password = password;
	this.birthday = birthday;
	this.starday = starday;
	this.gender = gender;
	this.maritalStatus = maritalStatus;
	this.phone = phone;
	this.email = email;
	this.birthplaceProvince = birthplaceProvince;
	this.birthdayplaceCity = birthdayplaceCity;
	this.politicalOutlook = politicalOutlook;
	this.deptId = deptId;
	this.positionId = positionId;
	this.roleId = roleId;
	this.status = status;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", workNumber=" + workNumber + ", password=" + password
			+ ", birthday=" + birthday + ", starday=" + starday + ", gender=" + gender + ", maritalStatus="
			+ maritalStatus + ", phone=" + phone + ", email=" + email + ", birthplaceProvince=" + birthplaceProvince
			+ ", birthdayplaceCity=" + birthdayplaceCity + ", politicalOutlook=" + politicalOutlook + ", deptId="
			+ deptId + ", positionId=" + positionId + ", roleId=" + roleId + ", status=" + status + "]";
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getWorkNumber() {
	return workNumber;
}
public void setWorkNumber(String workNumber) {
	this.workNumber = workNumber;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
public Date getStarday() {
	return starday;
}
public void setStarday(Date starday) {
	this.starday = starday;
}
public Boolean getGender() {
	return gender;
}
public void setGender(Boolean gender) {
	this.gender = gender;
}
public Integer getMaritalStatus() {
	return maritalStatus;
}
public void setMaritalStatus(Integer maritalStatus) {
	this.maritalStatus = maritalStatus;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Integer getBirthplaceProvince() {
	return birthplaceProvince;
}
public void setBirthplaceProvince(Integer birthplaceProvince) {
	this.birthplaceProvince = birthplaceProvince;
}
public Integer getBirthdayplaceCity() {
	return birthdayplaceCity;
}
public void setBirthdayplaceCity(Integer birthdayplaceCity) {
	this.birthdayplaceCity = birthdayplaceCity;
}
public Integer getPoliticalOutlook() {
	return politicalOutlook;
}
public void setPoliticalOutlook(Integer politicalOutlook) {
	this.politicalOutlook = politicalOutlook;
}
public Integer getDeptId() {
	return deptId;
}
public void setDeptId(Integer deptId) {
	this.deptId = deptId;
}
public Integer getPositionId() {
	return positionId;
}
public void setPositionId(Integer positionId) {
	this.positionId = positionId;
}
public Integer getRoleId() {
	return roleId;
}
public void setRoleId(Integer roleId) {
	this.roleId = roleId;
}
public Integer getStatus() {
	return status;
}
public void setStatus(Integer status) {
	this.status = status;
}

}
