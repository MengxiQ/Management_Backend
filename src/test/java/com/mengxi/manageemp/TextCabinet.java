package com.mengxi.manageemp;

import com.mengxi.manageemp.dao.ICabinetDao;
import com.mengxi.manageemp.domain.Cabinet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TextCabinet {
    @Autowired
    private ICabinetDao iCabinetDao;

    @Test
    public void testGetAll(){
        List<Cabinet> cabinets = iCabinetDao.getAllCabinet();
        System.out.println(cabinets);
    }
}
