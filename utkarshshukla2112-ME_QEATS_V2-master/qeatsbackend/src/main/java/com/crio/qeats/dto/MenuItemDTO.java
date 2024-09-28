package com.crio.qeats.dto;

import java.util.List;

public class MenuItemDTO {
    private String id;
    private String name;
    private List<String> attributes;
    private int price;
    private String imageUrl;
    private String itemId;
    private String restaurantId;

    // Constructors, getters, and setters
    // Constructor
    public MenuItemDTO(String id, String name, List<String> attributes, int price, String imageUrl, String itemId, String restaurantId) {
        this.id = id;
        this.name = name;
        this.attributes = attributes;
        this.price = price;
        this.imageUrl = imageUrl;
        this.itemId = itemId;
        this.restaurantId = restaurantId;
    }

    // Default constructor for serialization
    public MenuItemDTO() {
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    // toString() method for debugging/logging
    @Override
    public String toString() {
        return "MenuItemDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", attributes=" + attributes +
                ", price=" + price +
                ", imageUrl='" + imageUrl + '\'' +
                ", itemId='" + itemId + '\'' +
                ", restaurantId='" + restaurantId + '\'' +
                '}';
    }
}
