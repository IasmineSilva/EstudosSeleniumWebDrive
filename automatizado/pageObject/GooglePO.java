package automatizado.page;

import org.openqa.selenium.WebDriver;

public class GooglePO extends BasePO{
    @FindBy(name = "q")
    public WebElement inputPesquisa;
    @param driver
    protected GooglePO(WebDriver driver){
        super(driver);
    }
}
