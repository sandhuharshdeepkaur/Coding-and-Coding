import random

class Rupees:


    def __init__(self,rare = False):

        self.rare = rare
        if self.rare:
            self.value = 1.25
        else:
            self.value = 1.00

            self.color = "silver"
            self.sides = 2
            self.diameter = 22.5
            self.thickness = 3.5
            self.heads = True

    def rust(self):
        self.color = "greenish"

    def clean(self):
        self.color = "gold"

    def flip(self):
        heads_options = [True,False]
        choice = random.choice(heads_options)
        self.heads = choice


    def __del__(self):
        print("coin spent! ")

    




    
