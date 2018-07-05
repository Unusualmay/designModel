package designModel.chainOfResponsibility;

abstract class Handler {
    protected Handler successor;
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}

class ConreteHandler1 extends Handler {
    private String name;
    public ConreteHandler1(String name) {
        this.name = name;
    }
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println(this.name+"处理请求"+request);
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}

class ConcreteHandler2 extends Handler {
    private String name;
    public ConcreteHandler2(String name) {
        this.name = name;
    }
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println(this.name + "处理请求"+ request);
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}

class ConcreteHandler3 extends Handler {
    private String name;
    public ConcreteHandler3(String name) {
        this.name = name;
    }
    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println(this.name + "处理请求" + request);
        } else {
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}
