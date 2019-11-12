Algoritmo ejercicio10
	Escribir 'Introduce una nota del 0 al 10'
	Leer nota
	Si nota<0 O nota>10 Entonces
		Escribir 'Introduce una nota valida'
	SiNo
		Si nota<5 Entonces
			Si nota<3 Entonces
				Escribir 'muy deficiente'
			SiNo
				Escribir 'insuficiente'
			FinSi
		SiNo
			Si nota<7 Entonces
				Escribir 'Bien'
			SiNo
				Si nota<9 Entonces
					Escribir 'Notable'
				SiNo
					Escribir 'Sobresaliente'
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo

