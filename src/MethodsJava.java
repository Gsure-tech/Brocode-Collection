public class MethodsJava {
    public static void main(String[] args) {
      String name = "Bro";
      int age =25;
       //hello(name,age);
        int x =3;
        int y =4;
        //int z = add(x,y);
        System.out.println(add(y,x));

    }
//   static void  hello(String name, int age){
//       System.out.println("Hello " + name);
//       System.out.println("you are " + age);
 //  }
    //Methods Overloading
   static int add(int x, int y){
        int z=x-y;
        return z;
   }
}
