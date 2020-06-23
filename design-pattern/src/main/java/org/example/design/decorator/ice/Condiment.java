package org.example.design.decorator.ice;

import org.example.design.decorator.ice.Drink;

/**
 * @Author: qingshan
 * @Date: 2019/3/11 00:35
 * @Description: 咕泡学院，只为更好的你
 *
 * 调料——抽象类
 */
public abstract class Condiment extends Drink {
    public abstract String getDesc();
}
