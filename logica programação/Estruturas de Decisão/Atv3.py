caracter = input("Digite um único caractere: ")

decimal = ord(caracter)

if 65 <= decimal <= 90:
    print("O caractere é uma letra maiúscula.")
elif 97 <= decimal <= 122:
    print("O caractere é uma letra minúscula.")
elif 48 <= decimal <= 57:
    print("O caractere é um algarismo decimal.")
else:
    print("O caractere é um caractere especial.")