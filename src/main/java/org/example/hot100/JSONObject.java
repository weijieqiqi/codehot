package org.example.hot100;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/11 16:00 //创建时间
 * @Version: 1.0    //版本号
 */
public class JSONObject {
    private String type;
    private int value;


    public JSONObject() {

    }
    public JSONObject(String type, int value) {
        this.type = type;
        this.value = value;
    }

    public void put(String key, Object value) {
        if (key.equals("type")) {
            this.type = (String) value;
        } else if (key.equals("value")) {
            if (value instanceof Integer) {
                this.value = (Integer) value;
            }
        }
    }

    @Override
    public String toString() {
        return "{\"type\":\"" + type + "\",\"value\":" + value + "}";
    }
}
