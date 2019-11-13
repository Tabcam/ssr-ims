
package org.ssr.ims.entity;

import java.util.Date;

public class Suggestion {
	
	/*意见表*/
	private Integer id;		//主键
	private String title;	//标题
	private Date sendTime;	//发送时间
	private String content;	//内容
	private Integer empId;	//员工id
	
	public Suggestion() {
		super();
	}

	public Suggestion(Integer id, String title, Date sendTime, String content, Integer empId) {
		super();
		this.id = id;
		this.title = title;
		this.sendTime = sendTime;
		this.content = content;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Suggestion [id=" + id + ", title=" + title + ", sendTime=" + sendTime + ", content=" + content
				+ ", empId=" + empId + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	

}
