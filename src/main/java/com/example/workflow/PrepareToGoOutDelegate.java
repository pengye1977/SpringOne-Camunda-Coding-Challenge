package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class PrepareToGoOutDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String heroin = "cocaine";
        delegateExecution.setVariable("heroin", heroin);
        System.out.println("Vincent buys drugs in order to prepare to take Mia out. He gets some: " + heroin);

    }
}
