public class Character {
    public String characterName = "Gandalf";
    public int level= 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healtPoints, level, CharacterName and mana
     */
    Character(String name){
        characterName = name;
    }
    Character(int newHp, int newLevel, int newMana){
        healthPoints = newHp;
        level = newLevel;
        manaPoints = newMana;
    }

    /**
     * Create a Method that display the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void displayName(){
        System.out.println("Character Initialized: "+this.characterName);
    }

    /**
     * Create a Method Damage Target Character
     */
    public void damageTarget(Character enemyCharacter,int damagePoints, int manaCost){
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        enemyCharacter.manaPoints-=manaCost;
        System.out.println("Enemy Character Mana left = "+ enemyCharacter.manaPoints);
        System.out.println("Enemy character HP left = " + enemyCharacter.healthPoints);
        System.out.println( "\n");

        /**
         * Promt Character is defeated if HP falls below 0
         */
        if(enemyCharacter.healthPoints <=0){
            System.out.println(enemyCharacter.characterName +" is now defeated");
            System.out.println(characterName +" wins the battle");
        }
    }
    public void Recovery(Character Character, int heal, int IncreaseMana){
         /**
         * Recovery of the character
         */
         Character.healthPoints += heal;
         Character.manaPoints += heal;
         System.out.println("Enemy character HP total = " + Character.healthPoints);
         System.out.println("Enemy character Mana Total = " + Character.manaPoints);
         System.out.println("\n");
    }
    public void Level(Character CharLevel, int level){
        CharLevel.level = level;
        System.out.println(characterName + " has reach level "+CharLevel.level);
    }
    
}
