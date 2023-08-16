package com.example.demo.domain.usecases.impl

import com.example.demo.domain.usecases.CalcFibonacciUseCase
import org.springframework.stereotype.Service

@Service
class CalcFibonacciUseCaseImpl : CalcFibonacciUseCase {

    override fun calc(position: Int): Long {
        if (position < 0) throw Exception("Nao pode ser menor que zero")
        if (position <= 1) return position.toLong()
        return calc(position - 1) +  calc(position - 2)
    }


}
