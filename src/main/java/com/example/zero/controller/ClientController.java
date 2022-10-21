package com.example.zero.controller;

import com.example.zero.model.Client;
import com.example.zero.request.RegistrationRequest;
import com.example.zero.service.ClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/zero")
@Api(value = "Client")
@RestController
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @ApiOperation(value = "Register client")
    @PostMapping("/registration")
    public ResponseEntity<Client> registrationClient(@Valid RegistrationRequest registrationRequest){
        System.out.println(registrationRequest.getName());
        Client client = clientService.registration(registrationRequest);
        System.out.println(client.getLastName());
        return new ResponseEntity<>(client, HttpStatus.CREATED);
    }

}
