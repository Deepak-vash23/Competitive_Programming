percentage = float(input("Enter your percentage: "))

if percentage < 25:
    grade = "D"
elif 25 <= percentage <= 45:
    grade = "C"
elif 45 < percentage <= 65:
    grade = "B"
elif 65 < percentage <= 85:
    grade = "A"
else:
    grade = "A+"

print("Your grade is: ", grade)