package New_topic_Maven;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by welcome on 19/11/2016.
 */
public class TestSuit extends BaseTest  {
    Utils utils = new Utils();
    @Test
    public void varifyUseronHomepage() {
        Assert.assertEquals(Utils.get_Text(By.id("logInPanelHeading")), "LOGIN Panel");
    }
    @Test
    public void userableto_Login (){
        utils.enterText(By.name("txtUsername"),"Admin");
        utils.enterText(By.id("txtPassword"),"admin");
        utils.clickOnElement(By.id("btnLogin"));
        System.out.println(utils.get_Text(By.id("welcome")));
        Assert.assertEquals(utils.get_Text(By.id("welcome")),"Welcome Admin");


    }
    @Test
    public void creatnew_Employee(){
        utils.clickOnElement(By.id("menu_admin_viewAdminModule"));
        utils.clickOnElement(By.className("arrow"));
        Assert.assertTrue(utils.isElementpresent(By.xpath("//input[@id='btnAdd']")));
        utils.clickOnElement(By.id("btnAdd"));
        utils.webDriverWaitExplicitly(By.xpath("//h1[@id='UserHeading']"),5);
        utils.selectElementByVisibletext(By.className("formSelect"),"ESS");
        utils.enterText(By.id("systemUser_employeeName_empName"),"Fiona Grace");
        utils.enterText(By.id("systemUser_userName"),"username");
        utils.selectElementByValue(By.id("systemUser_status"),"1");
        utils.enterText(By.name("systemUser[password]"),"stev1234");
        utils.clickOnElement(By.id("btnSave"));
        System.out.println("Registration completed");





    }


    }


