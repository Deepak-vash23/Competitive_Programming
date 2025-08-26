A = int(input("Enter an integer: "))

a = str(A)
b = a[::-1]

if a == b:
    print("The number is a palindrome")
else:
    print("The number is not a palindrome")
