package designModel.flyweight;

/**
 * 注意网站也分为可共享和不可共享的部分，可共享的部分叫做内部状态，不可共享的部分叫做外部状态
 * 而这里的网站就是内部状态，但是客户的账号就是外部状态
 */
abstract class Website {
    public abstract void use(User user);
}

/**
 * 所有共享的网站都归作一类了
 */
class ConcreteWebsite extends Website {
    private String name = "";

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类：" + name+" 用户：" + user.name);
    }
}

