package com.partition.service.impl;

import com.partition.service.IServicePartition;
import com.partition.service.utils.UtilsList;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServicePartition implements IServicePartition {

    @Override
    public UtilsList partition(List<Integer> lst, int type) {

        return UtilsList.ofSize(lst,type);
    }

}
