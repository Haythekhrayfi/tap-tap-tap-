package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class jn implements u8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f22089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private t8[] f22093g;

    public jn() {
        this(0);
    }

    public jn(int i10) {
        this.f22087a = true;
        this.f22088b = 65536;
        this.f22092f = 0;
        this.f22093g = new t8[100];
        this.f22089c = null;
    }

    public final synchronized t8 a() {
        t8 t8Var;
        int i10 = this.f22091e + 1;
        this.f22091e = i10;
        int i11 = this.f22092f;
        if (i11 > 0) {
            t8[] t8VarArr = this.f22093g;
            int i12 = i11 - 1;
            this.f22092f = i12;
            t8Var = t8VarArr[i12];
            Objects.requireNonNull(t8Var);
            this.f22093g[this.f22092f] = null;
        } else {
            t8 t8Var2 = new t8(0, new byte[this.f22088b]);
            t8[] t8VarArr2 = this.f22093g;
            if (i10 > t8VarArr2.length) {
                this.f22093g = (t8[]) Arrays.copyOf(t8VarArr2, t8VarArr2.length * 2);
            }
            t8Var = t8Var2;
        }
        return t8Var;
    }

    public final synchronized void a(int i10) {
        boolean z10 = i10 < this.f22090d;
        this.f22090d = i10;
        if (z10) {
            e();
        }
    }

    public final synchronized void a(t8 t8Var) {
        t8[] t8VarArr = this.f22093g;
        int i10 = this.f22092f;
        this.f22092f = i10 + 1;
        t8VarArr[i10] = t8Var;
        this.f22091e--;
        notifyAll();
    }

    public final synchronized void a(u8.a aVar) {
        while (aVar != null) {
            t8[] t8VarArr = this.f22093g;
            int i10 = this.f22092f;
            this.f22092f = i10 + 1;
            t8VarArr[i10] = aVar.a();
            this.f22091e--;
            aVar = aVar.next();
        }
        notifyAll();
    }

    public final int b() {
        return this.f22088b;
    }

    public final synchronized int c() {
        return this.f22091e * this.f22088b;
    }

    public final synchronized void d() {
        if (this.f22087a) {
            a(0);
        }
    }

    public final synchronized void e() {
        int i10 = 0;
        int iMax = Math.max(0, da1.a(this.f22090d, this.f22088b) - this.f22091e);
        int i11 = this.f22092f;
        if (iMax >= i11) {
            return;
        }
        if (this.f22089c != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                t8 t8Var = this.f22093g[i10];
                Objects.requireNonNull(t8Var);
                if (t8Var.f25287a == this.f22089c) {
                    i10++;
                } else {
                    t8 t8Var2 = this.f22093g[i12];
                    Objects.requireNonNull(t8Var2);
                    if (t8Var2.f25287a != this.f22089c) {
                        i12--;
                    } else {
                        t8[] t8VarArr = this.f22093g;
                        t8VarArr[i10] = t8Var2;
                        t8VarArr[i12] = t8Var;
                        i12--;
                        i10++;
                    }
                }
            }
            iMax = Math.max(iMax, i10);
            if (iMax >= this.f22092f) {
                return;
            }
        }
        Arrays.fill(this.f22093g, iMax, this.f22092f, (Object) null);
        this.f22092f = iMax;
    }
}
