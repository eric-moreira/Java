package com.company;
import java.util.Scanner;
/*
On the chessboard, the square in row 1, column 1 (upper left corner)
it's always white and the house colors alternate between white and black,
according to the pattern known as... chess! In this way,
as the traditional board has eight rows and eight columns,
the square in row 8, column 8 (bottom right) will also be white.
In this problem, however, we want to know the color of the square in the lower right corner.
of a board with any dimensions: L rows and C columns.
In the example in the figure, for L = 6 and C = 9, the square in the lower right corner will be black.
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


