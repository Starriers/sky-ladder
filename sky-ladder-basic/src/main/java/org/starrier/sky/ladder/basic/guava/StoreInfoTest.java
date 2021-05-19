package org.starrier.sky.ladder.basic.guava;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * @author starrier
 * @date 2021/4/19
 */
public class StoreInfoTest {

    public static void main(String[] args) {

        List<StoreInfo> storeInfos = new ArrayList<>();
        StoreInfo storeInfo = new StoreInfo();
        storeInfo.setName("2222");
        storeInfos.add(storeInfo);
        Gson gson = new Gson();
        String storeInfoJsonString = gson.toJson(storeInfos);


        Gson  GSON = new Gson();
        TypeToken<List<StoreInfo>> typeToken = new TypeToken<List<StoreInfo>>() {
        };
        List<StoreInfo> target =  GSON.fromJson(storeInfoJsonString,typeToken.getType() );
        System.out.println(target);

    }
}
