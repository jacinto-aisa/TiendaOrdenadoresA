// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Classes.*;
public class Main {
    public static void main(String[] args) {
         Memoria bancoMemoria1 = new Memoria(new Componente("879FH",100,"Banco de Memoria SDRAM"),10,"512M");
         Memoria bancoMemoria2 = new Memoria(new Componente("879FH-L",125,"Banco de Memoria SDRAM"),15,"1G");
         Memoria bancoMemoria3 = new Memoria(new Componente("879FH-T",150,"Banco de Memoria SDRAM"),24,"2G");

         Procesador procesador1 = new Procesador(new Componente("789-XCS",134, "ProcesadorIntel i7"),10,9);
         Procesador procesador2 = new Procesador(new Componente("789-XCD",138, "ProcesadorIntel i7"),12,10);
         Procesador procesador3 = new Procesador(new Componente("797-X3",278, "Procesador Ryzen AMD"),60,34);

         Disco disco1 = new Disco (new Componente("789-XX", 50, "DiscoDuroSanDisk"),10,"500G");
         Disco disco2 = new Disco (new NuevaBase("Scam"),67,"Dccc");
         Disco disco3 = new Disco (new Componente("789-XX-3", 128, "DiscoDuroSanDisk"),39,"2TB");

         Ordenador ordenadorMaria = new Ordenador(disco1,bancoMemoria1,procesador1);
         Ordenador ordenadorAndres = new Ordenador(disco3,bancoMemoria3,procesador3);

         System.out.println("El precio del ordenadore de Maria es: "+ordenadorMaria.damePrecio());
         System.out.println("El calor del ordenadore de Maria es: "+ordenadorMaria.dameCalor());
         System.out.println("El precio del ordenadore de Andres es: "+ordenadorAndres.damePrecio());
         System.out.println("El calor del ordenadore de Andres es: "+ordenadorAndres.dameCalor());

    }
}
