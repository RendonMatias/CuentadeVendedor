
public class Vendedor {

    private String nombre;
    private double ventas;
    private double comision;
    private boolean activo;

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getVentas() {
        return ventas;
    }

    public double getComision() {
        return comision;
    }

    public boolean isActivo() {
        return activo;
    }

    // Setters
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setVentas(double ventas) {
        if (ventas >= 0) {
            this.ventas = ventas;
        }
    }

    public void setComision(double comision) {
        if (comision >= 0 && comision <= 100) {
            this.comision = comision;
        }
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Metodo para registrar ventas
    public void registrarVenta(double cantidad) {
        if (cantidad > 0) {
            this.ventas = this.ventas + cantidad;
        }
    }
}
