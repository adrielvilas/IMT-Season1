idade = int(input("Digite sua idade: "))

if idade >= 0 and idade <= 4:
    print("Você é muito novo para competir")
elif idade >= 5 and idade <= 7:
    print("Categoria: Infantil A")
elif idade >= 8 and idade <= 10:
    print("Categoria: Infantil B")
elif idade >= 11 and idade <= 13:
    print("Categoria: Juvenil A")
elif idade >= 14 and idade <= 17:
    print("Categoria: Juvenil B")
else:
    print("Categoria: Adulto")