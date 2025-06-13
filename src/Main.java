import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ConversorMonedasService conversor = new ConversorMonedasService();


        System.out.println("Selecciona una moneda: ");
        String MonedaBase= scanner.nextLine();

        try {
            SeleccionMoneda seleccion = conversor.buscaMoneda(MonedaBase);
            System.out.println("Base :" + "1 = " + seleccion.base_code());
            System.out.println("MXN :" + seleccion.conversion_rates().get("MXN"));
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