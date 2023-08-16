package com.example.demo.infraestructure.adapters

import com.example.demo.domain.ports.FibonacyPort
import com.example.demo.domain.usecases.impl.CalcFibonacciUseCaseImpl
import org.springframework.stereotype.Component

@Component
class FibonaccyPortAdapter(
    private val fibonacciUseCase: CalcFibonacciUseCaseImpl
): FibonacyPort {

    override fun calc(position: Int): Long {
        return fibonacciUseCase.calc(position)
    }


}