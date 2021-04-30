package com.codegym.task.task30.task3008.client;

public class BotClient extends Client {
    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        // The bot must not send the text entered from the console
        return false;
    }

    @Override
    protected String getUserName() {
        // Each time, we generate a new bot name if multiple bots connect to the server
        return "date_bot_" + (int) (Math.random() * 100);
    }

    public static void main(String[] args) {
        // Create and start a client bot
        Client client = new BotClient();
        client.run();
    }

    public class BotSocketThread extends SocketThread {
    }
}