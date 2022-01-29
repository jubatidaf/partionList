package com.partition.controllers;


import com.partition.entity.PartitionEntityDto;
import com.partition.service.impl.ServicePartition;
import com.partition.service.utils.UtilsList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/get-partion-list")
public class GetListPartition {

    private static final Logger LOGGER = LoggerFactory.getLogger(GetListPartition.class);


    @Autowired
    private ServicePartition servicePartition;

    @PostMapping("/")
    @Produces(MediaType.APPLICATION_JSON)
    public UtilsList getListPartition(@RequestBody PartitionEntityDto partitionEntityDto) throws Exception {
        try {
            if (partitionEntityDto ==null) {
                return servicePartition.partition(null, 0);
            }
            if (partitionEntityDto !=null) {
                if(partitionEntityDto.getLstPartition()==null || partitionEntityDto.getPartitionNumber()==null)
                    return servicePartition.partition(null, 0);
            }
            return servicePartition.partition(partitionEntityDto.getLstPartition(), partitionEntityDto.getPartitionNumber());
        } catch (Exception e) {
            LOGGER.error("Erreur générale lors de la partition {}", e.getMessage());
            throw new Exception("Erreur Général");
        }
    }

    @GetMapping("/1")
    @Produces(MediaType.APPLICATION_JSON)
    public UtilsList getListPartition2() throws Exception {
        try {
            List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
            return servicePartition.partition(numbers, 2);
        } catch (Exception e) {
            LOGGER.error("Erreur générale lors de la partition {}", e.getMessage());
            throw new Exception("Erreur Général");
        }
    }
}
