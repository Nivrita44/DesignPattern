package proxyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class proxyCommand implements computer{
    private computer realCommand;
    private List<String> restrictedCommand;

    public proxyCommand(){
        realCommand = new realCommand();
        restrictedCommand = new ArrayList<>();
        restrictedCommand.add("rm-rf");
    }
    @Override
    public void commandExecuted(String command,String role) {
            if(restrictedCommand.contains(command)  && role != "administrator"){
                System.out.println("The command" + command +" can't be executed" );

            }else {
                realCommand.commandExecuted(command,role);
            }
    }
}
