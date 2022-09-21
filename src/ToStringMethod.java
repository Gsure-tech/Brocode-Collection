public class ToStringMethod {
    public static void main(String[] args) {
       ConvertToString myCar = new ConvertToString();
        System.out.println(myCar);
    }
}

class ConvertToString{
   String carName = "Toyota";
   int carYear = 2019;
   String color ="red";

   public String  toString(){
String myString = carName + " " + carYear + " " + color;
       return myString;
   }
}