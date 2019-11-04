

Funcion nota2 <- calculodenotas(nota)
	Segun variable_numerica Hacer
		opcion_1, 2:
			Escribir "muy deficiente"
		opcion_3, 4:
			Escribir "insuficiente"
		opcion_5:
			Escribir "suficiente"
		opcion_6:
			Escribir "bien"
		opcion_7, 8:
			Escribir "notable"
		opcion_9, 10:
			Escribir "sobresaliente"
		De Otro Modo:
			Escribir "Nota incorrecta"
	Fin Segun
Fin Funcion

Algoritmo ejercicio10multiple
	Escribir "Introduce una nota del 0 al 10"
	Leer nota
	calculodenotas(nota)
	
FinAlgoritmo



