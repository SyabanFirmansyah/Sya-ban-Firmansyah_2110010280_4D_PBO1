package datahewan;

public class hewan {
    //atribut berserta enkapsulasi
    private String jenis;
    protected String idhwn;
    
    //konstruktor
    public hewan(String jenis, String idhwn) {    
        this.jenis = jenis;
        this.idhwn = idhwn;
    }
    
    //mutator
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setIdhwn(String idhwn) {    
        this.idhwn = idhwn;
    }

    //accessor
    public String getJenis() {
        return jenis;
    }

    public String getIdhwn() {
        return idhwn;
    }
    
    
    public String tampilanInfo(){
        return "Jenis hewan: "+getJenis()+
               "\nId hewan   : "+getIdhwn();
    }
    
    public String tampilanInfo(String tipe){
        return tampilanInfo() + "\nTipe: "+tipe;
    }
}
