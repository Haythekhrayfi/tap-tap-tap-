package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.net.ServerSocket;

/* JADX INFO: loaded from: classes.dex */
class Rh implements InterfaceC1638fi {
    @Override // com.yandex.metrica.impl.ob.InterfaceC1638fi
    public ServerSocket a(int i10) throws IOException {
        return new ServerSocket(i10);
    }
}
