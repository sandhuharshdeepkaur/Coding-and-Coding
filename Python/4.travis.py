known_users = ("joe","harry","ron","bob","clay")

while True:
    print("Hi!My name is Travis")
    name = input("what is your name?:").strip().lower()

    if name in known_users:
        print("Hello! {}".format(name))
        remove = input("would you like to remove your name from the system(y/n)?:").lower()

        if remove == "y":
            known_users.remove(name)
        elif remove == "n":
            print("No problem!")
        else:
            print("Hmmm, I don't think I met you yet!{}".format(name))
            addd_me = input("would you like to be added to the system (y/n)?:").strip().lower()
            if add_me == "y":
                known_users.append(name)
            elif add_me == "n":
                print("No worries..")

    

            
            
            
    
