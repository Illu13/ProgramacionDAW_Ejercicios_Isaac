package Apuntes;

public class Apuntes_Operadores {

	public static void main(String[] args) {
//&= 1-1=1, en cualquier otro caso, 0.=y=and
//|= 1-1=1 1-0=1 0-1=1 0-0=0=o=or		
//Si hacemos and 5 (101) y 3 (011) = 5&3=001=1
//"    "     or  "   "   " "   "   = 5|3=111=7
//Nor cambia los bits, 5=101, nor5= 010
//xor= ^ 1-1=0 1-0=1 0-1=1 0-0=0
//<<1 mueve los 0 y 1 un espacio a la izquierda, multiplicándolo por 2.
//>>1 mueve los 0 y 1 un espacio a la derecha, dividiéndolo por 2.

	int num1 = 4;
	int num2 = 3;
	System.out.println("Operación lógica AND: " + (num1 & num2));
	System.out.println("Opeación lógica or: " + (num1 | num2));
	System.out.println("Operación lógica nor: " + ~num1);
	System.out.println("Operación lógica xor :" + (num1 ^ num2));
	System.out.println("Operación lógica>>: " + (num1>>1));
			}
}