package com.yandex.metrica.impl.ob;

import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class N1 implements M1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M1 f14528a;

    public N1(M1 m10) {
        this.f14528a = m10;
    }

    @Override // com.yandex.metrica.impl.ob.M1.d
    public boolean a(Intent intent, M1 m10) {
        M1 m11 = this.f14528a;
        String action = intent.getAction();
        Objects.requireNonNull(m11);
        return "com.yandex.metrica.ACTION_C_BG_L".equals(action);
    }
}
