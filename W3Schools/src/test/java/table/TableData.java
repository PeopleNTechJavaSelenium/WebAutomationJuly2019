package table;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import table.page.TablePage;

public class TableData extends CommonAPI {

    @Test
    public void scrapeTable(){
        TablePage tablePage = PageFactory.initElements(driver, TablePage.class);
        tablePage.getTableData();
    }
}
