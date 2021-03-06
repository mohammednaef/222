package com.example.finalprojectm;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashemRegisterActivityTest {

    RegisterActivity registerActivity;

    @Before
    public void SetUp(){
        registerActivity = new RegisterActivity();
    }

    @Test
    public void ValidEmailAddress_test1()throws Exception{
        Assert.assertTrue("Email is Valid",registerActivity.isValidEmail("hashem@gmail.com"));
    }

    @Test
    public void inValidEmailAddress_test2()throws Exception{
        Assert.assertFalse("Email is Not Valid",registerActivity.isInValidEmail("hashemgmail.com"));
    }

    @Test
    public void inValidEmailAddress_test3()throws Exception{
        Assert.assertFalse("Email is Not Valid",registerActivity.isInValidEmail("hashem@.com"));
    }

    @Test
    public void inValidEmailAddress_test4()throws Exception{
        Assert.assertFalse("Email is Not Valid",registerActivity.isInValidEmail("hashem@gmail."));
    }

    @Test
    public void inValidEmailAddress_test5()throws Exception{
        Assert.assertFalse("Email is Not Valid",registerActivity.isInValidEmail("hashem@gmailcom"));
    }

    @Test
    public void isEmptyEmail_test6()throws Exception{
        Assert.assertFalse("Email is Empty",registerActivity.isEmptyEmail(""));
    }

    @Test
    public void isValidPassword_test7()throws Exception{
        Assert.assertTrue("Password is Valid",registerActivity.isValidPassword(""));
    }

}
