package org.example.strategy.Handler;

class BDataHandler extends DataHandler {
    @Override
    public void handleData(Data data) {
        if (data.getSender().equals("B")) {
            System.out.println("Data handled by BDataHandler");
        } else if (nextHandler != null) {
            nextHandler.handleData(data);
        } else {
            System.out.println("No handler found for the data");
        }
    }
}
