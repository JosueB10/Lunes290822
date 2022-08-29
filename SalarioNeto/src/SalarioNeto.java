import java.util.Scanner;

public class SalarioNeto {

	final static double TasaInss=0.07,TasaIr=0.156,TasaSin=0.01,TasaInssPat=0.225,TasaAntiguedad=0.15;
	static Scanner Sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
//Nombre de variables
double MontoInss,MontoIr,MontoSin,MontoAntiguedad,MontoInssPat;
double IngresoTotal,TotalDeducciones,IngresoNeto;

//Datos de entrada
System.out.print("Ingrese su salario bruto(Basico): C$");	
double IngresoBruto = Sc.nextDouble();

System.out.print("Ingrese su antiguedad: ");	
int antiguedad = Sc.nextInt();




MontoAntiguedad=IngresoBruto*TasaAntiguedad;
IngresoTotal=IngresoBruto+MontoAntiguedad;
MontoInss=IngresoTotal*TasaInss;
MontoIr=IngresoTotal*TasaIr;
MontoSin=IngresoBruto*TasaSin;
TotalDeducciones=MontoInss+MontoIr+MontoSin;
IngresoNeto=IngresoTotal-TotalDeducciones;

MontoInssPat=IngresoTotal*TasaInssPat;



System.out.println("*-*-*-Ingresos*-*-*-");
System.out.println("Salario bruto: C$" +IngresoBruto);
System.out.println("Antiguedad: " + antiguedad + "años");

System.out.println("*-*-*-Deducciones*-*-*-");

System.out.println("Tasa del Inss: "+TasaInss + "%");
System.out.println("Monto por Inss: "+String.format("%.2f",MontoInss));

System.out.println("Tasa del Ir: "+TasaIr + "%");
System.out.println("Monto por Ir: "+ MontoIr );

System.out.println("Tasa del sindicato: "+TasaSin+"%");
System.out.println("Monto del sindicato: "+MontoSin);


System.out.println("*-*-*-Calculos Totales*-*-*-");
System.out.println("Ingresos totales: "+IngresoTotal);
System.out.println("Deducciones  totales: "+TotalDeducciones);
System.out.println("Ingreso Neto: "+IngresoNeto);

System.out.println("*-*-*-Inss Patronal*-*-*-");
System.out.println("Tasa Inss patronal: "+TasaInssPat + "%");
System.out.println("Monto Inss patronal: "+MontoInssPat );

		
		
		
		
		

	}

}
