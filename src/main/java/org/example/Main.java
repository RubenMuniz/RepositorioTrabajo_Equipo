package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Ya se pudo");
        System.out.println("Hola bb ");
        System.out.println("Hola ");
        int opc;
        do{
            try {
                System.out.println("---------------------");
                System.out.println("----PLATAFORMA DE STRAMING----");
                System.out.println("1.- Registrar Usuario");
                System.out.println("2.- Mostrar Reporte");
                System.out.println("3.- Salir");
                System.out.println("Elije una opcion");
                opc = sc.nextInt();
                sc.nextLine();
                switch (opc){
                    case 1:
                        System.out.println("---------------");
                        System.out.println("----REGISTRAR USUARIO----");
                        System.out.println("Ingrese el Correo Electronico:");

                        System.out.println("Ingresa los meses Contraados");

                        System.out.println("Selecciona el tipo de Cuenta:");
                        System.out.println("1.-Cuenta Basica");
                        System.out.println("2.-Cuenta Estandar");
                        System.out.println("3.-Cuenta Premiun");
                        System.out.println("Elije una opcion");

                        CuentaUsuario Cuenta;
                        switch (opcionCuenta){
                            case 1:


                        }
                }


            }
        }
    }
}
