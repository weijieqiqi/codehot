package org.example.strategy.Handler;

// 客户端代码
public class Client {
    public static void main(String[] args) {
        ADataHandler handlerA = new ADataHandler();
        DataHandler handlerB = new BDataHandler();
        DataHandler handlerC = new CDataHandler();
/*
        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);*/
/*
        handlerA.handleData(new Data("A"));
        handlerA.handleData(new Data("B"));*/
        handlerA.handleData(new Data("C"));

    }
}