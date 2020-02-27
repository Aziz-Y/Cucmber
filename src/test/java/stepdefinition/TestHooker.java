package stepdefinition;

import base.DriverManager;
import org.testng.annotations.AfterClass;

public class TestHooker {

   @AfterClass
    public static void quitTest(){
        DriverManager.tearDown();
    }
}
