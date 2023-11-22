package com.infobasic.svilsw;

import java.util.UUID;

public class Feedback {
    UUID id;
    String title;
    String text;
    int score;

    public Feedback(UUID id, String title, String text, int score) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.text = text;
        this.score = score;
    }

    // GETTER
    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public int getScore() {
        return score;
    }

    // SETTER
    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
