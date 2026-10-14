package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ne implements et {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h71 f23338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f23340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yv[] f23341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23342e;

    public ne(h71 h71Var, int[] iArr) {
        int i10 = 0;
        pa.b(iArr.length > 0);
        this.f23338a = (h71) pa.a(h71Var);
        int length = iArr.length;
        this.f23339b = length;
        this.f23341d = new yv[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f23341d[i11] = h71Var.a(iArr[i11]);
        }
        Arrays.sort(this.f23341d, fo1.f20771l);
        this.f23340c = new int[this.f23339b];
        while (true) {
            int i12 = this.f23339b;
            if (i10 >= i12) {
                long[] jArr = new long[i12];
                return;
            } else {
                this.f23340c[i10] = h71Var.a(this.f23341d[i10]);
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(yv yvVar, yv yvVar2) {
        return yvVar2.f27111h - yvVar.f27111h;
    }

    @Override // com.yandex.mobile.ads.impl.l71
    public final h71 a() {
        return this.f23338a;
    }

    @Override // com.yandex.mobile.ads.impl.l71
    public final yv a(int i10) {
        return this.f23341d[i10];
    }

    @Override // com.yandex.mobile.ads.impl.et
    public void a(float f10) {
    }

    @Override // com.yandex.mobile.ads.impl.l71
    public final int b(int i10) {
        return this.f23340c[i10];
    }

    @Override // com.yandex.mobile.ads.impl.et
    public void b() {
    }

    @Override // com.yandex.mobile.ads.impl.l71
    public final int c(int i10) {
        for (int i11 = 0; i11 < this.f23339b; i11++) {
            if (this.f23340c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.et
    public void c() {
    }

    @Override // com.yandex.mobile.ads.impl.et
    public final yv d() {
        yv[] yvVarArr = this.f23341d;
        e();
        return yvVarArr[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ne neVar = (ne) obj;
        return this.f23338a == neVar.f23338a && Arrays.equals(this.f23340c, neVar.f23340c);
    }

    public final int hashCode() {
        if (this.f23342e == 0) {
            this.f23342e = Arrays.hashCode(this.f23340c) + (System.identityHashCode(this.f23338a) * 31);
        }
        return this.f23342e;
    }

    @Override // com.yandex.mobile.ads.impl.l71
    public final int length() {
        return this.f23340c.length;
    }
}
