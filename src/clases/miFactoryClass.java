package clases;

import Interfaces.Sorter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public abstract class miFactoryClass {

    public static Object getInstance(String objName){
        Object o = new Object();
        try {
            FileInputStream archivo = new FileInputStream("mifactory.properties");
            Properties properties = new Properties();
            properties.load(archivo);
            o = Class.forName(properties.getProperty(objName)).newInstance();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return o;
    }
}
