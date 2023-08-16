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
    void updateEvent(){
        // TODO
    }
    void deleteEvent(){
        // TODO
    }
    public void getAllEvents(OnCompleteListener<QuerySnapshot> onCompleteListener){
        eventsCollectionReference.get().addOnCompleteListener(onCompleteListener);
    }
    void getLikedEvents(){
        // TODO
    }


}
