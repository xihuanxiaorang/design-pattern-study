package top.xiaorang.design.pattern.publishersubscriber;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">基础发布者<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/11 23:44
 */
public class EventManager {
    private final Map<EventType, List<EventListener>> listeners = new ConcurrentHashMap<>();

    public void subscribe(EventType eventType, EventListener eventListener) {
        List<EventListener> eventListeners = listeners.getOrDefault(eventType, new ArrayList<>());
        eventListeners.add(eventListener);
        listeners.put(eventType, eventListeners);
    }

    public void unsubscribe(EventType eventType, EventListener eventListener) {
        List<EventListener> eventListeners = listeners.get(eventType);
        if (eventListeners != null && eventListeners.size() > 0) {
            eventListeners.remove(eventListener);
        }
    }

    public void notify(EventType eventType, File file) {
        List<EventListener> eventListeners = listeners.get(eventType);
        if (eventListeners != null && eventListeners.size() > 0) {
            for (EventListener listener : eventListeners) {
                listener.update(eventType, file);
            }
        }
    }
}
