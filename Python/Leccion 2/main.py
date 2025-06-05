# En esta clase veremos la sentencia if/else
"""
condicion = True
if condicion:
    print("Condicion verdadera")
else:
    print("Condicion falsa")

condicion = False
if condicion:
    print("Condicion verdadera")
else:
    print("Condicion falsa")

condicion = 10 # La condicion sera verdadera, ya que se determina si la variable esta vacia o no
if condicion:
    print("Condicion verdadera")
else:
    print("Condicion falsa")

condicion = "Hola alumnos"
if condicion == True:
    print("Condicion verdadera")
elif condicion == False:
    print("Condicion falsa")
else:
    print("Condicion sin especificar")

condicion = True
if condicion == True:
    print("Condicion verdadera")
elif condicion == False:
    print("Condicion falsa")
else:
    print("Condicion sin especificar")

condicion = False
if condicion == True:
    print("Condicion verdadera")
elif condicion == False:
    print("Condicion falsa")
else:
    print("Condicion sin especificar")
"""
# Operador ternario (sintaxis simplificada) - Solo recomendable cuando el codigo es pequeño
condicion = True
print("Condicion Verdadera") if condicion else print("Condicion Falsa")
