import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
public class HashSetDemo {
        public static void main(String[] args) throws IOException {
            List<String> EmployeeNames = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("Duplicates.txt"))) {

                String name;
                while ((name = br.readLine()) != null) {
                    EmployeeNames.add(name);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Size of the collection is: " + EmployeeNames.size());

            for (String name : EmployeeNames
            ) {
                System.out.println(name);
            }

            HashSet<String> set = new HashSet<String>(EmployeeNames);

            List<String> EmployeeList = new ArrayList<String>(set);

            System.out.println("List without duplicates:");
            for (Object uniqueName: EmployeeList)
                System.out.println(uniqueName);

        }
    }

