board = ["" for i in range(9)]

def print_board():
    row1 = "|{}|{}|{}|".format(board[0],board[1],board[2])  
    row2 = "|{}|{}|{}|".format(board[3],board[4],board[5])
    row3 = "|{}|{}|{}|".format(board[6],board[7],board[8])

    print()
    print(row1)
    print(row2)
    print(row3)
    print()

def player_move(icon):

    if icon == "x":
        number = 1
    elif icon == "o":
        number = 2

    print("Your turn player {}".format(number))

    choice = int(input("Enter your move(1-9):").strip())
    if board[choice - 1] == "":
        board[choice - 1] = icon
    else:
        print()
        print("space is taken!")


while True:
    print_board()
    player_move("x")
    print_board()
    player_move("o")
