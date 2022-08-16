films = {
    "finding dory":[5,1],
    "bourne":[12,6],
    "tarzan":[6,15]
    }
while True:
    choice = input("Which movie you wanna watch?:").strip().lower()

    if choice in films:
        age = int(input("How old are you?").strip())
        if age >= films[choice][0]:
            num_seats = films[choice][1] 
            if num_seats >= 0:
                print("Enjoy your movie!")
                films[choice][1] = films[choice][1] - 1
            else:
                print("Sorry we are sold out!")
        else:
            print("You are too young to watch this movie!")
    else:
        print("We don't have this movie...")
                
         
      
        
        
