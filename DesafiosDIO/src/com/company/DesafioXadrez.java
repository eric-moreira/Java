package com.company;
import java.util.Scanner;
/*
No tabuleiro de xadrez, a casa na linha 1, coluna 1 (canto superior esquerdo)
é sempre branca e as cores das casas se alternam entre branca e preta,
de acordo com o padrão conhecido como... xadrez! Dessa forma,
como o tabuleiro tradicional tem oito linhas e oito colunas,
a casa na linha 8, coluna 8 (canto inferior direito) será também branca.
Neste problema, entretanto, queremos saber a cor da casa no canto inferior direito
de um tabuleiro com dimensões quaisquer:L linhas e C colunas.
No exemplo da figura, para L = 6 eC = 9, a casa no canto inferior direito será preta.
 */
public class DesafioXadrez {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int L = sc.nextInt();
                int C = sc.nextInt();
                if ((L%2 & C%2)==0)
                    System.out.println("0");
                else                                               //complete o código nos espaços em branco
                    System.out.println("1");
                sc.close();
    }
}


