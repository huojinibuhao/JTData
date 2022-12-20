package com.example.lirui.service.iml;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.lirui.mapper.ExternPropertyMapper;
import com.example.lirui.pojo.ExternProperty;
import com.example.lirui.pojo.MoData;
import com.example.lirui.service.ExternPropertyService;
import com.example.lirui.service.MoDataService;
import com.example.lirui.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;


/**
 * (ExternProperty)表服务实现类
 *
 * @author makejava
 * @since 2022-12-12 10:34:17
 */
@Service("externPropertyService")
public class ExternPropertyServiceImpl extends ServiceImpl<ExternPropertyMapper, ExternProperty> implements ExternPropertyService {

    @Autowired
    private MoDataService moDataService;

    @Autowired
    private ExternPropertyService externPropertyService;

    @Override
    @Transactional
    public String insertData(HttpServletRequest request, String map) {
        // 将String转化为相应的JSONObject对象，map是“键值对”形式的json字符串，转化为JSONObject对象之后就可以使用其内置的方法
        JSONObject jsonObject = JSONObject.parseObject(map);
        // 根据key获取json数组中对应的值
        JSONArray selfData = jsonObject.getJSONArray("data");

        ArrayList<MoData> moDataArrayList = new ArrayList<>();
        ArrayList<ExternProperty> externProperties = new ArrayList<>();

        for (int i = 0; i < selfData.size(); i++) {
            JSONObject modataJson = selfData.getJSONObject(i);
            String externPropertyId = UUIDUtils.generateShortUuid();
            JSONArray box_package_code = modataJson.getJSONArray("box_package_code");
            int count = box_package_code.size();
            StringBuffer boxPackageCodes = new StringBuffer();
            for (int j = 0; j < count; j++) {
                boxPackageCodes.append(box_package_code.getString(j));
                if (j < count - 1) {
                    boxPackageCodes.append(",");
                }
            }
            MoData moData = MoData.builder()
                    .id(modataJson.getString("id"))
                    .packageCode(modataJson.getString("package_code"))
                    .jobOrderNo(modataJson.getString("job_order_no"))
                    .equipmentClassObjectId(modataJson.getString("equipment_class_object_id"))
                    .equipmentObjectId(modataJson.getString("equipment_object_id"))
                    .equipmentObjectName(modataJson.getString("equipment_object_name"))
                    .packageTime(modataJson.getDate("package_time"))
                    .printTime(modataJson.getDate(" print_time"))
                    .parentId(modataJson.getString("parent_id"))
                    .boxpackage(modataJson.getString("boxPackage"))
                    .boxPackageCode(modataJson.getString("box_package_code"))
                    .packages(modataJson.getString("packages"))
                    .materialDefinitionObjectId(modataJson.getString("material_definition_object_id"))
                    .binCode(modataJson.getString("bin_code"))
                    .etaValue(modataJson.getString("eta_value"))
                    .efficiencyValue(modataJson.getString("efficiency_value"))
                    .pmppValue(modataJson.getString("pmpp_value"))
                    .colorValue(modataJson.getString("color_value"))
                    .gradeValue(modataJson.getString("grade_value"))
                    .uocValue(modataJson.getString("uoc_value"))
                    .specValue(modataJson.getString("spec_value"))
                    .authcodeValue(modataJson.getString("authcode_value"))
                    .partnoValue(modataJson.getString("partno_value"))
                    .remarkValue(modataJson.getString("remark_value"))
                    .outlabelcValue(modataJson.getString("outlabelc_value"))
                    .binschemeidValue(modataJson.getString("binschemeid_value"))
                    .classValue(modataJson.getString("class_value"))
                    .quantity(modataJson.getInteger("quantity"))
                    .externPropertyId(externPropertyId)
                    .build();

            JSONObject externPropertyJson = modataJson.getJSONObject("extern_property");
            ExternProperty externProperty = ExternProperty.builder()
                    .id(externPropertyId)
                    .binschemeid(externPropertyJson.getString("BinSchemeID"))
                    .binschemedesc(externPropertyJson.getString("BinSchemeDesc"))
                    .bincode(externPropertyJson.getString("BinCode"))
                    .quantity(externPropertyJson.getString("Quantity"))
                    .customfields(externPropertyJson.getString("CustomFields"))
                    .quantitytype(externPropertyJson.getString("QuantityType"))
                    .grade(externPropertyJson.getString("Grade"))
                    .uoc(externPropertyJson.getString("Uoc"))
                    .rmks(externPropertyJson.getString("RMKS"))
                    .partno(externPropertyJson.getString("PartNo"))
                    .jtprdcode(externPropertyJson.getString("JtPrdCode"))
                    .etaout(externPropertyJson.getString("Eta(Out)"))
                    .recipe(externPropertyJson.getString("Recipe"))
                    .colorcodeb(externPropertyJson.getString("Color-Code-B"))
                    .colors(externPropertyJson.getString("Color-S"))
                    .figure(externPropertyJson.getString("Figure"))
                    .outlabelc(externPropertyJson.getString("OutLabelC"))
                    .pcode(externPropertyJson.getString("PCode"))
                    .slabellt(externPropertyJson.getString("SLabellT"))
                    .pmpp(externPropertyJson.getString("Pmpp"))
                    .companycode(externPropertyJson.getString("Company-Code"))
                    .eta(externPropertyJson.getString("Eta"))
                    .colorcodes(externPropertyJson.getString("Color-Code-S"))
                    .uoce(externPropertyJson.getString("M"))
                    .color(externPropertyJson.getString("Color"))
                    .thick(externPropertyJson.getString("Thick"))
                    .productcode(externPropertyJson.getString("ProductCode"))
                    .productname(externPropertyJson.getString("ProductName"))
                    .productid(externPropertyJson.getString("ProductId"))
                    .month(externPropertyJson.getString("Month"))
                    .year(externPropertyJson.getString("Year"))
                    .day(externPropertyJson.getString("day"))
                    .machinename(externPropertyJson.getString("MachineName"))
                    .machinecode(externPropertyJson.getString("MachineCode"))
                    .line(externPropertyJson.getString("Line"))
                    .testface(externPropertyJson.getString("TestFace"))
                    .factorycode(externPropertyJson.getString("FactoryCode"))
                    .sitecode(externPropertyJson.getString("SiteCode"))
                    .site(externPropertyJson.getString("Site"))
                    .productno(externPropertyJson.getString("ProductNo"))
                    .build();
            moDataArrayList.add(moData);
            externProperties.add(externProperty);
        }
        moDataService.saveBatch(moDataArrayList);
        externPropertyService.saveBatch(externProperties);
        return "Success";
    }

}
