package com.example.a310_rondayview;

import android.os.Bundle;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

public class EventsFirestoreManager {

    private static EventsFirestoreManager eventsFirestoreManager;

    private CollectionReference eventsCollectionReference;
    private FirebaseFirestore firebaseFirestore;

    private EventsFirestoreManager (){
        firebaseFirestore = FirebaseFirestore.getInstance();
    }

    public static EventsFirestoreManager getInstance(){
        if(eventsFirestoreManager == null){
            eventsFirestoreManager = new EventsFirestoreManager();
        }
        return eventsFirestoreManager;
    }

    public void addEvent(Event event){
        eventsCollectionReference.add(event);
    }

    /**
     * Updates the event in the database with the new event
     * @param event
     */
    public void updateEvent(Event event){
        String documentId = event.getDocumentId();
        eventsCollectionReference.document(documentId).set(event);
    }
    void deleteEvent(String documentId){
        eventsCollectionReference.document(documentId).delete();
    }
    public void getAllEvents(OnCompleteListener<QuerySnapshot> onCompleteListener){
        eventsCollectionReference.get().addOnCompleteListener(onCompleteListener);
    }
    void getLikedEvents(){
        // TODO
    }

}
