package OOP;

/**
 * Created by nikolaj on 20.07.17.
 */
public class Oop1 {

    public static void main(String[] args) {

        info info1 = new Animal(1);
        info info2 = new Person("Nooo");
        Animal animal = new Animal(2);





    }


}

class Person implements info{

    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Name is "+this.name);
    }
}

class Animal implements info{

    public void animalMethod(){
        System.out.println("Animal");
    }

    public Animal(int id) {
        this.id = id;
    }

    public int id;
    @Override
    public void showInfo() {
        System.out.println("Id is "+id);
    }
}

interface info{
    public void showInfo();
}


