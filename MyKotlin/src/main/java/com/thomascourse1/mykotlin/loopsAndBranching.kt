package com.thomascourse1.mykotlin

fun main(){

    //val: no mutable, var: mutable
    val name = "Kotlin";
    val age = 24;

    print("Hello $name your age is $age\n" )


    //loops and branching
    val amount = 1104;

    when(amount){
        100 -> println("You have 100")
        125 -> println("You have 125")
        1100 -> println("You've made it")
        in 1101..1110 -> print("This amount is between 1101 and 1110")
        else ->{
            println("$amount is not goin to work")
        }
    }


    for (i in 1..3){
        println(i)
    }

}

