import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] toto) throws IOException {
        System.out.println("Envoi de requête au serveur...");

        Socket s = new Socket(InetAddress.getLocalHost(), 1234);

        InputStream is = s.getInputStream();

        OutputStream os = s.getOutputStream();

        System.out.println("Veuillez saisir un entier : ");
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();//Récupération de l'entier

        os.write(val);//Permet d'envoyer la valeur saisie au serveur
        int valReceived = is.read();
        System.out.println("Le résultat envoyé par le serveur est " +valReceived);

        s.close();
    }
}
