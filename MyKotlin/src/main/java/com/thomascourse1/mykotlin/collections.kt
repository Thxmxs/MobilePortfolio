package com.thomascourse1.mykotlin

fun main() {

    //collections (List, ArrayList, listOf )
    //listOf :no mutable
    //mutableListOf: mutable

    val myListOfNames = listOf<String>("test","test1");
    val myMutableListOfNames = mutableListOf<String>("Test3", "Test4");

    myMutableListOfNames.add("xD");
    myMutableListOfNames.removeAt(0)

    for (item in myListOfNames){
        println(item)
    }

    myListOfNames.forEach {
        println(it);
    }

    //filter a collection
    val nameFount = myListOfNames.filter {
        it  == "test"
    }

    //set: collection of unique elements and the order is not important and is no mutable unless is mutableSetOf
    val mySetCollection = setOf<String>("US", "CL", "JP");
    val myMutableSet = mutableSetOf<String>("US", "CL", "JP");

    //Map is like a json object
    val secretMap = mapOf("Up" to 1, "Down" to 2, "Left" to 3, "Right" to 4);

}