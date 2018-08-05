/*

THIS IS PAGE OBJECT MODEL APPROACH,
ALL THE ELEMENTS OF SINGLE PAGE FOR TESTS
ARE IN THIS PAGE.
 *
 */





package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ComputerDB {

    WebDriver driver;


    @FindBy(id = "add")
    WebElement addButton;

    @FindBy(id = "name")
    WebElement compname;

    @FindBy(id = "introduced" )
    WebElement daterelease;

    @FindBy(id = "discontinued")
    WebElement expire;

    @FindBy(id = "company")
    WebElement dropmenu;

     @FindBy(xpath = "//*[@id=\"main\"]/form/div/input")
    WebElement creatbutton;

     @FindBy(id = "searchbox")
     WebElement searchinput;

    @FindBy(id = "searchsubmit")
    WebElement submitbutton;

    @FindBy(xpath = "//*[@id=\"main\"]/table/tbody")
    WebElement getdata;

    @FindBy(xpath = "//*[@id=\"main\"]/h1")
    WebElement header;

   @FindBy(partialLinkText = "Play sample application" )
    WebElement homelink;

   @FindBy(xpath = "//*[@id=\"main\"]/form[2]/input")
   WebElement deletebutton;

   @FindBy(xpath = "//*[@id=\"main\"]/table/tbody/tr/td[1]/a")
   WebElement mac;

   @FindBy(xpath = "//*[@id=\"main\"]/div[1]")
   WebElement alertnot;

   @FindBy(linkText = "Next →")
   WebElement next;

   @FindBy (linkText = "← Previous")
   WebElement prev;

   @FindBy(partialLinkText = "Displaying")
   WebElement displaycount;


    public ComputerDB(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);


    }

    public void addcomputer(String computername, String datereleases, String discontinuedate){
        addButton.click();
        compname.sendKeys(computername);
        daterelease.sendKeys(datereleases);
        expire.sendKeys(discontinuedate);
        Select selector = new Select(dropmenu);
        selector.selectByVisibleText("Apple Inc.");
        dropmenu.click();
        creatbutton.click();

    }

    public void searchUp(String computername){
        searchinput.sendKeys(computername);
        submitbutton.click();
        String compname;
        compname=getdata.getText();
        System.out.println(compname);
        mac.click();

    }

    public void deletecomp(){
        searchUp("");
        deletebutton.click();
        String alertnotification;
        alertnotification = alertnot.getText();
        System.out.println(alertnotification);


    }

    public void home(){
        homelink.click();
        next.click();
        WebDriverWait wait= new WebDriverWait(driver, 2);
        String count;
       count = displaycount.getText();
        System.out.println(count);
        prev.click();
        String countprev;
        countprev = displaycount.getText();
        System.out.println(countprev);
    }




}
