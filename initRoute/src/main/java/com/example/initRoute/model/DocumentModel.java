package com.example.initRoute.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;


@Document
public class DocumentModel {

    @Id
    private UUID document_id;
    private String client_id;
    private String client_secret;
    private Date created_on;
    private Date expiry_on;
    private String state_code;
    private String state_name;
    private String dept_code;
    private String dept_name;
    private String govt;
    private String nodal_officer_name;
    private String nodal_officer_mobile;
    private String nodal_officer_email;
    private String nodal_officer_designation;

    public UUID getDocument_id() {
        return document_id;
    }

    public void setDocument_id(UUID document_id) {
        this.document_id = document_id;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    public Date getExpiry_on() {
        return expiry_on;
    }

    public void setExpiry_on(Date expiry_on) {
        this.expiry_on = expiry_on;
    }

    public String getState_code() {
        return state_code;
    }

    public void setState_code(String state_code) {
        this.state_code = state_code;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getGovt() {
        return govt;
    }

    public void setGovt(String govt) {
        this.govt = govt;
    }

    public String getNodal_officer_name() {
        return nodal_officer_name;
    }

    public void setNodal_officer_name(String nodal_officer_name) {
        this.nodal_officer_name = nodal_officer_name;
    }

    public String getNodal_officer_mobile() {
        return nodal_officer_mobile;
    }

    public void setNodal_officer_mobile(String nodal_officer_mobile) {
        this.nodal_officer_mobile = nodal_officer_mobile;
    }

    public String getNodal_officer_email() {
        return nodal_officer_email;
    }

    public void setNodal_officer_email(String nodal_officer_email) {
        this.nodal_officer_email = nodal_officer_email;
    }

    public String getNodal_officer_designation() {
        return nodal_officer_designation;
    }

    public void setNodal_officer_designation(String nodal_officer_designation) {
        this.nodal_officer_designation = nodal_officer_designation;
    }

    public DocumentModel getBody() {

        return null;
    }
}
