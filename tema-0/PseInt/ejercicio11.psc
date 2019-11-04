Algoritmo Ejercicio11
	Escribir "Introduce 3 numeros"
	Leer num1
	Leer num2
	Leer num3
	
	Si num1>num2 y num1>num3 Entonces
		Escribir "El numero mayor es ", num1
		Si num2>num3 Entonces
			Escribir "El numero menor es ", num3
		SiNo
			Escribir "El numero menor es ", num2
		Fin Si
	SiNo
		Si num2>num3 y num2>num1 Entonces
			Escribir "El numero mayor es ", num2
			Si num3>num1 Entonces
				Escribir "El numero menor es ", num1
			SiNo
				Escribir "El numero menor es ", num2
			Fin Si
		SiNo
			Escribir "El numero mayor es ", num3
			Si num2<num1 Entonces
				Escribir "El numero menor es ", num2
			SiNo
				Escribir "El numero menor es ", num1
			Fin Si
		Fin Si
		
	Fin Si	
FinAlgoritmo
