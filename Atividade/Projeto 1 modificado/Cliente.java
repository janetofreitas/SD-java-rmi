import java.rmi.*;
import java.util.Scanner;

public class Cliente{
public static void main(String args[]){

Scanner ler = new Scanner(System.in);
int n;
int m;

System.out.printf("Informe o primeiro número para soma:\n");
n = ler.nextInt();

System.out.printf("Informe o segundo número para soma:\n");
m = ler.nextInt();

try{
Somador stub =
(Somador)Naming.lookup("rmi://localhost:8000/soma");
System.out.println(stub.soma(n,m));
}catch(Exception e){}
} } 