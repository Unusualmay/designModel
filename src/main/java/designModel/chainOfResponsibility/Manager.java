package designModel.chainOfResponsibility;

abstract class Manager {
    protected String name;
    protected Manager superior;
    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestHandlder(Request request);
}


class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestHandlder(Request request) {
        if (request.getRequestType() == "请假" && request.getRequestNumber() <= 2) {
            System.out.println(this.name+":数量"+request.getRequestNumber()+request
            .getRequestContent()+"被批准了");
        } else {
            if (superior != null) {
                superior.requestHandlder(request);
            }
        }
    }
}

class Majordomo extends Manager {
    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestHandlder(Request request) {
        if (request.getRequestType() == "请假" && request.getRequestNumber() <= 5) {
            System.out.println(this.name+":数量"+request.getRequestNumber()+request
                    .getRequestContent()+"被批准了");
        } else {
            if (superior != null) {
                superior.requestHandlder(request);
            }
        }
    }
}

class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestHandlder(Request request) {
        if (request.getRequestType() == "请假") {
            System.out.println(this.name+":数量"+request.getRequestNumber()+request
                    .getRequestContent()+"被批准了");
        } else if (request.getRequestType() == "加薪" && request.getRequestNumber() < 500) {
            System.out.println(this.name+":数量"+request.getRequestNumber()+request
                    .getRequestContent()+"被批准了");
        } else if (request.getRequestType() == "加薪" && request.getRequestNumber() >= 500) {
            System.out.println(this.name+":数量"+request.getRequestNumber()+request
                    .getRequestContent()+"再说吧");
        }
    }
}

class Request {
    private String requestType;
    private String requestContent;
    private int requestNumber;

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(int requestNumber) {
        this.requestNumber = requestNumber;
    }
}