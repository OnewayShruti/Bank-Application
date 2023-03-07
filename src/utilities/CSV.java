package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    public CSV() {
    }

    public static List<String[]> read(String file) {
        List<String[]> data = new LinkedList();

        try {
            BufferedReader lineReader = new BufferedReader(new FileReader(file));

            String dataRow;
            while((dataRow = lineReader.readLine()) != null) {
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }

            return data;
        } catch (FileNotFoundException var5) {
            System.out.println(var5.getMessage());
            throw new RuntimeException(var5);
        } catch (IOException var6) {
            System.out.println(var6.getMessage());
            throw new RuntimeException(var6);
        }
    }
}

