package Metodos;

public class MetodoSobrecarregado {
	public void testaMetodosSobrecarregados()
	{
		System.out.println("Salário em número inteiro: "+salario(1000));
		System.out.println("Salário em número double: "+salario(7.500));
	}
	public int salario(int valorInt)
	{
		System.out.println("Salário em com argumento inteiro: "+valorInt);
		return valorInt * valorInt;
	}
	public double salario(double valorDouble)
	{
		System.out.println("Salário em com argumento inteiro: "+valorDouble);
		return valorDouble * valorDouble;
	}

}
