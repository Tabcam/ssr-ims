package org.ssr.ims.entity;

public class PermissionRole {

	private Integer roleId;
	private Integer permissionId;

	public PermissionRole() {
		super();
	}

	public PermissionRole(Integer roleId, Integer permissionId) {
		super();
		this.roleId = roleId;
		this.permissionId = permissionId;
	}

	@Override
	public String toString() {
		return "PermissionRole [roleId=" + roleId + ", permissionId=" + permissionId + "]";
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}

}