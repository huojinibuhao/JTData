package com.example.lirui.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (MoData)实体类
 *
 * @author makejava
 * @since 2022-12-12 10:18:31
 */
@TableName(value = "[test].[mo_data]")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MoData implements Serializable {
    private static final long serialVersionUID = 461958593886903257L;

    private String id;

    private String packageCode;

    private String jobOrderNo;

    private String equipmentClassObjectId;

    private String equipmentObjectId;

    private String equipmentObjectName;

    private Date packageTime;

    private Date printTime;

    private String parentId;

    private String boxpackage;

    private String boxPackageCode;

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

    private String externPropertyId;

    private String packageType;

    private String packageTypeName;

    private String packageState;

    private String packageStateName;

    private String printType;

    private String printTypeName;

    private String createUser;

    @TableField(value = "testtype_value")
    private String testTypeValue;

    private String siteValue;

    private String lineValue;

    @TableField(value = "shiftday")
    private String shiftDay;

    @TableField(value = "shiftname")
    private String shiftName;

    @TableField(value = "classcode")
    private String classCode;

}

