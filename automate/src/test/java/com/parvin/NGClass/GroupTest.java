package com.parvin.NGClass;

import org.testng.annotations.Test;

//public class GroupTest {
//    @Test(groups ={"sanity"})
//    public void test1 (){
//        System.out.println("Test-1");
//    }
//    @Test(groups = {"sanity"})
//    public void test2(){
//        System.out.println("Test-2");
//    }
//    @Test(groups = {"regression"})
//    public  void test3(){
//        System.out.println("Test-3");
//    }
//    @Test(groups = {"sanity","regression"})
//    public void test4(){
//        System.out.println("Test-4");
//    }
//    @Test(groups = {"regression"})
//    public void test5(){
//        System.out.println("Test-5");
//    }
//}
public class GroupTest{
    @Test(groups = {"sanity"})
    public void test1(){
        System.out.println("Test-1");
    }
    @Test(groups = {"sanity"})
    public void test2(){
        System.out.println("Test-2");
    }
    @Test(groups = {"regression"})
    public void test3() {
        System.out.println("Test-3");
    }
    @Test(groups = {"sanity","regression"})
    public void test4(){
        System.out.println("Test-4");
    }
    @Test(groups = {"regression"})
    public void test5(){
        System.out.println("Test-5");
    }
}