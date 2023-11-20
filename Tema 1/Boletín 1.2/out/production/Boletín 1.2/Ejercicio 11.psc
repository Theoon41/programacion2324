Algoritmo sin_titulo
	Escribir "Dime tu edad y el planeta"
	Leer edad
	Leer planeta
	Si planeta<>"tierra" Entonces
		Si planeta =="marte" Entonces
			edad <- edad * 1.88
			Escribir "Tu edad en " planeta " sería " edad
		SiNo
			Si planeta=="jupiter" Entonces
				edad <- edad * 11.86
				Escribir "Tu edad en " planeta " sería " edad
			SiNo
				Escribir "No se que planeta es ese"
			FinSi
		FinSi
	SiNo
		Escribir "tu edad es " edad
	FinSi
FinAlgoritmo
