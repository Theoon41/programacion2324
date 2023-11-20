Algoritmo sin_titulo
	Escribir "Dime cuántos números vas a introducir"
	Leer num
	i <- 1
	Para i<-1 Hasta num Con Paso 1 Hacer
		Escribir "Dame dato número " i
		Leer dat
		sum <- sum+dat
	FinPara
	media <- sum/num
	Escribir "La media de los datos introducidos es " media
FinAlgoritmo
