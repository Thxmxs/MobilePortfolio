package com.thomascourse1.mykotlin

fun main() {

    val car = Car("red","Ferrari");

}



open class Car(var color:String,var brand:String){

    fun drive(){
        println("Driving a car...");
    }

    open fun speed(){
        println("my max speed is 240 km/h");
    }

}

class Truck() : Car("Blue","Mercedes benz"), IClickEvent{

    override fun speed() {
        println("My max speed is 80km/h")
    }

    override fun onClick(message: String) {
        println("The message is: $message")
    }

}

//interfaces
interface IClickEvent{
    fun onClick(message:String)
}