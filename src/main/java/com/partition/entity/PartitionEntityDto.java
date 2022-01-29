package com.partition.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wordnik.swagger.annotations.ApiModel;

import java.util.List;

@ApiModel(value = "PartitionEntityDto", description = "Bean PartitionEntityDto")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PartitionEntityDto<T>{
    private  List<T> lstPartition;
    private  Integer partitionNumber;

    public List<T> getLstPartition() {
        return lstPartition;
    }

    public PartitionEntityDto(List<T> lstPartition, int partitionNumber) {
        this.lstPartition = lstPartition;
        this.partitionNumber = partitionNumber;
    }

    public void setLstPartition(List<T> lstPartition) {
        this.lstPartition = lstPartition;
    }

    public Integer getPartitionNumber() {
        return partitionNumber;
    }

    public void setPartitionNumber(Integer partitionNumber) {
        this.partitionNumber = partitionNumber;
    }
}
