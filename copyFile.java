import java.io.*;

class copyFile {
  public static void main(String args[]){
    File fin=new File("Aditya.txt");
    File fout= new File("output.txt");
    FileReader fr= null;
    FileWriter fw=null;
    try{
      fr=new FileReader(fin);
      fw=new FileWriter(fout);
      int ch;
      while((ch=fr.read())!= -1){
        fw.write(ch);
      }
      System.out.println("check file now");
    }
    catch(Exception e){
      System.out.println(e);
    }
    finally{
      try{
        fr.close();
        fw.close();
      }
      catch(Exception e){
        System.out.println(e);
      }
    }
  }
}