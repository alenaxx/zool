package com.example.zool.dto;

import java.util.ArrayList;
import java.util.UUID;

public class OrderDto {

    private UUID id;

    private Integer totalAmount;

    private OrderStatus orderStatus;

    private String totalCost;

    private ArrayList<OrderItemDto> items;


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

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setItems(ArrayList<OrderItemDto> items) {
        this.items = items;
    }

    public ArrayList<OrderItemDto> getItems() {
        return items;
    }
}
