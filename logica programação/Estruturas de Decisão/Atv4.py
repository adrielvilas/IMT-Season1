codigoProduto = int(input("1 - brinquedos com bateria\n2 - brinquedos com pilhas\n3 - brinquedos com baterias recarregaveis\n"))
                   
order_value = float(input("Enter the order value: "))

if codigoProduto == 1 and order_value > 1000:
    net_amount = order_value * 0.9
elif codigoProduto == 2 and order_value > 100:
    net_amount = order_value * 0.95
elif codigoProduto == 3 and order_value > 500:
    net_amount = order_value * 0.9
else:
    net_amount = order_value

print("Valor a ser pago: R$", net_amount)
