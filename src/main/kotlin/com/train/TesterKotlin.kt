package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var check = 0

    while(check == 0){
        print("Please enter number of ticket: ")
        var ticketNum = scanner.nextInt()
        print("How many round-trip tickets: ")
        var roundTrip = scanner.nextInt()
        if(ticketNum<roundTrip || ticketNum<=0 || roundTrip <= 0){ // 測試輸入票數是否正確
            println("Error: Please enter again")
        }
        else{
            check = 1 // 表示輸入正確，跳出迴圈
            val ticket = TicketKotlin(ticketNum,roundTrip)
            ticket.printInfo()
        }
    }
}

class TicketKotlin(var ticketNum:Int, var roundTrip:Int){
    private val totalPrice = ((ticketNum-roundTrip)*1000+roundTrip*2000*0.9)

    fun printInfo(){
        println("Total tickets: $ticketNum" )
        println("Round-trip: $roundTrip")
        println("Total: $totalPrice")
    }
}