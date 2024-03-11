valorAnterior = float(input("Digite o valor anterior: "))
valorAtual = float(input("Digite o valor atual: "))

unidadesConsumidas = valorAtual - valorAnterior

if unidadesConsumidas <= 100:
    valorConta = unidadesConsumidas * 0.50
elif unidadesConsumidas <= 200:
    valorConta = 50 + (unidadesConsumidas - 100) * 1
elif unidadesConsumidas <= 300:
    valorConta = 150 + (unidadesConsumidas - 200) * 1.50
else:
    valorConta = 300 + (unidadesConsumidas - 300) * 2

print("Numero de unidades consumidas:", unidadesConsumidas)
print("Conta de eletricidade: $", valorConta)