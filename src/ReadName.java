/**
 * Created by alexm on 2/28/2017.
 */
public class ReadName {

    public static void main(String[] args) {

        int n = SkeletonJava.readIntConsole("Cate nume?");

        String[] name = new String[n];
        String[] surname = new String[n];

        for(int i =0; i<n; i ++){

            int j= i+1;
            name[i] = SkeletonJava.readStringConsole("Name" + j + "?");
            surname[i] = SkeletonJava.readStringConsole("Surname" + j + "?");

            int len = surname[i].length();
            System.out.println(surname[i] + "+" + name[i] + " " + len);



        }




    }

}