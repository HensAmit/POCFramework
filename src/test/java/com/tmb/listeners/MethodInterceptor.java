package com.tmb.listeners;

import com.tmb.utils.ExcelUtils;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MethodInterceptor implements IMethodInterceptor {

    public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext iTestContext) {
        List<IMethodInstance> result = new ArrayList<>();
        List<Map<String,String>> list = ExcelUtils.getTestDetails();

        for(int i=0; i<methods.size(); i++){
            boolean isPresentInRunnerExcel = false;
            for(int j=0; j<list.size(); j++){
                if(methods.get(i).getMethod().getMethodName().equalsIgnoreCase(list.get(j).get("TestName"))){
                    isPresentInRunnerExcel = true;
                    if(list.get(j).get("ShouldExecute").equalsIgnoreCase("yes")){
                        methods.get(i).getMethod().setDescription(list.get(j).get("TestDescription"));
                        result.add(methods.get(i));
                    }
                }
                if(j==list.size()-1 && !isPresentInRunnerExcel){
                    methods.get(i).getMethod().setDescription(methods.get(i).getMethod().getMethodName());
                    result.add(methods.get(i));
                }
            }
        }
        return result;
    }
}
