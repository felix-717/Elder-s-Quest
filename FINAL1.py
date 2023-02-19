axespearimport time
import os
import random
urhp=100
urcp=25
chp=150
ccp=15
php=200
pcp=25
khp=200
kcp=30
rhp=200
rcp=35
r=3

#Intro
print(" Throughout the world, there are several adventurers.")
print(" Some seek the sights of uncharted lands, or perhaps the casual stroll through a familiar place just to see it at a different angle.")
print(" However the most widely known are the Hunters, From beginners to masters,")
print(" these adventurers are restless in their pursuit of whatever goals they set their sights on.")
print(" From gathering materials to slaying mighty beasts, form battling the lowliest of Jaggi to the seemingly unstoppable elder dragons.")
print(" Hunters are without a doubt, the best adventurers the world has ever seen.")


time.sleep(10)
print("""        
  __  __  ____  _   _  _____ _______ ______ _____  
 |  \/  |/ __ \| \ | |/ ____|__   __|  ____|  __ \ 
 | \  / | |  | |  \| | (___    | |  | |__  | |__) |
 | |\/| | |  | | . ` |\___ \   | |  |  __| |  _  / 
 | |  | | |__| | |\  |____) |  | |  | |____| | \ \ 
 |_|  |_|\____/|_| \_|_____/   |_|  |______|_|  \_\
 

                       
""")
time.sleep(1)
print("""        


  _    _ _    _ _   _ _______ ______ _____  _ 
 | |  | | |  | | \ | |__   __|  ____|  __ \| |
 | |__| | |  | |  \| |  | |  | |__  | |__) | |
 |  __  | |  | | . ` |  | |  |  __| |  _  /| |
 | |  | | |__| | |\  |  | |  | |____| | \ \|_|
 |_|  |_|\____/|_| \_|  |_|  |______|_|  \_(_)
                                                                                         

                       
""")

enter1 = input("\n~Press Enter to continue~\n")

print("""



    It was a cloudy day above the Forrest of the Elders.
    Many knew of the forrest as a place of exotic monsters,
    all of which were different in their own way, even dangerous,
    and the strange bond they share with the town of which the forrest takes its name after.
    You have arrived in The Town of the Elders.



      """)

enter1 = input("\n~Press Enter to continue~\n")


print(" As you enter, you are greeted with the sight of injured hunters, broken houses, and the bodies of dead brave hunters.")
enter1 = input("\n~Press Enter to continue~\n")
print(" You ask around about what happened but everyone was too busy tending to the damage that has been done")
enter1 = input("\n~Press Enter to continue~\n")
print(" Looking around further more, you notice a well decorated old man, The Town Chief.")
enter1 = input("\n~Press Enter to continue~\n")
print(" Town Chief: You don't look familiar, what is your business here?")

name=input(str("What is your name, brave hunter?"))
print(" Town Chief: Well you've come to the right place if you seek the Elder dragons... ",name,", take a look around, the Kushala Daora did this.")
enter1 = input("\n~Press Enter to continue~\n")
print(" Town Chief: But before we get into further details, tell me about your experience as a Hunter.")

enter1 = input("\n~Press Enter to continue~\n")

print(""" Here are your stats:
 ============================== 
  Hunter""" ,name, """
  HP 100  / 100 
  CP 25
 ============================== 
  Here are your weapons: 
  1. Long sword
  2. Switch axe
  3. Shield
  4. Warbow
 ============================== 
  Rations:3
""")
#Start of the story
print(" Town Chief: We could truly use a Hunter of such stature! Please you seek the Elder dragon,")
print(" Town Chief:  help us in this present darkness!")
print(" Town Chief: four monsters have been in bothering this town for awhile, our hunters are stretched to thin to deal with them.")
print(" Out of pity, you agree to help the town.")

enter1 = input("\n~Press Enter to continue~\n")

print("Town Chief: Here is the deed to the quest.")

print("""

  _         _     _   _            _   _             _     ____             _       _ 
 | |    ___| |_  | |_| |__   ___  | | | |_   _ _ __ | |_  | __ )  ___  __ _(_)_ __ | |
 | |   / _ \ __| | __| '_ \ / _ \ | |_| | | | | '_ \| __| |  _ \ / _ \/ _` | | '_ \| |
 | |__|  __/ |_  | |_| | | |  __/ |  _  | |_| | | | | |_  | |_) |  __/ (_| | | | | |_|
 |_____\___|\__|  \__|_| |_|\___| |_| |_|\__,_|_| |_|\__| |____/ \___|\__, |_|_| |_(_)
                                                                      |___/  

 """)

enter1 = input("\n~Press Enter to continue~\n")


#quest 1
#Finding habitat


print("You set off to The Forrest of Elders")
time.sleep(1)
print("You take a look at the quest information.")
time.sleep(1)

print( """
****************************** 
Congalala
  HP 150/150
  CP 15
 ****************************** 
 ==============================

It resembles a giant, tailed gorilla with pink fur, a hippo-like head, and long front claws. 

When damaged enough, their rage mode is triggered.
Most of their upper jaw will be red, and they will be more aggressive.

The Congalala resides primarily in a lush environment
that features tropical forested areas, secluded grottoes,
and expansive, marshy lowlands.

 ============================== 
  MAP: 
  1. White Tower 
  2. Everwood Greens
  3. Flooded Ruins
  4. Verdant Highlands
 ==============================
  """)

atmpt=0
habi1=0
c = 2

