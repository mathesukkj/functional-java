import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Employee> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src\\in.csv"))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));

                line = br.readLine();
            }

        }
    }
}
