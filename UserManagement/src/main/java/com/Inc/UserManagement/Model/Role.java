package com.Inc.UserManagement.Model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="roles")
public class Role implements Serializable {

    private Permission permission;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "Role_id")
    private int roleId;

    @Column(name = "Role_Name")
    private String roleName;

    @Column(name = "Description")
    private String description;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "permission_id", referencedColumnName = "permission_id")
    private Set<Permission> permiss;


    public Role(){
    }

    public Role(Permission permission, int roleId, String roleName, String description, Set<Permission> permiss) {
        this.permission = permission;
        this.roleId = roleId;
        this.roleName = roleName;
        this.description = description;
        this.permiss = permiss;
    }

    public Role(String roleName, int roleId, String description) {
        this.roleName = roleName;
        this.roleId = roleId;
        this.description = description;
    }


    /**
     * get field
     *
     * @return roleId
     */
    public int getRoleId() {
        return this.roleId;
    }

    /**
     * set field
     *
     * @param roleId
     */
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    /**
     * get field
     *
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * set field
     *
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * get field
     *
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * set field
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get field

     */
    public Set<Permission> getPermiss() {
        return this.permiss;
    }

    /**
     * set field

     */
    public void setPermiss(Set<Permission> permiss) {
        this.permiss = permiss;
    }
}

