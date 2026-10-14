package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class vn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f26040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f26044f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final mp0 f26045g = new mp0(255);

    public final boolean a(xn xnVar, long j10) throws IOException {
        boolean zB;
        pa.a(xnVar.getPosition() == xnVar.e());
        this.f26045g.c(4);
        while (true) {
            if (j10 != -1 && xnVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                zB = xnVar.b(this.f26045g.c(), 0, 4, true);
            } catch (EOFException unused) {
                zB = false;
            }
            if (!zB) {
                break;
            }
            this.f26045g.e(0);
            if (this.f26045g.v() == 1332176723) {
                xnVar.c();
                return true;
            }
            xnVar.a(1);
        }
        do {
            if (j10 != -1 && xnVar.getPosition() >= j10) {
                break;
            }
        } while (xnVar.c(1) != -1);
        return false;
    }

    public final boolean a(xn xnVar, boolean z10) throws IOException {
        boolean zB;
        boolean zB2;
        this.f26039a = 0;
        this.f26040b = 0L;
        this.f26041c = 0;
        this.f26042d = 0;
        this.f26043e = 0;
        this.f26045g.c(27);
        try {
            zB = xnVar.b(this.f26045g.c(), 0, 27, z10);
        } catch (EOFException e10) {
            if (!z10) {
                throw e10;
            }
            zB = false;
        }
        if (!zB || this.f26045g.v() != 1332176723) {
            return false;
        }
        if (this.f26045g.t() != 0) {
            if (z10) {
                return false;
            }
            throw qp0.a("unsupported bit stream revision");
        }
        this.f26039a = this.f26045g.t();
        this.f26040b = this.f26045g.l();
        this.f26045g.n();
        this.f26045g.n();
        this.f26045g.n();
        int iT = this.f26045g.t();
        this.f26041c = iT;
        this.f26042d = iT + 27;
        this.f26045g.c(iT);
        try {
            zB2 = xnVar.b(this.f26045g.c(), 0, this.f26041c, z10);
        } catch (EOFException e11) {
            if (!z10) {
                throw e11;
            }
            zB2 = false;
        }
        if (!zB2) {
            return false;
        }
        for (int i10 = 0; i10 < this.f26041c; i10++) {
            this.f26044f[i10] = this.f26045g.t();
            this.f26043e += this.f26044f[i10];
        }
        return true;
    }
}
