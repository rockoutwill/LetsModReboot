package com.rockoutwill.letsmodreboot.configuration;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler {

    public static void init(File configFile){
        boolean configValue = false;
        // create the Config object from the given file
        Configuration configuration = new Configuration(configFile);

        try{
            //load the Config file
            configuration.load();
            // read in properties in the Config file
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example value").getBoolean(true);

        }
        catch(Exception e){
            // log the exception
        }
        finally {
            // save the Config File
            configuration.save();
        }
        System.out.println("Configuration Test: " + configValue);
    }
}
