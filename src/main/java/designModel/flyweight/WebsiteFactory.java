package designModel.flyweight;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * 工厂类管理网站类
 */
class WebsiteFactory {
    private HashMap<String, Website> websites = new LinkedHashMap<>();

    public Website getWebsite(String key) {
        if (!websites.containsKey(key)) {
            websites.put(key,new ConcreteWebsite(key));
        }
        return websites.get(key);
    }

    public int getWebsiteNums() {
        return websites.size();
    }
}
