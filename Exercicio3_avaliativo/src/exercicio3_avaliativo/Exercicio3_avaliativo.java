/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3_avaliativo;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Exercicio3_avaliativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner multiplo = new Scanner (System.in);
        System.out.println("Digite o primeiro número: ");
        double n1 = multiplo.nextDouble();
        System.out.println("Digite o segundo número: ");
        double n2 = multiplo.nextDouble();
        
        System.out.println(n1%n2 == 0? "O primeiro número é multiplo do segundo número": "O primeiro número não é multiplo do segundo número");
    }
    
}
