package com.yandex.metrica.impl.ob;

import okhttp3.internal.connection.RealConnection;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1999u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I8 f17514a;

    public C1999u6(I8 i10) {
        this.f17514a = i10;
    }

    public long a() {
        long j10 = this.f17514a.j();
        long j11 = RealConnection.IDLE_CONNECTION_HEALTHY_NS;
        if (j10 >= RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
            j11 = 1 + j10;
        }
        this.f17514a.a(j11);
        return j11;
    }
}
