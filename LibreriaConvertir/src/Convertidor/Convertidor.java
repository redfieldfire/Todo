package Convertidor;

public class Convertidor {

    public String seleccionConvertir(int numero , int valorConvertir ){
        String res = "";
        switch (valorConvertir){
            case 2: res = this.binario(numero); break;
            case 8: res = this.octal(numero); break;
            case 16: res = this.hexadecimal(numero); break;
        }
        return res;
    }

    public String binario(int numero){
        return Integer.toBinaryString(numero);
    }
    public String hexadecimal(int numero){
        return Integer.toHexString(numero);
    }
    public String octal(int numero){
        return Integer.toOctalString(numero);
    }
}
