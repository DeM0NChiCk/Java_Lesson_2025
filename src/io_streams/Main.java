package io_streams;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        FileInputStream fis = null;
        String text = "Hello world!";

        String base_path = "C:\\Users\\myles\\IdeaProjects\\Java_Lesson_2025\\src\\io_streams";

        File dir = new File(base_path);

        File personFile = new File(dir, "person.dat");
        File txtEx = new File(dir, "text.txt");

        try (FileOutputStream fos = new FileOutputStream(txtEx)) {

            byte[] buffer = text.getBytes();

            int offset = 0;

            fos.write(buffer, offset, buffer.length - offset - 2);
            System.out.println("The file has been written");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            fis = new FileInputStream(txtEx);
            int i;
            while ((i = fis.read()) != -1) {

                System.out.print((char) i);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        } finally {
            try {

                if (fis != null)
                    fis.close();
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }

        System.out.println("\n");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(personFile)))
        {
            Person p = new Person("Sam", 33, 178, true);
            oos.writeObject(p);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(personFile)))
        {
            Person p = (Person) ois.readObject();
            System.out.printf("Name: %s \t Age: %d \t Height: %f  Married: %b \n ", p.getName(), p.getAge(), p.getHeight(), p.getMarried());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

//        try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
//            BufferedWriter bw = new BufferedWriter(new FileWriter(txtEx)))
//        {
//            // чтение построчно
//            String textBuf;
//            while(!(textBuf=br.readLine()).equals("ESC")){
//
//                bw.write(textBuf + "\n");
//                bw.flush();
//            }
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }


        Console console = System.console();
        if(console!=null){
            // считываем данные с консоли
            String login = console.readLine("LOGIN:");
            char[] password = console.readPassword("PASSWORD:");

            console.printf("LOGIN: %s \n", login);
            console.printf("PASSWORD : %s \n", new String(password));
        }

    }
}
