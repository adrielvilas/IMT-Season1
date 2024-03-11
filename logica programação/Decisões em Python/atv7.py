x = float(input("Digite o primeiro valor: "))
y = float(input("Digite o segundo valor: "))
z = float(input("Digite o terceiro valor: "))

codigo = input("Digite o código de condição (c para crescente, d para decrescente):\n")

if codigo == "c":
    valores = [x, y, z]
    valores.sort()

    print("Valores em ordem crescente:", valores)

elif codigo == "d":
    valores = [x, y, z]
    valores.sort(reverse=True)

    print("Valores em ordem decrescente:", valores)
    
        
