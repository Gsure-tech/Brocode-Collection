import java.util.Arrays;

public class ArrayOfObjects {
    public static void main(String[] args) {
      Food [] food = new Food[3];

      Food myFood1 = new Food("Tuwo");
      Food myFood2 = new Food("Rice");
      Food myFood3 = new Food("Zomo");

        food[0] = myFood1;
        food[1] = myFood2;
        food[2] = myFood3;
        System.out.println(Arrays.toString(food));
    }
}
class Food {
    String name;
    Food(String name){
        this.name=name;
    }

    public String toString(){
        return name;
    }
}