package ch.qos.logback.core.net.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public class a extends ServerSocketListener<u2.a> {
    public a(ServerSocket serverSocket) {
        super(serverSocket);
    }

    @Override // ch.qos.logback.core.net.server.ServerSocketListener
    public Client createClient(String str, Socket socket) throws IOException {
        return new b(str, socket);
    }
}
