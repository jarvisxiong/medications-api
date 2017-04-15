package com.him.medications.rs;

import com.alibaba.boot.dubbo.annotation.DubboConsumer;
import com.google.common.collect.Lists;
import com.him.medications.exterface.IDrugCategoryService;
import com.him.medications.pojo.DrugCategoryPO;
import com.him.medications.vo.DrugCategoryVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by apple on 2017/4/7.
 */
@Service
public class DrugCategoryService {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 调用药品分类服务
     */
    @DubboConsumer
    private IDrugCategoryService iDrugCategoryService;


    /**
     * 保存药品分类信息
     * @param drugCategoryVO
     * @return
     */
    public Long saveDrugCategory(DrugCategoryVO drugCategoryVO){

        Long id = null;
        DrugCategoryPO  drugCategoryPO = new DrugCategoryPO();
        BeanUtils.copyProperties(drugCategoryVO, drugCategoryPO);
        if(drugCategoryPO != null){
            id = iDrugCategoryService.saveDrugCategory(drugCategoryPO);
        }

        return id;
    }








}
