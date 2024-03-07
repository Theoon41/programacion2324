Algoritmo sin_titulo
	Repetir
		Escribir "Introduce un numero (negativo para terminar)"
		Leer num
		Si num >= 0 Entonces
			pos <- pos + 1
		FinSi
	Hasta Que num < 0
	Escribir "Has introducido " pos " positivos"
FinAlgoritmo
