import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException
    {
        System.out.println("Serveur démarré... ");

        ServerSocket ss = new ServerSocket (1234);
        Socket s = ss.accept();
        System.out.println("Un client connecté !!");

        InputStream is = s.getInputStream();

        OutputStream os = s.getOutputStream();

        int nb = is.read();
        System.out.println("Requête reçue !!");
        int result = nb*2;

        os.write(result);
        System.out.println("Résultat envoyé !!");
    }
}
