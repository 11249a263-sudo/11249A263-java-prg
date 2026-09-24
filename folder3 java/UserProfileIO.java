import java.io.*;

public class UserProfileIO {
    public static void main(String[] args) throws IOException {

        String data = "Name: Madhulika\nAge: 22\nGoal: Fitness";

        // Write to file
        FileOutputStream fos =
                new FileOutputStream("user_profile.txt");

        fos.write(data.getBytes());
        fos.close();

        // Read from file
        FileInputStream fis =
                new FileInputStream("user_profile.txt");

        int ch;

        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }

        fis.close();
    }
}