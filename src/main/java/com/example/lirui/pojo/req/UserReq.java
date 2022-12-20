package com.example.lirui.pojo.req;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "userReq",description = "用户请求体")
public class UserReq {
    private Integer id;
    @ApiModelProperty(name = "name",value = "名称",example = "lirui",required = true)
    @NotBlank(message = "名称不能为空")
    @Length(max = 30)
    private String name;
    @ApiModelProperty(name = "address",value = "地址",example = "汊河",required = true)
    @NotBlank(message = "地址不能为空")
    @Length(max = 30)
    private String address;
}
