# Get the names of the users
player1 = input("What is Player 1's name? ")
player2 = input("What is Player 2's name? ")

# While looping endlessly
while True:
    # Ask player1's choice
    player1_answer = input(player1 + ", do you want to choose rock, paper or scissors? ").lower()
    
    # Ask player2's choice
    player2_answer = input(player2 + ", do you want to choose rock, paper or scissors? ").lower()
    
    # Run the algorithm to see who wins
    if player1_answer == player2_answer:
        print("It's a tie!")
    elif player1_answer == 'rock':
        if player2_answer == 'scissors':
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif player1_answer == 'scissors':
        if player2_answer == 'paper':
            print("Scissors win!")
        else:
            print("Rock wins!")
    elif player1_answer == 'paper':
        if player2_answer == 'rock':
            print("Paper wins!")
        else:
            print("Scissors win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    # Ask them if they want to play again
    repeat = input("Do you want to play another round? Yes/No: ").lower()
    
    # If they say yes, don't do anything
    if(repeat == "yes" or repeat == "y"):
        pass
    # If they say no, exit the game
    elif(repeat == "no" or repeat == "n"):
        raise SystemExit
    # If they say anything else, exit with an error message.
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit