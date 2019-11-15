package org.ssr.ims.entity;

public class Position {
	
	private Integer id;
	private String name;
	private String description;
	private Double baseSalary;
	private Integer statusasd;
	private Integer deptId;
	private Integer status;
	public Position() {
		super();
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Integer getStatusasd() {
		return statusasd;
	}
	public void setStatusasd(Integer statusasd) {
		this.statusasd = statusasd;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Position(Integer id, String name, String description, Double baseSalary, Integer statusasd, Integer deptId,
			Integer status) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.baseSalary = baseSalary;
		this.statusasd = statusasd;
		this.deptId = deptId;
		this.status = status;
	}
	@Override
	public String toString() {
		return "position [id=" + id + ", name=" + name + ", description=" + description + ", baseSalary=" + baseSalary
				+ ", statusasd=" + statusasd + ", deptId=" + deptId + ", status=" + status + "]";
	}
	
	

	

}
