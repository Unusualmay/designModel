package designModel.flyweight;

public class TestWebsite {
    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();

        /**
         * 网站１和网站２都是产品展示类，因此是共享同一种代码
         */
        Website website1 = factory.getWebsite("产品展示");
        website1.use(new User("小明哥"));

        Website website2 = factory.getWebsite("产品展示");
        website2.use(new User("小李子"));

        Website website3 = factory.getWebsite("博客杂记");
        website3.use(new User("小木木"));

        System.out.println("网站分类的总数：" + factory.getWebsiteNums());
    }
}
