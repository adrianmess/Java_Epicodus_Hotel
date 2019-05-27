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

            boolean summer = season.equals("summer");
            boolean weekend = dayOfWeek.equals("weekend");

            if (summer && weekend) {
                System.out.println("Your stay is probably going to pretty expensive. It's both peak travel season AND the weekend");
            } else if (summer) {
                System.out.println("Your stay is probably going to be pretty expensive cause it's summer");
            } else if (weekend) {
                System.out.println("Your stat is probably going to be pretty expensive cause it's the weekend");
            } else {
                System.out.println("Your stay might be expensive, but it's not during peak travel season, so it could certainly be worse!");
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
