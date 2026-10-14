package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class k81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f22295a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f22298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22301g;

    public final void a() {
        this.f22296b = false;
        this.f22297c = 0;
    }

    public final void a(j71 j71Var, long j10, int i10, int i11, int i12, j71.a aVar) {
        pa.b("TrueHD chunk samples must be contiguous in the sample queue.", this.f22301g <= i11 + i12);
        if (this.f22296b) {
            int i13 = this.f22297c;
            int i14 = i13 + 1;
            this.f22297c = i14;
            if (i13 == 0) {
                this.f22298d = j10;
                this.f22299e = i10;
                this.f22300f = 0;
            }
            this.f22300f += i11;
            this.f22301g = i12;
            if (i14 >= 16) {
                a(j71Var, aVar);
            }
        }
    }

    public final void a(j71 j71Var, j71.a aVar) {
        if (this.f22297c > 0) {
            j71Var.a(this.f22298d, this.f22299e, this.f22300f, this.f22301g, aVar);
            this.f22297c = 0;
        }
    }

    public final void a(vt vtVar) throws IOException {
        if (this.f22296b) {
            return;
        }
        int i10 = 0;
        vtVar.a(this.f22295a, 0, 10);
        vtVar.c();
        byte[] bArr = this.f22295a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                i10 = 40 << ((bArr[((b10 & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i10 == 0) {
            return;
        }
        this.f22296b = true;
    }
}
