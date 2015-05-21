package com.rockoutwill.letsmodreboot.handler;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;

    public static void init(File configFile){
        boolean configValue = false;
        // create the Config object from the given file
        configuration = new Configuration(configFile);

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
            if (configuration.hasChanged())
                configuration.save();
        }
        System.out.println("Configuration Test: " + configValue);
    }
}
