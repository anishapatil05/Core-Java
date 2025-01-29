package com.anisha.annotations.userdefined;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Creation of userdefined annotations
//Using : @Target & @RetentionPolicy

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)

public @interface FirstAnnotation {
            int value();
            String name();
}
