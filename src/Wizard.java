public class Wizard extends Character {
    Wizard(String name){
        super(name);
    }
    public void fireStorm(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Firestorm ");
        int damagePoints = 45;
        int manaCost = 85;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void Vengeance(Character enemyCharacter){
        System.out.println(super.characterName + " use Vengeance (Hp +20)(mana +10)");
        int recover = 20;
        int mana = 10;
        Recovery(enemyCharacter, recover, mana);
    };
    public void IncreaseLevel(Character Winner){
        int levelIncrease = 10;
        Level(Winner, levelIncrease);
    };
    
}
