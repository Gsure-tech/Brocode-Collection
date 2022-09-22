import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue");
            writer.append("\n(A poem by Geeee)");
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
