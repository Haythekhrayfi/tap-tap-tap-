package com.yandex.metrica.impl.ob;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class Nm implements Om {
    @Override // com.yandex.metrica.impl.ob.Om
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // com.yandex.metrica.impl.ob.Om
    public long b() {
        return System.currentTimeMillis() / 1000;
    }

    @Override // com.yandex.metrica.impl.ob.Om
    public long c() {
        return SystemClock.elapsedRealtime();
    }
}
