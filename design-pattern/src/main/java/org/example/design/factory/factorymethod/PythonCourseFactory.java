package org.example.design.factory.factorymethod;


import org.example.design.factory.ICourse;
import org.example.design.factory.PythonCourse;

/**
 * Created by Tom.
 */
public class PythonCourseFactory implements ICourseFactory {

    public ICourse create() {
        return new PythonCourse();
    }
}
