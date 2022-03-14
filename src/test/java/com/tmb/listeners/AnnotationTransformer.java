package com.tmb.listeners;

import com.tmb.dataproviders.DataProviders;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationTransformer implements IAnnotationTransformer {

    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(RetryFailedTestCases.class);
        annotation.setDataProviderClass(DataProviders.class);
    }
}