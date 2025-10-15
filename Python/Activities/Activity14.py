count = input("How many Fibonacci numbers would you like to generate? ")
count = int(count)

fib_sequence = []

if count > 0:
    fib_sequence.append(0)
if count > 1:
    fib_sequence.append(1)

for i in range(2, count):
    next_num = fib_sequence[-1] + fib_sequence[-2]
    fib_sequence.append(next_num)

print("Fibonacci sequence:")
for num in fib_sequence:
    print(num)