package com.mycompany.crudfirebase;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class Provider {

    private static Firestore db;

    // Inicializa o Firestore
    static {
        db = FirestoreClient.getFirestore();
    }

    public static boolean insertPersona(String collection, String doc, Map<String, Object> data) {
        try {
            DocumentReference docRef = db.collection(collection).document(doc);
            ApiFuture<WriteResult> result = docRef.set(data);
            System.out.println("Inserido com sucesso!");
            return true;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return false;
    }

    public static boolean updatePersona(String collection, String doc, Map<String, Object> data) {
        try {
            DocumentReference docRef = db.collection(collection).document(doc);
            ApiFuture<WriteResult> result = docRef.update(data);
            System.out.println("Atualizado com sucesso!");
            return true;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return false;
    }

    public static boolean deletePersona(String collection, String doc) {
        try {
            DocumentReference docRef = db.collection(collection).document(doc);
            ApiFuture<WriteResult> result = docRef.delete();
            System.out.println("Êxito ao deletar!");
            return true;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return false;
    }
    
    
    
     public static Map<String, Object> getPersona(String collection, String doc) {
        try {
            DocumentReference docRef = db.collection(collection).document(doc);
            ApiFuture<DocumentSnapshot> future = docRef.get();
            DocumentSnapshot document = future.get();

            if (document.exists()) {
                return document.getData();
            } else {
                return null;
            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return null;
    }
    
    
    public static void carregarTablePersona(JTable table) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Título");
        model.addColumn("Autor");
        model.addColumn("ID");
        model.addColumn("Editora");
        
        

        try {
            CollectionReference personas = db.collection("Persona");
            ApiFuture<QuerySnapshot> querySnap = personas.get();
            QuerySnapshot querySnapshot = querySnap.get();

            for (DocumentSnapshot document : querySnapshot.getDocuments()) {
                model.addRow(new Object[]{
                    document.getString("Nome"),
                    document.getString("Sobrenome"),
                    document.getString("CPF"),
                    document.getString("Email")
                });
            }

        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }

        table.setModel(model);
    }
}