while habi1 != 2 :
    habi1=int(input("Where is congolala?"))
    if habi1 == 1 or habi1 ==3 or habi1 == 4:
        print("Congolala is not there!. Choose again before he escapes! You have" ,c," more chance!")
        atmpt= atmpt + 1
        c=c-1
        if atmpt == 3:
            print ("Congolala escaped!!. You failed your quest")
            print("""
  ▄████  ▄▄▄       ███▄ ▄███▓▓█████ 
 ██▒ ▀█▒▒████▄    ▓██▒▀█▀ ██▒▓█   ▀ 
▒██░▄▄▄░▒██  ▀█▄  ▓██    ▓██░▒███   
░▓█  ██▓░██▄▄▄▄██ ▒██    ▒██ ▒▓█  ▄ 
░▒▓███▀▒ ▓█   ▓██▒▒██▒   ░██▒░▒████▒
 ░▒   ▒  ▒▒   ▓▒█░░ ▒░   ░  ░░░ ▒░ ░
  ░   ░   ▒   ▒▒ ░░  ░      ░ ░ ░  ░
░ ░   ░   ░   ▒   ░      ░      ░   
      ░       ░  ░       ░      ░  ░
                                    
""")
            time.sleep(2)
            print("""
 ▒█████   ██▒   █▓▓█████  ██▀███  
▒██▒  ██▒▓██░   █▒▓█   ▀ ▓██ ▒ ██▒
▒██░  ██▒ ▓██  █▒░▒███   ▓██ ░▄█ ▒
▒██   ██░  ▒██ █░░▒▓█  ▄ ▒██▀▀█▄  
░ ████▓▒░   ▒▀█░  ░▒████▒░██▓ ▒██▒
░ ▒░▒░▒░    ░ ▐░  ░░ ▒░ ░░ ▒▓ ░▒▓░
  ░ ▒ ▒░    ░ ░░   ░ ░  ░  ░▒ ░ ▒░
░ ░ ░ ▒       ░░     ░     ░░   ░ 
    ░ ░        ░     ░  ░   ░     
              ░                   
""")
            enter1 = input("\n~Press Enter to exit~\n")
            exit()
        
   
    elif habi1 == 2:
        print("You have found congolala")
    
    
    else:
        print("Invalid answer! Find congolala before it escapes!")   
    

        






#battle sequence
time.sleep(1)

print("""



      You are facing Congalala
      """)
time.sleep(1)
print("""


   _____                        _       _       
  / ____|                      | |     | |      
 | |     ___  _ __   __ _  ___ | | __ _| | __ _ 
 | |    / _ \| '_ \ / _` |/ _ \| |/ _` | |/ _` |
 | |___| (_) | | | | (_| | (_) | | (_| | | (_| |
  \_____\___/|_| |_|\__, |\___/|_|\__,_|_|\__,_|
                     __/ |                      
                    |___/                       


                  ."`".
              .-./ _=_ \.-.
             {  (,(oYo),) }}
             {{ |   "   |} }
             { { \(---)/  }}
             {{  }'-=-'{ } }
             { { }._:_.{  }}
             {{  } -:- { } }
             {_{ }`===`{  _}
            ((((\)     (/))))""")

time.sleep(2)


print("""

 
    Here are your stats:
 ============================== 
  Hunter""" ,name, """
  HP """ ,urhp, """  / 100 
  CP 25
 ============================== 
  Here are your weapons: 
  1. Long sword
  2. Switch axe
  3. Shield
  4. Warbow
 ============================== 
  5. Rations:3


   Here are Congolala's stats:
 ============================== 
 Congolala
  HP 150  / 150
  CP 15
 ============================== 
  tip to beat
 ============================== 
  
""")
ccp= 15

while not chp <= 0:
    att1=int(input("Choose which weapon to use(1-5)"))
    if att1==1:
        chp=(int(chp-urcp))
        print("Attack effective!! You have delt",urcp," damage! Congolala's hp:",chp,)
    elif att1 == 3 or att1 == 2:
        urhp=(int(urhp-ccp))
        print("Attack Ineffective!!")
        print("Congolala attacks and you recieve",ccp," damage" ,name,"s hp :" ,urhp,) 
    elif att1 == 4:
        urhp=(int(urhp-ccp))
        print("Attack recoiled!!" ,name, "recieves",ccp," damage!." ,name,"'s hp:" ,urhp,)
    elif att1==5 and urhp < 70 :
        if r!=0:
            urhp=urhp+30
            print("Added hp points by 30!" ,name,"'s hp:",urhp,)
            r=r-1
        elif r==0:
            print("No more Rations!")
         
            
        
    elif att1 == 5 and urhp >=70 :
        if r!=0:
            urhp=100
            print("Hp full!",name,"'s hp:",urhp,)
            r=r-1
        elif r==0:
            
            print("No more Rations!")

    if urhp <= 0:
        print("""
  ▄████  ▄▄▄       ███▄ ▄███▓▓█████    
 ██▒ ▀█▒▒████▄    ▓██▒▀█▀ ██▒▓█   ▀    
▒██░▄▄▄░▒██  ▀█▄  ▓██    ▓██░▒███      
░▓█  ██▓░██▄▄▄▄██ ▒██    ▒██ ▒▓█  ▄    
░▒▓███▀▒ ▓█   ▓██▒▒██▒   ░██▒░▒████▒   
 ░▒   ▒  ▒▒   ▓▒█░░ ▒░   ░  ░░░ ▒░ ░   
  ░   ░   ▒   ▒▒ ░░  ░      ░ ░ ░  ░   
░ ░   ░   ░   ▒   ░      ░      ░      
      ░       ░  ░       ░      ░  ░   
                                       
""")
        time.sleep(1)
        print("""




      
 ▒█████   ██▒   █▓▓█████  ██▀███  
▒██▒  ██▒▓██░   █▒▓█   ▀ ▓██ ▒ ██▒
▒██░  ██▒ ▓██  █▒░▒███   ▓██ ░▄█ ▒
▒██   ██░  ▒██ █░░▒▓█  ▄ ▒██▀▀█▄  
░ ████▓▒░   ▒▀█░  ░▒████▒░██▓ ▒██▒
░ ▒░▒░▒░    ░ ▐░  ░░ ▒░ ░░ ▒▓ ░▒▓░
  ░ ▒ ▒░    ░ ░░   ░ ░  ░  ░▒ ░ ▒░
░ ░ ░ ▒       ░░     ░     ░░   ░ 
    ░ ░        ░     ░  ░   ░     
              ░                   
""")
        print("            You died. Your journey has ended.")
        
        exit()
    elif chp <= 0:
        print("""

                            

     _______. __          ___   ____    ____  _______  _______   __  
    /       ||  |        /   \  \   \  /   / |   ____||       \ |  | 
   |   (----`|  |       /  ^  \  \   \/   /  |  |__   |  .--.  ||  | 
    \   \    |  |      /  /_\  \  \_    _/   |   __|  |  |  |  ||  | 
.----)   |   |  `----./  _____  \   |  |     |  |____ |  '--'  ||__| 
|_______/    |_______/__/     \__\  |__|     |_______||_______/ (__) 
                                                                     

                                            
                                            
""")
        print("congratulations you beaten congalala")
        time.sleep(1)

