package parte01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        //Instanciando-Criando objetos
        User user01 = new User();
        User user02 = new User();
        User user03 = new User("Gabriel Lima", "gabriel@gmail.com", "gabriel");

        System.out.println(user01.details());
        System.out.println(user02.details());

        //Inserir informações nos objetos
        user01.setName("Davi Saldanha");
        user01.setEmail("davi@gmail.com");
        user01.resetPassword("123mudar");

        user02.setName("Carla Alves");
        user02.setEmail("carla@gmail.com");
        user02.resetPassword("123carla");

        users.add(user01);
        users.add(user02);

        System.out.println(user01.details());
        System.out.println(user02.details());
        System.out.println(user03.details());


        System.out.println("--- TELA DE LOGIN ---");
        System.out.print("Email: ");
        String email = scan.next();
        System.out.print("Password: ");
        String password = scan.next();

        boolean flaglogin = false;

        for(User user : users){
            if (user.login(email, password)){
                flaglogin = true;
                break;
            }
        }

        System.out.println(flaglogin ? "Seja Bem-Vindo!" : "Email ou senha incorretos!");


        while(true) {
            System.out.println("RESET DE SENHA: ");
            if (user01.resetPassword(scan.next())) {
                System.out.println("Senha alterada com sucesso!");
            } else {
                System.out.println("A senha não pode ser uma utilizada anteriormente!");
                break;
            }
        }

    }

}