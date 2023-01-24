import java.io.*;
import java.util.*;

public class SalesSplit {
    /**
     * Prompts for and reads name of file to process.
     * 
     * @param in Scanner from which to read
     * @return file name
     */
    private static String getFileName(Scanner in) {
        String filename = null;
        System.out.print("Enter file to process: ");
        if (in.hasNext()) {
            filename = in.next();
        }

        return filename;
    }

    /**
     * Read a sales entry from input Scanner.
     * 
     * @param in Scanner from which to read entry
     */
    private static Sale readSaleEntry(Scanner in) {
        String inputLine = in.nextLine();
        Scanner lineScan = new Scanner(inputLine);
        lineScan.useDelimiter(";");
        
        return new Sale(in.next(), in.next(), in.nextDouble(), in.next());
    }

    /**
    Reads sales data from the specified file.
    @param filename name of sales data file
    */
    private static ArrayList<Sale> readSalesFile(String filename) throws FileNotFoundException{
        ArrayList<Sale> sales = new ArrayList<Sale>();
        if (filename != null){
            try (Scanner infile = new Scanner(filename)){
                while (infile.hasNext()){
                    sales.add(readSaleEntry(infile));
                }
            }
        }
        return sales;
    }

    /**
     * Writes sale to writer.
     * 
     * @param out  PrintWriter to which sale is written
     * @param sale sale information
     */
    private static void writeSale(PrintWriter out, Sale sale) {
        out.print(sale.getName());
        out.print(";");
        out.print(sale.getServiceCategory());
        out.print(";");
        out.print(sale.getAmount());
        out.print(";");
        out.print(sale.getDate());
        out.println();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String filename = getFileName(in);
        System.out.println(filename);
        PrintWriter out = new PrintWriter("output.txt");

        try {
            ArrayList<Sale> sales = new ArrayList<Sale>();
            for (Sale s : sales)
                writeSale(out, s);
                out.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (NoSuchElementException e) {
            System.out.println("File format not valid.");
        }
    }
}