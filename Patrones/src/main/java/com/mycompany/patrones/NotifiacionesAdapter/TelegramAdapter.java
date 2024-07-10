package com.mycompany.patrones.NotifiacionesAdapter;

public class TelegramAdapter implements Notifier {

    private TelegramService service;

    public TelegramAdapter() {
        this.service = new TelegramService();
    }

    @Override
    public void sendNotification(String message) {
        // Adaptar la llamada al servicio de Telegram
        service.sendMessage(message);
    }
}

