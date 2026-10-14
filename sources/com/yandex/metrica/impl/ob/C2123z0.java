package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.T4;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2123z0<C extends T4> extends Q2<C> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Z4 f17953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final I8 f17954f;

    public C2123z0(C c10, Zi zi, Z4 z10, I8 i10) {
        super(c10, zi);
        this.f17953e = z10;
        this.f17954f = i10;
    }

    public void a(C1744k0 c1744k0) {
        if (this.f14735c) {
            return;
        }
        synchronized (this.f14734b) {
            if (!this.f14735c) {
                f();
            }
        }
        V4 v10 = new V4(e(), c1744k0, this.f17953e, this.f17954f);
        R1 r1L = P0.i().l();
        if (r1L != null) {
            r1L.b(v10);
        }
    }
}
