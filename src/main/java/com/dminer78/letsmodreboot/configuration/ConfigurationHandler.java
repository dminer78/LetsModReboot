package com.dminer78.letsmodreboot.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static void init(File configFile) {
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try {
            //Load config
            configuration.load();

            //Get config value
            boolean ocnfigValue = configuration.get("Dminer's Category", "configValue", true, "This is an example config value").getBoolean(true);

        } catch(Exception e) {

        } finally {
            configuration.save();
        }

        //System.out.println("configValue is " + configValue);
    }
}