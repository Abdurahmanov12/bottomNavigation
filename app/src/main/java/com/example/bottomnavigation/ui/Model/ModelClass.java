package com.example.bottomnavigation.ui.Model;

public class ModelClass {

    private String textViewNameProduct;
    private String textViewDate;
    private String textViewScore;
    private String textViewButton;

    public ModelClass(String textViewNameProduct, String textViewDate, String textViewScore, String textViewButton) {
        this.textViewNameProduct = textViewNameProduct;
        this.textViewDate = textViewDate;
        this.textViewScore = textViewScore;
        this.textViewButton = textViewButton;
    }

    public String getTextViewNameProduct() {
        return textViewNameProduct;
    }

    public String getTextViewDate() {
        return textViewDate;
    }

    public String getTextViewScore() {
        return textViewScore;
    }

    public String getTextViewButton() {
        return textViewButton;
    }
}
