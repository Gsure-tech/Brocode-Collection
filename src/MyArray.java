import java.util.ArrayList;
import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
        String[][]cars = new String[3][2];
        cars[0][0] ="Camry";
        cars[0][1] ="Tesla";
        cars[1][0] ="Toyota";
        cars[1][1] ="Lamborghini";
        cars[2][0] ="Bughatti";
        cars[2][1] ="Ferrari";
       // System.out.println(Arrays.deepToString(cars));
   //String methods
        String name = "Abdul";
        //boolean result = name.equalsIgnoreCase("bro");
        //char result=name.charAt(0);
       // int result = name.indexOf("b");
        String result= name.replace("u","O");
        //String result = name.toLowerCase();
        ArrayList<String>food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
         food.set(0,"sushi");
         food.remove(2);
         food.clear();
//        for (int i = 0; i < food.size(); i++) {
//            System.out.println(food.get(i));
//        }
ArrayList<ArrayList<String>> groceryList = new ArrayList();
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> productList = new ArrayList();
        productList.add("tomato");
        productList.add("zucchini");
        productList.add("peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("soda");
        drinksList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(productList);
        groceryList.add(drinksList);


        //System.out.println(groceryList.get(2).get(1));

       // String[] animals = {"cat","dog", "rat", "bird"};
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bat");
        animals.add("pig");

        for (String myAnimals:animals) {
            System.out.println(myAnimals);

        }
    }
}
