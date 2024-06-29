package calculator;

import java.io.Console;
import java.util.Scanner;

public class CalculatorImpl {
    private Note note = new Note();
    Scanner scanner = new Scanner(System.in);


    public void  menu () {
        System.out.print("Digete sua primeira nota: ");
        double calculatorNota1 = scanner.nextDouble();

        System.out.print("Digete sua segunda nota: ");
        double calculatorNota2 = scanner.nextDouble();

        System.out.print("Digete sua terceira nota: ");
        double calculatorNota3 = scanner.nextDouble();

        note.setNota1(calculatorNota1);
        note.setNota2(calculatorNota2);
        note.setNota3(calculatorNota3);
        note.media = ( note.getNota1() + note.getNota2() + note.getNota3() ) / 3;

        System.out.println("A média do aluno foi: " + note.media);
    }
}
