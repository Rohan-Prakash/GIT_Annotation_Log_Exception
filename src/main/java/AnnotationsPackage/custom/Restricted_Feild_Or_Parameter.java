package AnnotationsPackage.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE , ElementType.PARAMETER})
public @interface Restricted_Feild_Or_Parameter {
}
