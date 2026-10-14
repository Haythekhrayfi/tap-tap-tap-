package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class Ah implements Qd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Eh f13658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2115yh f13659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2140zh f13660c;

    public Ah(C2140zh c2140zh, Eh eh, C2115yh c2115yh) {
        this.f13660c = c2140zh;
        this.f13658a = eh;
        this.f13659b = c2115yh;
    }

    @Override // com.yandex.metrica.impl.ob.Qd.a
    public void a() {
        C2115yh c2115yh = this.f13659b;
        Eh eh = this.f13658a;
        List<Hh> list = eh.f13908a;
        String str = eh.f13909b;
        Objects.requireNonNull(this.f13660c.f18032f);
        c2115yh.a(new Eh(list, str, System.currentTimeMillis(), true, false));
    }

    @Override // com.yandex.metrica.impl.ob.Qd.a
    public void a(String str, byte[] bArr) {
        List<Hh> listA = this.f13660c.f18029c.a(this.f13660c.f18030d.a(bArr, "af9202nao18gswqp"));
        C2115yh c2115yh = this.f13659b;
        Objects.requireNonNull(this.f13660c.f18032f);
        c2115yh.a(new Eh(listA, str, System.currentTimeMillis(), true, false));
    }

    @Override // com.yandex.metrica.impl.ob.Qd.a
    public String b() {
        return this.f13658a.f13909b;
    }

    @Override // com.yandex.metrica.impl.ob.Qd.a
    public void c() {
        this.f13659b.a();
    }
}
