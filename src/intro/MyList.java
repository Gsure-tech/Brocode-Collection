package intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyList {

    public static void main(String[] args) {
        List<String> carTypes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter car " + i);
            String firstCar  = sc.nextLine();
            carTypes.add(firstCar);
        }
        System.out.println(carTypes);
    }


}
