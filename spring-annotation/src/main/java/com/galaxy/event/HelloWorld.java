package com.galaxy.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2021/9/26 16:24
 */
public class HelloWorld implements ApplicationEventPublisherAware {

    private String word;
    private ApplicationEventPublisher tradeEventPublisher;

    public void setWord(String word) {
        this.word = word;
    }

    public void say(){
        System.out.println("say:"+this.word);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.tradeEventPublisher = applicationEventPublisher;
    }
}