enter1 = input("\n~Press Enter to continue~\n")


#QUEST 2
#IDK WHAT TO PUT SO ILL JUST MAKE STUFF Up
    
  
print("You pursue your second target")
time.sleep(1)
print("You take a look at the quest information.")
time.sleep(1)

print( """
****************************** 
Plesioth
  HP 200/200
  CP 25
 ****************************** 
 ==============================

Plesioth are bipedal monsters with a wyvern-esque body structure.
They have webbed feet and a paddle-like tail, and are covered in shiny,
fish-like scales. Their mouth is filled with shark-like teeth, and their eyes glow a bright yellow.
Their head and back feature large fins which can fold in and out at will.


Plesioth are commonly found in large bodies of water in a wide variety of environments, 
 ============================== 
  MAP: 
  1. White Tower 
  2. Everwood Greens
  3. Flooded Ruins
  4. Verdant Highlands
 ==============================
  """)

atmpt=0
habi1=0
c = 2

while habi1 != 3 :
    habi1=int(input("Where is Plesioth?"))
    if habi1 == 1 or habi1 ==2 or habi1 == 4:
        print("Plesioth is not there!. Choose again before he escapes! You have" ,c," more chance!")
        atmpt= atmpt + 1
        c=c-1
        if atmpt == 3:
            print ("Plesioth has escaped!!. You failed your quest")
            print("""
  ▄████  ▄▄▄       ███▄ ▄███▓▓█████ 
 ██▒ ▀█▒▒████▄    ▓██▒▀█▀ ██▒▓█   ▀ 
▒██░▄▄▄░▒██  ▀█▄  ▓██    ▓██░▒███   
░▓█  ██▓░██▄▄▄▄██ ▒██    ▒██ ▒▓█  ▄ 
░▒▓███▀▒ ▓█   ▓██▒▒██▒   ░██▒░▒████▒
 ░▒   ▒  ▒▒   ▓▒█░░ ▒░   ░  ░░░ ▒░ ░
  ░   ░   ▒   ▒▒ ░░  ░      ░ ░ ░  ░
░ ░   ░   ░   ▒   ░      ░      ░   
      ░       ░  ░       ░      ░  ░
                                    
""")
            time.sleep(2)
            print("""
 ▒█████   ██▒   █▓▓█████  ██▀███  
▒██▒  ██▒▓██░   █▒▓█   ▀ ▓██ ▒ ██▒
▒██░  ██▒ ▓██  █▒░▒███   ▓██ ░▄█ ▒
▒██   ██░  ▒██ █░░▒▓█  ▄ ▒██▀▀█▄  
░ ████▓▒░   ▒▀█░  ░▒████▒░██▓ ▒██▒
░ ▒░▒░▒░    ░ ▐░  ░░ ▒░ ░░ ▒▓ ░▒▓░
  ░ ▒ ▒░    ░ ░░   ░ ░  ░  ░▒ ░ ▒░
░ ░ ░ ▒       ░░     ░     ░░   ░ 
    ░ ░        ░     ░  ░   ░     
              ░                   
""")
            enter1 = input("\n~Press Enter to exit~\n")
            exit()
        
   
    elif habi1 == 3:
        print("You have found Plesioth")
    
    
    else:
        print("Invalid answer! Find Plesioth before it escapes!")    
    
    

        






#battle sequence
time.sleep(1)

print("""



      You are facing Plesioth
      """)
time.sleep(1)
print("""

  ____  _           _       _   _     
 |  _ \| | ___  ___(_) ___ | |_| |__  
 | |_) | |/ _ \/ __| |/ _ \| __| '_ \ 
 |  __/| |  __/\__ \ | (_) | |_| | | |
 |_|   |_|\___||___/_|\___/ \__|_| |_|


    _..--'`     `'-.
   .'            _   '.
                (@)    \
                _.---:-'
               _\'._ \\
    jgs_.--''`` `'-.`' |
     .'             `""`
    /
                                      
""")

time.sleep(2)


print("""

Here are your stats:
 ============================== 
  Hunter""" ,name, """
  HP """ ,urhp, """  / 100 
  CP 25
 ============================== 
  Here are your weapons: 
  1. Long sword
  2. Evade
  3. Shield
  4. Warbow
 ============================== 
  5. Rations:""" ,r, """


   Here are Plesioth's stats:
 ============================== 
 Plesioth
  HP 200 / 200
  CP 25
 ============================== 
  It is underwater, Longsword may not help
 ============================== 

 
  
""")

