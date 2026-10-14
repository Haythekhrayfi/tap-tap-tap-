package com.yandex.metrica.impl.ob;

import android.app.Activity;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class Hl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Xl f14162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1592dm.a f14163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Yl f14164c;

    public Hl() {
        this(new Xl(), new C1592dm.a(), new Yl());
    }

    public Hl(Xl xl, C1592dm.a aVar, Yl yl) {
        this.f14162a = xl;
        this.f14163b = aVar;
        this.f14164c = yl;
    }

    public Gl a(Activity activity, C1542bm c1542bm, C1541bl c1541bl, InterfaceC1715il interfaceC1715il, boolean z10) throws Throwable {
        if (z10) {
            return new Gl();
        }
        Yl yl = this.f14164c;
        Objects.requireNonNull(this.f14163b);
        return yl.a(activity, interfaceC1715il, c1542bm, c1541bl, new C1592dm(c1542bm, Oh.a()), this.f14162a);
    }
}
