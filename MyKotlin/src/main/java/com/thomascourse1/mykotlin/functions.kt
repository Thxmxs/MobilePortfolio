package com.thomascourse1.mykotlin

fun main() {

    //lambda expressions
    val sum: (Int, Int) -> Int =
    { a, b -> a + b}


    //lambda that returns void, Unit means void
    val showName: (String) -> Unit = { name -> print(name) }


    //trailing lambda: function that receives a function as param
    fun enhancedMessage(message: String, funAsParameter:() -> Int){
        println("$message ${funAsParameter()}")
    }

    val add:(Int, Int) -> Int = {a, b -> a + b}

    // if the function is the last parameter, we can pass it in the body
    enhancedMessage(message = "Hello") {
        add(2, 3)
    }


}