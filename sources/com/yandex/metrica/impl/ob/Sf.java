package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Sf extends AbstractC1594e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f15005b;

    public Sf() {
        b();
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        if (Arrays.equals(this.f15005b, C1644g.f16157d)) {
            return 0;
        }
        return 0 + C1519b.a(1, this.f15005b);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public AbstractC1594e a(C1494a c1494a) throws IOException {
        while (true) {
            int iL = c1494a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                this.f15005b = c1494a.d();
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        if (Arrays.equals(this.f15005b, C1644g.f16157d)) {
            return;
        }
        c1519b.b(1, this.f15005b);
    }

    public Sf b() {
        this.f15005b = C1644g.f16157d;
        this.f15981a = -1;
        return this;
    }
}
