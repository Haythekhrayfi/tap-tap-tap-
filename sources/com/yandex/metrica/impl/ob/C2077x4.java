package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.x4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2077x4 extends C1624f4 {
    private final M2 A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final String f17832z;

    public C2077x4(Context context, C1549c4 c1549c4, V3 v10, R2 r10, C1649g4 c1649g4, M2 m10) {
        super(context, c1549c4, v10, r10, c1649g4);
        this.f17832z = c1549c4.a();
        this.A = m10;
    }

    public C2077x4(Context context, C1549c4 c1549c4, X3.a aVar, M2 m10, Qi qi, Wi wi) {
        this(context, c1549c4, new V3(), new R2(), new C1649g4(context, c1549c4, aVar, wi, qi, new C2022v4(m10), P0.i().s().e(), U2.b(context, c1549c4.b()), P0.i().j()), m10);
    }

    @Override // com.yandex.metrica.impl.ob.C1624f4, com.yandex.metrica.impl.ob.InterfaceC1798m4
    public synchronized void a(X3.a aVar) {
        super.a(aVar);
        this.A.a(this.f17832z, aVar.f15460l);
    }
}
