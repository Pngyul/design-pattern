package com.klayzz.designpattern.behavior.observer.eventbus;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import com.klayzz.designpattern.behavior.observer.eventbus.observer.RegNotificationObserver;
import com.klayzz.designpattern.behavior.observer.eventbus.observer.RegPromotionObserver;
import com.klayzz.designpattern.behavior.observer.eventbus.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;

@Controller
@RequestMapping("/eventbus")
public class EventbusUserController implements InitializingBean {

    @Autowired
    private UserService userService; // 依赖注入

    @Autowired
    private RegPromotionObserver regPromotionObserver;

    @Autowired
    private RegNotificationObserver regNotificationObserver;

    private EventBus eventBus;
    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    public EventbusUserController() {
        //eventBus = new EventBus(); // 同步阻塞模式
        eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE)); // 异步非阻塞模式
    }

    public void setRegObservers(List<Object> observers) {
        for (Object observer : observers) {
            eventBus.register(observer);
        }
    }

    @ResponseBody
    @GetMapping("/test")
    public Long register(String telephone, String password) {
        //省略输入参数的校验代码
        //省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);

        eventBus.post(userId);

        return userId;
    }

    @Override
    public void afterPropertiesSet() {
        //初始化观察者
        setRegObservers(Arrays.asList(regPromotionObserver,regNotificationObserver));
    }
}
