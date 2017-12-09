package com.hannea.annotation;

import com.hannea.constant.PrimaryKeyTypeObject;
import com.hannea.constant.PrimaryKeyTypeOption;
import org.apache.commons.lang3.ObjectUtils;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Inherited
public @interface TableKey {
	String name() default "";

	PrimaryKeyTypeObject type() default PrimaryKeyTypeObject.STRING;
	PrimaryKeyTypeOption option() default PrimaryKeyTypeOption.NONE;
	int sort() default 0;//使用时必须赋值，且不能重复，需要和tablestore里面表的顺序一样，切记
}
