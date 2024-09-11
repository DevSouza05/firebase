package com.mycompany.crudfirebase;

import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.auth.oauth2.GoogleCredentials;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author peterson.moraes
 */
public class crudDAL {
    public static Firestore db;
    
    public static void conecta(){
        try {
         FileInputStream serviceAccount = new FileInputStream("crud.json");

        FirebaseOptions options = FirebaseOptions.builder()
            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
            .build();
        
        FirebaseApp.initializeApp(options);
        
        db = FirestoreClient.getFirestore();
        System.out.println("Exito ao conectar");
        } catch(IOException e ){
            System.err.print("Error" + e.getMessage());
        }
       
    }
}
