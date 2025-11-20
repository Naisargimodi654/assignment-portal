package com.portal.assignmentportal;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginUiTest {

    @Disabled("UI Test disabled because it requires the Spring Boot server to be running")
    @Test
    public void loginTest() {

        // Start Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open your login page
        driver.get("http://localhost:8080/login");

        // Enter username
        driver.findElement(By.id("username")).sendKeys("admin");

        // Enter password
        driver.findElement(By.id("password")).sendKeys("password");

        // Submit login form
        driver.findElement(By.id("submit")).click();

        // Verify login success page
        String expectedUrl = "http://localhost:8080/home";
        assertEquals(expectedUrl, driver.getCurrentUrl());

        driver.quit();
    }
}
