
package org.ssr.ims.entity;

import java.util.Date;

public class Reply {
	
	//意见回复表
	private Integer id;				//主键
	private Date replyTime;			//回复时间
	private Integer replyEmpid;		//回复员工的id
	private String content;			//回复的内容
	private Integer suggestionId;	//意见id
	
	public Reply() {
		super();
	}

	public Reply(Integer id, Date replyTime, Integer replyEmpid, String content, Integer suggestionId) {
		super();
		this.id = id;
		this.replyTime = replyTime;
		this.replyEmpid = replyEmpid;
		this.content = content;
		this.suggestionId = suggestionId;
	}

	@Override
	public String toString() {
		return "Reply [id=" + id + ", replyTime=" + replyTime + ", replyEmpid=" + replyEmpid + ", content=" + content
				+ ", suggestionId=" + suggestionId + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	public Integer getReplyEmpid() {
		return replyEmpid;
	}

	public void setReplyEmpid(Integer replyEmpid) {
		this.replyEmpid = replyEmpid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getSuggestionId() {
		return suggestionId;
	}

	public void setSuggestionId(Integer suggestionId) {
		this.suggestionId = suggestionId;
	}
	
	

}
