package io.essentialcore;

import java.util.ArrayList;
import java.util.List;

public class PluginData {
    // 玩家名字列表
    public List<String> PlayerList;
    // 玩家传送列表
    public ArrayList<PlayerTpStruct> PlayerTpList;

    public boolean PlayerFind(String PlayerName) {
        for (int i = 0;i != PlayerList.size();i++) {
            if (PlayerList.get(i).equals(PlayerName)) {
                return true;
            }
        }
        return false;
    }

    /*
    如果isTpaOrTphere 是 true 那就是查找 Tpa 中的玩家，false 查找的是 Tphere 中的玩家
    传入的玩家是否有未处理的传送请求
    */

    public boolean PlayerTpFind(String PlayerName,boolean isTpaOrTphere) throws InterruptedException {
        // 循环查找是否有关于他的请求，如果有就执行Tp函数，要是没有就返回false
        for (int i = 0;i != PlayerTpList.size();i++) {
            if (isTpaOrTphere) {
                if (PlayerTpList.get(i).TeleportedPlayer.getName() == PlayerName) {
                    PlayerTpList.get(i).Tp();
                    return true;
                }
            } else {
                if (PlayerTpList.get(i).TeleportingPlayer.getName() == PlayerName) {
                    PlayerTpList.get(i).Tp();
                    return true;
                }
            }
        }
        return false;
    }
    /*
     传入 isTpaOtTphere 如果是 true 就是去查找关于 Tpa 的请求，如果是 false 就是查找关于 Tphere 的请求
     */

    public int PlayerTpFindI(String PlayerName,boolean isTpaOrTphere) {
        for (int i = 0;i != PlayerTpList.size();i++) {
            if (isTpaOrTphere) {

            }
        }
        return -1;
    }
    public PluginData() {
        PlayerList = new ArrayList<>();
        PlayerTpList = new ArrayList<>();
    }
}