pcp= 25
php=200
while not php <= 0:
    att1=int(input("Choose which weapon to use(1-5)"))
    if att1==4: 
        php=(int(php-urcp))
        print("Attack effective!! You have delt",urcp," damage! Plesioth's hp:",php,)
    elif att1 == 3 or att1 == 2:
        urhp=(int(urhp-pcp))
        print("Attack Ineffective!!")
        print("Plesioth attacks and you recieve",pcp," damage" ,name,"s hp :" ,urhp,) 
    elif att1 == 1:
        urhp=(int(urhp-ccp))
        print("Attack recoiled!!" ,name, "recieves",pcp," damage!." ,name,"'s hp:" ,urhp,)
    elif att1==5 and urhp < 70 :
        if r!=0:
            urhp=urhp+30
            print("Added hp points by 30!" ,name,"'s hp:",urhp,)
            r=r-1
        elif r==0:
            print("No more Rations!")
         
            
        
    elif att1 == 5 and urhp >=70 :
        if r!=0:
            urhp=100
            print("Hp full!",name,"'s hp:",urhp,)
            r=r-1
        elif r==0:
            
            print("No more Rations!")

    if urhp <= 0:
        print("""
  ▄████  ▄▄▄       ███▄ ▄███▓▓█████    
 ██▒ ▀█▒▒████▄    ▓██▒▀█▀ ██▒▓█   ▀    
▒██░▄▄▄░▒██  ▀█▄  ▓██    ▓██░▒███      
░▓█  ██▓░██▄▄▄▄██ ▒██    ▒██ ▒▓█  ▄    
░▒▓███▀▒ ▓█   ▓██▒▒██▒   ░██▒░▒████▒   
 ░▒   ▒  ▒▒   ▓▒█░░ ▒░   ░  ░░░ ▒░ ░   
  ░   ░   ▒   ▒▒ ░░  ░      ░ ░ ░  ░   
░ ░   ░   ░   ▒   ░      ░      ░      
      ░       ░  ░       ░      ░  ░   
                                       
""")
        time.sleep(1)
        print("""




      
 ▒█████   ██▒   █▓▓█████  ██▀███  
▒██▒  ██▒▓██░   █▒▓█   ▀ ▓██ ▒ ██▒
▒██░  ██▒ ▓██  █▒░▒███   ▓██ ░▄█ ▒
▒██   ██░  ▒██ █░░▒▓█  ▄ ▒██▀▀█▄  
░ ████▓▒░   ▒▀█░  ░▒████▒░██▓ ▒██▒
░ ▒░▒░▒░    ░ ▐░  ░░ ▒░ ░░ ▒▓ ░▒▓░
  ░ ▒ ▒░    ░ ░░   ░ ░  ░  ░▒ ░ ▒░
░ ░ ░ ▒       ░░     ░     ░░   ░ 
    ░ ░        ░     ░  ░   ░     
              ░                   
""")
        print("            You died. Your journey has ended.")
        
        exit()
    elif php <= 0:
        print("""

                            

     _______. __          ___   ____    ____  _______  _______   __  
    /       ||  |        /   \  \   \  /   / |   ____||       \ |  | 
   |   (----`|  |       /  ^  \  \   \/   /  |  |__   |  .--.  ||  | 
    \   \    |  |      /  /_\  \  \_    _/   |   __|  |  |  |  ||  | 
.----)   |   |  `----./  _____  \   |  |     |  |____ |  '--'  ||__| 
|_______/    |_______/__/     \__\  |__|     |_______||_______/ (__) 
                                                                     

                                            
                                            
""")
        print("congratulations you beaten Plesioth")
        time.sleep(1)

enter1 = input("\n~Press Enter to continue~\n")


 


print("You pursue your third target")
time.sleep(1)
print("You take a look at the quest information.")
time.sleep(1)

print( """
****************************** 
kirin
  HP 200/200
  CP 40
 ****************************** 
 ==============================

Kirin are most famous for their horns, as they are incredibly sharp,
yet surprisingly fragile. A strong Silver Horn
is said to be one of the most powerful and valuable of Kirin horns.
They have a physique of a horse.

Kirin are found mostly in high places, and ancient structures. 
 ============================== 
  MAP: 
  1. White Tower 
  2. Everwood Greens
  3. Flooded Ruins
  4. Verdant Highlands
 ==============================
  """)

atmpt=0
habi1=0
c = 2

while habi1 != 1 :
    habi1=int(input("Where is Kirin?"))
    if habi1 == 3 or habi1 ==2 or habi1 == 4:
        print("Kirin is not there!. Choose again before he escapes! You have" ,c," more chance!")
        atmpt= atmpt + 1
        c=c-1
        if atmpt == 3:
            print ("Kirin has escaped!!. You failed your quest")
            print("""
  ▄████  ▄▄▄       ███▄ ▄███▓▓█████ 
 ██▒ ▀█▒▒████▄    ▓██▒▀█▀ ██▒▓█   ▀ 
▒██░▄▄▄░▒██  ▀█▄  ▓██    ▓██░▒███   
░▓█  ██▓░██▄▄▄▄██ ▒██    ▒██ ▒▓█  ▄ 
░▒▓███▀▒ ▓█   ▓██▒▒██▒   ░██▒░▒████▒
 ░▒   ▒  ▒▒   ▓▒█░░ ▒░   ░  ░░░ ▒░ ░
  ░   ░   ▒   ▒▒ ░░  ░      ░ ░ ░  ░
░ ░   ░   ░   ▒   ░      ░      ░   
      ░       ░  ░       ░      ░  ░
                                    
""")
            time.sleep(2)
            print("""
 ▒█████   ██▒   █▓▓█████  ██▀███  
▒██▒  ██▒▓██░   █▒▓█   ▀ ▓██ ▒ ██▒
▒██░  ██▒ ▓██  █▒░▒███   ▓██ ░▄█ ▒
▒██   ██░  ▒██ █░░▒▓█  ▄ ▒██▀▀█▄  
░ ████▓▒░   ▒▀█░  ░▒████▒░██▓ ▒██▒
░ ▒░▒░▒░    ░ ▐░  ░░ ▒░ ░░ ▒▓ ░▒▓░
  ░ ▒ ▒░    ░ ░░   ░ ░  ░  ░▒ ░ ▒░
░ ░ ░ ▒       ░░     ░     ░░   ░ 
    ░ ░        ░     ░  ░   ░     
              ░                   
""")
            enter1 = input("\n~Press Enter to exit~\n")
            exit()
        
   
    elif habi1 == 1:
        print("You have found kirin")
    
    
    else:
        print("Invalid answer! Find krirn before it escapes!")    
    
    

        






