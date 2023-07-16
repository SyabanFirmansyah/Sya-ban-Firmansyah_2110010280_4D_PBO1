package datahewan;

//inheritance
public class hewanDetail extends hewan{
    //overriding
    public hewanDetail(String jenis, String idhwn) {
        super(jenis, idhwn);
    } 
    //2110010001
    public int getTahun(){
        return Integer.parseInt(getIdhwn().substring(0, 2)) + 2000;
    }
    
    public String getMakan(){
        String kodeMkn = (getIdhwn().substring(2, 3));
        //seleksi if
        switch(kodeMkn){
            case "1":
                return "Karnivora";
            case "2":
                return "Herbivora";
            default:
                return "Omnivora";
        }
    }
    
    public String getStatus(){
        String kodeStatus = (getIdhwn().substring(3, 5));
        //seleksi switch
        switch(kodeStatus){
            case "11":
                return "Terancam Punah";
            case "22":
                return "aman";
            default:
                return "tidak diketahui";
        }
    }
    
    public int getDatake(){
        return Integer.parseInt(getIdhwn().substring(5));
    }
    
    //overriding
    @Override
    public String tampilanInfo(){
        return super.tampilanInfo()+
                "\nTahun Didata       : "+getTahun()+
                "\nTipe Makanannya    : "+getMakan()+
                "\nStatus Hewan       : "+getStatus()+
                "\nData ke            : "+getDatake();
    }
}
