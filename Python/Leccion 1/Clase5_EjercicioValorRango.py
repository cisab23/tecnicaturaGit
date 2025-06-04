"""
Ejercicio: Valor dentro de un rango
1. Pedimos al usuario un valor numérico
2. Verificar si el valor ingresado se encuentra entre el rango de 0 a 5
3. La formula es: <num> >= 0  and  <num> <= 5
"""
valor = (int(input("Ingrese un numero: ")))
if valor >= 0 and valor <= 5:
    print(f"El valor {valor} se encuentra dentro del rango.")
else:
    print("Fuera de rango.")
