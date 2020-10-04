
##动态代理原理

Proxy.newProxyInstance()创建代理对象
进入这个方法，主要是这三个方法
* Class<?> cl = getProxyClass0() 生成动态代理类字节码文件，并加载
* Constructor<?> cons = cl.getConstructor();
* cons.newInstance(); //反射生成代理对象

其中最为重要的是getProxyClass0()方法，缓存存在直接缓存获取，
不存在则创建，在这方法里面
* Object subKey = subKeyFactory.apply();
* Factory factory = new Factory(subKey);
* factory.get()--> valueFactory.apply(key, parameter)这个方法生成字节码文件
再继续点进去，最终是
* byte[] proxyClassFile = ProxyGenerator.generateProxyClass();
生成代理类对象
* 往下是defineClass0();加载返回

网上找到的一个生成的字节码文件，反编译后得到的文件
$Proxy11

结合着看啥都懂了/。。。。




