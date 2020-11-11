package com.example.demoo.server.serverInf;

import com.example.demoo.enter.userEnter;
import com.example.demoo.mapper.userMapper;
import com.example.demoo.server.userServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userSververInf implements userServer {

    @Autowired
    userMapper uMapper;
    @Override
    public void uServer() {

        userEnter aa= uMapper.userSelective();
        System.out.println("qqqqqq"+aa);

    }
}
