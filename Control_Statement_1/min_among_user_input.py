A = float(input("Enter first number (A): "))
B = float(input("Enter second number (B): "))
C = float(input("Enter third number (C): "))

if A <= B and A <= C:
    minimum = A
elif B <= A and B <= C:
    minimum = B
else:
    minimum = C

print("The minimum among A, B & C is:", minimum)