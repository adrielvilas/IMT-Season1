a = float(input('Digite o primeiro numero: '))
b = float(input('Digite o segundo numero: '))
c = float(input('Digite o terceiro numero: '))

delta = b**2 - (4*a*c)

if a == 0:
    print("Essa equação não é quadratica.")
else:
    if delta > 0:
        x1 = (-b + delta**0.5) / (2*a)
        x2 = (-b - delta**0.5) / (2*a)
        print("Essa equação tem duas raizes reais:")
        print("x1 =", round(x1, 2))
        print("x2 =", round(x2, 2))
    elif delta == 0:
        x = -b / (2*a)
        print("Essa equação tem uma raiz:")
        print("x =", x)
    else:
        print("Essa equação não tem raiz.")

