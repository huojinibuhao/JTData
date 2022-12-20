package com.example.lirui.pojo.req;

/**
 * @ClassName ParseJsonReq
 * @Description TODO
 * @Author lr
 * @Date 2022/12/12 13:06
 * @Version 1.0
 */

import com.example.lirui.pojo.ExternProperty;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "parseJsonReq", description = "json解析")
public class ParseJsonReq {
    private Integer id;

    private String packageCode;

    private Integer jobOrderNo;

    private Integer equipmentClassObjectId;

    private Integer equipmentObjectId;

    private String equipmentObjectName;

    private String packageTime;

    private String printTime;

    private String parentId;

    private String boxpackage;

    private List<String> boxPackageCode;

    private String packages;

    private String materialDefinitionObjectId;

    private String binCode;

    private String etaValue;

    private String efficiencyValue;

    private String pmppValue;

    private String colorValue;

    private String gradeValue;

    private String uocValue;

    private String specValue;

    private String authcodeValue;

    private String partnoValue;

    private String remarkValue;

    private String outlabelcValue;

    private String binschemeidValue;

    private String classValue;

    private Integer quantity;

    private ExternProperty externProperty;
}

