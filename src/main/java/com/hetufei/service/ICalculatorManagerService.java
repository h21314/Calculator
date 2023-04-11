package com.hetufei.service;


import com.hetufei.enums.OperatorEnum;

import java.math.BigDecimal;

/**
 * 计算器管理接口
 */
public interface ICalculatorManagerService {

    /**
     * 执行指令
     * @param operateValue 被操作数
     * @param operatorEnum 操作类型
     * @return 计算结果
     */
    BigDecimal execute(BigDecimal operateValue, OperatorEnum operatorEnum);

    /**
     * undo操作
     */
    void undo();

    /**
     * redo操作
     */
    void redo();
}
