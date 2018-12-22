package com.train;

public class Ticket {
    private int ticketNum; // 總票數
    private int roundTrip; // 來回票票數
    private double totalPrice;

    public Ticket(int ticketNum, int roundTrip) {
        this.ticketNum = ticketNum;
        this.roundTrip = roundTrip;
        this.totalPrice = ((ticketNum-roundTrip)*1000+roundTrip*2000*0.9); // 計算總價
    }

    public void printInfo(){
        System.out.println("Total tickets: " + ticketNum);
        System.out.println("Round-trip: " + roundTrip);
        System.out.println("Total: "+ totalPrice);
    }
}
