package Clases;

public class Productos_Congelados extends Producto {
    private int num_lote;
    private String fecha_caducidad;
    private int cantidad_producida;
    private float temperatura;

    public void asignar(int num_lote,String fecha_caducidad,int cantidad_producida, float temperatura) {
         this.num_lote= num_lote;
        this.fecha_caducidad=fecha_caducidad;
        this.cantidad_producida=cantidad_producida;
        this.temperatura=temperatura;
    }

    public float getNum_lote() {
        return num_lote;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    private float getCantidad_producida() {
        return cantidad_producida;
    }

    public float produccion() {
        final  float precio_caja = 50.00F;
        return getCantidad_producida() * precio_caja;
    }
}
