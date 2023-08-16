package com.example.demo.application.resource

import com.example.demo.domain.usecases.CalcFibonacciUseCase
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid
import javax.validation.constraints.Min

@CrossOrigin(origins = ["*"], maxAge = 3600)
@RequestMapping("/v1")
@RestController
class FibonnaciResource(
    private val calcFibonacciUseCase: CalcFibonacciUseCase
) {
    private val logger = LoggerFactory.getLogger(FibonnaciResource::class.java)

    @GetMapping("/fibonacci/{index}" )
    fun calc(@Valid @Min(0) @PathVariable index: Int): ResponseEntity<Long> {
        logger.info("calc fibonaci $index")
        return ResponseEntity.ok(calcFibonacciUseCase.calc(index))
    }
}