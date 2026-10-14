package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1844o0 implements Bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1894q0 f16965a;

    public C1844o0(C1894q0 c1894q0) {
        this.f16965a = c1894q0;
    }

    @Override // com.yandex.metrica.impl.ob.Bk
    public void a(Ak ak) {
        Vj vjB = ak.b();
        if (vjB != null) {
            this.f16965a.f17155f.put("cellular_connection_type", vjB.m());
        }
        this.f16965a.f17155f.put("call_state", Integer.valueOf(ak.a()));
    }
}
