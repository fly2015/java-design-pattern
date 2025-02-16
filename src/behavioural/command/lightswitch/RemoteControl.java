/*
 * RemoteControl.java
 *
 * Da Nang, VN
 * Da Nang
 * All rights reserved.
 */
package behavioural.command.lightswitch;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class RemoteControl
{
    private Command command;
    private Command lastCommand;
    
    public void setCommand(Command command)
    {
        this.command = command;
    }

    public void pressButton()
    {
        command.execute();
    }


    public void setLastCommand(Command lastCommand)
    {
        this.lastCommand = lastCommand;
    }
    
    public void pressUndoButton()
    {
        if (lastCommand != null)
        {
            lastCommand.undo();
        }
    }
}



/*
 * Changes:
 * $Log: $
 */