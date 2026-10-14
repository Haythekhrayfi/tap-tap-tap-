package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class b31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mp0 f19107a = new mp0(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19108b;

    private long a(xn xnVar) throws IOException {
        int i10 = 0;
        xnVar.b(this.f19107a.c(), 0, 1, false);
        int i11 = this.f19107a.c()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        xnVar.b(this.f19107a.c(), 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (this.f19107a.c()[i10] & 255) + (i14 << 8);
        }
        this.f19108b = i13 + 1 + this.f19108b;
        return i14;
    }

    public final boolean b(xn xnVar) throws IOException {
        long jA = xnVar.a();
        long j10 = 1024;
        if (jA != -1 && jA <= 1024) {
            j10 = jA;
        }
        int i10 = (int) j10;
        xnVar.b(this.f19107a.c(), 0, 4, false);
        long jV = this.f19107a.v();
        this.f19108b = 4;
        while (jV != 440786851) {
            int i11 = this.f19108b + 1;
            this.f19108b = i11;
            if (i11 == i10) {
                return false;
            }
            xnVar.b(this.f19107a.c(), 0, 1, false);
            jV = ((jV << 8) & (-256)) | ((long) (this.f19107a.c()[0] & 255));
        }
        long jA2 = a(xnVar);
        long j11 = this.f19108b;
        if (jA2 == Long.MIN_VALUE) {
            return false;
        }
        if (jA != -1 && j11 + jA2 >= jA) {
            return false;
        }
        while (true) {
            long j12 = this.f19108b;
            long j13 = j11 + jA2;
            if (j12 >= j13) {
                return j12 == j13;
            }
            if (a(xnVar) == Long.MIN_VALUE) {
                return false;
            }
            long jA3 = a(xnVar);
            if (jA3 < 0 || jA3 > 2147483647L) {
                return false;
            }
            if (jA3 != 0) {
                int i12 = (int) jA3;
                xnVar.a(false, i12);
                this.f19108b += i12;
            }
        }
    }
}
