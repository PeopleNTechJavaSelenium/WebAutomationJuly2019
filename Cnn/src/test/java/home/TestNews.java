package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNews extends CommonAPI {

    @Test
    public void test1(){
        clickOnElement(".nav-linksstyles__NavLinkList-sc-1tike8v-2.jJWZwe li:nth-child(4)");
        //clickOnElement("nav-linksstyles__Link-sc-1tike8v-0");
    }
}
