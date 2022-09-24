package src;

public class FunctionAsData {

    protected static class Person {
        private String name;
        private int age;

        Person(final String name,final Integer age){
            this.age=age;
            this.name=name;
        }
    }

    protected static class DataLoader {

        private final NoArgFunction<Person> loadPerson;

        public DataLoader(final boolean devMode){
            this.loadPerson=devMode?this::loadFakePerson:this::loadPersonReal;

        }

        private Person loadPersonReal() {
            System.out.println("----Loading Person---");
            return new Person("Real",30);
        }

        private  Person loadFakePerson() {
            System.out.println("--returning fake person---");
            return new Person("Fake",30);
        }


    }

    public static void main(String[] args) {
        final boolean isDevMode = false;
        DataLoader dataLoader = new DataLoader(isDevMode);
        System.out.println(dataLoader.loadPerson.apply());
    }

}


