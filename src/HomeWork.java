import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class HomeWork {
     private static List<String> vocab;
    public static void main(String[] args){

    int count = 'z' - 'a' + 1;

   vocab = new ArrayList<>();
            try(BufferedReader br = new BufferedReader(new FileReader("src/File/vocab.txt")))

    {
        String s;
        do {
            s = br.readLine();
            if (s != null)
                vocab.add(s);
        }
        while (s != null);
    } catch(
    FileNotFoundException e)

    {
        e.printStackTrace();
    } catch(
    IOException e)

    {
        e.printStackTrace();
    }




        System.out.println("Частота использования заданной  буквы  : ");
        System.out.println( countOfLetter('z'));
        System.out.println();

        System.out.println("Количество слов, начинающихся на заданную букву : ");
        System.out.println(countOfWardsStartingWith('g'));

}

       public static int countOfLetter(char c){
            int count =0;
            for (String string: vocab){
                for (int i = 0; i <string.length();i++){
                    if (string.charAt(i)==c)
                        count++;}}
            return count;


        }
    public static int countOfWardsStartingWith(char c){
        int count =0;
        for (String string: vocab){
                if (string.charAt(0)==c)
                    count++;}
        return count;


    }
}

















