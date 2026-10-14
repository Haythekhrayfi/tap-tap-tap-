package com.yandex.metrica.impl.ob;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
class H1 implements M1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B1 f14120a;

    public H1(B1 b10) {
        this.f14120a = b10;
    }

    @Override // com.yandex.metrica.impl.ob.M1.e
    public void a(Intent intent) {
        if (this.f14120a.f13679a != null) {
            B1 b10 = this.f14120a;
            B1.b(b10, b10.f13679a);
            B1.g(this.f14120a);
            this.f14120a.f13683e.a(this.f14120a.f13679a);
        }
    }
}
