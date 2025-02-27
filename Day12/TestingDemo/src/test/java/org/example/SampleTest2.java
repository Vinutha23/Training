package org.example;

import org.junit.jupiter.api.*;

public class SampleTest2 {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before all test cases");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("After all test cases");
    }
    @BeforeEach
    public void setUP(){
        System.out.println("DB Connected");
    }
    @AfterEach
    public void Down(){
        System.out.println("DB dis-Connected");
    }
    @Test
    public void myTest1(){
        System.out.println("Test 1 executed");
    }
    @Test
    public void myTest2(){
        System.out.println("Test 2 executed");
    }
}
