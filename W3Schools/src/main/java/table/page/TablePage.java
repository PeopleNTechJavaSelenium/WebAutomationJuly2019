package table.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TablePage {

    @FindBy(how = How.CSS, using =".w3-responsive tr:nth-child(3) td:nth-child(6)")
    public WebElement tableElement;

    public void getTableData(){
        String data = tableElement.getText();
        System.out.println(data);
    }
}
