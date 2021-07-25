package com.example.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello, world!")
        println("whatsap")
        println("what is your name\n")
        println("what is your \n age")
        val age = 5 * 44
        val name = "mohammad"
        println("its five ${age} good to celebrate ${name}")
        println("your age is ${age}")
        printBorder("$$$$", 6)
        printTwo(10)
        printThree(10, 5)

    }

    fun printBorder(text: String, number: Int) {
        repeat(number) {
            print(text)

        }
        println()
    }

    fun printTwo(age: Int) {
        repeat(age) {
            print(",")
        }
        println();
        repeat(age) {
            print("|")
        }
        println()
    }

    fun printThree(age: Int, layers: Int) {
        repeat(layers) {
            repeat(age)
            {
                print("@")
            }
            println()
        }
    }
}