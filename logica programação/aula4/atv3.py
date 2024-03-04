def converter_comprimento(metros):
    polegadas = metros * 39.37
    pes = polegadas / 12
    jardas = pes / 3
    milhas = jardas / 1760

    print(f"Comprimento em polegadas: {polegadas:.2f}")
    print(f"Comprimento em pés: {pes:.2f}")
    print(f"Comprimento em jardas: {jardas:.2f}")
    print(f"Comprimento em milhas: {milhas:.2f}")

comprimento_metros = float(input("Digite o comprimento em metros: "))
converter_comprimento(comprimento_metros)
