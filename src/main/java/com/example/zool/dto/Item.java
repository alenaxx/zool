package com.example.zool.dto;


import java.util.UUID;

public class Item {
    private UUID id;
    private  String name;
    private  float price;
    private int actualAmount;
    private int availableAmount;


    public Item(UUID id, String name, float price, int actualAmount, int availableAmount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.actualAmount = actualAmount;
        this.availableAmount = availableAmount;
    }

    public Item(UUID id) {

        this.id = id;
    }

    public static Item fromItem(Item item) {
        Item itemDto = new Item(item.id);
        itemDto.setId(item.getId());
        itemDto.setName(item.getName());
        itemDto.setPrice(item.getPrice());
        itemDto.setActualAmount(item.getActualAmount());
        itemDto.setAvailableAmount(item.getAvailableAmount());
        return itemDto;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(int actualAmount) {
        this.actualAmount = actualAmount;
    }

    public int getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(int availableAmount) {
        this.availableAmount = availableAmount;
    }
}
