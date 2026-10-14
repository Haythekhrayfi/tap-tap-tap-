package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.e.k;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f5658a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f5659b = new y(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5660c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f5662e;

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f5661d = 0;
        do {
            int i13 = this.f5661d;
            int i14 = i10 + i13;
            e eVar = this.f5658a;
            if (i14 >= eVar.f5669g) {
                break;
            }
            int[] iArr = eVar.f5672j;
            this.f5661d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public void a() {
        this.f5658a.a();
        this.f5659b.a(0);
        this.f5660c = -1;
        this.f5662e = false;
    }

    public boolean a(com.applovin.exoplayer2.e.i iVar) throws IOException {
        int i10;
        com.applovin.exoplayer2.l.a.b(iVar != null);
        if (this.f5662e) {
            this.f5662e = false;
            this.f5659b.a(0);
        }
        while (!this.f5662e) {
            if (this.f5660c < 0) {
                if (!this.f5658a.a(iVar) || !this.f5658a.a(iVar, true)) {
                    return false;
                }
                e eVar = this.f5658a;
                int iA = eVar.f5670h;
                if ((eVar.f5664b & 1) == 1 && this.f5659b.b() == 0) {
                    iA += a(0);
                    i10 = this.f5661d + 0;
                } else {
                    i10 = 0;
                }
                if (!k.a(iVar, iA)) {
                    return false;
                }
                this.f5660c = i10;
            }
            int iA2 = a(this.f5660c);
            int i11 = this.f5660c + this.f5661d;
            if (iA2 > 0) {
                y yVar = this.f5659b;
                yVar.b(yVar.b() + iA2);
                if (!k.b(iVar, this.f5659b.d(), this.f5659b.b(), iA2)) {
                    return false;
                }
                y yVar2 = this.f5659b;
                yVar2.c(yVar2.b() + iA2);
                this.f5662e = this.f5658a.f5672j[i11 + (-1)] != 255;
            }
            if (i11 == this.f5658a.f5669g) {
                i11 = -1;
            }
            this.f5660c = i11;
        }
        return true;
    }

    public e b() {
        return this.f5658a;
    }

    public y c() {
        return this.f5659b;
    }

    public void d() {
        if (this.f5659b.d().length == 65025) {
            return;
        }
        y yVar = this.f5659b;
        yVar.a(Arrays.copyOf(yVar.d(), Math.max(65025, this.f5659b.b())), this.f5659b.b());
    }
}
