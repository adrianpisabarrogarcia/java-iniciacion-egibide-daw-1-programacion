Algoritmo ejercicio9
	Escribir "introduce una nota (0 al 10)"
	Leer nota
	Si nota<0 o nota>10 Entonces
		Escribir "no has introducido una nota valida"
	SiNo
		Si nota<5 Entonces
			Escribir "suspenso"
		SiNo
			Escribir "aprobado"
		Fin Si
	Fin Si
	
FinAlgoritmo
