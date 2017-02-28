/**
 * Created by alexm on 2/28/2017.
 */
public class ReadName {

    public static void main(String[] args) {

        int n = SkeletonJava.readIntConsole("Cate nume?");

      /*  String[] name = new String[n];
        String[] surname = new String[n];
        int[] ziuaDeNastere = new int[n];*/

        Person[] persoane =  new Person[n];

        for(int i =0; i<n; i ++){

            int j= i+1;
            String name = SkeletonJava.readStringConsole("Name" + j + "?");
            String surname = SkeletonJava.readStringConsole("Surname" + j + "?");
            int ziuaDeNastere = SkeletonJava.readIntConsole("Ziua de nasere?Luni=0");

            Person person =  new Person(surname,name,ziuaDeNastere);
          /*  person.setPrenume(surname);
            person.setNume(name);
            person.setZiNastere(ziuaDeNastere);*/
            persoane[i] = person;


            System.out.println(persoane[i].getName() + "+" + persoane[i].getPrenume() + " " + persoane[i].getName().length() + "nas" + persoane[i].getZiNastere());

        }
    }
}
