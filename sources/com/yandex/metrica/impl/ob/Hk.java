package com.yandex.metrica.impl.ob;

import android.app.Activity;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class Hk implements InterfaceC1517am {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lk f14157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F9 f14158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1815ml f14159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f14160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f14161e;

    public static class a {
    }

    public static class b {
    }

    public Hk(Lk lk, F9 f10, boolean z10, InterfaceC1815ml interfaceC1815ml, a aVar) {
        this.f14157a = lk;
        this.f14158b = f10;
        this.f14161e = z10;
        this.f14159c = interfaceC1815ml;
        this.f14160d = aVar;
    }

    private boolean b(Il il) {
        if (!il.f14234c || il.f14238g == null) {
            return false;
        }
        return this.f14161e || this.f14158b.a(false);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1517am
    public void a(long j10, Activity activity, Gl gl, List<Wl> list, Il il, C1566cl c1566cl) {
        if (b(il)) {
            a aVar = this.f14160d;
            Kl kl = il.f14238g;
            Objects.requireNonNull(aVar);
            this.f14157a.a((kl.f14366h ? new C1666gl() : new C1591dl(list)).a(activity, gl, il.f14238g, c1566cl.a(), j10));
            this.f14159c.onResult(this.f14157a.a());
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1517am
    public void a(Throwable th, C1542bm c1542bm) {
        this.f14159c.onError(r2.a.a(th, defpackage.a.a("exception: ")));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1517am
    public boolean a(Il il) {
        return b(il) && !il.f14238g.f14366h;
    }
}
