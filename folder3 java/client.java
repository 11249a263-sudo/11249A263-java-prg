import java.net.*;
import java.io.*;

class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);

        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(s.getInputStream()));

        pw.println("Hello Server");
        System.out.println("Server: " + br.readLine());

        s.close();
    }
}
