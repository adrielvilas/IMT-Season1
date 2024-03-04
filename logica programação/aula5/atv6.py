salario = float(input("Salario: "))
codigoTrabalho = int(input("Codigo do trabalho: "))

if codigoTrabalho == 310:
    aumentarPorcentagem = 5.0
elif codigoTrabalho == 456:
    aumentarPorcentagem = 7.5
elif codigoTrabalho == 885:
    aumentarPorcentagem = 10.0
else:
    aumentarPorcentagem = 15.0

novoSalario = salario + (salario * aumentarPorcentagem / 100)

diferenca = novoSalario - salario

print("Old salario:", salario)
print("New salario:", novoSalario)
print("porcentagem::", aumentarPorcentagem)
print("diferenca:", diferenca)