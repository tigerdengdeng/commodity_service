package com.tiger.common.commodity_common;

import com.tiger.common.commodity_common.dao.entity.TUser;
import com.tiger.common.commodity_common.dao.mapper.TUserMapper;

import org.apache.log4j.net.SyslogAppender;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.swing.plaf.synth.SynthOptionPaneUI;

@SpringBootTest
public class CommodityCommonApplicationTests {

    @Resource
    private TUserMapper tUserMapper;
    @Test
    void contextLoads() {

            TUser user =new TUser();
           user= tUserMapper.userById(3);
            System.out.println(user);
      //  tUserMapper.userId("admin");
//        user = tUserMapper.selectById(1);
    //   System.out.println(user);
//            tUserMapper.deleteById(2);
//            user.setId(1);
//            user.setUsername("孙悟空");
//            user.setPassword("456");
//            user.setStatus(2);
//            tUserMapper.updateById(user);

//            user.setUsername("admin");
//            user.setPassword("456");
//            user.setStatus(1);
//            System.out.println(user);
//             tUserMapper.insert(user);


        }


    }


