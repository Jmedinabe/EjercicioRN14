package com.mycompany.ejerciciorn14;
import java.util.Scanner;
public class EjercicioRN14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese las ventas del vendedor del departamento 1: ");
        double VD1 = scanner.nextDouble();
        System.out.print("Ingrese las ventas del vendedor del departamento 2: ");
        double VD2 = scanner.nextDouble();
        System.out.print("Ingrese las ventas del vendedor del departamento 3: ");
        double VD3 = scanner.nextDouble();
        System.out.print("Ingrese el salario base: ");
        double SALAR = scanner.nextDouble();

        double TOTVEN = VD1 + VD2 + VD3;
        double PORVEN = 0.33 * TOTVEN;

        double SALAR1, SALAR2, SALAR3;
        if (VD1 > PORVEN) {
            SALAR1 = SALAR + 0.2 * SALAR;
        } else {
            SALAR1 = SALAR;
        }

        if (VD2 > PORVEN) {
            SALAR2 = SALAR + 0.2 * SALAR;
        } else {
            SALAR2 = SALAR;
        }

        if (VD3 > PORVEN) {
            SALAR3 = SALAR + 0.2 * SALAR;
        } else {
            SALAR3 = SALAR;
        }

        System.out.println("SALARIO VENDEDORES DEPTO. 1: " + SALAR1);
        System.out.println("SALARIO VENDEDORES DEPTO. 2: " + SALAR2);
        System.out.println("SALARIO VENDEDORES DEPTO. 3: " + SALAR3); //EN EL EJERCICIO HAY UN ERROR, PORQUE TOTVEN=10MILL. NO SON 9.7MILL.
        scanner.close();
    }
}
