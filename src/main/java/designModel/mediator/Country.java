package designModel.mediator;

abstract class Country {
    protected UnitedNations mediator;
    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }
}

class USA extends Country {
    public USA(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        mediator.declare(message,this);
    }

    public void getMessage(String message) {
        System.out.println("美国获得对方消息"+message);
    }
}

class Iraq extends Country {
    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        mediator.declare(message,this);
    }

    public void getMessage(String message) {
        System.out.println("伊拉克获得对方消息"+message);
    }
}