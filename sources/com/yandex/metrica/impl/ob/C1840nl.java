package com.yandex.metrica.impl.ob;

import android.app.Activity;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1840nl implements InterfaceC1567cm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.metrica.uiaccessor.b f16958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1592dm.a f16959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1741jm f16960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1716im f16961d;

    public C1840nl(Um<Activity> um, InterfaceC1741jm interfaceC1741jm) {
        this(new C1592dm.a(), um, interfaceC1741jm, new C1641fl(), new C1716im());
    }

    public C1840nl(C1592dm.a aVar, Um<Activity> um, InterfaceC1741jm interfaceC1741jm, C1641fl c1641fl, C1716im c1716im) {
        this.f16959b = aVar;
        this.f16960c = interfaceC1741jm;
        this.f16958a = c1641fl.a(um);
        this.f16961d = c1716im;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1517am
    public void a(long j10, Activity activity, Gl gl, List<Wl> list, Il il, C1566cl c1566cl) {
        Kl kl;
        Kl kl2;
        if (il.f14233b && (kl2 = il.f14237f) != null) {
            this.f16960c.b(this.f16961d.a(activity, gl, kl2, c1566cl.b(), j10));
        }
        if (!il.f14235d || (kl = il.f14239h) == null) {
            return;
        }
        this.f16960c.a(this.f16961d.a(activity, gl, kl, c1566cl.d(), j10));
    }

    public void a(Activity activity) {
        try {
            this.f16958a.unsubscribe(activity);
        } catch (Throwable unused) {
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1567cm
    public void a(Activity activity, long j10) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1567cm
    public void a(Activity activity, boolean z10) {
        if (z10) {
            return;
        }
        try {
            this.f16958a.subscribe(activity);
        } catch (Throwable unused) {
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1517am
    public void a(Throwable th, C1542bm c1542bm) {
        Objects.requireNonNull(this.f16959b);
        new C1592dm(c1542bm, Oh.a()).a("ui_parsing", th);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1517am
    public boolean a(Il il) {
        return false;
    }
}
