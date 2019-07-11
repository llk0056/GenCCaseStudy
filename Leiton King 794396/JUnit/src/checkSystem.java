import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class checkSystem {
        public void checkTitle(WebDriver drive, String url, String title){
            WebDriver driver = drive;
            String baseUrl = url;
            String expectedTitle = title;
            String actualTitle = "";
            driver.get(baseUrl);
            actualTitle = driver.getTitle();
            assertEquals(expectedTitle, actualTitle);
        }
        public void checkInputValue(WebDriver drive, String url, String idOfElement, String elementName, String value){
            WebDriver driver = drive;
            String baseUrl = url;
            driver.get(baseUrl);
            String name = "";
            String expectedName = elementName;
            WebElement element = driver.findElement((By.id(idOfElement)));
            try{
                if(element.isEnabled()){
                    element.sendKeys((value));
                }
            }
            catch(NoSuchElementException nsee){
                System.out.println(nsee.toString());
            }
            driver.findElement(By.id("submit_form")).click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
            name = driver.findElement((By.xpath("/html/body/table/tbody/tr[2]/td[1]"))).getText();
            assertEquals(expectedName, name);
        }

        public void checkLinks(String baseUrl, WebDriver drive){
            WebDriver driver = drive;
            // TODO Auto-generated method stub

            String homePage = baseUrl;
            String url = "";
            HttpURLConnection huc = null;
            int respCode = 200;



            driver.manage().window().maximize();

            driver.get(homePage);

            List<WebElement> links = driver.findElements(By.tagName("a"));

            Iterator<WebElement> it = links.iterator();

            while(it.hasNext()){

                url = it.next().getAttribute("href");

                System.out.println(url);

                if(url == null || url.isEmpty()){
                    System.out.println("URL is either not configured for anchor tag or it is empty");
                    continue;
                }

                if(!url.startsWith(homePage)){
                    System.out.println("URL belongs to another domain, skipping it.");
                    continue;
                }

                try {
                    huc = (HttpURLConnection)(new URL(url).openConnection());

                    huc.setRequestMethod("HEAD");

                    huc.connect();

                    respCode = huc.getResponseCode();

                    if(respCode >= 400){
                        System.out.println(url+" is a broken link");
                    }
                    else{
                        System.out.println(url+" is a valid link");
                    }

                } catch (MalformedURLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }


        }
        public void checkNavTitle(String baseUrl, WebDriver drive){
            WebDriver driver = drive;
            // TODO Auto-generated method stub

            String homePage = baseUrl;
            driver.get(homePage);
            String actualNavTitle = driver.findElement(By.xpath("/html/body/nav/a")).getText();
            String expectedTitle = "Dewey Decimation";
            assertEquals(expectedTitle, actualNavTitle);
        }
        public void checkNavbar(String baseUrl, WebDriver drive){
            WebDriver driver = drive;
            // TODO Auto-generated method stub

            String homePage = baseUrl;
            driver.get(homePage);
            Actions builder = new Actions(driver);
            WebElement link_Home = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a"));


            Action mouseOverHome = builder
                    .moveToElement(link_Home)
                    .click()
                    .build();
            mouseOverHome.perform();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement link_Main = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a"));
            Action mouseOverMain = builder
                    .moveToElement(link_Main)
                    .click()
                    .build();
            mouseOverMain.perform();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement link_Nav = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"));
            Action mouseOverNav = builder
                    .moveToElement(link_Nav)
                    .click()
                    .build();
            mouseOverNav.perform();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement link_AId = driver.findElement(By.id("sAID"));
            WebElement link_Search = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]"));
            Action mouseOverAId = builder
                    .moveToElement(link_Search)
                    .click()
                    .pause(java.time.Duration.ofSeconds(2))
                    .moveToElement(link_AId)
                    .click()
                    .build();
            mouseOverAId.perform();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement link_LAB = driver.findElement(By.xpath("//*[@id=\"searchAllBooks\"]"));
            link_Search = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]"));
            Action mouseOverLAB = builder
                    .moveToElement(link_Search)
                    .click()
                    .pause(java.time.Duration.ofSeconds(2))
                    .moveToElement(link_LAB)
                    .click()
                    .build();
            mouseOverLAB.perform();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement link_LA = driver.findElement(By.xpath("//*[@id=\"searchAll\"]"));
            link_Search = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]"));

            Action mouseOverLA = builder
                    .moveToElement(link_Search)
                    .click()
                    .pause(java.time.Duration.ofSeconds(2))
                    .moveToElement(link_LA)
                    .click()
                    .build();
            mouseOverLA.perform();

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement link_FindBooksByAuthor = driver.findElement(By.xpath("//*[@id=\"find\"]"));
            link_Search = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]"));
            Action mouseOverFBBA = builder
                    .moveToElement(link_Search)
                    .click()
                    .pause(java.time.Duration.ofSeconds(2))
                    .moveToElement(link_FindBooksByAuthor)
                    .click()
                    .build();
            mouseOverFBBA.perform();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement link_FindBooksByTitle = driver.findElement(By.xpath("//*[@id=\"findBBT\"]"));
            link_Search = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]"));
            Action mouseOverFBBT = builder
                    .moveToElement(link_Search)
                    .click()
                    .pause(java.time.Duration.ofSeconds(2))
                    .moveToElement(link_FindBooksByTitle)
                    .click()
                    .build();
            mouseOverFBBT.perform();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement link_BId = driver.findElement(By.xpath("//*[@id=\"sBID\"]"));
            link_Search = driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]"));
            Action mouseOverBId = builder
                    .moveToElement(link_Search)
                    .click()
                    .pause(java.time.Duration.ofSeconds(2))
                    .moveToElement(link_BId)
                    .click()
                    .build();
            mouseOverBId.perform();
        }
        public void checkListValueByName(WebDriver drive, String url, String idOfElement, String elementName, int row){
            WebDriver driver = drive;
            driver.get(url);
            String name = "";
            name = driver.findElement((By.xpath("/html/body/table/tbody/tr[" + row + "]/td[1]"))).getText();
            assertEquals(elementName, name);
        }
        public void checkListValueByTitle(WebDriver drive, String url, String idOfElement, String elementName, int row){
            WebDriver driver = drive;
            driver.get(url);
            String name = "";
            name = driver.findElement((By.xpath("/html/body/table/tbody/tr[" + row + "]/td[2]"))).getText();
            assertEquals(elementName, name);
        }
        public void checkListValueByPageNum(WebDriver drive, String url, String idOfElement, String elementName, int row){
            WebDriver driver = drive;
            driver.get(url);
            String name = "";
            name = driver.findElement((By.xpath("/html/body/table/tbody/tr[" + row + "]/td[3]"))).getText();
            assertEquals(elementName, name);
        }
        public void checkListValueByIsbn(WebDriver drive, String url, String idOfElement, String elementName, int row){
            WebDriver driver = drive;
            driver.get(url);
            String name = "";
            name = driver.findElement((By.xpath("/html/body/table/tbody/tr[" + row + "]/td[4]"))).getText();
            assertEquals(elementName, name);
        }
        public void checkListValueByGenre(WebDriver drive, String url, String idOfElement, String elementName, int row){
            WebDriver driver = drive;
            driver.get(url);
            String name = "";
            name = driver.findElement((By.xpath("/html/body/table/tbody/tr[" + row + "]/td[5]"))).getText();
            assertEquals(elementName, name);
        }
        public void checkListValueByName(WebDriver drive, String url, String idOfElement, String elementName, int column, int row){
            WebDriver driver = drive;
            driver.get(url);
            String name = "";
            name = driver.findElement((By.xpath("/html/body/table/tbody/tr[" + column + "]/td[" + row + "]"))).getText();
            assertEquals(elementName, name);
        }
        public void checkListValueByTitle(WebDriver drive, String url, String idOfElement, String elementName, int column, int row){
            WebDriver driver = drive;
            driver.get(url);
            String name = "";
            name = driver.findElement((By.xpath("/html/body/table/tbody/tr[" + column + "]/td[" + row + "]"))).getText();
            assertEquals(elementName, name);
        }
        public void checkListValueByPageNum(WebDriver drive, String url, String idOfElement, String elementName, int column, int row){
            WebDriver driver = drive;
            driver.get(url);
            String name = "";
            name = driver.findElement((By.xpath("/html/body/table/tbody/tr[" + column + "]/td[" + row + "]"))).getText();
            assertEquals(elementName, name);
        }
        public void checkListValueByIsbn(WebDriver drive, String url, String idOfElement, String elementName, int column, int row){
            WebDriver driver = drive;
            driver.get(url);
            String name = "";
            name = driver.findElement((By.xpath("/html/body/table/tbody/tr[" + column + "]/td[" + row + "]"))).getText();
            assertEquals(elementName, name);
        }
        public void checkListValueByGenre(WebDriver drive, String url, String idOfElement, String elementName, int column, int row){
            WebDriver driver = drive;
            driver.get(url);
            String name = "";
            name = driver.findElement((By.xpath("/html/body/table/tbody/tr[" + column + "]/td[" + row + "]"))).getText();
            assertEquals(elementName, name);
        }
    }
