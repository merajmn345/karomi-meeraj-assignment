import datetime
textFile = open("text-file.txt", "r")

Counter = 0

# Reading from file
Content = textFile.read()
CoList = Content.split("\n")

date = str(datetime.datetime.now().date())
newFile = open(f'{date}.txt', 'w')
for i in CoList:
    if Counter % 2 == 0:
        newFile.write(f"{Counter+1} {i}\n")

    if i:
        Counter += 1


print("Number of lines in text-file.txt is ",  Counter)
