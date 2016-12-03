package com.balant.diana.jada;

/**
 * Created by Diana on 2016-12-03.
 */

public class budget {
    private int total;
    private int amtSpent;

    budget(int totalBudget, int amountSpent){
        total = totalBudget;
        amtSpent = amountSpent;
    }

    int leftToSpend(){
        int left = total - amtSpent;
        return left;
    }
}
