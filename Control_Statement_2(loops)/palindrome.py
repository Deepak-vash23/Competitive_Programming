A = int(input("Enter an integer: "))

if A < 0:
    print("Cannot check palindrome for negative integers.")
else:
    original = A
    reverse = 0
    while A > 0:
        digit = A % 10
        reverse = reverse * 10 + digit
        A = A // 10

    if original == reverse:
        print("Yes, it is a palindrome.")
    else:
        print("No, it is not a palindrome.")