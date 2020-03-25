public class Person {
    public String name;

    public Person(String personName){ //the individual Person constructor
        name = personName;
    };

    public String getName(){ // gets the person's name
        return name;
    };

    public void setName(String x){ // sets the name property to the passed value
        name = x;
    };

    public void sayHello(String x){ // prints a message to the console using the person's name
        System.out.println("Hey there, " + x);
    };

    public static void main (String [] args){
//        Person dog = new Person("Jimbo");
//        System.out.println(dog.getName());
//        dog.setName("Yo mama");
//        System.out.println(dog.getName() + " is his new name.");
//        dog.sayHello(dog.getName());
//
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName()); // why is this not John??
        System.out.println(person2.getName());
    }
}
