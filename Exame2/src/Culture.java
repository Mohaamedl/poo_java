
public class Culture extends Ativity {
    private Option option;
    public enum Option {
    FULL_MENU,
    DRINKS_AND_SNACKS,
    LIGHT_BITES,
    ARCHITECTURAL_TOUR,
    ART_MUSEUM,
    WINE_TASTING,RIVER_TOUR

}
    
    public Culture(Option op, int id) {
        super(id);
        this.option = op;
        
    }
    public Option getOption() {
        return option;
    }
}
