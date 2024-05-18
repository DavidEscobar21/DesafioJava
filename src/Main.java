import com.aluracursos.modelos.ConsultaTasa;
import com.aluracursos.modelos.TasaMonedaOmdb;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        ConsultaTasa consultaTasa = new ConsultaTasa();
        TasaMonedaOmdb tasaMonedaOmdb;
        int opcion;
        double valor;
        double montoCambio;
        System.out.println("Sea Bienvenido/a al Conversor de Moneda:");

        do {
            System.out.println("");
            System.out.println("Ingrese una opcion");
            System.out.println("1. Dolar =>> Peso Argentino");
            System.out.println("2. Peso Argentino =>> Dolar");
            System.out.println("3. Dolar =>> Real Brasileño");
            System.out.println("4. Real Brasileño =>> Dolar");
            System.out.println("5. Dolar =>> Peso Colombiano");
            System.out.println("6. Peso Colombiano =>> Dolar");
            System.out.println("7. Salir");
            opcion = leerEntero(sc, "", "Ha ingresado un caracter no valido");

            switch (opcion) {
                case 1:
                    tasaMonedaOmdb = consultaTasa.buscaTasaMonesa("USD");
                    System.out.println("Ingrese el valor que desea convertir:");
                    valor = leerReal(sc,"","Ha ingresado un caracter no valido");
                    montoCambio = valor * tasaMonedaOmdb.conversion_rates().get("ARS");
                    System.out.println("El valor "+valor+" [USD] Corresponde al valor final de =>>> "+montoCambio+" [ARS]");
                    break;
                case 2:
                    tasaMonedaOmdb = consultaTasa.buscaTasaMonesa("ARS");
                    System.out.println("Ingrese el valor que desea convertir:");
                    valor = leerReal(sc,"","Ha ingresado un caracter no valido");
                    montoCambio = valor * tasaMonedaOmdb.conversion_rates().get("USD");
                    System.out.println("El valor "+valor+" [ARS] Corresponde al valor final de =>>> "+montoCambio+" [USD]");
                    break;
                case 3:
                    tasaMonedaOmdb = consultaTasa.buscaTasaMonesa("USD");
                    System.out.println("Ingrese el valor que desea convertir:");
                    valor = leerReal(sc,"","Ha ingresado un caracter no valido");
                    montoCambio = valor * tasaMonedaOmdb.conversion_rates().get("BRL");
                    System.out.println("El valor "+valor+" [USD] Corresponde al valor final de =>>> "+montoCambio+" [BRL]");
                    break;
                case 4:
                    tasaMonedaOmdb = consultaTasa.buscaTasaMonesa("BRL");
                    System.out.println("Ingrese el valor que desea convertir:");
                    valor = leerReal(sc,"","Ha ingresado un caracter no valido");
                    montoCambio = valor * tasaMonedaOmdb.conversion_rates().get("USD");
                    System.out.println("El valor "+valor+" [BRL] Corresponde al valor final de =>>> "+montoCambio+" [USD]");
                    break;
                case 5:
                    tasaMonedaOmdb = consultaTasa.buscaTasaMonesa("USD");
                    System.out.println("Ingrese el valor que desea convertir:");
                    valor = leerReal(sc,"","Ha ingresado un caracter no valido");
                    montoCambio = valor * tasaMonedaOmdb.conversion_rates().get("COP");
                    System.out.println("El valor "+valor+" [USD] Corresponde al valor final de =>>> "+montoCambio+" [COP]");
                    break;
                case 6:
                    tasaMonedaOmdb = consultaTasa.buscaTasaMonesa("COP");
                    System.out.println("Ingrese el valor que desea convertir:");
                    valor = leerReal(sc,"","Ha ingresado un caracter no valido");
                    montoCambio = valor * tasaMonedaOmdb.conversion_rates().get("USD");
                    System.out.println("El valor "+valor+" [COP] Corresponde al valor final de =>>> "+montoCambio+" [USD]");
                    break;
            }
        } while (opcion != 7);
    }

    public static int leerEntero(Scanner sc,String mensaje, String mensajeError) {
        int retval = 0;
        System.out.println(mensaje);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println(mensajeError);
        }
        retval = sc.nextInt();
        sc.nextLine();
        return retval;
    }

    public static double leerReal(Scanner sc,String mensaje, String mensajeError) {
        double retval = 0;
        System.out.println(mensaje);
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println(mensajeError);
        }
        retval = sc.nextDouble();
        sc.nextLine();
        return retval;
    }

}