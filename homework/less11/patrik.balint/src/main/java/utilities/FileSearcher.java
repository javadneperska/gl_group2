package utilities;

import java.io.File;
import java.util.ArrayList;

public class FileSearcher {

    public static String getFileFormat() {
        return fileFormat;
    }

    public static void setFileFormat(String fileFormat) {
        FileSearcher.fileFormat = fileFormat;
    }

    private static String fileFormat;


    public static ArrayList<String> getFileList() {
        ArrayList<String> fileNames = new ArrayList<String>();
        File directory = new File(System.getProperty("user.dir"));
        try {
            for (File file : directory.listFiles()) {
                if (file.getName().endsWith(fileFormat)) {
                    fileNames.add(file.getName());
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Please, specify the file format");
            System.exit(-3);
        }
        if (fileNames.size() % 2 != 0)
        {
            System.out.println("Number of files must be even");
            System.exit(-1);
        } else if(fileNames.size() == 0){
            System.out.println("Files with csv extension were not found");
            System.exit(-2);
        }
        return fileNames;
    }
}
