package com.Inc.UserManagement.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="permissions")
public class Permission implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "permission_id")
    private int permisId;

    @Column(name = "permission_name")
    private String permisName;

    @Column(name = "Description")
    private String description;

    @Column(name = "Feature_Id")
    private int featureId;

    public Permission() {}

    public Permission(int permisId, String permisName, String description, int featureId) {
        this.permisId = permisId;
        this.permisName = permisName;
        this.description = description;
        this.featureId = featureId;
    }


    /**
     * get field
     *
     * @return permisId
     */
    public int getPermisId() {
        return this.permisId;
    }

    /**
     * set field
     *
     * @param permisId
     */
    public void setPermisId(int permisId) {
        this.permisId = permisId;
    }

    /**
     * get field
     *
     * @return permisName
     */
    public String getPermisName() {
        return this.permisName;
    }

    /**
     * set field
     *
     * @param permisName
     */
    public void setPermisName(String permisName) {
        this.permisName = permisName;
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
}
