package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2053w5 extends AbstractC1948s5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1651g6 f17761b;

    public C2053w5(C1624f4 c1624f4) {
        this(c1624f4, c1624f4.j());
    }

    public C2053w5(C1624f4 c1624f4, C1651g6 c1651g6) {
        super(c1624f4);
        this.f17761b = c1651g6;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1824n5
    public boolean a(C1744k0 c1744k0) {
        if (TextUtils.isEmpty(c1744k0.g())) {
            return false;
        }
        c1744k0.a(this.f17761b.a(c1744k0.g()));
        return false;
    }
}
