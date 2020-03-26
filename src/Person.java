public class Person {
    private String name;

    public Person(String personName){ //the individual Person constructor
        this.name = personName;
    };

        public String getName(){ // gets the person's name
            return this.name;
        };

        public void setName(String x){ // sets the name
            this.name = x;
        };

        public void sayHello(){ // says hello using the person's name
            System.out.println("Hey there, " + this.name);
        };

    public static void main (String [] args){
//        Person dog = new Person("Jimbo");
//        System.out.println(dog.getName());
//        dog.setName("Yo mama");
//        System.out.println(dog.getName() + " is his new name.");
//        dog.sayHello();

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName()); // it's Jane because p1 and p2 point to the same place
        System.out.println(person2.getName());
    }
}
