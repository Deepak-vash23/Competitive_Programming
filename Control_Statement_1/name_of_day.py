num = int(input("Enter a number (1-7): "))

if (num<7):
    if num == 1:
        print("Sunday")
    elif num == 2:
        print("Monday")
    elif num == 3:
        print("Tuesday")
    elif num == 4:
        print("Wednesday")
    elif num == 5:
        print("Thursday")
    elif num == 6:
        print("Friday")
    elif num == 7:
        print("Saturday")

else:
    print("Invalid input! Please enter a number between 1 and 7.")