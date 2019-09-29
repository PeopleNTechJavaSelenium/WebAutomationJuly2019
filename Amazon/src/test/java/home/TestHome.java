package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHome extends CommonAPI {
    @Test
    public void test1(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeOnElement("#twotabsearchtextbox", "iPhone");
        clickOnElement(".nav-input");
    }

}
