package com.example.gitpractice

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun MixedCode(){
    Column() {
        Text(
            text = "first person 1"
        )
        Text(text = "Second Person 1")
        Text(text = "first person 2")
        Text(text = "second person 2")
        Text(text = "second person 3")

        Text(text = "first person 3")

        Text(text = "person2 branch text 1")

        Text(text = "person1 branch text 1")

        Text(text = "person1 branch text 2")



        Text(text = "person1 branch text 3")
        Text(text = "person1 branch text 4")



        Text(text = "person2 branch text 2")

        Text(text = "person2 branch text 3")


        Text(text = "person1 branch text 10")

        Text(text = "person2 branch text 10")



        Text(text = "person1 branch text 20")

    }
}