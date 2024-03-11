idade = int(input("Digite a sua idade: "))

if idade < 2:
    print ('bebe')
elif idade < 4:
    print('criança de colo')
elif idade < 13:
    print('criança')
elif idade < 20:
    print('adolecente')
elif idade < 65:
    print('adulto')
else:
    print('idoso')