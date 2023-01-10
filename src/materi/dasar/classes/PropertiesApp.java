package materi.dasar.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {

        try {
            Properties properties1 = new Properties();

            String host = properties1.getProperty("database.host");
            String port = properties1.getProperty("database.port");
            String username = properties1.getProperty("database.username");
            String password = properties1.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);

            properties1.load(new FileInputStream("application.properties"));
        }   catch (FileNotFoundException exception) {
            System.out.println("File tidak ketemu");
        }   catch (IOException exception) {
            System.out.println("Gagal load data dari file");
        }

        try {
            Properties properties = new Properties();
            properties.put("name,first", "Eko");
            properties.put("name,middle", "Kurniawan");
            properties.put("name,last", "Khannedy");

            properties.store(new FileOutputStream("name.properties"), "Konfigurasi Nama");
        }   catch (FileNotFoundException exception){
            System.out.println("Error membuat file properties");
        }   catch (IOException e) {
            System.out.println("Error menyimpan properties");
        }

    }
}
