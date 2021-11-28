package com.example.clone_gmail_ui;

public class ItemModel {
    private int avatarResource;
    private String title;
    private String content;
    private String subject;
    private String time;

    public ItemModel(int avatarResource, String title, String subject,String content,String time) {
        this.avatarResource = avatarResource;
        this.title = title;
        this.content = content;
        this.subject = subject;
        this.time=time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAvatarResource() {
        return avatarResource;
    }

    public void setAvatarResource(int avatarResource) {
        this.avatarResource = avatarResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
