package org.ssr.ims.entity;

public class permission {

	private Integer id;
	private String name;
	private String description;
	private String uri;

	public permission() {
		super();
	}

	public permission(Integer id, String name, String description, String uri) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.uri = uri;
	}

	@Override
	public String toString() {
		return "permission [id=" + id + ", name=" + name + ", description=" + description + ", uri=" + uri + "]";
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

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}