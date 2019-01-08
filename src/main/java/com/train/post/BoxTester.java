package com.train.post;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        float length;
        float width;
        int height;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter object's length: ");
        length = scanner.nextFloat();
        System.out.print("Please enter object's width: ");
        width = scanner.nextFloat();
        System.out.print("Please enter object's height: ");
        height = scanner.nextInt();

        Box box5 = new Box5();
        Box box3 = new Box3();

        /* 先判斷box5是否合適，再接著判斷box3 */
        if(box5.validate(length,width,height)){
            if(box3.validate(length,width,height)){
                System.out.println(box3.showBox());
            } else System.out.println(box5.showBox());
        } else System.out.println("Can't find moderate box.");
    }
}
