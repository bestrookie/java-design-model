package com.bestrookie.design;

import javax.security.auth.login.Configuration;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/11/30 21:41
 */
public class ConfigMemento {
    private ConfigFile configFile;
    public ConfigMemento(ConfigFile configFile){
        this.configFile = configFile;
    }

    public ConfigFile getConfigFile(){
        return configFile;
    }

    public void setConfigFile(ConfigFile configFile){
        this.configFile = configFile;
    }
}
