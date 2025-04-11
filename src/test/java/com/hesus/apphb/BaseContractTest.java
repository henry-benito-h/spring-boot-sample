package com.hesus.apphb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

@SpringBootTest
@AutoConfigureMockMvc
public abstract class BaseContractTest {

    @Autowired
    protected MockMvc mockMvc;  // Inyección de MockMvc para ser usado por las pruebas generadas

    // Este método se ejecuta antes de cada prueba
    @BeforeEach
    public void setUp() {
        RestAssuredMockMvc.mockMvc(mockMvc);  // Configura RestAssuredMockMvc con MockMvc inyectado
    }
}
