package com.example.zool.service;

import com.example.zool.dto.*;
import com.example.zool.feignClients.OrderServiceFeignClient;
import com.example.zool.feignClients.WarehouseServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ApiGatewayService {

    @Autowired
    private WarehouseServiceFeignClient warehouseServiceFeignClient;

    @Autowired
    private OrderServiceFeignClient orderServiceFeignClient;

    @Autowired
    public ApiGatewayService() {}

    public AggregateOrderDto getAggregatedOrder(UUID id) {
        ResponseEntity<OrderDto> orderDtoResponseEntity = orderServiceFeignClient.getOrderItems(id);
        OrderDto orderDto = orderDtoResponseEntity.getBody();

        List<AggregateOrderItemDto> items = new ArrayList<>();
        for (OrderItemDto orderItemDto : orderDto.getItems()) {
            Item itemDto = warehouseServiceFeignClient.getItemById(orderItemDto.getItemId());
            items.add(new AggregateOrderItemDto(itemDto, orderItemDto));
        }
        return new AggregateOrderDto(orderDto, items);
    }
}
