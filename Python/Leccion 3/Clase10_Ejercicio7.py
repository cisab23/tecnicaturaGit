# Dadas las horas trabajadas de 5 personas y la tarifa de pago,
# calcular el salario y la sumatoria de todos los salarios.

suma = 0

for i in range(1,6):
    print(f"Salario del empleado {i}: ")
    # Pedir cantidad de horas y valor de las horas
    horas = int(input("Ingrese la cantidad de horas trabajadas: "))
    tarifa = float(input("Ingrese el valor de la hora de trabajo: "))

    # Calcular el salario
    salario = horas * tarifa
    print(f"El salario es: ${salario:.2f}")

    # Sumar todos los salarios
    suma += salario

print(f"La suma de todos los salarios es: {suma:.2f}")