#battle sequence
time.sleep(1)

print("""



      You are facing kirin
      """)
time.sleep(1)
print("""

  _    _      _       
 | | _(_)_ __(_)_ __  
 | |/ / | '__| | '_ \ 
 |   <| | |  | | | | |
 |_|\_\_|_|  |_|_| |_|


                   __       //
                   -\= \=\ //
                 --=_\=---//=--
               -_==/  \/ //\/--
                ==/   /O   O\==--
   _ _ _ _     /_/    \  ]  /--
  /\ ( (- \    /       ] ] ]==-
 (\ _\_\_\-\__/     \  (,_,)--
(\_/                 \     \-
\/      /       (   ( \  ] /)
/      (         \   \_ \./ )
(       \         \      )  \
(       /\_ _ _ _ /---/ /\_  \
 \     / \     / ____/ /   \  \
  (   /   )   / /  /__ )   (  )
  (  )   / __/ '---`       / /
  \  /   \ \             _/ /
  ] ]     )_\_         /__\/
  /_\     ]___\
 (___)                      
                                      
""")

time.sleep(2)


print("""

Here are your stats:
 ============================== 
  Hunter""" ,name, """
  HP """ ,urhp, """  / 100 
  CP 25
 ============================== 
  Here are your weapons: 
  1. Long sword
  2. Switch axe
  3. Shield
  4. Warbow
 ============================== 
  5. Rations:""" ,r, """


   Here are Kirin's stats:
 ============================== 
 Kirin
  HP 200 / 200
  CP 40
 ============================== 
You cannot go near it because of its thundery aura,
use something to deflect its power!
 ============================== 

 
  
""")




kcp= 30
khp=200
while not khp <= 0:
    att1=int(input("Choose which weapon to use(1-5)"))
    if att1==3:
        khp=(int(khp-urcp))
        print("Attack effective!! You have delt",urcp," damage! Kirin's hp:",khp,)
    elif att1 == 4 or att1 == 2:
        urhp=(int(urhp-kcp))
        print("Attack Ineffective!!")
        print("Kirin attacks and you recieve",kcp," damage" ,name,"s hp :" ,urhp,) 
    elif att1 == 1:
        urhp=(int(urhp-kcp))
        print("Attack recoiled!!" ,name, "recieves",kcp," damage!." ,name,"'s hp:" ,urhp,)
    elif att1==5 and urhp < 70 :
        if r!=0:
            urhp=urhp+30
            print("Added hp points by 30!" ,name,"'s hp:",urhp,)
            r=r-1
        elif r==0:
            print("No more Rations!")
         
            
        
    elif att1 == 5 and urhp >=70 :
        if r!=0:
            urhp=100
            print("Hp full!",name,"'s hp:",urhp,)
            r=r-1
        elif r==0:
            
            print("No more Rations!")

    if urhp <= 0:
        print("""
  ▄████  ▄▄▄       ███▄ ▄███▓▓█████    
 ██▒ ▀█▒▒████▄    ▓██▒▀█▀ ██▒▓█   ▀    
▒██░▄▄▄░▒██  ▀█▄  ▓██    ▓██░▒███      
░▓█  ██▓░██▄▄▄▄██ ▒██    ▒██ ▒▓█  ▄    
░▒▓███▀▒ ▓█   ▓██▒▒██▒   ░██▒░▒████▒   
 ░▒   ▒  ▒▒   ▓▒█░░ ▒░   ░  ░░░ ▒░ ░   
  ░   ░   ▒   ▒▒ ░░  ░      ░ ░ ░  ░   
░ ░   ░   ░   ▒   ░      ░      ░      
      ░       ░  ░       ░      ░  ░   
                                       
""")
        time.sleep(1)
        print("""




      
 ▒█████   ██▒   █▓▓█████  ██▀███  
▒██▒  ██▒▓██░   █▒▓█   ▀ ▓██ ▒ ██▒
▒██░  ██▒ ▓██  █▒░▒███   ▓██ ░▄█ ▒
▒██   ██░  ▒██ █░░▒▓█  ▄ ▒██▀▀█▄  
░ ████▓▒░   ▒▀█░  ░▒████▒░██▓ ▒██▒
░ ▒░▒░▒░    ░ ▐░  ░░ ▒░ ░░ ▒▓ ░▒▓░
  ░ ▒ ▒░    ░ ░░   ░ ░  ░  ░▒ ░ ▒░
░ ░ ░ ▒       ░░     ░     ░░   ░ 
    ░ ░        ░     ░  ░   ░     
              ░                   
""")
        print("            You died. Your journey has ended.")
        
        exit()
    elif khp <= 0:
        print("""

                            

     _______. __          ___   ____    ____  _______  _______   __  
    /       ||  |        /   \  \   \  /   / |   ____||       \ |  | 
   |   (----`|  |       /  ^  \  \   \/   /  |  |__   |  .--.  ||  | 
    \   \    |  |      /  /_\  \  \_    _/   |   __|  |  |  |  ||  | 
.----)   |   |  `----./  _____  \   |  |     |  |____ |  '--'  ||__| 
|_______/    |_______/__/     \__\  |__|     |_______||_______/ (__) 
                                                                     

                                            
                                            
""")
        print("congratulations you beaten the Kirin")
        time.sleep(1)

enter1 = input("\n~Press Enter to continue~\n")



print("You pursue your last target")
time.sleep(1)
print("You take a look at the quest information.")
time.sleep(1)

