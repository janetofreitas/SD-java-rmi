import java.rmi.*;
public class Cliente{
public static void main(String args[]){
try{
Calculadora calculadora = (Calculadora)
Naming.lookup("rmi://localhost:8000/calculadora");
System.out.println(calculadora.somar(34,4));
System.out.println(calculadora.subtrair(34,4));
System.out.println(calculadora.multiplicar(10,4));
System.out.println(calculadora.dividir(40,4));
}catch(Exception e){}
} } 