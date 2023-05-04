package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal();
    //Singleton design pattern
    //It will assign one driver to each test Scenario in order TO run it parallel.
    private Driver() { }
    public static WebDriver getDriver() {
        if (driverPool.get() == null) {
            //Class var0 = Driver.class;
            synchronized(Driver.class) {
                switch (ConfigurationReader.getProperties("browser")) {
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());break;
                    case "edge":
                        WebDriverManager.edgedriver().setup();
                        driverPool.set(new EdgeDriver());break;
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());break;
                    case "chrome-headless":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver((new ChromeOptions()).
                                setHeadless(true)));break;
                    default: System.out.println("The Driver is NOT Found");}}}
        return (WebDriver)driverPool.get();}
    public static void closeDriver() {
        if (driverPool.get() != null) {
            ((WebDriver)driverPool.get()).quit();
            driverPool.remove();}}}

