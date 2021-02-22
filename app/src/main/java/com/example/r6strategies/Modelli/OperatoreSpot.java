package com.example.r6strategies.Modelli;

import java.io.Serializable;

public class OperatoreSpot implements Serializable {
    public int mappa;
    public String operatore;
    public int spot;
    public int diff;

    public OperatoreSpot(int mappa,String operatore,int spot,int diff){
        this.mappa=mappa;
        this.operatore=operatore;
        this.spot= spot;
        this.diff=diff;
    }
}
