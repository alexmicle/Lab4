import java.util.Date;

/**
 * Created by alexm on 2/28/2017.
 */
public class Person {

    private String prenume;
    private String nume;
    private char gender;
    private int ziNastere;

    public Person(String prenume, String nume,int x){
        this.prenume = prenume;
        this.nume = nume;
        ziNastere= x;

    }

    public String getPrenume(){
        return prenume;
    }

    public void setPrenume(String prenume){

        this.prenume = prenume;
    }

    public void setNume(String nume){
        this.nume = nume;
    }

    public String getName(){
        return nume;
    }

    public static void main(String[] args) {

        Person florin = new Person();
        florin.setNume("Macicasan");
        florin.setPrenume("Florin");

    }


}