print( """
****************************** 
Rathalos
  HP 200/200
  CP 40
 ****************************** 
 ==============================
Rathalos are large, bipedal wyverns with a spiny,
armored hide covering their body. It is primarily bright red,
with black markings throughout. 


As a master of flight, they will travel far and wide,
searching for prey from the skies.
 ============================== 
  MAP: 
  1. White Tower 
  2. Everwood Greens
  3. Flooded Ruins
  4. Verdant Highlands
 ==============================
  """)

atmpt=0
habi1=0
c = 2

while habi1 != 4 :
    habi1=int(input("Where is Rathalos?"))
    if habi1 == 1 or habi1 ==2 or habi1 == 3:
        print("Rathalos is not there!. Choose again before he escapes! You have" ,c," more chance!")
        atmpt= atmpt + 1
        c=c-1
        if atmpt == 3:
            print ("Rathalos has escaped!!. You failed your quest")
            print("""
  ▄████  ▄▄▄       ███▄ ▄███▓▓█████ 
 ██▒ ▀█▒▒████▄    ▓██▒▀█▀ ██▒▓█   ▀ 
▒██░▄▄▄░▒██  ▀█▄  ▓██    ▓██░▒███   
░▓█  ██▓░██▄▄▄▄██ ▒██    ▒██ ▒▓█  ▄ 
░▒▓███▀▒ ▓█   ▓██▒▒██▒   ░██▒░▒████▒
 ░▒   ▒  ▒▒   ▓▒█░░ ▒░   ░  ░░░ ▒░ ░
  ░   ░   ▒   ▒▒ ░░  ░      ░ ░ ░  ░
░ ░   ░   ░   ▒   ░      ░      ░   
      ░       ░  ░       ░      ░  ░
                                    
""")
            time.sleep(2)
            print("""
 ▒█████   ██▒   █▓▓█████  ██▀███  
▒██▒  ██▒▓██░   █▒▓█   ▀ ▓██ ▒ ██▒
▒██░  ██▒ ▓██  █▒░▒███   ▓██ ░▄█ ▒
▒██   ██░  ▒██ █░░▒▓█  ▄ ▒██▀▀█▄  
░ ████▓▒░   ▒▀█░  ░▒████▒░██▓ ▒██▒
░ ▒░▒░▒░    ░ ▐░  ░░ ▒░ ░░ ▒▓ ░▒▓░
  ░ ▒ ▒░    ░ ░░   ░ ░  ░  ░▒ ░ ▒░
░ ░ ░ ▒       ░░     ░     ░░   ░ 
    ░ ░        ░     ░  ░   ░     
              ░                   
""")
            enter1 = input("\n~Press Enter to exit~\n")
            exit()
        
   
    elif habi1 == 4:
        print("You have found Rathalos")
    
    
    else:
        print("Invalid answer! Find Rathalos before it escapes!")    
    
    

        






#battle sequence
time.sleep(1)

print("""



      You are facing Rathalos
      """)
time.sleep(1)
print("""

  ____       _   _           _           
 |  _ \ __ _| |_| |__   __ _| | ___  ___ 
 | |_) / _` | __| '_ \ / _` | |/ _ \/ __|
 |  _ < (_| | |_| | | | (_| | | (_) \__ \
 |_| \_\__,_|\__|_| |_|\__,_|_|\___/|___/

                                                                 __----~~~~~~~~~~~------___
                                      .  .   ~~//====......          __--~ ~~
                      -.            \_|//     |||\\  ~~~~~~::::... /~
                   ___-==_       _-~o~  \/    |||  \\            _/~~-
           __---~~~.==~||\=_    -_--~/_-~|-   |\\   \\        _/~
       _-~~     .=~    |  \\-_    '-~7  /-   /  ||    \      /
     .~       .~       |   \\ -_    /  /-   /   ||      \   /
    /  ____  /         |     \\ ~-_/  /|- _/   .||       \ /
    |~~    ~~|--~~~~--_ \     ~==-/   | \~--===~~        .\
             '         ~-|      /|    |-~\~~       __--~~
                         |-~~-_/ |    |   ~\_   _-~            /\
                              /  \     \__   \/~                \__
                          _--~ _/ | .-~~____--~-/                  ~~==.
                         ((->/~   '.|||' -_|    ~~-/ ,              . _||
                                    -_     ~\      ~~---l__i__i__i--~~_/
                                    _-~-__   ~)  \--______________--~~
                                  //.-~~~-~_--~- |-------~~~~~~~~
                                         //.-~~~--\
                                      
""")

time.sleep(2)


print("""

Here are your stats:
 ============================== 
  Hunter""" ,name, """
  HP """ ,urhp, """  / 100 
  CP 25
 ============================== 
  Here are your weapons: 
  1. Long sword
  2. Switch axe
  3. Shield
  4. Warbow
 ============================== 
  5. Rations:""" """


   Here are Rathalos's stats:
 ============================== 
  Rathalos
  HP 200 / 200
  CP 35
 ============================== 
 RUN
 ============================== 

 
  
""")
        
