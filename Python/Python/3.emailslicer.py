#get user email address

email = input("what is your email address?:").strip()

#slice user name
user= email[:email.index("@")-1]

#slice domain name
domain= email[email.index("@") + 1:]

#format message
output= "your user name is {} and your domain name is {}".format(user,domain)

#dislay output message
print(output)


            
