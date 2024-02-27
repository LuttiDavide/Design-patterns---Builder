public class Main {
    public static void main(String[] args) {

        Person person1 = new Person.Builder("Mario", "Rossi")
                .age(30)
                .address("Via Roma 12, Milano")
                .build();

        Person person2 = new Person.Builder("Anna", "Verdi")
                .age(25)
                .build();

        System.out.println(person1);
        System.out.println(person2);
    }
}