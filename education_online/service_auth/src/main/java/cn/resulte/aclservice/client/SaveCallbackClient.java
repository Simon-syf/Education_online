package cn.resulte.aclservice.client;

import cn.resulte.aclservice.utils.R;

public class SaveCallbackClient implements SaveClient{

    @Override
    public void saveToken(String token) {
        System.out.println("存储token出错");
    }
}
