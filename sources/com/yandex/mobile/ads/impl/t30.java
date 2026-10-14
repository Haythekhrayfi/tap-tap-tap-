package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class t30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q30 f25237a;

    public interface a {
    }

    public static final class b implements uw0<w50> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f25238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f25239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList f25240c;

        private b(int i10, a aVar) {
            this.f25238a = new AtomicInteger(i10);
            this.f25239b = aVar;
            this.f25240c = new ArrayList();
        }

        public /* synthetic */ b(int i10, a aVar, int i11) {
            this(i10, aVar);
        }

        @Override // com.yandex.mobile.ads.impl.uw0
        public final void a(lc1 lc1Var) {
            if (this.f25238a.decrementAndGet() == 0) {
                ((k40) this.f25239b).a(this.f25240c);
            }
        }

        @Override // com.yandex.mobile.ads.impl.uw0
        public final void a(w50 w50Var) {
            this.f25240c.add(w50Var);
            if (this.f25238a.decrementAndGet() == 0) {
                ((k40) this.f25239b).a(this.f25240c);
            }
        }
    }

    public t30(xc1 xc1Var) {
        this.f25237a = new q30(xc1Var);
    }

    public final void a(Context context, ArrayList arrayList, a aVar) {
        b bVar = new b(arrayList.size(), aVar, 0);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f25237a.a(context, (q1) it.next(), bVar);
        }
    }
}
