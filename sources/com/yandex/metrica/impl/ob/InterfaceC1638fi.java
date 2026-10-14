package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.net.ServerSocket;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1638fi {

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fi$a */
    public static class a extends Throwable {
        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    ServerSocket a(int i10) throws IOException, a;
}
