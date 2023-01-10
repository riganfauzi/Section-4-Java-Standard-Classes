package materi.dasar.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ", "{", "} ");

        joiner.add("Rigan");
        joiner.add("Nur");
        joiner.add("Fauzi");

        String value = joiner.toString();
        System.out.println(value);

    }
}
