package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int check = 0;

        while(check == 0){
            System.out.print("Please enter number of ticket: ");
            int ticketNum = scanner.nextInt();
            System.out.print("How many round-trip tickets: ");
            int roundTrip = scanner.nextInt();
            if(ticketNum<roundTrip || ticketNum<=0 || roundTrip <= 0) { // 測試輸入票數是否正確
                System.out.println("Error: Please enter again");
            }
            else{
                check = 1; // 表示輸入正確，跳出迴圈
                Ticket ticket = new Ticket(ticketNum,roundTrip);
                ticket.printInfo();
            }
        }
    }
}
