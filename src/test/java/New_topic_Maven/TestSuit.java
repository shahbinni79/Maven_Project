package New_topic_Maven;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by welcome on 19/11/2016.
 */
public class TestSuit extends BaseTest  {

    @Test
    public void varifyUseronHomepage() {
        Assert.assertEquals(Utils.get_Text(By.id("logInPanelHeading")), "LOGIN Panel");
    }
    @Test
    public static void userableto_Login (){
        Utils.enterText(By.name("txtUsername"),"Admin");
        Utils.enterText(By.id("txtPassword"),"admin");
        Utils.clickOnElement(By.id("btnLogin"));
        System.out.println(Utils.get_Text(By.id("welcome")));
        Assert.assertEquals(Utils.get_Text(By.id("welcome")),"Welcome Admin");


    }
    @Test
    public static void creatnew_Employee(){
        Utils.clickOnElement(By.id("menu_admin_viewAdminModule"));
        Utils.clickOnElement(By.className("arrow"));
        Assert.assertTrue(Utils.isElementpresent(By.xpath("//input[@id='btnAdd']")));
        Utils.clickOnElement(By.id("btnAdd"));
        Utils.webDriverWaitExplicitly(By.xpath("//h1[@id='UserHeading']"),5);
        Utils.selectElementByVisibletext(By.className("formSelect"),"ESS");
        Utils.enterText(By.id("systemUser_employeeName_empName"),"Fiona Grace");
        Utils.enterText(By.id("systemUser_userName"),"username");
        Utils.selectElementByValue(By.id("systemUser_status"),"1");
        Utils.enterText(By.name("systemUser[password]"),"stev1234");
        Utils.clickOnElement(By.id("btnSave"));
        System.out.println("Registration completed");





    }


    }


