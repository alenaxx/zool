package com.example.zool.dto;

import java.util.List;
import java.util.UUID;

public class AggregateOrderDto {
    private UUID id;
    private Integer totalAmount;
    private OrderStatus orderStatus;
    private String totalCost;

    private List<AggregateOrderItemDto> items;

    public AggregateOrderDto() {}

    public AggregateOrderDto(OrderDto order, List<AggregateOrderItemDto> items) {
        this.id = order.getId();
        this.totalAmount = order.getTotalAmount();
        this.orderStatus = order.getOrderStatus();
        this.totalCost = order.getTotalCost();
        this.items = items;
    }

    public UUID getId() {
        return id;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public List<AggregateOrderItemDto> getItems() {
        return items;
    }
}

