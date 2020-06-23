package org.example.design.factory.factorymethod;


import org.example.design.factory.ICourse;
import org.example.design.factory.JavaCourse;

/**
 * Created by Tom.
 */
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