rcp= 35
rhp=200
while not rhp <= 0:
    att1=int(input("Choose which weapon to use(1-5)"))
    if att1==2:
        rhp=(int(rhp-urcp))
        print("Attack effective!! You have delt",urcp," damage! Rathalos' hp:",rhp,)
    elif att1 == 4 or att1 == 3:
        urhp=(int(urhp-rcp))
        print("Attack Ineffective!!")
        print("Rathalos attacks and you recieve",rcp," damage" ,name,"s hp :" ,urhp,) 
    elif att1 == 1:
        urhp=(int(urhp-rcp))
        print("Ineffective!!" ,name, "recieves",rcp," damage!." ,name,"'s hp:" ,urhp,)
    elif att1==5 and urhp < 70 :
        if r!=0:
            urhp=urhp+30
            print("Added hp points by 30!" ,name,"'s hp:",urhp,)
            r=r-1
        elif r==0:
            print("No more Rations!")
         
            
        
    elif att1 == 5 and urhp >=70 :
        if r!=0:
            urhp=100
            print("Hp full!",name,"'s hp:",urhp,)
            r=r-1
        elif r==0:
            
            print("No more Rations!")

            
    if urhp <= 0:
        print("""
  ▄████  ▄▄▄       ███▄ ▄███▓▓█████    
 ██▒ ▀█▒▒████▄    ▓██▒▀█▀ ██▒▓█   ▀    
▒██░▄▄▄░▒██  ▀█▄  ▓██    ▓██░▒███      
░▓█  ██▓░██▄▄▄▄██ ▒██    ▒██ ▒▓█  ▄    
░▒▓███▀▒ ▓█   ▓██▒▒██▒   ░██▒░▒████▒   
 ░▒   ▒  ▒▒   ▓▒█░░ ▒░   ░  ░░░ ▒░ ░   
  ░   ░   ▒   ▒▒ ░░  ░      ░ ░ ░  ░   
░ ░   ░   ░   ▒   ░      ░      ░      
      ░       ░  ░       ░      ░  ░   
                                       
""")
        time.sleep(1)
        print("""




      
 ▒█████   ██▒   █▓▓█████  ██▀███  
▒██▒  ██▒▓██░   █▒▓█   ▀ ▓██ ▒ ██▒
▒██░  ██▒ ▓██  █▒░▒███   ▓██ ░▄█ ▒
▒██   ██░  ▒██ █░░▒▓█  ▄ ▒██▀▀█▄  
░ ████▓▒░   ▒▀█░  ░▒████▒░██▓ ▒██▒
░ ▒░▒░▒░    ░ ▐░  ░░ ▒░ ░░ ▒▓ ░▒▓░
  ░ ▒ ▒░    ░ ░░   ░ ░  ░  ░▒ ░ ▒░
░ ░ ░ ▒       ░░     ░     ░░   ░ 
    ░ ░        ░     ░  ░   ░     
              ░                   
""")
        print("            You died. Your journey has ended.")
        
        exit()
    elif rhp <= 0:
        print("""

                            

     _______. __          ___   ____    ____  _______  _______   __  
    /       ||  |        /   \  \   \  /   / |   ____||       \ |  | 
   |   (----`|  |       /  ^  \  \   \/   /  |  |__   |  .--.  ||  | 
    \   \    |  |      /  /_\  \  \_    _/   |   __|  |  |  |  ||  | 
.----)   |   |  `----./  _____  \   |  |     |  |____ |  '--'  ||__| 
|_______/    |_______/__/     \__\  |__|     |_______||_______/ (__) 
                                                                     

                                            
                                            
""")
        print("You have accomplish your Quest")
        time.sleep(1)
        print(""" 
 ██████╗ ██╗   ██╗███████╗███████╗████████╗
██╔═══██╗██║   ██║██╔════╝██╔════╝╚══██╔══╝
██║   ██║██║   ██║█████╗  ███████╗   ██║   
██║▄▄ ██║██║   ██║██╔══╝  ╚════██║   ██║   
╚██████╔╝╚██████╔╝███████╗███████║   ██║   
 ╚══▀▀═╝  ╚═════╝ ╚══════╝╚══════╝   ╚═╝   
                                           
""")
        time.sleep(1)
        print("""
 ██████╗ ██████╗ ███╗   ███╗██████╗ ██╗     ███████╗████████╗███████╗██████╗ 
██╔════╝██╔═══██╗████╗ ████║██╔══██╗██║     ██╔════╝╚══██╔══╝██╔════╝██╔══██╗
██║     ██║   ██║██╔████╔██║██████╔╝██║     █████╗     ██║   █████╗  ██║  ██║
██║     ██║   ██║██║╚██╔╝██║██╔═══╝ ██║     ██╔══╝     ██║   ██╔══╝  ██║  ██║
╚██████╗╚██████╔╝██║ ╚═╝ ██║██║     ███████╗███████╗   ██║   ███████╗██████╔╝
 ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚═╝     ╚══════╝╚══════╝   ╚═╝   ╚══════╝╚═════╝ 
                                                                             
""")
        
    elif rhp >=1 and rhp <=100:
        print("Rathalos starts to fly!")
        rcp=30
        while not rhp <= 0:
            att1=int(input("Choose which weapon to use(1-5)"))
            if att1 ==4:
                rhp=(int(rhp-urcp))
                print("Attack effective!! You have delt",urcp," damage! Rathalos' hp:",rhp,)
            elif att1 == 2:
                urhp=(int(urhp-rcp))
                print("Attack Missed!!")
                print("Rathalos attacks and you recieve",rcp," damage" ,name,"s hp :" ,urhp,) 
            elif attl == 3:
                urhp=(int(urhp-rcp))
                print("Attack Missed!!")
                print("Rathalos attacks and you recieve",rcp," damage" ,name,"s hp :" ,urhp,) 
            elif att1 == 1:
                urhp=(int(urhp-rcp))
                print("Attack Missed!!")
                print("Rathalos attacks and you recieve",rcp," damage" ,name,"s hp :" ,urhp,) 
            elif att1==5 and urhp <= 70:
                if r!=0:
                    urhp=urhp+30
                    print("Added hp points by 30!" ,name,"'s hp:",urhp,)
                    r=r-1
                elif r==0:
                    print("No more Rations!")

                elif att1 == 5 and urhp >=70:
                    if r!=0:
                        urhp=100
                        print("Hp full!",name,"'s hp:",urhp,)
                        r=r-1
                    elif r==0:
                        
                        print("No more Rations!")

    if urhp <= 0:
            print("""
      ▄████  ▄▄▄       ███▄ ▄███▓▓█████    
     ██▒ ▀█▒▒████▄    ▓██▒▀█▀ ██▒▓█   ▀    
    ▒██░▄▄▄░▒██  ▀█▄  ▓██    ▓██░▒███      
    ░▓█  ██▓░██▄▄▄▄██ ▒██    ▒██ ▒▓█  ▄    
    ░▒▓███▀▒ ▓█   ▓██▒▒██▒   ░██▒░▒████▒   
     ░▒   ▒  ▒▒   ▓▒█░░ ▒░   ░  ░░░ ▒░ ░   
      ░   ░   ▒   ▒▒ ░░  ░      ░ ░ ░  ░   
    ░ ░   ░   ░   ▒   ░      ░      ░      
          ░       ░  ░       ░      ░  ░   
                                           
    """)
            time.sleep(1)
            print("""




          
     ▒█████   ██▒   █▓▓█████  ██▀███  
    ▒██▒  ██▒▓██░   █▒▓█   ▀ ▓██ ▒ ██▒
    ▒██░  ██▒ ▓██  █▒░▒███   ▓██ ░▄█ ▒
    ▒██   ██░  ▒██ █░░▒▓█  ▄ ▒██▀▀█▄  
    ░ ████▓▒░   ▒▀█░  ░▒████▒░██▓ ▒██▒
    ░ ▒░▒░▒░    ░ ▐░  ░░ ▒░ ░░ ▒▓ ░▒▓░
      ░ ▒ ▒░    ░ ░░   ░ ░  ░  ░▒ ░ ▒░
    ░ ░ ░ ▒       ░░     ░     ░░   ░ 
        ░ ░        ░     ░  ░   ░     
                  ░                   
    """)
            print("            You died. Your journey has ended.")
            
            exit()
    elif rhp <= 0:
            print("""

                                

         _______. __          ___   ____    ____  _______  _______   __  
        /       ||  |        /   \  \   \  /   / |   ____||       \ |  | 
       |   (----`|  |       /  ^  \  \   \/   /  |  |__   |  .--.  ||  | 
        \   \    |  |      /  /_\  \  \_    _/   |   __|  |  |  |  ||  | 
    .----)   |   |  `----./  _____  \   |  |     |  |____ |  '--'  ||__| 
    |_______/    |_______/__/     \__\  |__|     |_______||_______/ (__) 
                                                                         

                                                
                                                
    """)
            print("congratulations you beaten congalala")
            time.sleep(1)
            print(""" 
     ██████╗ ██╗   ██╗███████╗███████╗████████╗
    ██╔═══██╗██║   ██║██╔════╝██╔════╝╚══██╔══╝
    ██║   ██║██║   ██║█████╗  ███████╗   ██║   
    ██║▄▄ ██║██║   ██║██╔══╝  ╚════██║   ██║   
    ╚██████╔╝╚██████╔╝███████╗███████║   ██║   
     ╚══▀▀═╝  ╚═════╝ ╚══════╝╚══════╝   ╚═╝   
                                               
    """)
            time.sleep(1)
            print("""
     ██████╗ ██████╗ ███╗   ███╗██████╗ ██╗     ███████╗████████╗███████╗██████╗ 
    ██╔════╝██╔═══██╗████╗ ████║██╔══██╗██║     ██╔════╝╚══██╔══╝██╔════╝██╔══██╗
    ██║     ██║   ██║██╔████╔██║██████╔╝██║     █████╗     ██║   █████╗  ██║  ██║
    ██║     ██║   ██║██║╚██╔╝██║██╔═══╝ ██║     ██╔══╝     ██║   ██╔══╝  ██║  ██║
    ╚██████╗╚██████╔╝██║ ╚═╝ ██║██║     ███████╗███████╗   ██║   ███████╗██████╔╝
     ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚═╝     ╚══════╝╚══════╝   ╚═╝   ╚══════╝╚═════╝ 
                                                                                 
    """)                 
            
        
    
                   
                    
