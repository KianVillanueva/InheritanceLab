public class App {
    public static void main (String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n");
        Wizard Baxia = new Wizard( "Baxia");
        Warlock Gloo = new Warlock( "Gloo");
        Baxia.fireStorm(Gloo);
        Gloo.Retrify(Baxia);
        Gloo.revitalize(Gloo);
        Baxia.Vengeance(Baxia);
        Baxia.fireStorm(Gloo);
        Baxia.fireStorm(Gloo);
        Baxia.IncreaseLevel(Baxia);
}
}

