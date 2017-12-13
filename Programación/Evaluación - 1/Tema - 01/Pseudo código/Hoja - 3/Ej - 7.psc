Proceso H3Ej7
	Definir frase como Caracter;
	Definir contador como Real;
	Contador = 0;
	Escribir "Introduce una frase";
	Leer frase;
	Mientras frase != "" Hacer
		Escribir "Introduce una frase";
		Leer frase;
		Contador = contador + 1;
	FinMientras
	Escribir "Has escrito ",contador," frases, el nuevo Cervantes";
FinProceso
