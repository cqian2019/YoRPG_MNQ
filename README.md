# Team **MNQ**'s YoRPG:

## :star2: Classes :star2::

### ===[ Character ]===
##### *Attributes*:
- **health** variable
- **strength** variable
- **defense** variable
- **attRating** variable
- **isAlive** method
- **getDefense** method
- **lowerHP** method
- **attack** method

### ===[ Protagonist ]===
##### *Attributes*:
- :fire: *Inherits all attributes from **Character*** :fire:
- **name** variable
- **Protagonist** specific variable values in constructor.
- **getName** method
- **specialize** method
- **normalize** method

### ===[ Monster ] ===
##### *Attributes*:
- :fire: *Inherits all attributes from **Character*** :fire:
- **Monster** specific variable values in constructor

### ===[ Knight ]===
##### *Attributes*:
- :fire: *Inherits all attributes from **Protagonist*** :fire:
- **Knight**-specific **about** method
- **setStr** method for increasing strength.

### ===[ Archer ]===
##### *Attributes*:
- :fire: *Inherits all attributes from **Protagonist*** :fire:
- **Archer**-specific **about** method
- **setAtt** method for increasing strength and attack rating.

### ===[ Mage ]===
##### *Attributes*:
- :fire: *Inherits all attributes from **Protagonist*** :fire:
- **Mage**-specific **about** method
- **setDef** method for increasing defense.

### ===[ Giant ]===
##### *Attributes*:
- :fire: *Inherits all attributes from **Monster*** :fire:
- **Giant**-specific **about** method
- **setAtt** method for increasing health, strength and attack rating.

### ===[ Dragon ]===
##### *Attributes*:
- :fire: *Inherits all attributes from **Monster*** :fire:
- **Dragon**-specific **about** method
- **setAtt** method for increasing strength and defense.

### ===[ :dog: Dog :dog: ]===
##### *Attributes*:
- :fire: *Inherits all attributes from **Monster*** :fire:
- **Dog**-specific **about** method
- **setAtt** method for increasing defense and attack rating.
