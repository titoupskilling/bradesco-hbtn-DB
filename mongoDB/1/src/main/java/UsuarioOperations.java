import java.util.Arrays;

import org.bson.Document;

import com.mongodb.client.MongoCollection;

public class UsuarioOperations {
    public static void main(String[] args) {
        MongoDBConnection connection = new MongoDBConnection();

        // Exemplo de uso
        if (connection.getDatabase() != null) {
            System.out.println("Banco de dados: " + connection.getDatabase().getName());

            Usuario u1 = new Usuario("Alice", 25);
            Usuario u2 = new Usuario("Bob", 30);
            Usuario u3 = new Usuario("Charlie", 35);

            MongoCollection<Document> collect = connection.getDatabase().getCollection("usuario");

            collect.insertOne(new Document("", u1));
        }

        try {
            // Aguarde para garantir que os processos internos sejam concluídos
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        connection.closeConnection();
    }
}
