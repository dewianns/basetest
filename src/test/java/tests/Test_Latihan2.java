package tests;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import static extentreports.ExtentTestManager.getTest;
import static extentreports.ExtentTestManager.startTest;

public class Test_Latihan2 extends BaseTest {

    @Test(priority = 0)
    public void clickAdd(){
        startTest("Click add", "Start");
        latihan2.clickAdd();
        getTest().log(Status.INFO, "start");
    }

    @Test (priority = 1)
    public void inputData() {
        startTest("Input data", "semuanya");
        latihan2.formInputName(setup.getfName(), setup.getlName());
        getTest().log(Status.INFO, "input name");
        latihan2.formInputEmail("anam.dewiannisa@gmail.com");
        getTest().log(Status.INFO, "input email");
        latihan2.formInputAge("23");
        getTest().log(Status.INFO, "input age");
        latihan2.formInputSalary("6500000");
        getTest().log(Status.INFO, "input salary");
        latihan2.formInputDept("Quality Assurance");
        getTest().log(Status.INFO, "input dept");
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("document.body.style.zoom = '0.8'");
        latihan2.clickSubmit();
    }


}
