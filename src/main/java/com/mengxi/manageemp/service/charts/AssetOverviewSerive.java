package com.mengxi.manageemp.service.charts;

import com.mengxi.manageemp.dao.INetworkEquipmentDao;
import com.mengxi.manageemp.domain.charts.TypeOverview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AssetOverviewSerive implements IAssetOverviewService {
    @Autowired
    private INetworkEquipmentDao iNetworkEquipmentDao;

    @Override
    public List<TypeOverview> typeOverview() {
        return iNetworkEquipmentDao.getAssetOverviewByCol();
    }
}
