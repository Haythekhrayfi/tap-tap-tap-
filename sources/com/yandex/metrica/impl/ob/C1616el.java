package com.yandex.metrica.impl.ob;

import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.el, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1616el implements Bl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ok f16071a;

    public C1616el() {
        this(new Ok());
    }

    public C1616el(Ok ok) {
        this.f16071a = ok;
    }

    @Override // com.yandex.metrica.impl.ob.Bl
    public boolean a(String str, C1542bm c1542bm) {
        if (!c1542bm.f15852g) {
            return !U2.a("allow-parsing", str);
        }
        Objects.requireNonNull(this.f16071a);
        return U2.a("do-not-parse", str);
    }
}