enter1 = input("\n~Press Enter to continue~\n")

print(" You head back to report to the Town Chief")

enter1 = input("\n~Press Enter to continue~\n")

print(" Town Chief: We thank you for your heroism, brave Hunter!")

print(" Town Chief: Though i'd like to apologize, about the Elder dragons")

print(" Town Chief: No one has seen an Elder dragon for over a century now.")

print(" Town Chief:  No one knows what happened to them.")

print(" Town Chief: It was the Rathalos that did this to the Town.")

print(" Town Chief:  We desperatley needed your help.")


enter1 = input("\n~Press Enter to continue~\n")

print(" Next Quest, Investigate the disappearance of the Elder dragons.")

time.sleep(3)
print("""        
  __  __  ____  _   _  _____ _______ ______ _____  
 |  \/  |/ __ \| \ | |/ ____|__   __|  ____|  __ \ 
 | \  / | |  | |  \| | (___    | |  | |__  | |__) |
 | |\/| | |  | | . ` |\___ \   | |  |  __| |  _  / 
 | |  | | |__| | |\  |____) |  | |  | |____| | \ \ 
 |_|  |_|\____/|_| \_|_____/   |_|  |______|_|  \_\
 

                       
""")
time.sleep(1)
print("""        


  _    _ _    _ _   _ _______ ______ _____  _ 
 | |  | | |  | | \ | |__   __|  ____|  __ \| |
 | |__| | |  | |  \| |  | |  | |__  | |__) | |
 |  __  | |  | | . ` |  | |  |  __| |  _  /| |
 | |  | | |__| | |\  |  | |  | |____| | \ \|_|
 |_|  |_|\____/|_| \_|  |_|  |______|_|  \_(_)
                                                                                         

                       
""")

time.sleep(3)

print("""

  _____ _            _____ _   _ ____  
 |_   _| |__   ___  | ____| \ | |  _ \ 
   | | | '_ \ / _ \ |  _| |  \| | | | |
   | | | | | |  __/ | |___| |\  | |_| |
   |_| |_| |_|\___| |_____|_| \_|____/ 
                                       

""")

exit()
      
    


            



     
     





   
    
        
    

    




