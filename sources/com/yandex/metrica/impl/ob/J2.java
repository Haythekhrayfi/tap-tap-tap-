package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class J2 implements S1<C2042vj> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2012uj f14269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1530ba f14270b;

    public J2() {
        this(new C2012uj(), new C1530ba());
    }

    public J2(C2012uj c2012uj, C1530ba c1530ba) {
        this.f14269a = c2012uj;
        this.f14270b = c1530ba;
    }

    @Override // com.yandex.metrica.impl.ob.S1
    public C2042vj a(int i10, byte[] bArr, Map map) {
        if (200 == i10) {
            List list = (List) map.get("Content-Encoding");
            if (!U2.b(list) && "encrypted".equals(list.get(0))) {
                bArr = this.f14270b.a(bArr, "hBnBQbZrmjPXEWVJ");
            }
            if (bArr != null) {
                C2042vj c2042vjA = this.f14269a.a(bArr);
                if (C2042vj.a.OK == c2042vjA.z()) {
                    return c2042vjA;
                }
            }
        }
        return null;
    }
}
