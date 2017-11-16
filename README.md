# Team **MNQ**'s YoRPG:
***Roster***:

*Tim Marder*

*Bill Ni*

*Cheryl Qian*

## :star2: Classes :star2::

### ===[ :bust_in_silhouette: Character :bust_in_silhouette: ]===
##### *Attributes*:
- **health** variable
- **strength** variable
- **defense** variable
- **attRating** variable
- **isAlive** method
- **getDefense** method
- **lowerHP** method
- **attack** method

### ===[ :boy: Protagonist :boy: ]===
##### *Attributes*:
- :fire: *Inherits all attributes from **Character*** :fire:
- **name** variable
- **Protagonist** specific variable values in constructor.
- **getName** method
- **specialize** method
- **normalize** method

### ===[ :japanese_goblin: Monster :japanese_goblin: ] ===
##### *Attributes*:
- :fire: *Inherits all attributes from **Character*** :fire:
- **Monster** specific variable values in constructor

### ===[ :punch: Knight :punch: ]===
##### *Attributes*:
- :fire: *Inherits all attributes from **Protagonist*** :fire:
- **Knight**-specific **about** method
- **setStr** method for increasing strength.

### ===[ :crescent_moon: Archer :crescent_moon: ]===
##### *Attributes*:
- :fire: *Inherits all attributes from **Protagonist*** :fire:
- **Archer**-specific **about** method
- **setAtt** method for increasing strength and attack rating.

### ===[ :zap: Mage :zap: ]===
##### *Attributes*:
- :fire: *Inherits all attributes from **Protagonist*** :fire:
- **Mage**-specific **about** method
- **setDef** method for increasing defense.

### ===[ :rage3: Giant :rage3: ]===
##### *Attributes*:
- :fire: *Inherits all attributes from **Monster*** :fire:
- **Giant**-specific **about** method
- **setAtt** method for increasing health, strength and attack rating.

### ===[ :dragon: Dragon :dragon: ]===
##### *Attributes*:
- :fire: *Inherits all attributes from **Monster*** :fire:
- **Dragon**-specific **about** method
- **setAtt** method for increasing strength and defense.

### ===[ :dog: Dog :dog: ]===
##### *Attributes*:
- :fire: *Inherits all attributes from **Monster*** :fire:
- **Dog**-specific **about** method
- **setAtt** method for increasing defense and attack rating.


## *:star: Instructions :star:* ##

1. Run game with **$ java YoRPG**.

2. Choose your difficulty.
  - Type **1** for Easy.
  - Type **2** for Medium.
  - Type **3** for Hard.
3. Choose your name by typing it in.

4. Choose your hero type.
  - Type **1** for Knight.
  - Type **2** for Mage.
  - Type **3** for Archer.
5. Go on your adventure!
  A. If a monster is encountered:
    - Type **1** if you aren't feeling lucky.
    - Type **2** if you are feeling lucky.
    - When monster is slain, you receive coins.
    - Option to visit store:
   
- Type **1** to visit store
  - Choose what potion to buy:
    - Type **1** for a *Defense Potion*.
    - Type **2** for an *Attack Potion*.
    - Type **3** for a *Health Potion*.
    - Type **4** to exit store. 
    - After purchase, option to stay/leave:
      - Type **y** to buy more items.
      - Type **n** to finish shopping.
            
- Type **2** to continue adventuring.
  - If no monster found:
    - Continue adventuring.
  - When adventured enough:
    - End game.
    
