package com.anisha.annotations.userdefined;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Creating userdefined annotation : @SecoendAnnotation

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface SecoendAnnotation {
	char gender();

	int age();

	String name();
}
