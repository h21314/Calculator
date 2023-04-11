package com.hetufei.strategy;

import com.hetufei.model.Calculator;

import java.math.BigDecimal;

/**
 * 操作策略类
 * @author hetufei
 */
public interface IOperateStrategy {

    public BigDecimal calculate(BigDecimal operateValue, Calculator calculator);
}
