Algoritmo sin_titulo
	Escribir 'dame un número del 0 al 10 para hacer su respectiva tabla de multiplicar'
	Leer num
	Si num>=0 Entonces
		Si num<=10 Entonces
			Mientras i<=10 Hacer
				res <- num*i
				i <- i+1
				Escribir res
			FinMientras
		SiNo
			Escribir 'Ese numero excede el limite'
		FinSi
	SiNo
		Escribir 'Ese numero no es correcto'
	FinSi
FinAlgoritmo
