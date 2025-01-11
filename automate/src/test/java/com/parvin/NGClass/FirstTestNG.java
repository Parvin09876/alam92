package com.parvin.NGClass;

import org.testng.annotations.*;

public class FirstTestNG {
   @BeforeSuite
   public void beforeSuite(){
       System.out.println("Before Suite");
   }
   @BeforeTest
    public void beforeTest(){
       System.out.println("Before Test");
   }
   @BeforeClass
    public void beforeClass(){
       System.out.println("Before Class");
   }
   @BeforeMethod
    public void beforeMethod(){
       System.out.println("before Method");
   }
   @Test
    public void test1(){
       System.out.println("Test 1");
   }
   @Test
    public void test2(){
       System.out.println("Test 2");
   }
   @AfterMethod
    public void afterMethod() {
       System.out.println("After Method");
   }
   @AfterClass
    public void afteClass(){
       System.out.println("After Class");
   }
   @AfterTest
    public void afterTest(){
       System.out.println("after Test");
   }
   @AfterSuite
    public void  afterSuite(){
       System.out.println("After Suite");
   }
}

