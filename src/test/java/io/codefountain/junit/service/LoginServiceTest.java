package io.codefountain.junit.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginServiceTest {

    @Test
    @DisplayName("Test Login Service")
    void testLogin(){
        assertEquals("Login Successful", LoginService.login());
    }
}
