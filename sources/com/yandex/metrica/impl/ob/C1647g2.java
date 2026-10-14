package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1647g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2099y1 f16163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ea.c f16164b;

    public C1647g2(InterfaceC2099y1 interfaceC2099y1, Context context) {
        this(interfaceC2099y1, new C2090xh().b(context));
    }

    public C1647g2(InterfaceC2099y1 interfaceC2099y1, ea.c cVar) {
        this.f16163a = interfaceC2099y1;
        this.f16164b = cVar;
    }

    public void a(int i10, Bundle bundle) {
        if (i10 == 1) {
            this.f16163a.reportData(bundle);
        } else {
            if (i10 != 2) {
                return;
            }
            this.f16164b.reportData(bundle);
        }
    }
}
