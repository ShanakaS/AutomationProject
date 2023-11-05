package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
    private Properties getData(String fileName){
        ClassLoader classLoader = getClass().getClassLoader();// read the class loader
        File file =new File(classLoader.getResource(fileName+".properties").getFile());// check the where the file is located. get resources means the file in the Test path or main path resources .properties we hard coded. its checking only .properties file only
        FileInputStream fileInput = null; // read the inside of the file
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) { // if file is not found its given an error
            e.printStackTrace();
        }
        Properties property = new Properties();

        try {
            property.load(fileInput);// loading the file
        } catch (IOException e) { // if there are any issues while loading given en error
            e.printStackTrace();
        }
        return property;
    }

    public String getProperty(String fileName,String key){
        return getData(fileName).getProperty(key);

    }
}
