import java.util.Random;

public class LocalGlobalClass {

}
class DiceRoller{
    Random myRandom;
    int number =0;
    DiceRoller(){
        myRandom = new Random();
        roll();
    }

    void roll(){
        number = myRandom.nextInt(6)+1;
        System.out.println(number);
    }
}