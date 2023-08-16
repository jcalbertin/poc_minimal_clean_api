package com.example.demo

import com.example.demo.domain.usecases.impl.CalcFibonacciUseCaseImpl
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class CalcFibonacciTest {
    private val calcFibonacciUseCase = CalcFibonacciUseCaseImpl()

    @Test
    fun `test calc with negative index`() {
        val index = -1;

        assertThrows(Exception::class.java) {
            calcFibonacciUseCase.calc(index)
        }

    }

    @Test
    fun `test calc with valid index`() {
        val index = 10
        val expectedValue = 55L

        val result = calcFibonacciUseCase.calc(index)

        Assertions.assertEquals(expectedValue, result)
    }

    @Test
    fun `test calc with index 0`() {
        val index = 0
        val expectedValue = 0L

        val result = calcFibonacciUseCase.calc(index)

        Assertions.assertEquals(expectedValue, result)
    }

    @Test
    fun `test calc with index 1`() {
        val index = 1
        val expectedValue = 1L

        val result = calcFibonacciUseCase.calc(index)

        Assertions.assertEquals(expectedValue, result)
    }

}