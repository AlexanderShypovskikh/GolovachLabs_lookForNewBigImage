/**
 * Created by Al on 25.06.2016.
 */
import java.io.*;

public class FileLab_LookFor {
    public static void main(String[] args) {
        File file = new File("F:/tmp");
        print(file);
    }

    public static void print(File root) {
        boolean res = new FilterFilesImages().accept(root);
        if ((root.isFile())) {
            if(res)
            System.out.println(root.getPath());
        } else {
            File[] fileArray = root.listFiles();
            for (File file : fileArray) {
                    print(file);
            }
        }
    }
    }

   class FilterFilesImages implements FileFilter {

       @Override
       public boolean accept(File pathname) {
           int lenght = 1024 * 1024;
           if (pathname.length() > lenght) {
               if (pathname.getName().endsWith(".jpg") || pathname.getName().endsWith(".png") ||
                      pathname.getName().endsWith(".bmp") || pathname.getName().endsWith(".gif")) {

                   return true;
              }
           }

           return false;
       }
   }
