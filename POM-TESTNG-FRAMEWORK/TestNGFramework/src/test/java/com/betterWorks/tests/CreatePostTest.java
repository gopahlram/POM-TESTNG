package com.betterWorks.tests;
import com.BetterWorks.pages.*;
import org.testng.annotations.Test;

public final class CreatePostTest extends BaseTest{

    private CreatePostTest(){

    }

    String emailId = "hyphen_admin@acmetest.com";
    String code = "34067";

    String type = "Official";
    String group = "Any Suggestion";
    String Post = "this is to test from automation";

    /* create objects for page methods to fetch items */

    LoginPage login = new LoginPage();
    PostCreationPage pc = new PostCreationPage();

    @Test(testName = "Test to validate user able to login into application and create post")
    public void LoginFromUser(){

        login.login(emailId,code);
        pc.createOpenPost(type,group,Post);

    }

}
