package org.example.strategy.Handler;

class CDataHandler extends DataHandler {
    @Override
    public void handleData(Data data) {
        if (data.getSender().equals("C")) {
            System.out.println("Data handled by CDataHandler");
        } else if (nextHandler != null) {
            nextHandler.handleData(data);
        } else {
            System.out.println("No handler found for the data");
        }
    }
}