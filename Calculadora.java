package unam.curso.calculadora;

public class Calculadora {
	//declaracion de variables
 private double num1;
 private double num2;
 private double resultado;
 //constructor de la clase
 
 public Calculadora() {
	 this.num1= 0;
	 this.num2= 0;
	 this.resultado= 0;
 }
//metodo para la suma
 public double suma(double num1, double num2) {
	 this.num1 = num1;
	 this.num2 = num2;
	 this.resultado = this.num1 + this.num2;
	 return this. resultado;
 }
//metodo para la resta
public double resta (double num1, double num2) {
	 this.num1 = num1;
	 this.num2 = num2;
	 this.resultado = this. num1 - this.num2;
	 return this. resultado;
}
//metodo para la multiplicacion
public double multiplicacion (double num1, double num2) {
	 this.num1 = num1;
	 this.num2 = num2;
	 this.resultado = this. num1 * this.num2;
	 return this. resultado;
}
//metodo para la division 
public double division(double num1, double num2) {
	if(num2!=0) {//comprobar di el denominador es cero
		this.num1 = num1;
		this.num2 = num2;
	 this.resultado = this.num1 / this.num2;
	}else {
		System.out.println("El denominador no puede ser cero");
		this.resultado = -1;
	}
	 return this. resultado;
  }
}