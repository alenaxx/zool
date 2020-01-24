package com.example.zool.api;


import com.example.zool.dto.AggregateOrderDto;
import com.example.zool.service.ApiGatewayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api")
public class ApiGateway {
    private final ApiGatewayService apiGatewayService;

    public ApiGateway(ApiGatewayService apiGatewayService) {
        this.apiGatewayService = apiGatewayService;
    }
}

/*
    @GetMapping(path = "/orders/{id}")
    public AggregateOrderDto getAggregatedOrder(@PathVariable UUID id) {
        return apiGatewayService.getAggregatedOrder(id);
    }
}*/
