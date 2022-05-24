package AnnotationsPackage.custom;


import java.lang.annotation.Inherited;

@Inherited // all the subclass
public @interface CustomAnnotation_Inherited {

    // Java Annotation Properties are called "elements"
    String name() default "noName";
    int count( ) default -1;
    String[] tags() default {"these" , "are" , "array" , "elements" };
}
