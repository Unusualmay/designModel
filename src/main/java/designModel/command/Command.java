package designModel.command;

public abstract class Command {
    protected Barbecuer cookier;

    public Command(Barbecuer receiver) {
        this.cookier = receiver;
    }

    public abstract void executeCommand();
}

class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer cookier) {
        super(cookier);
    }

    @Override
    public void executeCommand() {
        cookier.bakeMutton();
    }
}

class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(Barbecuer cookier) {
        super(cookier);
    }

    @Override
    public void executeCommand() {
        cookier.bakeChickenWing();
    }
}
