import HomePage.ComputerDB;
import Web.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest {

    WebDriver driver = BrowserFactory.RunBrowser("Chrome");
    ComputerDB tasks = PageFactory.initElements(driver, ComputerDB.class);


    public void getBaseURL() {
        driver.get("http://computer-database.herokuapp.com/computers");
        ;
    }

    //creating computer

    @Test
        public void createComp () {
            getBaseURL();
            tasks.addcomputer(" ", " ", " ");
        }

        //searching the database

    @Test
    public void searching(){
           getBaseURL();
           tasks.searchUp(" ");
           //tasks.home();


        }

        //deleting computer
        @Test public void delete(){
        getBaseURL();
        tasks.deletecomp();



        }
        //basic functions
        @Test public void functions(){
            getBaseURL();
            tasks.home();
        }

    }

