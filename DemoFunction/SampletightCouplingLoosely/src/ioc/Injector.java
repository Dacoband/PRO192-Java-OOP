
package ioc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
 
import javax.management.InstanceNotFoundException;
 
public class Injector {
 
    private static final String IOC_CONFIGURATION_FILE_NAME = "ioc_config.properties";
 
    private Injector() {
        throw new UnsupportedOperationException();
    } 
    public static Object getInstance(String key) throws InstanceNotFoundException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException  
    {
        try (InputStream input = new FileInputStream(IOC_CONFIGURATION_FILE_NAME)) {
            // load a properties file
            Properties prop = new Properties();
            prop.load(input); 
            // get the property value
            String className = prop.getProperty(key);
            return Class.forName(className).
                    getDeclaredConstructor().newInstance();
        } catch (IOException | InstantiationException | IllegalAccessException 
                | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            throw new InstanceNotFoundException(
                    "Can't create instance of " + key + 
                            " base on the configuration of "
                            + IOC_CONFIGURATION_FILE_NAME);
        }
    }
}