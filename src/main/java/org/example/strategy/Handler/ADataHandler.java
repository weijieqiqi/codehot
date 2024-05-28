package org.example.strategy.Handler;


class ADataHandler extends DataHandler {
    @Override
    public void handleData(Data data) {
        if ("A".equals(data.getSender())) {
            System.out.println("Data handled by ADataHandler");
        } else if (nextHandler != null) {
            nextHandler.handleData(data);
        } else {
            System.out.println("No handler found for the data");
        }
    }
}