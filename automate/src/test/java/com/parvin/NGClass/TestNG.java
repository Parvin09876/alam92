package com.parvin.NGClass;

import org.testng.annotations.*;

public class TestNG {
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
       System.out.println("Before Method");
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
    public void afterMethd(){
       System.out.println("after Method");
   }
   @AfterClass
    public void afterClass(){
       System.out.println("After Class");
   }
   @AfterSuite
    public void afterSuite(){
       System.out.println("After Suite");
   }

}
