nterms = int(input("How many terms?"))
n1 = 0
n2 = 1
count = 0
if terms <= 0:
    print("Please enter a posotive integer")
elif nterms== 1:
    print("Fibonacci sequemnce upto",nterms,":")
    print(n1)
else:
    print("Fibonacci sequemnce upto",nterms,":")
    while count < nterms:
        print(n1)
        nth = n1 + n2
        n1 = n2
        n2 = nth
        count +=1
