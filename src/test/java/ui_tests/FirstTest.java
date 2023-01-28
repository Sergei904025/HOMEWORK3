package ui_tests;

import org.testng.annotations.Test;

public class FirstTest extends BaseTest{

    @Test()
    public void checkYandexStartPage() {
        driver.get("https://dzen.com");
    }

    @Test()
    public void checkGoogleStartPage() {
        driver.get("https://google.com");
    }


}
