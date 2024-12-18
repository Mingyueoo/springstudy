package com.ming.service.impl;

import com.ming.service.CalcService;
import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    @Override
    public int add(int num01, int num02) {
        int result =num01 + num02;
        System.out.println("加法result = "+ result);
        return result;
    }

    @Override
    public int div(int num01, int num02) {
        int result = num01 / num02;
        System.out.println("除法result"+ result);
        return result;
    }
}
