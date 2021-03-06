package com.earlyspring.example.entity.animal;

import com.earlyspring.ioc.bean.annotation.AutoWired;
import com.earlyspring.ioc.bean.annotation.Component;
import lombok.Data;

/**
 * @Author: czf
 * @Date: 2020/5/29 14:40
 */
@Component("tiger")
@Data
public class Tiger {
    @AutoWired
    private Lion lion;
}
