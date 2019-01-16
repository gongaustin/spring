package com.gongjun.tools.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gongjun.tools.mapper.TestMapper;
import com.gongjun.tools.model.Test;
import com.gongjun.tools.service.ITestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl  extends ServiceImpl<TestMapper,Test> implements ITestService{
}