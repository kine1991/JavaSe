package patterns.abstractFactory;

public class AbstractFactory {


    public static void main(String[] args) {

        Factory carFactory = new AbstractFactory1().createFactory("Car");
        Factory tankFactory = new AbstractFactory1().createFactory("Tank");


    }


}

interface Car{
    void drive();
}


class Toyota implements Car{

    @Override
    public void drive() {
        System.out.println("drive Toyota");
    }
}
class Audi implements Car{

    @Override
    public void drive() {
        System.out.println("drive Audi");
    }
}




class CarFactory implements Factory{
    public Car createCar(String typeOfCar){
        switch (typeOfCar){
            case "Toyota" : return new Toyota();
            case "Audi" : return new Audi();
            default:return null;
        }

    }

    @Override
    public Tank createTank(String typeOfTank) {
        return null;
    }

}













interface Tank{
    void drive();
}


class T51 implements Tank{

    @Override
    public void drive() {
        System.out.println("drive t51");
    }
}
class T52 implements Tank{

    @Override
    public void drive() {
        System.out.println("drive t52");
    }
}




class TankFactory implements Factory {
    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }

    public Tank createTank(String typeOfCar){
        switch (typeOfCar){
            case "t51" : return new T51();
            case "t52" : return new T52();
            default:return null;
        }

    }

}

interface Factory{
    Car createCar(String typeOfCar);
    Tank createTank(String typeOfTank);
}

class AbstractFactory1{
    public Factory createFactory (String typeOfFactory){
        switch (typeOfFactory){
            case "Car" : return new CarFactory();
            case "Tank" : return new TankFactory();
            default: return null;

        }
    }
}
