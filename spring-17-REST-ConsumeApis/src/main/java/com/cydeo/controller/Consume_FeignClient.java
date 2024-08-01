package com.cydeo.controller;

import com.cydeo.client.CurrencyClient;
import com.cydeo.client.UserClient;
import com.cydeo.dto.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Consume_FeignClient {

    private final UserClient userClient;
    private final CurrencyClient currencyClient;

    public Consume_FeignClient(UserClient userClient, CurrencyClient currencyClient) {
        this.userClient = userClient;
        this.currencyClient = currencyClient;
    }

    @GetMapping("api/v1/users")
    public ResponseEntity<ResponseWrapper> getUsers(){
        return ResponseEntity.ok(new ResponseWrapper("UserList Retrieved",userClient.getUsers()));
    }

    @GetMapping("/usd.json")
    public ResponseEntity<ResponseWrapper> getCurrencies(){

        return ResponseEntity.ok(new ResponseWrapper("Currency", currencyClient.getCurrency()));
    }
}
