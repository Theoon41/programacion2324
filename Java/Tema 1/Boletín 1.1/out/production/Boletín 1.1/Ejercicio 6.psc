Algoritmo sin_titulo
	Escribir "Dame 2 números que quieras multiplicar entre sí"
	Leer mulA
	Leer mulB
	Para i<-1 Hasta mulB-1 Con Paso 1 Hacer
		mulA <- mulA +mulA
	FinPara
	Escribir "El resultado es " mulA
FinAlgoritmo
