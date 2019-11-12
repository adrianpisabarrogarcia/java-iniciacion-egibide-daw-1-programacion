Algoritmo ejercicio8v2
	Escribir "por una nota (del 0 al 10)"
	leer nota
	Si nota<0 o nota>10 Entonces
		Escribir "La nota introducida es incorrecta"
	SiNo
		Si nota<5 Entonces
			Escribir "suspendido"
		SiNo
			Escribir "aprobado"
		Fin Si
	Fin Si
FinAlgoritmo