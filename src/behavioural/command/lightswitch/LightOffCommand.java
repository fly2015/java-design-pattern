/*
 * LightOnCommand.java
 *
 * Da Nang, VN
 * Da Nang
 * All rights reserved.
 */
package behavioural.command.lightswitch;

import behavioural.command.lightswitch.receiver.Light;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class LightOffCommand implements Command
{
    private Light light;
    
    public LightOffCommand(Light light)
    {
        this.light = light;
    }
    
    /**
     * @see behavioural.command.lightswitch.Command#execute()
     */
    @Override
    public void execute()
    {
        light.off();
    }

    /**
     * @see behavioural.command.lightswitch.Command#undo()
     */
    @Override
    public void undo()
    {
        light.on();
    }

}



/*
 * Changes:
 * $Log: $
 */