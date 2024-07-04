package com.Inc.UserManagement.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "organizations")
public class Organization implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "organization_id")
  private int orgId;

    @Column(name = "Organization_Name")
    private String orgName;

    @Column(name = "Address1")
    private String orgAddres1;

    @Column(name = "Address2")
    private String orgAddres2;

    @Column(name = "Country")
    private String country;

    @Column(name = "City")
    private String city;

    public Organization() {}

    public Organization(String country, String city, String orgAddres1, String orgAddres2, int orgId, String orgName) {
        this.country = country;
        this.city = city;
        this.orgAddres1 = orgAddres1;
        this.orgAddres2 = orgAddres2;
        this.orgId = orgId;
        this.orgName = orgName;
    }


    /**
     * get field
     *
     * @return orgName
     */
    public String getOrgName() {
        return this.orgName;
    }

    /**
     * set field
     *
     * @param orgName
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * get field
     *
     * @return orgAddres1
     */
    public String getOrgAddres1() {
        return this.orgAddres1;
    }

    /**
     * set field
     *
     * @param orgAddres1
     */
    public void setOrgAddres1(String orgAddres1) {
        this.orgAddres1 = orgAddres1;
    }

    /**
     * get field
     *
     * @return orgAddres2
     */
    public String getOrgAddres2() {
        return this.orgAddres2;
    }

    /**
     * set field
     *
     * @param orgAddres2
     */
    public void setOrgAddres2(String orgAddres2) {
        this.orgAddres2 = orgAddres2;
    }

    /**
     * get field
     *
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * set field
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * get field
     *
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * set field
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }
}
