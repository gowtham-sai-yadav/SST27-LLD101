package com.example.notifications;

public class SmsDecorator extends NotifierDecorator {
    private final String phone;

    public SmsDecorator(Notifier wrappee, String phone) {
        super(wrappee);
        this.phone = phone;
    }

    @Override
    public void notify(String text) {
        wrappee.notify(text);
        System.out.println("[SMS -> " + phone + "]: " + text);
    }
}


