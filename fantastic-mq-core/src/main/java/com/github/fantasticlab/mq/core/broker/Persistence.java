package com.github.fantasticlab.mq.core.broker;

import com.github.fantasticlab.mq.core.common.Message;

import java.util.List;

public interface Persistence {

    Position writeMsg(Message msg);

    Position writeMsg2Disk(Message msg);

    boolean flushDisk(int milliseconds);

    Message loadMsg(Position position);

    List<Message> loadMsg(List<Position> positions);

}
