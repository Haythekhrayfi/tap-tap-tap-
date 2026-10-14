package com.yandex.metrica.impl.ob;

import android.net.Uri;
import java.net.Socket;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1588di extends AbstractC1513ai {
    public C1588di(Socket socket, Uri uri, InterfaceC1663gi interfaceC1663gi, Ei ei, C1688hi c1688hi) {
        super(socket, uri, interfaceC1663gi, ei, c1688hi);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1513ai
    public void a() throws Throwable {
        Set<String> queryParameterNames = this.f15764d.getQueryParameterNames();
        HashMap map = new HashMap();
        for (String str : queryParameterNames) {
            map.put(str, this.f15764d.getQueryParameter(str));
        }
        map.remove("t");
        a("HTTP/1.1 200 OK", new HashMap(), new byte[0]);
        ((RunnableC1737ji) this.f15762b).a(map, this.f15761a.getLocalPort(), this.f15765e);
    }
}
