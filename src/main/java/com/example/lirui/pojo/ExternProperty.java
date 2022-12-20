package com.example.lirui.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lr
 * @TableName extern_property
 */
@TableName(value = "[test].[extern_property]")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExternProperty implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private String id;

    /**
     *
     */
    @TableField(value = "bin_scheme_id")
    private String binschemeid;

    /**
     *
     */
    @TableField(value = "bin_scheme_desc")
    private String binschemedesc;

    /**
     *
     */
    @TableField(value = "bin_code")
    private String bincode;

    /**
     *
     */
    private String quantity;

    /**
     *
     */
    @TableField(value = "custom_fields")
    private String customfields;

    /**
     *
     */
    @TableField(value = "quantity_type")
    private String quantitytype;

    /**
     *
     */
    @TableField(value = "grade")
    private String grade;

    /**
     *
     */
    @TableField(value = "uoc")
    private String uoc;
    
    @TableField(value = "rmks")
    private String rmks;

    /**
     *
     */
    @TableField(value = "part_no")
    private String partno;

    /**
     *
     */
    @TableField(value = "jtprd_code")
    private String jtprdcode;

    /**
     *
     */
    @TableField(value = "eta_out")
    private String etaout;

    /**
     *
     */
    @TableField(value = "recipe")
    private String recipe;

    /**
     *
     */
    @TableField(value = "color_code_b")
    private String colorcodeb;

    /**
     *
     */
    @TableField(value = "colors")
    private String colors;

    /**
     *
     */
    @TableField(value = "figure")
    private String figure;

    /**
     *
     */
    @TableField(value = "out_label_c")
    private String outlabelc;

    /**
     *
     */
    @TableField(value = "p_code")
    private String pcode;

    /**
     *
     */
    @TableField(value = "s_label_it")
    private String slabellt;

    /**
     *
     */
    @TableField(value = "pmpp")
    private String pmpp;

    /**
     *
     */
    @TableField(value = "company_code")
    private String companycode;

    /**
     *
     */
    @TableField(value = "eta")
    private String eta;

    /**
     *
     */
    @TableField(value = "color_code_s")
    private String colorcodes;

    /**
     *
     */
    @TableField(value = "uoce")
    private String uoce;

    /**
     *
     */
    @TableField(value = "color")
    private String color;

    /**
     *
     */
    @TableField(value = "thick")
    private String thick;

    /**
     *
     */
    @TableField(value = "product_code")
    private String productcode;

    /**
     *
     */
    @TableField(value = "product_name")
    private String productname;

    /**
     *
     */
    @TableField(value = "product_id")
    private String productid;

    /**
     *
     */
    @TableField(value = "month")
    private String month;

    /**
     *
     */
    @TableField(value = "year")
    private String year;

    /**
     *
     */
    @TableField(value = "day")
    private String day;

    /**
     *
     */
    @TableField(value = "machine_name")
    private String machinename;

    /**
     *
     */
    @TableField(value = "machine_code")
    private String machinecode;

    /**
     *
     */
    @TableField(value = "line")
    private String line;

    /**
     *
     */
    @TableField(value = "test_face")
    private String testface;

    /**
     *
     */
    @TableField(value = "factory_code")
    private String factorycode;

    /**
     *
     */
    @TableField(value = "site_code")
    private String sitecode;

    /**
     *
     */
    @TableField(value = "site")
    private String site;

    /**
     *
     */
    @TableField(value = "product_no")
    private String productno;

}