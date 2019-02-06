package io.iamkyu.composite.after;


import io.iamkyu.composite.after.domain.Body;
import io.iamkyu.composite.after.domain.Computer;
import io.iamkyu.composite.after.domain.ComputerDevice;
import io.iamkyu.composite.after.domain.Keyboard;
import io.iamkyu.composite.after.domain.Monitor;

public class Client {
    public void doSomething() {
        ComputerDevice body = new Body(100, 70);
        ComputerDevice keyboard = new Keyboard(5, 2);
        ComputerDevice monitor = new Monitor(20, 30);

        Computer computer = new Computer();
        computer.addComponent(body);
        computer.addComponent(keyboard);
        computer.addComponent(monitor);
    }
}
