package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@SpringJUnitConfig
@SpringBootTest
@AutoConfigureMockMvc
class CalcFibonacciIntegrationTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `test calc with valid index`() {
        val index = 10

        mockMvc.perform(
            MockMvcRequestBuilders.get("/v1/fibonacci/{index}", index)
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().isOk)
    }

}