package com.partition.service;

import com.partition.service.utils.UtilsList;

import java.util.List;

public interface IServicePartition {
    public UtilsList partition(List<Integer> lst, int type);
}
