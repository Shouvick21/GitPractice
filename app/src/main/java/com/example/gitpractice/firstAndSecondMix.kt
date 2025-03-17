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
    }
}