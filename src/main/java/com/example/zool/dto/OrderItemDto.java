package com.example.zool.dto;

import java.util.UUID;
public class OrderItemDto {

    private final UUID itemId;
    private final int amount;

    public OrderItemDto(UUID itemId, int amount) {
        this.itemId = itemId;
        this.amount = amount;
    }


    public UUID getItemId() {
        return this.itemId;
    }

    public int getAmount() {
        return amount;
    }
}
