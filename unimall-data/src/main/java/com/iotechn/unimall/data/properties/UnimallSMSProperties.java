package com.iotechn.unimall.data.properties;

import com.iotechn.unimall.data.annotaion.DynamicConfigProperties;
import com.iotechn.unimall.data.constant.DynamicConst;
import lombok.Data;

/**
 * Description:
 * User: rize
 * Date: 2020/8/6
 * Time: 15:51
 */
@Data
@DynamicConfigProperties(prefix = DynamicConst.SMS_CONFIG_PREFIX)
public class UnimallSMSProperties {

    private String enable;

    private String aliyunAccessKeyId;

    private String aliyunAccessKeySecret;

    private String aliyunSignature;

    private String aliyunRegisterTemplateId;

    private String aliyunBindPhoneTemplateId;

    private String aliyunResetPasswordTemplateId;

    private String aliyunAdminLoginTemplateId;

    private String qcloudAppId;

    private String qcloudAppKey;

    private String qcloudSignature;

    private String qcloudRegisterTemplateId;

    private String qcloudBindPhoneTemplateId;

    private String qcloudResetPasswordTemplateId;

    private String qcloudAdminLoginTemplateId;

}