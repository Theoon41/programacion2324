Algoritmo sin_titulo
	Escribir '�Cu�ntos n�meros me vas a dar?'
	Leer cont
	Si cont>=0 Entonces
		Para i<-1 Hasta cont Con Paso 1 Hacer
			Escribir 'Dame un n�mero mayor que 0'
			Leer num
			Si num>0 Entonces
				Si num MOD 2=0 Entonces
					Escribir num " es par"
				SiNo
					Escribir num " es impar"
				FinSi
			SiNo
				i <- i-1
			FinSi
		FinPara
	SiNo
		Escribir 'Pues nos vemos la pr�xima.'
	FinSi
FinAlgoritmo
