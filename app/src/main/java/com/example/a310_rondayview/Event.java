package com.example.a310_rondayview;

import com.google.firebase.firestore.DocumentId;

import java.util.Date;

public class Event {
    @DocumentId
    private String documentId;
    private String title;
    private String description;
    private String location;
    private Date time;

    public Event() {}
    public Event(String title, String description, String location, Date time) {
        this.title = title;
        this.description = description;
        this.location = location;
        this.time = time;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    void updateDetails(){
        // TODO
    }
    void delete(){
        // TODO
    }


}
