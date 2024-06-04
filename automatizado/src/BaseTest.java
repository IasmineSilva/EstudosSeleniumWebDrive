public abstract class BaseTest {

    protected static WebDriver driver;
    private static final String URL_BASE = "https://www.google.com/";
    private static final String CAMINHO_DRIVER = "automatizado//resources//chromedriver-v125.0.6422.exe";

    @BeforeClass
    private static void iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);

    }
    @AfterClass
    protected static void finalizar(){
        driver.quit();
        
    }
}
