package org.maven;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        Properties vProps = new Properties();
        InputStream vInputStream = null;
        try{
        	vInputStream = App.class.getResourceAsStream("/info.properties");
        	vProps.load(vInputStream);
        }
        finally{
        	if(vInputStream != null) {
        		vInputStream.close();
        	}
        }
        System.out.println( "Application version : " + vProps.getProperty("org.maven.version", "?"));
      
    }
}


