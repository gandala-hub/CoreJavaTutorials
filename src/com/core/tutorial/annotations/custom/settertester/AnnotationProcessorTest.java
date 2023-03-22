package com.core.tutorial.annotations.custom.settertester;

import com.core.tutorial.annotations.custom.settermethod.Setter;

public class AnnotationProcessorTest {
    
    @Setter
    private void setValue(String value) {}

    @Setter
    public void setString(String value) {}
    
    @Setter
    public static void main(String[] args) {}
    
}