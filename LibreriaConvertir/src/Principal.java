import Convertidor.Convertidor;

public class Principal {
    public static void main(String[] args) {
        Convertidor convertidor = new Convertidor();
        System.out.println(convertidor.seleccionConvertir(100,2));
        System.out.println(convertidor.seleccionConvertir(100,8));
        System.out.println(convertidor.seleccionConvertir(100,16));

    }
}
