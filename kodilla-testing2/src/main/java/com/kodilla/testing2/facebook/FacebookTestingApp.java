package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    private static final String ONLY_NECESSARY_COOKIES = "/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[1]";
    private static final String NEW_ACCOUNT = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a";
    private static final String SELECT_DAY = "//*[@id=\"birthday_wrapper\"]/div[contains(@class,\"_5k_5\")]/span/span/select[1]";
    private static final String SELECT_MONTH = "//*[@id=\"birthday_wrapper\"]/div[contains(@class,\"_5k_5\")]/span/span/select[2]";
    private static final String SELECT_YEAR = "//*[@id=\"birthday_wrapper\"]/div[contains(@class,\"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(ONLY_NECESSARY_COOKIES)).click();
        driver.findElement(By.xpath(NEW_ACCOUNT)).click();

        while (!driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div")).isDisplayed());

        WebElement dayComboBox = driver.findElement(By.xpath(SELECT_DAY));
        Select selectDay = new Select(dayComboBox);
        selectDay.selectByValue("1");

        WebElement monthComboBox = driver.findElement(By.xpath(SELECT_MONTH));
        Select selectMonth = new Select(monthComboBox);
        selectMonth.selectByValue("1");

        WebElement yearComboBox = driver.findElement(By.xpath(SELECT_YEAR));
        Select selectYear = new Select(yearComboBox);
        selectYear.selectByValue("1986");
    }
}
