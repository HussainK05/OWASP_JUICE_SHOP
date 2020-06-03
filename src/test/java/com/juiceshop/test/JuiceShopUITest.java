package com.juiceshop.test;

import com.juiceshop.pageActions.registerNewUser;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class JuiceShopUITest extends baseTest{

    public JuiceShopUITest() throws IOException {
    }

    @Test
    public void registerUserTest() {
        String email = prop.getProperty("username");
        String password = prop.getProperty("password");
        registerNewUser newUser = new registerNewUser(driver);
        newUser.registerNewUser(email,password);
    }
}
