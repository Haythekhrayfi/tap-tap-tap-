package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class ud1 implements td1, vd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f25598a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f25599b = new LinkedHashSet();

    @Override // com.yandex.mobile.ads.impl.vd1
    public final void a() {
        Iterator it = this.f25599b.iterator();
        while (it.hasNext()) {
            ((vd1) it.next()).a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.td1
    public final void a(long j10, long j11) {
        Iterator it = this.f25598a.iterator();
        while (it.hasNext()) {
            ((td1) it.next()).a(j10, j11);
        }
    }

    public final void a(td1... td1VarArr) {
        fd.j0.i(td1VarArr, "newProgressChangeListeners");
        kc.q.m(this.f25598a, td1VarArr);
    }

    public final void a(vd1... vd1VarArr) {
        fd.j0.i(vd1VarArr, "newProgressLifecycleListeners");
        kc.q.m(this.f25599b, vd1VarArr);
    }

    @Override // com.yandex.mobile.ads.impl.vd1
    public final void b() {
        Iterator it = this.f25599b.iterator();
        while (it.hasNext()) {
            ((vd1) it.next()).b();
        }
    }
}
