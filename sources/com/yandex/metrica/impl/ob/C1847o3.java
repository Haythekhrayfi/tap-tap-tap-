package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1847o3 {
    public Dg a(C1821n2 c1821n2, F9 f10, Handler handler) {
        return new Dg(c1821n2, f10, handler);
    }

    public Ii a(Context context, C1821n2 c1821n2, F9 f10, Handler handler) {
        return new Ii(context, c1821n2, f10, handler);
    }

    public U3 a(Context context, ResultReceiverC1819n0 resultReceiverC1819n0) {
        return new U3(context, resultReceiverC1819n0);
    }

    public C1771l2 a(Context context, U3 u10, C1821n2 c1821n2, Handler handler, Ii ii) {
        return new C1771l2(context, u10, c1821n2, handler, ii);
    }

    public ResultReceiverC1819n0 a(Handler handler, C1822n3 c1822n3) {
        return new ResultReceiverC1819n0(handler, c1822n3);
    }

    public C1821n2 a(U3 u10, Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        return new C1821n2(u10, context, new C2074x1(context, interfaceExecutorC1966sn), new C2080x7(), new C1577d7());
    }
}
