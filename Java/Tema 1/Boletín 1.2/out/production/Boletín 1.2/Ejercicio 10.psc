Algoritmo sin_titulo
	Escribir "Dime tu animal favorito"
	Leer animal
	Escribir "Color favorito"
	Leer color
	Escribir "Asignatura favorita"
	
	Según color Hacer
rojo:
	Si animal=="gato" Entonces
		Si asig=="encantamiento" Entonces
			Escribir "Eres de Gryffindor"
		SiNo
			Escribir "Eres de Ravenclaw"
		FinSi
	SiNo
		Si animal=="sapo" Entonces
			Si asig=="herbolaria" Entonces
				Escribir "Eres de Hufflepuff"
			SiNo
				Si asig=="pociones" Entonces
					Escribir "Eres de Ravenclaw"
				FinSi
			FinSi
		SiNo
			Si animal=="lechuza" Entonces
				Escribir "Eres de Gryffindor"
			FinSi
		FinSi
	FinSi
verde:
	Si animal=="gato" Entonces
		Si asig=="encantamiento" Entonces
			Escribir "Eres Ravenclaw"
		SiNo
			Si asig=="herbolaria" Entonces
				Escribir "Eres Hufflepuff"
			SiNo
				Si asig=="pociones" Entonces
					Escribir "Eres Slytherin"
				FinSi
			FinSi
		FinSi
	SiNo
		Si animal=="sapo" Entonces
			Escribir "Eres Slytherin"
		SiNo
			Si animal=="lechuza" Entonces
				Si asig=="encantamiento" Entonces
					Escribir "Eres de Ravenclaw"
				SiNo
					Si asig=="herbolaria" Entonces
						Escribir "Eres de Slytherin"
					SiNo
						Si asig=="pociones" Entonces
							Escribir "Eres de Gryffindor"
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
azul:
	Si animal=="gato" Entonces
		
	SiNo
		Si animal=="sapo" Entonces
			
		SiNo
			Si animal=="lechuza" Entonces
				Escribir "Eres de Ravenclaw"
			FinSi
		FinSi
	FinSi
amarillo:
	Si animal=="gato" Entonces
		
	SiNo
		Si animal=="sapo" Entonces
			
		SiNo
			Si animal=="lechuza" Entonces
				
			FinSi
		FinSi
	FinSi
	FinSegún
		
FinAlgoritmo
