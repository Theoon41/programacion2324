Algoritmo sin_titulo
	Escribir "introduce tipo de vehiculo"
	Leer vehiculo
	Si vehiculo == "coche" Entonces
		Escribir "120 km/h"
	SiNo
		Si vehiculo == "moto" Entonces
			Escribir "90 km/h"
		SiNo
			Si vehiculo == "cami�n" Entonces
				Escribir "80 km/h"
			SiNo
				Escribir "No conozco ese veh�culo"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
