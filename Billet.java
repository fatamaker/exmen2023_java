import java.time.LocalDate;

public class Billet implements Publiable {

    protected LocalDate datePub ;
    protected String auteur ; 

    public Billet(LocalDate datePub, String auteur){
        this.datePub=datePub;
        this.auteur=auteur;

    }


     
    public LocalDate getDatePublication() {
        return datePub  ;
    }
    

    public String getAuteur(){
        return auteur ;
    }

    @Override
    public String toString(){
        return ("la date de publication :  " + datePub + " , l'auteur : " + auteur);

    }


}