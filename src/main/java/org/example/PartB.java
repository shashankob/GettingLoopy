package org.example;

public class PartB {

    public static void main(String[] args)
    {
        for (int count = 1; count <= 5; count++)
        {
            for (int cnt = 1; cnt <= count; cnt++)
            {
               System.out.print("*");
            }
            System.out.println();
        }

        for (int counting = 5; counting >= 1; counting--)
        {
            for (int cnts = 1; cnts <= counting; cnts++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int counted = 1; counted <= 5; counted++) {
            for (int cnte = 1; cnte <= 5; cnte++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
