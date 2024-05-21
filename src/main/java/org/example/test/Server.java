package org.example.test;

import java.lang.reflect.Constructor;

public class Server {
    public static void main(String[] args) {

        try {
            //HungrySingleton instance = HungrySingleton.getInstance();

            Class<HungrySingleton> singletonClass = HungrySingleton.class;

            Constructor<HungrySingleton> constructor = singletonClass.getDeclaredConstructor();

            constructor.setAccessible(true);

            HungrySingleton singleton = constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

       /* try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server started. Waiting for a client...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Client: " + message);
                if (message.equals("你好")) {
                    out.println("你也好");
                } else {
                    out.println("未知消息");
                }
            }
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
