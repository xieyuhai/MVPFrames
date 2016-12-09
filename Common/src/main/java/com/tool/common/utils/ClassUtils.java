package com.tool.common.utils;

import com.tool.common.utils.base.BaseUtils;

import java.lang.reflect.ParameterizedType;

/**
 * ClassUtils
 */
public class ClassUtils extends BaseUtils {

    public ClassUtils() {
        super();
    }

    public static <T> T getT(Object o, int i) {
        try {
            return ((Class<T>) ((ParameterizedType) (o.getClass()
                    .getGenericSuperclass())).getActualTypeArguments()[i])
                    .newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return null;
    }
}