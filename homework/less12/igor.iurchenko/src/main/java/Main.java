import utilities.FileReader;
import utilities.FileSearcher;

import java.text.ParseException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileSearcher.setFileFormat("csv");
        ArrayList<String> fileList = FileSearcher.getFileList();
        ArrayList<Student> students = new ArrayList<Student>();
        FileReader fileReader = new FileReader(",");
        for (String fileName:fileList) {
            ArrayList<String[]> fileContent = fileReader.readFile(fileName);
            for (String[] student :fileContent) {
                students.add(new Student(student[0], student[1], student[2], Integer.parseInt(student[3]), student[4],
                        student[5]));
            }
        }
        for (Student student : students) {
            try {
                student.printInfo();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
}
