package com.dussanpalma.demo.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "mecanicos")
public class Mechanic  implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mecanico;
    
    private String name;
    
    @Column(name = "second_name")
    private String secondName;
    
    @Column(name = "last_name")
    private String lastName;
     
    @Column(name = "second_last_name")
    private String secondLastName;
    
    private String email;
    
    private String address;
    
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;
    
    @Column(name = "type_document")
    private String typeDocument;
    
    private int document;
    
    private int phone;
    
    private int state;
    
    private static final long serialVersionUID = 1L;


    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
 
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondlastName() {
        return secondLastName;
    }

    public void setSecondlastName(String secondlastName) {
        this.secondLastName = secondlastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getNumber() {
        return phone;
    }

    public void setNumber(int number) {
        this.phone = number;
    }

    public Long getId() {
        return id_mecanico;
    }

    public void setId(Long id) {
        this.id_mecanico = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    
}
