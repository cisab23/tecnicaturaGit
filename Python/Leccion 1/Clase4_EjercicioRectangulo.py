"""
Se solicita calcular el area y el perimetro de un rectangulo. Para ello debemos crear las siguientes variables:
alto (int)
ancho (int)
El usuario debe proporcionar los valores de alto y ancho, despues se debe imprimir el resultado.
"""

alto = (int(input("Ingrese el alto del rectangulo: ")))
ancho = (int(input("Ingrese el ancho del rectangulo: ")))
area = alto * ancho
perimetro = (alto + ancho) * 2
print(f"El area del rectangulo es de: {area}")
print(f"El perimetro del rectangulo es de: {perimetro}")