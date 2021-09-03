package com.example.whatsapp_recylerview.Model;

public class ModelWhatsappChat {
    private int profile;
    private int send;
    private String personName;
    private String personMessage;
    private String messageTime;

    public ModelWhatsappChat(int profile, int send, String personName, String personMessage, String messageTime) {
        this.profile = profile;
        this.send = send;
        this.personName = personName;
        this.personMessage = personMessage;
        this.messageTime = messageTime;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public int getSend() {
        return send;
    }

    public void setSend(int send) {
        this.send = send;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonMessage() {
        return personMessage;
    }

    public void setPersonMessage(String personMessage) {
        this.personMessage = personMessage;
    }

    public String getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime;
    }
}
