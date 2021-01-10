package com.example.demo;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;



/**
 * @author 彭明久
 * @since 2021-01-05
 */
@Service
public class SignInstance {
    private static final Logger logger = LoggerFactory.getLogger(SignInstance.class);


    @Scheduled(cron = "0 30 8 * * ?")
    public void sign() {
        HttpResponse<String> response = Unirest.post("https://h5.xiaofubao.com/marketing/health/doDetail")
                .header("shiroJID", "抓包获得")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .field("id", "抓包获得")
                .field("schoolCode", "抓包获得")
                .field("schoolName", "抓包获得")
                .field("identityType", "1")
                .field("userId", "抓包获得")
                .field("mobilePhone", "抓包获得")
                .field("name", "抓包获得")
                .field("jobNo", "抓包获得")
                .field("departmentCode", "抓包获得")
                .field("department", "抓包获得")
                .field("specialitiesCode", "抓包获得")
                .field("specialities", "抓包获得")
                .field("classCode", "抓包获得")
                .field("className", "抓包获得")
                .field("provinceCode", "抓包获得")
                .field("province", "抓包获得")
                .field("cityCode", "抓包获得")
                .field("city", "抓包获得")
                .field("inSchool", "1")
                .field("contactArea", "1")
                .field("isPatient", "1")
                .field("contactPatient", "1")
                .field("linkPhone", "抓包获得")
                .field("parentsPhone", "抓包获得")
                .field("createTime", "抓包获得")
                .field("createDate", "抓包获得")
                .field("updateTime", "抓包获得")
                .field("locationInfo", "抓包获得也可自定义")
                .field("longitudeAndLatitude", "抓包获得也可自定义")
                .field("isSuspected", "1")
                .field("healthStatusNew", "1")
                .field("identitySecondType", "11")
                .field("districtCode", "抓包获得")
                .field("district", "抓包获得")
                .field("isFamiliyPatient", "1")
                .field("isCommunityPatient", "1")
                .field("isTodayBack", "1")
                .field("backRemark", "")
                .field("backProvince", "")
                .field("backCity", "")
                .field("backDistrict", "")
                .field("patientHospital", "")
                .field("isolatedPlace", "")
                .field("temperature", "")
                .field("temperatureAfter", "36.3")
                .field("country", "")
                .field("address", "抓包获得")
                .field("backWay", "")
                .field("backWayName", "")
                .field("backAddress", "")
                .field("isInCompany", "")
                .field("backProvinceCode", "")
                .field("backCityCode", "")
                .field("backDistrictCode", "")
                .field("token", "")
                .field("uuToken", "抓包获得")
                .field("loginUserId", "2101051626194972100")
                .field("loginUserName", "抓包获得")
                .field("loginSchoolCode", "抓包获得")
                .field("loginSchoolName", "抓包获得")
                .asString();
        logger.error(response.getBody());

    }
}
