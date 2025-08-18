num = input("Enter a number: ")
if (num % 7)==0 or (num % 10) == 5:
    print(num, "is either divisible by 7 or has a last digit of 5.")
else:
    print(num, "is neither divisible by 7 nor has a last digit of 5.")