# Get input from the user
num = int(input("Enter a number to generate its multiplication table: "))

# Generate and display the multiplication table
print(f"\nMultiplication Table of {num}:\n")
for i in range(1, 11):
    print(f"{num} x {i} = {num * i}")