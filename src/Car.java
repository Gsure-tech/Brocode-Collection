public class Car {
    String name;
    String model;
    int year;
    double price;
        //Constructors
        Car(String suna,String cala,int shekara){
            this.name =suna;
            this.model=cala;
            this.year=shekara;

        };
    Car(String suna,String cala,int shekara, double farashi){
        this.name =suna;
        this.model=cala;
        this.year=shekara;
        this.price=farashi;
    };
    void move(){
        System.out.println(this.name + " is moving");
    }
    void brake(){
        System.out.println(this.name + " just applied brake");
    }

}
