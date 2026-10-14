package com.yandex.metrica.impl.ob;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class Ua implements InterfaceC1556cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Hm f15136a;

    public Ua(Hm hm2) {
        this.f15136a = hm2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1556cb
    public long a(D9 d10) {
        return d10.a(new C2112ye(i.f.a("LAST_ACTIVATION_DIAGNOSTICS_SENT_TIME_", ((Dm) this.f15136a).b()), null).a(), RecyclerView.FOREVER_NS);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1556cb
    public void a(D9 d10, long j10) {
    }
}
