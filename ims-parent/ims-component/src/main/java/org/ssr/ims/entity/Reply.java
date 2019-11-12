
package org.ssr.ims.entity;

import java.util.Date;

public class Reply {
	private Integer id;
	private String title;
	private Date sendTime;
	private String content;
	private Integer empId;
	
	public Reply() {
		super();
	}

	public Reply(Integer id, String title, Date sendTime, String content, Integer empId) {
		super();
		this.id = id;
		this.title = title;
		this.sendTime = sendTime;
		this.content = content;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Reply [id=" + id + ", title=" + title + ", sendTime=" + sendTime + ", content=" + content + ", empId="
				+ empId + "]";
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
