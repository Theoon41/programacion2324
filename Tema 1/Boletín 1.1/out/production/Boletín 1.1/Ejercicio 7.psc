Algoritmo sin_titulo
	Escribir "Dime cu�ntos n�meros vas a introducir"
	Leer num
	i <- 1
	Para i<-1 Hasta num Con Paso 1 Hacer
		Escribir "Dame dato n�mero " i
		Leer dat
		sum <- sum+dat
	FinPara
	media <- sum/num
	Escribir "La media de los datos introducidos es " media
FinAlgoritmo
