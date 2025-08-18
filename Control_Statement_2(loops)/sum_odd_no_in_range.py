A = int(input("Enter the range number: "))
sum_odd = 0
i = 1
while i <= A:
    if i % 2 != 0:
        sum_odd += i
    i += 1
print(sum_odd)