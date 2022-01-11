package com.example.cachedemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.cachedemo.model.UserEntity;
import com.example.cachedemo.util.RedisUtil;
import com.sun.org.glassfish.gmbal.ParameterNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Slf4j
@RequestMapping("/redis")
@RestController
public class RedisController {

    private static int ExpireTime = 60;   // redis中存储的过期时间60s

    @Resource
    private RedisUtil redisUtil;

    @RequestMapping("set1")
    public boolean redissetTest(String key, String value){
        for(int i=0;i<23;i++){
            value+=value;
        }
        log.info("value.length={}",value.length());
        return redisUtil.set(key,value,ExpireTime);
    }

    @RequestMapping("set")
    public boolean redisset(String key, String value){
        UserEntity userEntity =UserEntity.getDefaultUser();
        return redisUtil.set(key,userEntity,ExpireTime);
    }

    @RequestMapping("get")
    public Object redisget(String key){
        return redisUtil.get(key);
    }

    @RequestMapping("expire")
    public boolean expire(String key){
        return redisUtil.expire(key,ExpireTime);
    }


    @RequestMapping("hset")
    public boolean redishset(String key, String value){
        Map<Long,UserEntity> map=UserEntity.getDefaultMap();
        for(Map.Entry entry: map.entrySet()){
            boolean flag=redisUtil.hset("h"+key,entry.getKey().toString(),entry.getValue());
            Assert.isTrue(flag,"push hash map error !");
        }
        return true;
    }

    @RequestMapping("hget")
    public Object redishget(String key,@RequestParam(defaultValue = "1") String filed){
        return redisUtil.hget("h"+key,filed);
    }

    @RequestMapping("lset")
    public boolean redilset(String key, String value){
        List<UserEntity> list =UserEntity.getDefaultList();
        return redisUtil.lSetAll("l"+key,list);
    }

    @RequestMapping("lget")
    public List<UserEntity> redilget(String key, @RequestParam(defaultValue = "0") int start,@RequestParam(defaultValue = "-1") int end){
        List<UserEntity> list=JSONObject.parseObject(JSONObject.toJSONString(redisUtil.lGet("l"+key,start,end)),List.class);
        return list;
    }
}