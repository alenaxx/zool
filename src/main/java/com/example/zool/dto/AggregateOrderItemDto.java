package com.example.zool.dto;

import java.util.UUID;


public class AggregateOrderItemDto {
    private UUID id;
    private String name;
    private float price;
    private int actualAmount;
    private int availableAmount;
    private int orderAmount;

    public AggregateOrderItemDto() {}

    public AggregateOrderItemDto(Item itemDto, OrderItemDto orderItemDto) {
        this.id = itemDto.getId();
        this.name = itemDto.getName();
        this.price = itemDto.getPrice();
        this.actualAmount = itemDto.getActualAmount();
        this.availableAmount = itemDto.getAvailableAmount();
        this.orderAmount = orderItemDto.getAmount();
    }
}
