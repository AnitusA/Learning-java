import java.io.*;

public class Writefile {
    public static void main(String[] args){
        String filename = "student.txt";

        try(FileWriter writer = new FileWriter(filename)){
            writer.write("1,  anitus\n");
            writer.write("2,  ajr\n");
            System.out.println("Fata written sucessfully");
        }catch(IOException e){
            e.printStackTrace();
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
                e.printStackTrace();
            }
    }
    
}
