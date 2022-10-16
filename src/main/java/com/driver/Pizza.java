package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int ExtraToppings;
    private int ExtraCheese;
    private int paperBag;

    private boolean isExtraCheese;
    private boolean isExtraToppings;
    private boolean isExtrapaperBag;
    private boolean isBillGenerated;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        ExtraCheese = 80;
        paperBag = 20;
        isExtraCheese = false;
        isExtrapaperBag  = false;
        isBillGenerated = false;
        if(isVeg){
            this.price =300;
            ExtraToppings = 70;
        }
        else{
            this.price = 400;
            ExtraToppings =120;
        }
        bill ="BasePriceOfThePizza: " + this.price + "\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isExtraCheese == false){
            price+=ExtraCheese;
            isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppings == false){
            price+=ExtraToppings;
            isExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isExtrapaperBag == false){
            price += paperBag;
            isExtrapaperBag = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false){
            isBillGenerated = true;
            if(isExtraCheese == true){
                this.bill += "ExtraCheeseAdded: " +this.ExtraCheese+"\n";
            }
            if(isExtraToppings ){
                this.bill += "ExtraToppingsAdded: " +this.ExtraToppings+"\n";
            }
            if(isExtrapaperBag){
                this.bill += "PaperBagAdded: " +this.paperBag+"\n";
            }
            this.bill+="TotalPrice " + this.price + "\n";
        }
        return this.bill;
    }
}
