package com.panda.learningkotlin

fun main() {
    // This is a comment.

    // Creating a variable
    var x = 1;
    val y = 1;
    x = 3;
    x = 5;
    println(x);
    println(y);
    // Var is for changing values
    // Val is for static values

    // Declaring Type
    // Integers = Numbers with no decimal points
    // (Variable Name): (Data Type) = (Value)
    val sampleInt: Int = 15;
    // Floats = Numbers with decimals
    val pi: Float = 3.14159265f;
    // Boolean = True or False
    val isOlder13: Boolean = false;
    // Long = Any number over 4 characters
    val bigNum: Long = 30000000000;
    // Double = Any Decimal
    val myDouble: Double = 2.15;

    // Declaring then Assigning
    var age: Int
    age = 15;

    // Strings
    val name: String = "Om Billy Panda";
    println(name[3])
    println(name[8])
    // Template String
    println("My name is $name and I am $age years old")
    val newName: String = "$name Doug"

    // Operations
    var b: Int = 20;
    var c = b - 5;
    b -= 5;
    b += 5;
    b *= 5;
    b /= 5;
    var isDivisible = b % 4;
    println(isDivisible); // Print out 0
}
