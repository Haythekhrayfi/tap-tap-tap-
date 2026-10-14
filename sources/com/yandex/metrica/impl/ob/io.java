package com.yandex.metrica.impl.ob;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class io<D> implements go<D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator<D> f16359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Om f16361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f16362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private D f16363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f16364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f16365g;

    public io(Comparator<D> comparator, Om om, int i10, long j10) {
        this.f16359a = comparator;
        this.f16360b = i10;
        this.f16361c = om;
        this.f16362d = TimeUnit.SECONDS.toMillis(j10);
    }

    private void a() {
        this.f16364f = 0;
        this.f16365g = this.f16361c.c();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006  */
    @Override // com.yandex.metrica.impl.ob.go
    public jo<D> get(D d10) {
        boolean z10;
        D d11 = this.f16363e;
        if (d11 == d10) {
            z10 = false;
        } else {
            int iCompare = this.f16359a.compare(d11, d10);
            this.f16363e = d10;
            if (iCompare == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (z10) {
            a();
            return new jo<>(jo.a.NEW, this.f16363e);
        }
        int i10 = this.f16364f + 1;
        this.f16364f = i10;
        this.f16364f = i10 % this.f16360b;
        if (this.f16361c.c() - this.f16365g >= this.f16362d) {
            a();
            return new jo<>(jo.a.REFRESH, this.f16363e);
        }
        if (this.f16364f != 0) {
            return new jo<>(jo.a.NOT_CHANGED, this.f16363e);
        }
        a();
        return new jo<>(jo.a.REFRESH, this.f16363e);
    }
}
