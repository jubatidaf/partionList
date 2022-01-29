package com.partition.service.utils;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public final class UtilsList<T> extends AbstractList<List<T>> {

    private final List<T> lstPartition;
    private final int partitionNumber;

    public UtilsList(List<T> list, int partitionNumber) {
        this.lstPartition = new ArrayList<>(list);
        this.partitionNumber = partitionNumber;
    }

    public static <T> UtilsList<T> ofSize(List<T> list, int partitionNumber) {
        if(list==null) {
            return new UtilsList<>(new ArrayList<>(), 0);
        }
        return new UtilsList<>(list, partitionNumber);
    }

    @Override
    public List<T> get(int index) {
        int start = index * partitionNumber;
        int end = Math.min(start + partitionNumber, lstPartition.size());

        if (start > end) {
            throw new IndexOutOfBoundsException("Index out of the list range");
        }

        return new ArrayList<>(lstPartition.subList(start, end));
    }
    @Override
    public int size() {
        return (int) Math.ceil((double) lstPartition.size() / (double) partitionNumber);
    }

}
