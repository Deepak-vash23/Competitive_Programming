A = int(input("Enter base (A): "))
B = int(input("Enter exponent (B): "))

if B < 0:
    print("Negative exponents are not supported.")
else:
    result = A**B
    print(result)