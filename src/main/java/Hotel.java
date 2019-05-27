import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hotel {
    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("In what season are you booking a stay?");
            String season = bufferedReader.readLine();

            System.out.println("On the weekend, or a weeknight?");
            String dayOfWeek = bufferedReader.readLine();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
