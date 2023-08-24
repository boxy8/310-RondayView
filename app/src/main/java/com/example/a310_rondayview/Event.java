package com.example.a310_rondayview;

<<<<<<< HEAD
import com.google.firebase.firestore.DocumentId;
=======

import com.google.firebase.Timestamp;
>>>>>>> main

import java.util.Date;

public class Event {
<<<<<<< HEAD
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
=======
    public String getEventID() {
        return eventID;
    }

    public String getClubName() {
        return clubName;
>>>>>>> main
    }

    public String getTitle() {
        return title;
    }

<<<<<<< HEAD
    public void setTitle(String title) {
        this.title = title;
    }

=======
>>>>>>> main
    public String getDescription() {
        return description;
    }

<<<<<<< HEAD
    public void setDescription(String description) {
        this.description = description;
    }

=======
>>>>>>> main
    public String getLocation() {
        return location;
    }

<<<<<<< HEAD
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
=======
    public Timestamp getDateTime() {
        return dateTime;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getEventClubProfilePicture() {
        return eventClubProfilePicture;
    }

    private String eventID;
    private String clubName;
    private String title;
    private String description;
    private String location;
    private Timestamp dateTime; // firestore default timestamp
    private String imageURL;
    private String eventClubProfilePicture;

    public Event() {
        // Default constructor for Firestore deserialization
    }

    public Event(String eventID, String clubName, String title, String description, String location, Timestamp dateTime, String imageURL, String eventClubProfilePicture) {
        this.eventID = eventID;
        this.clubName = clubName;
        this.title = title;
        this.description = description;
        this.location = location;
        this.dateTime = dateTime;
        this.imageURL = imageURL;
        this.eventClubProfilePicture = eventClubProfilePicture;
    }

    void updateDetails(){}
    void delete(){}
>>>>>>> main


}
