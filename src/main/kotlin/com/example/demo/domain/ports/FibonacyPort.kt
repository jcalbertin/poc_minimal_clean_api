package com.example.demo.domain.ports

fun interface FibonacyPort {
    fun calc(position: Int): Long
}