public class ej13 {
    public static void main(String[] args) {
        final double IRPF = 0.15;
        double sueldoBruto = 1500;
         double sueldoNeto = sueldoBruto - (sueldoBruto * IRPF);
        System.out.println("Sueldo bruto: " + sueldoBruto + "€");
        System.out.println("IRPF aplicado: " + (IRPF * 100) + "%");
        System.out.println("Sueldo neto: " + sueldoNeto + "€");
    }
}