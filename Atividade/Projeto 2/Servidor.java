import java.rmi.*;
import java.rmi.registry.*;
public class Servidor{
public static void main(String args[]){
try{
CalculadoraRemota calculadora = new CalculadoraRemota();
Naming.rebind("rmi://localhost:8000/calculadora",
calculadora); 
}catch(Exception e){System.out.println(e);}
} } 