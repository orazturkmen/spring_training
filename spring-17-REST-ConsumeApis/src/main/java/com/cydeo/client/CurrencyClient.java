package com.cydeo.client;

import com.cydeo.dto.Currency;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "https://cdn.jsdelivr.net/npm/@fawazahmed0/currency-api@latest/v1/currencies", name = "CURRENCY-CLIENT")
public interface CurrencyClient {

    @GetMapping("/usd.json")
    Currency getCurrency();
}
