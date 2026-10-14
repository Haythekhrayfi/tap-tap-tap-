package com.yandex.metrica.impl.ob;

import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C2044vl extends Zk<C1542bm> {
    public C2044vl(C1542bm c1542bm) {
        this(c1542bm, new Wk(102400, 200));
    }

    public C2044vl(C1542bm c1542bm, Wk wk) {
        super(c1542bm, wk);
    }

    @Override // com.yandex.metrica.impl.ob.Zk
    public List a(C1542bm c1542bm) {
        return c1542bm.f15853h;
    }

    @Override // com.yandex.metrica.impl.ob.Zk
    public int b(C1542bm c1542bm) {
        return c1542bm.f15846a;
    }
}
