Algoritmo ejercicio19
	Definir num,contador,cuadrado,resultado Como Entero
	contador <- 0
	cuadrado <- -1
	Escribir 'Inserta un numero para que calcule el cuadrado de ese numero'
	Leer num
	Repetir
		cuadrado <- cuadrado+2
		resultado <- cuadrado+resultado
		Escribir cuadrado,' + ' // para comprobar la suma de numeros impares
		contador <- contador+1
	Hasta Que contador=num
	Escribir 'el cuadrado de ',num,' es: ',resultado
FinAlgoritmo

