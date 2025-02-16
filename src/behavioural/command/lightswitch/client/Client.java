/*
 * Client.java
 *
 * Da Nang, VN
 * Da Nang
 * All rights reserved.
 */
package behavioural.command.lightswitch.client;

import behavioural.command.lightswitch.Command;
import behavioural.command.lightswitch.LightOffCommand;
import behavioural.command.lightswitch.LightOnCommand;
import behavioural.command.lightswitch.RemoteControl;
import behavioural.command.lightswitch.receiver.Light;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Client
{
    public static void main(String[] args)
    {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        
        RemoteControl remoteControl = new RemoteControl();
        // ON
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();
        
        //OFF
        remoteControl.setCommand(lightOffCommand);
        remoteControl.setLastCommand(lightOffCommand);
        remoteControl.pressButton();
        
        //UNDO
        remoteControl.pressUndoButton();
    }
}



/*
 * Changes:
 * $Log: $
 */