package InterestingTask;

import java.io.*;

public class CrUD {
    private int id;
    private String productName, fileName;
    private Double price;
    private Integer quantity;


    public CrUD(String file){
        fileName = file;
    };

    public void writeToFile(String productName, String price, String quantity){
        this.productName = productName;
        this.price = new Double(price);
        this.quantity = new Integer(quantity);
        byte[] id;
        try {
            BufferedInputStream fileiIn = new BufferedInputStream(new FileInputStream(fileName));
            int lastIdInFile = fileiIn.available() - 100;
            if (lastIdInFile > 0){
                fileiIn.read(id = new byte[8], lastIdInFile, 8);

            }else{

            }
        }catch (FileNotFoundException e){
            System.out.println(e.getStackTrace());
        }catch (IOException e){
            System.out.println(e.getStackTrace());
        }
        finally {

        }
    }
}
