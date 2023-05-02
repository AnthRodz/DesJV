import Clases.Productos_Congelados;
import Clases.Productos_Frescos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//Anthony Rodriguez
public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Productos_Frescos PF = new Productos_Frescos();
        Productos_Congelados PC = new Productos_Congelados();

        int num_lote, cantidad_producida, selec;
        String fecha;
        float temp_cong;

        do {
            System.out.println("Seleccione una opcion");
            System.out.println("1.Producto Fresco");
            System.out.println("2.Producto Congelado");
            System.out.println("3.Salir");

            while (true) {
                try {
                    System.out.print("Opcion:");
                    selec = Integer.parseInt(br.readLine());
                    break;
                } catch (Exception e) {
                    System.out.print("Solo permiten valores numericos en la seleccion\n" + e);
                }
            }

            switch (selec) {
                case 1 -> {
                    System.out.println("Productos Frescos");
                    System.out.println("Proporcione los siguientes datos");

                    while (true) {
                        try {
                            System.out.print("Cantidad producidad del producto: ");
                            cantidad_producida = Integer.parseInt(br.readLine());
                            break;
                        } catch (Exception e) {
                            System.out.print("Solo se permiten valores numericos" + e);
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Numero de lote: ");
                            num_lote = Integer.parseInt(br.readLine());

                            break;
                        } catch (Exception e) {
                            System.out.print("Solo se permiten valores numericos" + e);
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Fecha de caducidad en el siguiente formato (dia-mes-año): ");
                            fecha = br.readLine();
                            break;
                        } catch (Exception e) {
                            System.out.print("Error, Verefique la entrada de datos" + e);
                        }
                    }
                    PF.asignar(num_lote,fecha,cantidad_producida);
                    System.out.println("Costos de Produccion del Producto");
                    System.out.println("Costo de produccion: " + PF.produccion());
                    System.out.println("Numero de lote: " + "PF-" + PF.getNum_lote());
                    System.out.println("Fecha de caducidad:" + PF.getFecha_caducidad());
                }

                case 2 -> {
                    System.out.println("Productos Congelados");
                    System.out.println("Proporcione los siguientes datos");


                    while (true) {
                        try {
                            System.out.print("Cantidad producidad del producto: ");
                            cantidad_producida = Integer.parseInt(br.readLine());
                            break;
                        } catch (Exception e) {
                            System.out.print("Solo se permiten valores numericos " + e);
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Numero de lote: ");
                            num_lote = Integer.parseInt(br.readLine());

                            break;
                        } catch (Exception e) {
                            System.out.print("Solo se permiten valores numericos: " + e);
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Temperatura de congelacion: ");
                            temp_cong = Float.parseFloat(br.readLine());
                            break;
                        } catch (Exception e) {
                            System.out.print("Solo se permiten valores numericos " + e);
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Fecha de caducidad en el siguiente formato(dia-mes-año): ");
                            fecha = br.readLine();
                            break;
                        } catch (Exception e) {
                            System.out.print("Error, Verifique la entrada de datoss" + e);
                        }
                    }
                    PC.asignar(num_lote,fecha,cantidad_producida,temp_cong);
                    System.out.println("Costos de Produccion del Producto");
                    System.out.println("Costo de produccion: " + PC.produccion());
                    System.out.println("Temperatura de congelacion: " + PC.getTemperatura());
                    System.out.println("Numero de lote: " + "PC-" + PC.getNum_lote());
                    System.out.println("Fecha de caducidad:" + PC.getFecha_caducidad());
                }
                case 3 -> System.out.println("Ah salido del programa");
                default -> System.out.println("\nOpción inválida");
            }
        } while (selec != 3);

    }

}
