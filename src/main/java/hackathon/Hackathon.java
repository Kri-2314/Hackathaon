package hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hackathon
{
    WebDriver driver;
    @BeforeClass
    public void driverInit()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void Test11()
    {
        driver.get("https://www.homecentre.in/in/en/");
        driver.findElement(By.xpath("//*[@id='dept-living room']/a/span/span/div")).click();
        driver.findElement(By.xpath("//*[@id=\"block-homecentrein-DepartmentPage-livingroom-v2-Section3ASlot\"]/div[2]/div/div/div[12]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"filter-div\"]/div[2]/div[6]/div/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"filter-div\"]/div[2]/div[6]/span/div/div/div/div[1]/span/span/input")).click();
        driver.findElement(By.xpath("//*[@id=\"filter-div\"]/div[2]/div[1]/div[2]/div/div[2]/input")).sendKeys("15000");
        driver.findElement(By.xpath("//*[@id=\"filter-div\"]/div[2]/div[1]/div[2]/div/div[3]/button")).click();
    }

//    @AfterClass
//    public void quit()
//    {
//        driver.quit();
//    }
}
