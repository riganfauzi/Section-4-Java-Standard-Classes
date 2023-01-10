package materi.dasar.classes;

public class StringApp {
    public static void main(String[] args) {

        String name = "Rigan Nur Fauzi";
        String nameLowerCase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();


        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUppercase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Rigan"));
        System.out.println(name.endsWith("Fauzi"));

        String[] names = name.split(" ");
        for (var value : names){
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(name.charAt(0));

        char[] chars =  name.toCharArray();
    }
}
