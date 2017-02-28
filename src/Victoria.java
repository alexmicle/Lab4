import java.rmi.server.Skeleton;

/**
 * Created by alexm on 2/28/2017.
 */
public class Victoria {

    public static void main(String[] args) {

        Victoria.Vic();

    }

    public static void Vic(){

        //String[] name = new String[];

        //int i = 0;

        String name;

        do {
            name = SkeletonJava.readStringConsole("Nume?");
        }
        while(!"Victoria".equals(name));
        {

            System.out.println(name);
            System.out.println(name.length());
            //i++;

        }

    }

}
