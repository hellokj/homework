package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var check = true
    while (check){
        println("(If you enter -1, exit the system.)")
        print("Please enter number of ticket: ")
        var ticketNum = scanner.nextInt()
        if (ticketNum == -1) break
        print("How many round-trip tickets: ")
        var roundTrip = scanner.nextInt()
        if (ticketNum<roundTrip || ticketNum<0 || roundTrip<0){
            println("Error. Please enter again.")
        } else {
            var ticket = TicketKotlin(ticketNum,roundTrip)
            ticket.printInfo()
        }
    }
    println("Exit the system.")
}

class TicketKotlin(var ticketNum:Int, var roundTrip:Int){
    private val totalPrice = ((ticketNum-roundTrip)*1000+roundTrip*2000*0.9)

    fun printInfo(){
        println("Total tickets: $ticketNum" )
        println("Round-trip: $roundTrip")
        println("Total: $totalPrice")
    }
}