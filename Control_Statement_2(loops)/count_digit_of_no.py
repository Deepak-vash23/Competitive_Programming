N = int(input("Enter a positive integer: "))

count = 0
num = N

while num > 0:
    count += 1
    num //= 10

print(count)