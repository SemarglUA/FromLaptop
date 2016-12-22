package InterestingTask;/* Прайсы
InterestingTask.CrUD для таблицы внутри файла
Считать с консоли имя файла для операций InterestingTask.CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно,
     инкрементируя максимальный id, найденный в файле
В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины
Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;

public class MainClass {
    private static String fileName;
    public static void main(String args[]){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            fileName = reader.readLine();
        }catch(IOException e){
            System.out.println("IOException when read file name");
        }finally{
            try {
                reader.close();
            } catch (IOException e){
                System.out.println("Operation close() terminated");
            }
        }
        if(args.length == 4 && args[0].equals("-c")){
            new CrUD(fileName).writeToFile(args[1], args[2], args[3]);
        }
    }
}