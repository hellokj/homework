package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean check = true; // 判斷輸入是否合法
        int ticketNum = 0;

        while(check || ticketNum != -1){
            System.out.println("(If you enter -1, exit the system.)");
            System.out.print("Please enter number of ticket: ");
            ticketNum = scanner.nextInt();
            if(ticketNum == -1) break;
            System.out.print("How many round-trip tickets: ");
            int roundTrip = scanner.nextInt();
            if(ticketNum<roundTrip || ticketNum<0 || roundTrip < 0) { // 測試輸入票數是否正確
                System.out.println("Error: Please enter again");
            }
            else{
                check = false; // 表示輸入正確，跳出迴圈
                Ticket ticket = new Ticket(ticketNum,roundTrip);
                ticket.printInfo();
            }
        }
        System.out.println("Exit the system.");
    }
}
