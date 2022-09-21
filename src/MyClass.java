public class MyClass {
    public static void main(String[] args) {
        Car myCar1 = new Car("Chevrolet",
                "Accord",2022,2000.00);
        Car myCar2 = new Car("Toyota", "Corolla",2020);

        System.out.println(myCar1.name);
        System.out.println(myCar2.name);
        System.out.println(myCar1.model);

        myCar1.brake();
        myCar2.move();


    }
}
