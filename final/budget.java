package com.balant.diana.jada;

/**
 * Created by Diana on 2016-12-03.
 */

public class budget{
    private double total;
    private double amtSpent;

    public budget(double totalBudget, double amountSpent){
        total = totalBudget;
        amtSpent = amountSpent;
    }

    public budget(){
        total = 100;
        amtSpent = 0;
    }

    public double leftToSpend(){
        double left = total - amtSpent;
        return left;
    }

    public double percentSpent(){
        double percent = (amtSpent/total)*100;
        return percent;
    }

    public void add (double amount){
        amtSpent += amount;
    }

    public double getTotal(){
        return total;
    }

    public double getAmtSpent(){
        return amtSpent;
    }

    public void addToTotal(double amount){//only for total budget object
        total += amount;
    }

    public void newBudget (double amount){
        total = amount;
    }
}
