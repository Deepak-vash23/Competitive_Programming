N = int(input("Enter a positive integer: "))

sum_digits = 0

temp = N
while temp > 0:
    digit = temp % 10
    sum_digits += digit
    temp //= 10

print(sum_digits)