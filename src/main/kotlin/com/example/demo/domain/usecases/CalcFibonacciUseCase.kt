package com.example.demo.domain.usecases

fun interface CalcFibonacciUseCase {
    fun calc(position: Int): Long
}