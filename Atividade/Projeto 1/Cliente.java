import java.rmi.*;
public class Cliente{
public static void main(String args[]){
try{
Somador stub =
(Somador)Naming.lookup("rmi://localhost:8000/soma");
System.out.println(stub.soma(34,4));
}catch(Exception e){}
} } 