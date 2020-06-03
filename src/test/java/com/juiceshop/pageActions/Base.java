package com.juiceshop.pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Base {
    private WebDriver driver;
    private WebDriverWait webDriverWait;
    private WebElement element;

    public Base(WebDriver driver){
        this.driver = driver;
        webDriverWait=new WebDriverWait(this.driver,20);
    }

    public WebElement getElement(By locator){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));
        element=driver.findElement(locator);
        return element;
    }
}
