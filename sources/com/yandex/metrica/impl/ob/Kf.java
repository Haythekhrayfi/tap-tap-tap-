package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Kf extends AbstractC1594e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile Kf[] f14353d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f14354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f14355c;

    public Kf() {
        b();
    }

    public static Kf[] c() {
        if (f14353d == null) {
            synchronized (C1544c.f15862a) {
                if (f14353d == null) {
                    f14353d = new Kf[0];
                }
            }
        }
        return f14353d;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public int a() {
        byte[] bArr = this.f14354b;
        byte[] bArr2 = C1644g.f16157d;
        int iA = Arrays.equals(bArr, bArr2) ? 0 : 0 + C1519b.a(1, this.f14354b);
        return !Arrays.equals(this.f14355c, bArr2) ? iA + C1519b.a(2, this.f14355c) : iA;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public AbstractC1594e a(C1494a c1494a) throws IOException {
        while (true) {
            int iL = c1494a.l();
            if (iL == 0) {
                break;
            }
            if (iL == 10) {
                this.f14354b = c1494a.d();
            } else if (iL == 18) {
                this.f14355c = c1494a.d();
            } else if (!c1494a.f(iL)) {
                break;
            }
        }
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1594e
    public void a(C1519b c1519b) throws IOException {
        byte[] bArr = this.f14354b;
        byte[] bArr2 = C1644g.f16157d;
        if (!Arrays.equals(bArr, bArr2)) {
            c1519b.b(1, this.f14354b);
        }
        if (Arrays.equals(this.f14355c, bArr2)) {
            return;
        }
        c1519b.b(2, this.f14355c);
    }

    public Kf b() {
        byte[] bArr = C1644g.f16157d;
        this.f14354b = bArr;
        this.f14355c = bArr;
        this.f15981a = -1;
        return this;
    }
}
