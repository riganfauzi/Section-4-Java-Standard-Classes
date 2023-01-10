package materi.dasar.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Rigan");
        builder.append(" ");
        builder.append("Nur");
        builder.append(" ");
        builder.append("Fauzi");

        String name = builder.toString();
        System.out.println(name);

    }
}
