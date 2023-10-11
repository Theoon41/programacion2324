Algoritmo sin_titulo
	Escribir "introduce tipo de vehiculo"
	Leer vehiculo
	Si vehiculo == "coche" Entonces
		Escribir "120 km/h"
	SiNo
		Si vehiculo == "moto" Entonces
			Escribir "90 km/h"
		SiNo
			Si vehiculo == "camión" Entonces
				Escribir "80 km/h"
			SiNo
				Escribir "No conozco ese vehículo"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
