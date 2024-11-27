import java.time.LocalDate;
import java.util.Arrays;

public class Billetstaggables extends Billet implements Taggable {

    public String LTags[];
    public int nbTags ;

    public Billetstaggables(LocalDate datePub, String auteur, int capacite){
        super (datePub,auteur);
        this.LTags = new String[capacite];
        this.nbTags=0;
    }

    
    public int getnbTags() {
        return nbTags;
    }

    public void setnbTags(int nbTags) {
        this.nbTags =nbTags;}

   @Override
    public String toString() {
        return "BilletsTaggables [datePub=" + datePub + ", LTags=" + Arrays.toString(LTags) + ", nbTags=" + nbTags + "]";
}

  @Override
    public void ajoutTag(String tag) {
        int pos = rechercheTag(tag);
        if(nbTags==LTags.length){
            System.out.println("impossible d'ajouter un autre tag la capacité est max");
            return;
        }
        if(pos!=-1){
            System.out.println("ce tag est deja existe");
            return;
        }else {
           LTags[nbTags] = tag; 
           nbTags++;
        }
       }


    @Override 
    public void supprimeTag(String tag){
           int pos = rechercheTag(tag);
        if (pos == -1) {
            System.out.println("Tag introuvable.");
            return;
        }
        for (int i = pos; i < nbTags - 1; i++) {
            LTags[i] = LTags[i + 1]; 
        }
        LTags[nbTags - 1] = null; 
        nbTags--;
    }

 @Override
    public int nombreTags(){
        return LTags.length ;
    } 

   @Override
    public int rechercheTag(String tag) {
        int position=-1;
        for (int i = 0; i < nbTags ; i++) {
            if (LTags[i].equals(tag)) {
                return i; 
            }
        };
        return position;
        }





}