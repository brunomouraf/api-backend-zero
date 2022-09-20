package com.example.apibancozero.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "lastName")
    String lastName;
    @Column(name = "phoneNumber")
    int phoneNumber;
    @Column(name = "birthDate")
    String birthDate;
    @Column(name = "email")
    String email;
    @Column(name = "cpf")
    int cpf;
    @Column(name = "password")
    int password;
    @Column(name = "imagePerfil")
    String imagePerfil;
    @Column(name = "pix")
    String pix;

    public Client() {
    }

    public Client(int id, String name, String lastName, int phoneNumber, String birthDate, String email, int cpf, int password, String imagePerfil, String pix) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.email = email;
        this.cpf = cpf;
        this.password = password;
        this.imagePerfil = imagePerfil;
        this.pix = pix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getImagePerfil() {
        return imagePerfil;
    }

    public void setImagePerfil(String imagePerfil) {
        this.imagePerfil = imagePerfil;
    }

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }
}
