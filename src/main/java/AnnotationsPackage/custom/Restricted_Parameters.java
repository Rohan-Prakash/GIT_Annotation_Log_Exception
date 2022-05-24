package AnnotationsPackage.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.FIELD})
public @interface Restricted_Parameters {
}
