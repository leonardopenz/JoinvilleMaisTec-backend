package parte01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        //Instanciando/Construindo Objetos
        User user01 = new User();
        User user02 = new User();
        User user03 = new User("Gabriel Lima", "gabriel@gmail.com", "gabriel");

        //Inserindo informações nos objetiso
        user01.name = "Leonardo Penz";
        user01.email = "leonardo@gmail.com";
        user01.password = "123456";

        user02.name = "Davi Saldanha";
        user02.email = "davi@gmail.com";
        user02.password = "1234567";

        users.add(user01);
        users.add(user02);

        System.out.println(user01.details());
        System.out.println(user02.details());
        System.out.println(user03.details());

        System.out.println("------ TELA DE LOGIN --------");
        System.out.print("E-mail: ");
        String email = scan.next();
        System.out.print("Senha: ");
        String password = scan.next();

        boolean flagLogin = false;

        for(User user : users){
            if (user.login(email, password)) {
                flagLogin = true;
                break;
            }
        }

        System.out.println(flagLogin ? "Seja Bem Vindo!" : "E-mail ou Senha incorretos!");

    }
}
