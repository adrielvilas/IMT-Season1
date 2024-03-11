numero = int(input("Digite um número: "))

if numero >= 1 and numero <= 7:
    dias_semana = ["Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"]
    dia_semana = dias_semana[numero - 1]
    print("O dia da semana correspondente é:", dia_semana)
else:
    print("Número inválido. Digite um número entre 1 e 7.")