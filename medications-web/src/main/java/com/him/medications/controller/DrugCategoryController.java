package com.him.medications.controller;

/**
 * Created by apple on 2017/4/11.
 */

import com.him.medications.common.base.BaseController;
import com.him.medications.common.base.ResponseBuilder;
import com.him.medications.rs.DrugCategoryService;
import com.him.medications.vo.DrugCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 药品分类api
 */
@RestController
@RequestMapping("/category")
public class DrugCategoryController extends BaseController{


    @Autowired
    private DrugCategoryService drugCategoryService;


    /**
     * 保存药品分类信息
     * @param drugCategoryVO
     * @return
     */
    @RequestMapping(value = "/save/{pid}", method = RequestMethod.POST,consumes = "application/json")
    public ResponseBuilder getProvinceList(@PathVariable("pid") Long pid,@RequestBody DrugCategoryVO drugCategoryVO){
        Long id =drugCategoryService.saveDrugCategory(drugCategoryVO);
        return id != null ? ResponseBuilder.OK : ResponseBuilder.FAILURE;
    }






}
