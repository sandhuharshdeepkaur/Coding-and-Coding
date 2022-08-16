from random import choice

questions = ["why rainbow has seven colors",
             "why february has 28 days?",
             "why the dog is black? "]
question = choice(questions)
answer = input(question).strip().lower()

while answer != "just because":
    answer = input("why?:").strip().lower()
print("Ohh.. okay")
