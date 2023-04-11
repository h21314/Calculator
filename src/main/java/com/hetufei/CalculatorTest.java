package com.hetufei;

import com.hetufei.enums.OperatorEnum;
import com.hetufei.model.Calculator;
import com.hetufei.service.ICalculatorManagerService;
import com.hetufei.service.impl.CalculatorManagerServiceImpl;

import java.math.BigDecimal;

/**
 * 计算器测试入口类
 * @author hetufei
 */
public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        ICalculatorManagerService calculatorManager = new CalculatorManagerServiceImpl(calculator);

        calculatorManager.execute(BigDecimal.valueOf(1), OperatorEnum.ADD);
        System.out.println("result=" + calculator.getResult());

        calculatorManager.execute(BigDecimal.valueOf(5), OperatorEnum.ADD);
        System.out.println("result=" + calculator.getResult());

        calculatorManager.execute(BigDecimal.valueOf(2), OperatorEnum.SUBTRACT);
        System.out.println("result=" + calculator.getResult());

        calculatorManager.execute(BigDecimal.valueOf(4), OperatorEnum.MULTIPLY);
        System.out.println("result=" + calculator.getResult());

        calculatorManager.execute(BigDecimal.valueOf(2), OperatorEnum.DIVIDE);
        System.out.println("result=" + calculator.getResult());


        calculatorManager.redo();
        System.out.println("first redo result = " + calculator.getResult());


        calculatorManager.redo();
        System.out.println("second redo result = " + calculator.getResult());

        calculatorManager.undo();
        System.out.println("undo first result = " + calculator.getResult());

        calculatorManager.undo();
        System.out.println("undo second result = " + calculator.getResult());

        calculatorManager.redo();
        System.out.println("redo second result = " + calculator.getResult());

        calculatorManager.redo();
        System.out.println("redo second result = " + calculator.getResult());
    }

    //正常加减乘除，四个简单用例，其中除法2个

    //一个加减乘除都有的case

    //加减乘除，单undo

    //加减乘除，单undo+redo

    //加减乘除，只有redo

    //加减乘除，只有redo+undo

    //加减乘除，只有redo+undo

    //加减乘除，double undo

    //加减乘除，double undo + double redo

    //加减乘除，double undo + three redo


}