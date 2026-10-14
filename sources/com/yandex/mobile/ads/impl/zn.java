package com.yandex.mobile.ads.impl;

import ch.qos.logback.classic.Level;
import java.net.InetSocketAddress;
import java.net.Socket;

/* JADX INFO: loaded from: classes3.dex */
public final class zn implements dz {
    @Override // com.yandex.mobile.ads.impl.dz
    public final boolean a(String str) {
        Socket socket;
        fd.j0.i(str, "checkHost");
        try {
            socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(str, 80), Level.TRACE_INT);
                boolean zIsConnected = socket.isConnected();
                try {
                    socket.close();
                } catch (Throwable th) {
                    x60.a(th, th.getMessage(), new Object[0]);
                }
                return zIsConnected;
            } catch (Throwable th2) {
                th = th2;
                try {
                    x60.a(th, th.getMessage(), new Object[0]);
                    if (socket == null) {
                        return false;
                    }
                    try {
                        return false;
                    } catch (Throwable th3) {
                        x60.a(th3, th3.getMessage(), new Object[0]);
                        return false;
                    }
                } finally {
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (Throwable th4) {
                            x60.a(th4, th4.getMessage(), new Object[0]);
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
            socket = null;
        }
    }
}
