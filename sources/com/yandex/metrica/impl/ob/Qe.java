package com.yandex.metrica.impl.ob;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public class Qe implements InterfaceC1809mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1792ln f14779a;

    public Qe() {
        this(new C1792ln());
    }

    public Qe(C1792ln c1792ln) {
        this.f14779a = c1792ln;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1809mf
    public byte[] a(Xe xe2, C1736jh c1736jh) {
        byte[] bArrDecode = new byte[0];
        String str = xe2.f15485b;
        if (str != null) {
            try {
                bArrDecode = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        return this.f14779a.a(xe2.f15501r).a(bArrDecode);
    }
}
