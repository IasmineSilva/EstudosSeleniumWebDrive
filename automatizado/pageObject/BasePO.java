    package automatizado.page;

    import org.openqa.selenium.support.PageFactory;
    import org.openqa.selenium.support.WebDriver;

    public abstract class BasePO {
        //**Driver base que será usado pelas pages */
        protected webdriver driver;


        protected BasePO(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
    }


