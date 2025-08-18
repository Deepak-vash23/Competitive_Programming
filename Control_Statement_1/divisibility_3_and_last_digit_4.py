num = input("Enter a number: ")

if (num%3) == 0 and (num % 10) == 4:
    print(num, "is divisible by 3 and has a last digit of 4.")
else:
    print(num, "is not divisible by 3 and does not have a last digit of 4.")