package proxyDesignPattern;

public class realCommand implements computer{

    @Override
    public void commandExecuted(String command,String role) {

        System.out.println( role + command + " executed successfully" );
    }
}
