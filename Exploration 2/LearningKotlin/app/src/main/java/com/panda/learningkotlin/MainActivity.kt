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

    val heights: List<Int> = listOf<Int>(6, 5, 4, 3, 3, 4);
    println(heights.sorted());

    var ages: List<Int> = mutableListOf<Int>(10, 13, 13, 14, 15);
    println(ages.sorted());

    var randoms = heights + ages;
    println(randoms.sorted());

    randoms -= listOf(0);
    println(randoms);

    val map: Map<String, Int> = mapOf("Billy" to 14, "Joe" to 12, "Jim" to 14, "Bill" to 12, "Om" to 13);
    for((name, age) in map) {
        println("$name is $age years old");
        if(age > 13) {
            println("$name is older than 13");
        }
    }

    printHello();
    printAny("This is om");
    add(1, 3);

    println(multiply(3, 5));
    println(makeSentence("Om"));

    val om: Person = Person("Om", 13);
    println(om.name);
    println(om.age);
    om.grow();
    om.newName("Panda");
    println(om.age);
    println(om.name);
    println(makeSentence(om.name));
}

// Classes
class Person(var name: String, var age: Int) {
    // Name, age
//    var name: String = "";
//    var age: Int = 0;
//
//    constructor(name: String, age: Int): this() {
//        this.age = age;
//        this.name = name;
//    }

    fun grow() {
        this.age += 1;
    }

    fun newName(name: String) {
        this.name = name;
    }
}

open class Shape() {
    open var sides: Int = 4;

    open fun draw() {
        println("DRAWING...");
    }
}

class Square() : Shape() {
    override var sides: Int = super.sides;

    fun draw() {
        super.draw();
    }
}

// Functions
fun printHello() {
    println("Hello World");
}

fun printAny(sentence: String) {
    println(sentence);
}

fun add(x: Int, y: Int) {
    println(x + y);
}

fun multiply(x: Int, y: Int): Int {
    return x * y;
}

fun makeSentence(name: String): String {
    var sentence: String = "My name is $name"
    return sentence;
}
