Algoritmo sin_titulo
	Escribir "Introduce un n�mero"
	Leer num
	men <- num
	Escribir "Deseas introducir m�s numeros (S/N)"
	Leer sn
	Mientras (sn<>"s" O sn<>"n" O sn<>"S" O sn<>"N") Hacer
		Escribir "Lo siento, no te he entendido. Repitamelo profavor."
		Leer sn
	FinMientras
	Si sn == "s" O sn == "S" Entonces
		Mientras sn=("s" + "S") Hacer
			Escribir "Introduce otro valor"
			Leer num
			Si men > num Entonces
				men <- num
			FinSi
			Escribir "Desea introducir otro n�mero"
			Leer sn
		FinMientras
	FinSi
FinAlgoritmo
