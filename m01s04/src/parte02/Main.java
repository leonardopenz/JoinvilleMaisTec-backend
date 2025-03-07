package parte02;

import parte01.User;

public class Main {

    public static void main(String[] args) {
        User user01 = new User();

        Calculadora calc = new Calculadora();

        System.out.println(calc.somarValores(5, 10));
        System.out.println(calc.somarValores(10, 10, 10));
    }
}