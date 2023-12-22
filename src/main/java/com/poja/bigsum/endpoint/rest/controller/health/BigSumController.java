package com.poja.bigsum.endpoint.rest.controller.health;

import java.math.BigInteger;

import com.poja.bigsum.service.event.BigSumService;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BigSumController {
    private final BigSumService service;

    @GetMapping("/big-sum")
    public BigInteger sum(@RequestParam("a") String a, @RequestParam("b") String b) {
        return service.sum(a, b);
    }
}
