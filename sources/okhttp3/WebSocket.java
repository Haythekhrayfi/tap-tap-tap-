package okhttp3;

import qd.g;

/* JADX INFO: loaded from: classes3.dex */
public interface WebSocket {

    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i10, String str);

    long queueSize();

    Request request();

    boolean send(String str);

    boolean send(g gVar);
}
