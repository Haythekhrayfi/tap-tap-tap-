package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public final class Rg implements Xg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Og.d f14927a;

    public Rg(Og.d dVar) {
        this.f14927a = dVar;
    }

    @Override // com.yandex.metrica.impl.ob.Xg
    public void a(Fg fg) {
        Og og = Og.this;
        Og.a(og, fg, Og.b(og));
    }

    @Override // com.yandex.metrica.impl.ob.Xg
    public void a(Throwable th) {
        Og og = Og.this;
        Og.a(og, null, Og.b(og));
    }
}
