package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2118yk extends Rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Rj f17939b;

    public C2118yk(Context context, Wn wn, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        if (wn.a(context, "android.hardware.telephony")) {
            this.f17939b = new C1739jk(context, interfaceExecutorC1966sn);
        } else {
            this.f17939b = new C1789lk();
        }
    }

    public C2118yk(Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this(context.getApplicationContext(), new Wn(), interfaceExecutorC1966sn);
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public synchronized void a() {
        int i10 = this.f17938a + 1;
        this.f17938a = i10;
        if (i10 == 1) {
            this.f17939b.a();
        }
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public synchronized void a(Bk bk) {
        this.f17939b.a(bk);
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public void a(Qi qi) {
        this.f17939b.a(qi);
    }

    @Override // com.yandex.metrica.impl.ob.Vc
    public void a(Uc uc2) {
        this.f17939b.a(uc2);
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public synchronized void a(Wj wj) {
        this.f17939b.a(wj);
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public void a(boolean z10) {
        this.f17939b.a(z10);
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public synchronized void b() {
        int i10 = this.f17938a - 1;
        this.f17938a = i10;
        if (i10 == 0) {
            this.f17939b.b();
        }
    }
}
