package com.chriscoronel.conversordemonedas.principal;

import com.chriscoronel.conversordemonedas.modelos.ConversorMonedasService;
import com.chriscoronel.conversordemonedas.modelos.OperacionCambio;
import com.chriscoronel.conversordemonedas.modelos.SeleccionMoneda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuConversor {
    public void mostrar() {

        Scanner scanner = new Scanner(System.in);

        ConversorMonedasService conversor = new ConversorMonedasService();
        OperacionCambio operador = new OperacionCambio();

        String menu = """
                ==========================
                |   Conversor de Monedas  |
                ==========================
                1. Peso Mexicano =>> Dolar Estadounidense
                2. Libra Esterlina =>> Euro
                3. Bolivar Venezolano =>> Yen
                4. Real Brasileno =>> Renminbi
                5. Peso Argentino =>>Dolar Canadiense
                6. Peso Chileno =>> Rupia India
                7. Salir
                Elige una opción:
                """;
        int opcion = 0;

        while ( opcion != 7){

            System.out.println(menu);
//            opcion = scanner.nextInt();

            if (scanner.hasNextInt()){
                opcion =scanner.nextInt();
                scanner.nextLine();
            }else {
                System.out.println("Ingrese un numero valido");
                scanner.nextLine();
                continue;
            }

            String monedaBase ="";
            String segundaMoneda ="";

            switch (opcion) {

                case 1 -> {

                    monedaBase = "USD";
                    segundaMoneda = "MXN";
                }
                case 2 -> {

                    monedaBase = "GBP";
                    segundaMoneda = "EUR";
                }

                case 3 -> {

                    monedaBase = "JPY";
                    segundaMoneda = "VES";
                }

                case 4 -> {

                    monedaBase = "CNY";
                    segundaMoneda = "BRL";
                }

                case 5 -> {

                    monedaBase = "CAD";
                    segundaMoneda = "ARS";
                }

                case 6 -> {

                    monedaBase = "INR";
                    segundaMoneda = "CLP";
                }

                case 7 -> {
                    System.out.println("Case 7");
                    return;
                }
                default -> {
                    System.out.println("Opcion no valida, ingrese un numero valido");
                 continue;
                }
            }
            System.out.println("Que cantidad deseas cambiar?");
            try {
                Double cantidad = Double.valueOf(scanner.nextLine());


                SeleccionMoneda seleccion = conversor.buscaMoneda(monedaBase);
                Double tasa = seleccion.conversion_rates().get(segundaMoneda);
                double resultado = operador.convertir(cantidad,tasa);

                System.out.println(cantidad + " " + monedaBase + " equivale a " + resultado + " " + segundaMoneda);

            } catch (NullPointerException e){
                System.out.println("No se encontro ninguna moneda");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }catch (Exception e){
                System.out.println("A Ocurrido un error");
                System.out.println("Programa finalizado");
            }

        }

    }
}
