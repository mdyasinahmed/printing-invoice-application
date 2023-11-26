package com.aldrin.printtoxprinter.model;


public class Item {

    private String item;
    private String qty;
    private String price;
    private static Float lineTotal;

    public Item(String item, String qty, String price) {
        this.item = item;
        this.qty = qty;
        this.price = price;
    }

    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * @return the qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(String qty) {
        this.qty = qty;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the lineTotal
     */
    public static Float getLineTotal() {
        return lineTotal;
    }

    /**
     * @param aLineTotal the lineTotal to set
     */
    public static void setLineTotal(Float aLineTotal) {
        lineTotal = aLineTotal;
    }
}
