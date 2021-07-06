package com.BetterWorks.pages;
import com.BetterWorks.constants.FrameworkConstants;
import com.BetterWorks.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PostCreationPage extends BasePage {


    /* Declare Web Elements Here */

    private final By createPostBtn = By.xpath("//button[@id='create-button']");
    private final By openBtn = By.xpath("//button[text()='OPEN']");
    private final By selectField = By.xpath("//div[@class='Select-placeholder']");
    private final By validate = By.xpath("//div[@class=\"Select-value\"]/span");
    private final By selectBtn = By.xpath("//button[text()='Select']");
    private final By textArea = By.xpath("//textarea");
    private final By publishPostBtn = By.xpath("//button[text()='Publish post']");
    private final By validatePost = By.xpath("//div[contains(@class,'actionTile') and contains(@class,'selected')]");

    /* Declare Strings here */

    private final String postType = "//span[text()='%s']/parent::label//input";
    private final String validateType = "//span[text()='%s']/parent::label/span[contains(@class,'ant-radio-checked')]";
    private final String option = "//div[@class=\"Select-menu-outer\"]//div[text()='%s']";


    /*                  ----------- Declare Page Object Methods -----------------                       */




    /*  This method is to Click create post in home page and select the option from popup
     *
     *   */


    public PostCreationPage clickAndSelectPostOption(String type){

        By element = By.xpath(String.format(postType,type));
        By validateEle = By.xpath(String.format(validateType,type));

        click(createPostBtn);
        System.out.println("User able to click on create post button");
        clickUsingJS(DriverManager.getDriver().findElement(element));
        System.out.println("User able to Select post type as "+type);
        explicitlyWaitForElementVisibility(validateEle,FrameworkConstants.midWaitTime);

        return this;
    }


    /*  This method is to select the group from dropdown in create post popup
     *
     *   */

    public PostCreationPage selectGroup(String group) {

        By element = By.xpath(String.format(option,group));

        click(selectField);
        click(element);
        explicitlyWaitForElementVisibility(validate,FrameworkConstants.midWaitTime);
        click(selectBtn);
        System.out.println("User able to select group "+group);
        return this;
    }


    /*  This method is to create and validate open post
     *
     *   */

    public PostCreationPage createOpenPost(String postType, String group,String post) {

        clickAndSelectPostOption(postType);
        click(openBtn);
        selectGroup(group);
        send(textArea,post);
        click(publishPostBtn);
        explicitlyWaitForElementVisibility(validatePost,FrameworkConstants.midWaitTime);

        return this;
    }


    /*  This method is to create and validate multiple choice post Need to be implement
     *
     *   */
    public PostCreationPage createMultipleChoicePost(String postType, String QuestionType) {

        return this;
    }


}