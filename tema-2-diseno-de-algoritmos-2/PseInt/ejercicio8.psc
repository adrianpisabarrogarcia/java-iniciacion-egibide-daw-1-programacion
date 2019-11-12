Algoritmo ejercicio8
	Escribir "por una nota (del 0 al 10)"
	leer nota
	Si nota>=0 y nota<=10 Entonces
		Si nota<5 Entonces
			Escribir "suspendido"
		SiNo
			Escribir "aprobado"
		Fin Si
	SiNo
		escribir "La nota introducida no esta comprendida entre el 0 y el 10"
	Fin Si
FinAlgoritmo
