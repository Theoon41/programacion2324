Algoritmo sin_titulo
	Escribir "Introduce un n�mero"
	Leer num
	Mientras num <= 0 Hacer
		Escribir 'Introduce un n�mero que sea positivo'
		Leer num
	FinMientras
	Mientras i<=num Hacer
		suma <- suma+i
		i <- i+1
	FinMientras
	Escribir 'La suma de los ', num, ' primeros n�meros es: ', suma
FinAlgoritmo
