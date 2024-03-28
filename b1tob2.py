def convert_base(num, b1, b2):
    # Convertir le nombre de la base b1 à la base décimale
    decimal_num = int(str(num), b1)
    
    # Convertir le nombre décimal à la base b2
    converted_num = ""
    while decimal_num > 0:
        remainder = decimal_num % b2
        converted_num = str(remainder) + converted_num
        decimal_num //= b2
    return converted_num

# Exemple d'utilisation
number = input("Entrez le nombre à convertir : ")
base_b1 = int(input("Entrez la base actuelle du nombre : "))
base_b2 = int(input("Entrez la base dans laquelle vous voulez convertir le nombre : "))

result = convert_base(number, base_b1, base_b2)
print(f"Le nombre {number} en base {base_b1} est équivalent à {result} en base {base_b2}.")