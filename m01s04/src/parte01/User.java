package parte01;

public class User {

    //Atributos
    String name;
    String email;
    String password;

    //Construtor Padrão
    User(){}

    //Construtor parametrizado
    User(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

    //Métodos
    public String details(){
        return String.format("----------- INFORMAÇÕES DO USUÁRIO ------------"+
                "\nNome do usuário: %s" +
                "\nE-mail: %s" +
                "\nPassword: %s", name, email, password);
    }

    public boolean login(String email, String password){
        return this.email.equals(email) && this.password.equals(password);
    }
}
