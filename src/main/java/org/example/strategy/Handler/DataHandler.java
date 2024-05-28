package org.example.strategy.Handler;


// 抽象处理器类
abstract class DataHandler {
    protected DataHandler nextHandler;

    public void setNextHandler(DataHandler handler) {
        this.nextHandler = handler;
    }

    public DataHandler getNextHandler() {
        return nextHandler;
    }

    public abstract void handleData(Data data);
}