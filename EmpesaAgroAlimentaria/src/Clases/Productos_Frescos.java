package Clases;

public class Productos_Frescos extends Producto {
    private int num_lote;
    protected String fecha_caducidad;
    protected int cantidad_producida;


    public void asignar(int num_lote,String fecha_caducidad,int cantidad_producida) {
        this.num_lote= num_lote;
        this.fecha_caducidad=fecha_caducidad;
        this.cantidad_producida=cantidad_producida;
    }

    public int getNum_lote() {
        return num_lote;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public int getCantidad_producida() {
        return cantidad_producida;
    }

    public float produccion() {
       final float precio_caja = 100.00F;
        return getCantidad_producida() * precio_caja;
    }
}
