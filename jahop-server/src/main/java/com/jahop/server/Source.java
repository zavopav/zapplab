package com.jahop.server;

import com.jahop.common.msg.Message;

public interface Source {
    void send(Message response);
    void close();
}
