package com.mycompany.patrones.NotifiacionesAdapter;

public class WhatsAppAdapter implements Notifier {

    private WhatsAppService service;

    public WhatsAppAdapter() {
        this.service = new WhatsAppService();
    }

    @Override
    public void sendNotification(String message) {
        // Adaptar la llamada al servicio de WhatsApp
        service.sendMessage(message);
    }
}
