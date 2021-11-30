package com.bestrookie.design;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2021/11/30 21:45
 */
public class ConfigOriginator {
    private ConfigFile configFile;
    public ConfigFile getConfigFile(){
        return configFile;
    }
     public void setConfigFile(ConfigFile configFile){
        this.configFile = configFile;
     }
     public ConfigMemento saveMemento(){
        return new ConfigMemento(configFile);
     }
     public void getMemento(ConfigMemento memento){
        this.configFile = memento.getConfigFile();
     }
}
