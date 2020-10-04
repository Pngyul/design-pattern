package com.klayzz.designpattern.structure.proxy.dynamicproxy;

import com.klayzz.designpattern.structure.proxy.dynamicproxy.controller.IUserController;
import com.klayzz.designpattern.structure.proxy.staticproxy.entity.UserVo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * JDK动态代理生成的代理类
*/
public final class $Proxy11 extends Proxy implements IUserController {
    private static Method m1;
    private static Method m2;
    private static Method m3;
    private static Method m0;
    private static Method m4;

    public $Proxy11(InvocationHandler var1)  {
        super(var1);
    }

    public final boolean equals(Object var1) throws  UndeclaredThrowableException{
        try {
            return (Boolean)super.h.invoke(this, m1, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    public final String toString() throws UndeclaredThrowableException {
        try {
            return (String)super.h.invoke(this, m2, (Object[])null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }


    //my method
    public final UserVo login(String var1, String var2) throws UndeclaredThrowableException {
        try {
            return (UserVo)super.h.invoke(this, m3, new Object[]{var1, var2});
        } catch (RuntimeException | Error var4) {
            throw var4;
        } catch (Throwable var5) {
            throw new UndeclaredThrowableException(var5);
        }
    }

    //my method
    public final UserVo register(String var1, String var2) throws UndeclaredThrowableException {
        try {
            return (UserVo)super.h.invoke(this, m4, new Object[]{var1, var2});
        } catch (RuntimeException | Error var4) {
            throw var4;
        } catch (Throwable var5) {
            throw new UndeclaredThrowableException(var5);
        }
    }

    public final int hashCode() throws UndeclaredThrowableException {
        try {
            return (Integer)super.h.invoke(this, m0, (Object[])null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    static {
        try {
            m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
            m2 = Class.forName("java.lang.Object").getMethod("toString");
            m3 = Class.forName("com.klayzz.designpattern.structure.proxy.dynamicproxy.controller.IUserController").getMethod("login", String.class, String.class);
            m4 = Class.forName("com.klayzz.designpattern.structure.proxy.dynamicproxy.controller.IUserController").getMethod("register", String.class, String.class);
            m0 = Class.forName("java.lang.Object").getMethod("hashCode");
        } catch (NoSuchMethodException var2) {
            throw new NoSuchMethodError(var2.getMessage());
        } catch (ClassNotFoundException var3) {
            throw new NoClassDefFoundError(var3.getMessage());
        }
    }
}
