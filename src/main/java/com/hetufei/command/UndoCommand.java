package com.hetufei.command;

/**
 * undo命令
 * @author hetufei
 */
public interface UndoCommand extends Command{

    /**
     * undo操作
     */
    void undo();
}
