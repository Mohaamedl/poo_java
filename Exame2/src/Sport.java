
public class Sport extends Ativity{
    public enum Modality {
    KAYAK,
    HIKING,
    BOWLING,
    BIKE,
    
    }
   
    private Modality modality;
    public Sport(Modality mod, int id){
        super(id);
        this.modality = mod;
       

    }
    public Modality getModality() {
        return modality;
    }

    

}
