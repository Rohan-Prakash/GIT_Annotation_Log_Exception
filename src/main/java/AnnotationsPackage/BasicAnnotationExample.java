package AnnotationsPackage;

import AnnotationsPackage.custom.*;

@Restricted_Type
public class BasicAnnotationExample {       // class declaration

    @CustomAnnotation_Inherited
    private String name = "myName";         // member Variable

    @Restricted_Constructor
    public BasicAnnotationExample(){        // constructor

    }

    @MyAnnotation                                           // method
    public void printText(@Restricted_Parameters String text){       // parameter
        @Restricted_LocalVariable String localVariable = "some Text";   // local Variable
    }

    @MyAnnotation                                           // static method
    public static void main(@Restricted_Feild_Or_Parameter String[] args) {  // static method  parameter declaration

    }

}
