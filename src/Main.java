
public class Main {
    public static void main(String[] args) {

        // Crear objeto
        Vendedor vendedor1 = new Vendedor();

        // Asignar datos
        vendedor1.setNombre("Matias");
        vendedor1.setVentas(500);
        vendedor1.setComision(10);
        vendedor1.setActivo(true);

        // Mostrar datos iniciales
        System.out.println("DATOS DEL VENDEDOR");
        System.out.println("Nombre: " + vendedor1.getNombre());
        System.out.println("Ventas: " + vendedor1.getVentas());
        System.out.println("Comision: " + vendedor1.getComision());
        System.out.println("Activo: " + vendedor1.isActivo());

        // Registrar una nueva venta
        vendedor1.registrarVenta(200);

        System.out.println("DESPUES DE REGISTRAR VENTA");
        System.out.println("Ventas: " + vendedor1.getVentas());

        // Probar valores incorrectos
        vendedor1.setNombre("");
        vendedor1.setVentas(-100);
        vendedor1.setComision(150);
        vendedor1.registrarVenta(-50);

        // Comprobar validaciones
        System.out.println("DESPUES DE LAS VALIDACIONES");
        System.out.println("Nombre: " + vendedor1.getNombre());
        System.out.println("Ventas: " + vendedor1.getVentas());
        System.out.println("Comision: " + vendedor1.getComision());
    }
}

