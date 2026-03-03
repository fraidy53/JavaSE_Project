package chap07;

abstract public class Appliance {
    private String modelNo;


    public Appliance() {
    }

    public Appliance( String modelNo ) {
        this.modelNo = modelNo;
    }

    public String getModelNo() {
    
        return modelNo;
    }

    public void setModelNo( String modelNo ) {
    
        this.modelNo = modelNo;
    }
     
    abstract public void volumeUp() ;
    abstract public void volumeDown() ;
}
 