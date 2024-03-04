numero1 = int(input("DIGITE O PRIMEIRO NUMERO"))
numero2 = int(input("DIGITE O SEGUNDO NUMERO"))

soma = numero1 + numero2

if soma % 3 == 0 :
    print(f'a soma {soma} e um multi de 3')
else:
    print(f"A soma {soma} nao e um multi de 3")