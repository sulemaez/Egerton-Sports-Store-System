package com.Sports.models;

import com.Sports.repositories.ItemRepository;
import org.json.JSONObject;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BorrowedItem {
    private int borrowedItemId;
    private int itemId;
    private LocalDate borrowedDate;
    private int quantity;
    private String borrowerId;
    private Item item;

    public BorrowedItem(int itemId, LocalDate date,int borrowedItemId,int quantity,String borrowerId) {
        this.itemId = itemId;
        this.borrowedDate = date;
        this.borrowedItemId = borrowedItemId;
        this.quantity = quantity;
        this.borrowerId = borrowerId;
        item = new ItemRepository().getById(itemId).get();
    }

    public BorrowedItem(JSONObject issueItemJSON) {
        this.itemId = issueItemJSON.getInt("itemId");
        this.borrowedDate = LocalDate.parse(issueItemJSON.getString("borrowedDate"));
        this.borrowedItemId = issueItemJSON.getInt("borrowedItemId");
        this.quantity = issueItemJSON.getInt("quantity");
        this.item = new ItemRepository().getById(itemId).get();
        this.borrowerId =  issueItemJSON.getString("borrowerId");
    }

    public int getItemId() {
        return itemId;
    }

    public Item getItem() {
        return item;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getBorrowedItemId() {
        return borrowedItemId;
    }

    public void setBorrowedItemId(int borrowedItemId) {
        this.borrowedItemId = borrowedItemId;
    }

    public LocalDate getDate() {
        return borrowedDate;
    }

    public void setDate(LocalDate date) {
        this.borrowedDate = date;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    @Override
    public String toString() {
        JSONObject brit = new JSONObject();
        brit.put("borrowedItemId",this.borrowedItemId);
        brit.put("itemId",this.itemId);
        brit.put("borrowedDate",this.borrowedDate);
        brit.put("quantity",this.quantity);
        brit.put("borrowerId",this.borrowerId);
        brit.put("itemName",this.item.getName());
        return brit.toString();
    }
}
