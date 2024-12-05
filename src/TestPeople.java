public class TestPeople {
    public static void main(String args[]) {
        Person aPerson;
        Boy jimmy;
        Girl betty;
        aPerson = new Person("Fred");
        jimmy = new Boy();
        betty = new Girl("Betty");

        // Boy b = new Person();  // Throw Error - downcast (Boy)new Person()?
        // Girl g = new Person()  // Throw Error
        System.out.println(aPerson);
        System.out.println(aPerson.talk());
        System.out.println(aPerson.walk());
        System.out.println();

        System.out.println(jimmy);
        System.out.println(jimmy.talk());
        System.out.println(jimmy.walk());
        System.out.println();

        System.out.println(betty);
        System.out.println(betty.talk());
        System.out.println(betty.walk());
        System.out.println();

        // upcasting Boy obj to Person obj, but still using Boy methods.
        System.out.println((Person)jimmy);
        System.out.println(((Person)jimmy).talk());
        System.out.println(((Person)jimmy).walk());
        System.out.println();

        System.out.println((Person)betty);
        System.out.println(((Person)betty).talk());
        System.out.println(((Person)betty).walk());
        System.out.println();

        //static method lifeSpan() can be assessed directly with class name
        System.out.println(Person.lifeSpan());
        System.out.println(Boy.lifeSpan()); //return 60 using the method and variable in Person class
        System.out.println(Girl.lifeSpan()); // has itw own lifespan() method

        System.out.println(((Boy)aPerson).talk());
    }
}

