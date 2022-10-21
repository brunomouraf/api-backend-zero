package com.example.zero.model;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "last_name")
    String lastName;
    @Column(name = "phone_number")
    String phoneNumber;
    @Column(name = "birth_date")
    String birthDate;
    @Column(name = "email")
    String email;
    @Column(name = "cpf")
    String cpf;
    @Column(name = "password")
    String password;
    @Column(name = "image_perfil")
    String imagePerfil;
    @Column(name = "pix")
    String pix;

    public Client() {
    }

    public Client(Client client) {
        this.id = client.id;
        this.name = client.name;
        this.lastName = client.lastName;
        this.phoneNumber = client.phoneNumber;
        this.birthDate = client.birthDate;
        this.email = client.email;
        this.cpf = client.cpf;
        this.password = client.password;
        this.imagePerfil = client.imagePerfil;
        this.pix = client.pix;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
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
