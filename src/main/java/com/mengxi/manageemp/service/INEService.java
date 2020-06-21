package com.mengxi.manageemp.service;

import com.mengxi.manageemp.domain.NetworkEquipment;

import java.util.List;

public interface INEService {
//    查询所有
    List<NetworkEquipment> getAll();
//    更新
    int upateNetworkEquipment(NetworkEquipment networkEquipment);
//    删除设备时，需要删除外模式
    int deleteNetworkEquipment(int neid);
//    添加设备信息,对设备信息合法性进行检查
    int addNetworkEquipment(NetworkEquipment networkEquipment);
}
