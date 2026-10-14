package com.yandex.metrica.impl.ob;

import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2100y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2050w2 f17885a = new C2050w2(0, 0, 0, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, null);

    public synchronized C2050w2 a() {
        return this.f17885a;
    }

    public synchronized void a(C2050w2 c2050w2) {
        if (c2050w2 != null) {
            this.f17885a = c2050w2;
        }
    }
}
