package com.homecare.config.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.transaction.Transactional;

@Interceptor
@Transactional
public class TransactionalInterceptor {

    @AroundInvoke
    public Object AroundInvoke(InvocationContext context) throws Exception {
        for(Object obj : context.getParameters()){
            System.out.println(obj);
            if(obj instanceof Enum){
                System.out.println(obj);
            }
        }


        return context.proceed();
    }
}
