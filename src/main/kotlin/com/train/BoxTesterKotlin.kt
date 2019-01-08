package com.train

import java.util.*

fun main(args: Array<String>) {
    var box3 = Box3()
    var box5 = Box5()
    val scanner = Scanner(System.`in`)
    print("Please enter object's length: ")
    var length = scanner.nextFloat()
    print("Please enter object's width: ")
    var width = scanner.nextFloat()
    print("Please enter object's height: ")
    var height = scanner.nextInt()
    if(box5.validate(length,width,height)){
        if(box3.validate(length,width,height))
            println(box3.showBox())
        else println(box5.showBox())
    } else println("Can't find moderate box")
}

abstract class Box(var length: Float, var width: Float, var height: Int) {
    open var box = ""
    open fun validate(length: Float, width: Float, height: Int): Boolean
            = (length <= this.length && width <= this.width && height <= this.height)
    open fun showBox() = box
}

class Box5: Box(39.5f,27.5f,23){
    override var box = "Box5"
}

class Box3: Box(23f,14f,13){
    override var box = "Box3"
}