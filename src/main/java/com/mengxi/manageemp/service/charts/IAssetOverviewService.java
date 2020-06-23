package com.mengxi.manageemp.service.charts;


import com.mengxi.manageemp.domain.charts.TypeOverview;

import java.util.List;

public interface IAssetOverviewService {
    //图表数据：网络设备数量概况
    public List<TypeOverview> typeOverview();
}
