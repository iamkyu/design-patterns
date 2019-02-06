package io.iamkyu.composite.before;

import io.iamkyu.composite.before.domain.Body;
import io.iamkyu.composite.before.domain.Computer;
import io.iamkyu.composite.before.domain.Keyboard;
import io.iamkyu.composite.before.domain.Monitor;

public class Client {
    public void doSomething() {
        Body body = new Body(100, 70);
        Keyboard keyboard = new Keyboard(5, 2);
        Monitor monitor = new Monitor(20, 30);

        Computer computer = new Computer();
        computer.addBody(body);
        computer.addKeyboard(keyboard);
        computer.addMonitor(monitor);

        // Mouse 가 추가된다면 변경될 부분은?
    }
}
