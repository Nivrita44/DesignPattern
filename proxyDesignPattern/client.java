package proxyDesignPattern;

public class client {

    public static void main(String[] args) {
        proxyCommand proxyCommand = new proxyCommand();

        proxyCommand.commandExecuted("rm-rf","administrator");
        proxyCommand.commandExecuted("rm-rf","user");
        proxyCommand.commandExecuted("Delete Directory","user");

    }
}
