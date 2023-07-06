package OrangeHRM.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Browser {
    public WebDriver driver;
    public String pageURL;
    String browserName;
    String jsonContent;

    public WebDriver initializeTheBrowser() {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//OrangeHRM//configs//config.properties");
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException exception caught in initialize method: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException exception caught in initialize method: " + e.getMessage());
        }

        //TODO - To get Browser input form Terminal or config.properties File
        browserName = System.getProperty("web_browser") != null ? System.getProperty("web_browser") : properties.getProperty("web_browser");

        //TODO - To get url input form Terminal or Config.properties File
        pageURL = System.getProperty("webpageURL") != null ? System.getProperty("webpageURL") : properties.getProperty("webpageURL");

        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.setBinary("C://Users//KC - Reddy//AppData//Local//BraveSoftware//Brave-Browser//Application//brave.exe");
            driver = new ChromeDriver(options);
            System.out.println("Chrome Browser is Selected " + driver);
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            System.out.println("Firefox Browser is Selected " + driver);
        } else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            System.out.println("Edge Browser is Selected " + driver);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
    }
}