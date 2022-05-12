public class Warlock extends Character{
    Warlock(String name){
        super(name);
    }
    public void Retrify(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + "with retrify" );
        int damagePoints = 50;
        int manaCost = 100;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void revitalize(Character enemyCharacter){
        System.out.println(super.characterName + "use revitalize (Hp +50) (Mana +10)");
        int recover = 30;
        int mana = 10;
        Recovery(enemyCharacter, recover, mana);
    };
    public void IncreaseLevel(Character Winner){
        int levelIncrease = 10;
        Level(Winner, levelIncrease);
    }
    
}

