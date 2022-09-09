package com.cydeo.tests;

import com.cydeo.pages.CalculatorPage;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorPOMTest {

    CalculatorPage calculatorPage = new CalculatorPage();

    @Test
    public void multiplyTest(){
        calculatorPage.clickDigit(5);
        calculatorPage.multiply.click();
        calculatorPage.clickDigit(8);
        calculatorPage.equals.click();
        String actualResult=calculatorPage.result.getText();
        assertEquals(40,  Integer.parseInt(actualResult) );

    }



}
