A = int(input())
if A < 0:
    print("Invalid input")
else:
    i = 1
    while i <= 10:
        print(f"{A} * {i} = {A * i}")
        i += 1