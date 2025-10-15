user_input = input("Enter a sequence of comma-separated numbers: ")

try:
    numbers = [int(num.strip()) for num in user_input.split(",")]
    total = sum(numbers)
    print(f"The sum is: {total}")
except ValueError:
    print("Please enter only valid integers separated by commas.")