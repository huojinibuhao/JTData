package com.example.lirui.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * (ProductmsgX)表实体类
 *
 * @author makejava
 * @since 2022-12-09 09:58:25
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("ProDuctMsg_X")
public class ProductmsgX  {
    @TableId
    private String code;

    //状态
    private String ct;
    //产品编码
    private String code1;
    //等级
    private String series;
    //效率
    private String eff;
    //颜色
    private String color;
    //处方
    private String recipe;
    //数量
    private String qty;
    //产品名称
    private String type;
    //功率
    private String pmpp;
    //厚度
    private String thick;
    //栅线
    private String figure;
    //时间，这里代指：某天
    private String dete;
    //应该是备注栏吧
    private String rmks;

    @TableField(value = "车间")
    private String workShop;

    @TableField(value = "班别")
    private String classClassify;

    @TableField(value = "线别")
    private String lineClassify;

    @TableField(value = "装箱人员")
    private String packers;

    @TableField(value = "装箱时间")
    private Date packingTime;

    @TableField(value = "入检人员")
    private String incomingPersonnel;

    @TableField(value = "入检时间")
    private Date admissionTime;

    @TableField(value = "入检状态")
    private String admissionStatus;

    @TableField(value = "pmc入检人员")
    private String pMCAdmissionPersonnel;

    @TableField(value = "pmc入检时间")
    private Date pMCAdmissionTime;

    @TableField(value = "pmc入检状态")
    private String pMCAdmissionStatus;

    @TableField(value = "出检人员")
    private String inspectors;

    @TableField(value = "出检时间")
    private Date inspectionTime;

    @TableField(value = "出检状态")
    private String exitStatus;

    @TableField(value = "入库单号")
    private String inboundOrderNumber;

    @TableField(value = "出库单号")
    private String outboundTrackingNumber;

    private String code2;

    private String code3;
    
    private String cplx;
    
    private String lh;
    
    private String adr;
    
    private String mb;
    
    private String status;
    
    private String th;
    
    private Integer statusflag;
    
    private Integer num;
    //客户
    private String effXs;
    
    private String effJd;
    
    private String lhJd;
    
    private Integer id;
    
    private String rkuid;
    
    private Date rktime;
    
    private String gldh;
    
    private Integer bagnum;
    
    private String rmksmsg;
    
    private String coatMsg;
    
    private String typeid;
    
    private String colorBs;
    
    private String colorDm;
    
    private String colorFlag;
    
    private String marks;
    
    private String effFlag;
    
    private String pmppFlag;
    
    private String figureFlag;
    
    private String effShow;
    
    private String pmppShow;
    
    private String seriesShow;
    
    private String unlh;
    
    private String otherlh;
    
    private String seriesFlag;
    
    private String bmgz;
    
    private String reworkId;
    
    private String shift;
    
    private String pername;
    
    private Integer reworkNums;
    
    private String impp;
    
    private String ky;
    
    private String kyFlag;
    
    private String typeremark;
    
    private String workid;
    
    private String workcode;
    
    private Date createtime;
    
    private String kyShow;
    
    private Integer mbid;
    
    private Integer gysid;
    
    private String outlabelcValue;
    
    private Date updatetime;
    
    private String jtprdcode;
    
    private String colorFlname;



}

