angle_1 = int(input("Enter first angle:"))
angle_2 = int(input("Enter second angle:"))
angle_3 = int(input("Enter third angle:"))

sum = angle_1 + angle_2 + angle_3

if(sum==180):
    if(angle_1<90 and angle_2<90 and angle_3<90):
        print("Triangle is acute")
    elif(angle_1<=90 and angle_2<=90 and angle_3<=90):
        print("Triangle is Right angle")
    else:
        print("Triangle is obtuse")
else:
    print("Triangle is invalid")