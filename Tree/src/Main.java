import java.util.List;

public class Main {
    public static void main(String[] args) {

        Persona per1 = new Persona("Петр", "Петров", Persona.Sex.MALE, null);
        Persona per2 = new Persona("Анна", "Лещенкова", Persona.Sex.FEMALE, per1);
        Persona per3 = new Persona("Ольга", "Петрова", Persona.Sex.FEMALE, per2);
        Persona per4 = new Persona("Саша", "Петров", Persona.Sex.MALE, per3);
        Persona per5 = new Persona("Юля", "Петрова", Persona.Sex.FEMALE, per3);
        Persona per6 = new Persona("Алиса", "Лещенкова", Persona.Sex.FEMALE, per5);

        System.out.println("Родитель 1: ");
        for (Persona person : per2.getParents()) {
            System.out.println(person.getNameData());
        }

        System.out.println("Дети: ");
        for (Persona person : per3.getChildren()) {
            System.out.println(person.getNameData());
        }

        System.out.println("Родитель 2: ");
        for (Persona person : per4.getSubParents()) {
            System.out.println(person.getNameData());
       }

       System.out.println("Ребенок: ");
        for (Persona person : per3.getSubChildren()) {
            System.out.println(person.getNameData());
        }
    }
}