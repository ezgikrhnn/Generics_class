package xxx;

public class GenericDiziYazdir<GelenVeriTuru> {
    public void yazdir(GelenVeriTuru[] dizi){
        for(GelenVeriTuru gecici : dizi){
            System.out.println(gecici);
        }
    }


}
