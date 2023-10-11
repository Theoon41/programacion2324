Algoritmo sin_titulo
	Escribir "Introduce un número"
	Leer num
	Mientras num <= 0 Hacer
		Escribir 'Introduce un número que sea positivo'
		Leer num
	FinMientras
	Mientras i<=num Hacer
		suma <- suma+i
		i <- i+1
	FinMientras
	Escribir 'La suma de los ', num, ' primeros números es: ', suma
FinAlgoritmo
