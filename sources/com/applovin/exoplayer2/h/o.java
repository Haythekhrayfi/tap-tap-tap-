package com.applovin.exoplayer2.h;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6612e;

    public o(o oVar) {
        this.f6608a = oVar.f6608a;
        this.f6609b = oVar.f6609b;
        this.f6610c = oVar.f6610c;
        this.f6611d = oVar.f6611d;
        this.f6612e = oVar.f6612e;
    }

    public o(Object obj) {
        this(obj, -1L);
    }

    public o(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    private o(Object obj, int i10, int i11, long j10, int i12) {
        this.f6608a = obj;
        this.f6609b = i10;
        this.f6610c = i11;
        this.f6611d = j10;
        this.f6612e = i12;
    }

    public o(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public o(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public o a(Object obj) {
        return this.f6608a.equals(obj) ? this : new o(obj, this.f6609b, this.f6610c, this.f6611d, this.f6612e);
    }

    public boolean a() {
        return this.f6609b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f6608a.equals(oVar.f6608a) && this.f6609b == oVar.f6609b && this.f6610c == oVar.f6610c && this.f6611d == oVar.f6611d && this.f6612e == oVar.f6612e;
    }

    public int hashCode() {
        return ((((((((this.f6608a.hashCode() + 527) * 31) + this.f6609b) * 31) + this.f6610c) * 31) + ((int) this.f6611d)) * 31) + this.f6612e;
    }
}
