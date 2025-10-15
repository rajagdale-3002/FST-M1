# Ask the user to input a list of numbers separated by commas
user_input = input("Enter a list of numbers separated by commas: ")

# Convert the input string into a list of integers
try:
    numList = [int(num.strip()) for num in user_input.split(",")]
    print("Given list is", numList)

    # Get first and last elements
    firstElement = numList[0]
    lastElement = numList[-1]

    # Check if they are equal
    if firstElement == lastElement:
        print(True)
    else:
        print(False)

except ValueError:
    print("Please enter only valid integers separated by commas.")