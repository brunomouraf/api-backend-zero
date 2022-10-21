package com.example.zero.request;


import com.example.zero.model.Client;

public class RegistrationRequest {

    String name;
    String lastName;
    String phoneNumber;
    String birthDate;
    String email;
    String cpf;
    String password;

    private RegistrationRequest() {
    }

    public RegistrationRequest(String name, String lastName, String phoneNumber, String birthDate, String email, String cpf, String password) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.email = email;
        this.cpf = cpf;
        this.password = password;
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

    public Client saveRquestObject(){
        Client client = new Client();
        client.setName(this.name);
        client.setLastName(this.lastName);
        client.setPhoneNumber(this.phoneNumber);
        client.setBirthDate(this.birthDate);
        client.setEmail(this.email);
        client.setCpf(this.cpf);
        client.setPassword(this.password);

        System.out.println(client.getCpf());

        return client;
    }
}
