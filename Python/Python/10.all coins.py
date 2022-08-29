import random

class Coin:

    def __init__(self,rare = False,clean = True,heads = True,**kwargs):

        for key,value in kwargs.items():
            setattr(self,key,value)   
        
        self.is_rare = rare
        self.is_clean = clean
        self.heads = heads

        if self.is_rare:
            self.value = self.original_value*1.25
        else:
            self.value = self.original_value

        if self.is_clean:
            self.color = self.clean_color
        else:
            self.color = self.rusty_color

    def rust(self):
        self.color = self.rusty_color

    def clean(self):
        self.color = self.clean_color

    def __del__(self):
        print("coin spent!")

    def flip(self):
        heads_options = [True,False]
        choice = random.choice(heads_options)
        self.heads = choice
    def __str__(self):
        if self.original_value>=1:
            return"Rupees {} coin".format(int(self.original_value))

class One_Rupees(Coin):
    def __init__(self):
        data = {
            "original_value":1.00,
            "clean_color":"silver",
            "rusty_color":"black",
            "num_edges":1,
            "diameter":22.5,
            "thickness":3.5,
            "mass":9.5
            }
        super().__init__(**data)

class Two_Rupees(Coin):
    def __init__(self):
        data = {
            "original_value":2.00,
            "clean_color":"silver",
            "rusty_color":"black",
            "num_edges":1,
            "diameter":3.5,
            "thickness":3.15,
            "mass":9.9
            }
        super().__init__(**data)

class Five_Rupees(Coin):
    def __init__(self):
        data = {
            "original_value":5.00,
            "clean_color":"gold",
            "rusty_color":"green",
            "num_edges":1,
            "diameter":25.5,
            "thickness":3.25,
            "mass":15.0
            }
        super().__init__(**data)

class Ten_Rupees(Coin):
    def __init__(self):
        data = {
            "original_value":10.0,
            "clean_color":"goldsilver",
            "rusty_color":"black",
            "num_edges":1,
            "diameter":29.5,
            "thickness":4.15,
            "mass":20.0
            }
        super().__init__(**data)


coins = [One_Rupees(),Two_Rupees(),Five_Rupees(),Ten_Rupees()]


for coin in coins:
    arguments = [coin,coin.value,coin.color,coin.num_edges,coin.diameter,coin.thickness,coin.mass]

    string = "{}- value:{}, color:{}, nummber of edges:{}, diameter(mm):{},  thickness(mm):{},mass(g):{}".format(*arguments)
    print(string)
