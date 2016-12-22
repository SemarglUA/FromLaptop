package IOFacilities;

import java.io.*;

public class ReadFileAndOutputFile {
    static String file = "D://BasicFileOutput.out";
    public static void main(String[] args)
            throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("D://BasicFileOutput.txt")));
        // Сокращенная запись:
        PrintWriter out = new PrintWriter(file);
        int lineCount = 1;
        String s;
        while((s = in.readLine()) != null )
            out.println(lineCount++ + ": " + s);
        out.close();
        // Вывод содержимого файла:
        System.out.println(BufferedInputFile.read(file));
    }

    public static class BufferedInputFile {
        // Throw exceptions to console:
        public static String
        read(String filename) throws IOException {
            // Reading input by lines:
            BufferedReader in = new BufferedReader(
                    new FileReader(filename));
            String s;
            StringBuilder sb = new StringBuilder();
            while((s = in.readLine())!= null)
                sb.append(s + "\n");
            in.close();
            return sb.toString();
        }
    }
}

