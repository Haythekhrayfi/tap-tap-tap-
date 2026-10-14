package okhttp3;

import fd.j0;
import qd.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i10, String str) {
        j0.i(webSocket, "webSocket");
        j0.i(str, "reason");
    }

    public void onClosing(WebSocket webSocket, int i10, String str) {
        j0.i(webSocket, "webSocket");
        j0.i(str, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        j0.i(webSocket, "webSocket");
        j0.i(th, "t");
    }

    public void onMessage(WebSocket webSocket, String str) {
        j0.i(webSocket, "webSocket");
        j0.i(str, "text");
    }

    public void onMessage(WebSocket webSocket, g gVar) {
        j0.i(webSocket, "webSocket");
        j0.i(gVar, "bytes");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        j0.i(webSocket, "webSocket");
        j0.i(response, "response");
    }
}
