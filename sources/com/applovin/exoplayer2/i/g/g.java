package com.applovin.exoplayer2.i.g;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f7040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7044e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f7050k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f7051l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Layout.Alignment f7054o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Layout.Alignment f7055p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f7057r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7045f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7046g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7047h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7048i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f7049j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f7052m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7053n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f7056q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f7058s = Float.MAX_VALUE;

    private g a(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f7042c && gVar.f7042c) {
                a(gVar.f7041b);
            }
            if (this.f7047h == -1) {
                this.f7047h = gVar.f7047h;
            }
            if (this.f7048i == -1) {
                this.f7048i = gVar.f7048i;
            }
            if (this.f7040a == null && (str = gVar.f7040a) != null) {
                this.f7040a = str;
            }
            if (this.f7045f == -1) {
                this.f7045f = gVar.f7045f;
            }
            if (this.f7046g == -1) {
                this.f7046g = gVar.f7046g;
            }
            if (this.f7053n == -1) {
                this.f7053n = gVar.f7053n;
            }
            if (this.f7054o == null && (alignment2 = gVar.f7054o) != null) {
                this.f7054o = alignment2;
            }
            if (this.f7055p == null && (alignment = gVar.f7055p) != null) {
                this.f7055p = alignment;
            }
            if (this.f7056q == -1) {
                this.f7056q = gVar.f7056q;
            }
            if (this.f7049j == -1) {
                this.f7049j = gVar.f7049j;
                this.f7050k = gVar.f7050k;
            }
            if (this.f7057r == null) {
                this.f7057r = gVar.f7057r;
            }
            if (this.f7058s == Float.MAX_VALUE) {
                this.f7058s = gVar.f7058s;
            }
            if (z10 && !this.f7044e && gVar.f7044e) {
                b(gVar.f7043d);
            }
            if (z10 && this.f7052m == -1 && (i10 = gVar.f7052m) != -1) {
                this.f7052m = i10;
            }
        }
        return this;
    }

    public int a() {
        int i10 = this.f7047h;
        if (i10 == -1 && this.f7048i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f7048i == 1 ? 2 : 0);
    }

    public g a(float f10) {
        this.f7058s = f10;
        return this;
    }

    public g a(int i10) {
        this.f7041b = i10;
        this.f7042c = true;
        return this;
    }

    public g a(Layout.Alignment alignment) {
        this.f7054o = alignment;
        return this;
    }

    public g a(b bVar) {
        this.f7057r = bVar;
        return this;
    }

    public g a(g gVar) {
        return a(gVar, true);
    }

    public g a(String str) {
        this.f7040a = str;
        return this;
    }

    public g a(boolean z10) {
        this.f7045f = z10 ? 1 : 0;
        return this;
    }

    public g b(float f10) {
        this.f7050k = f10;
        return this;
    }

    public g b(int i10) {
        this.f7043d = i10;
        this.f7044e = true;
        return this;
    }

    public g b(Layout.Alignment alignment) {
        this.f7055p = alignment;
        return this;
    }

    public g b(String str) {
        this.f7051l = str;
        return this;
    }

    public g b(boolean z10) {
        this.f7046g = z10 ? 1 : 0;
        return this;
    }

    public boolean b() {
        return this.f7045f == 1;
    }

    public g c(int i10) {
        this.f7052m = i10;
        return this;
    }

    public g c(boolean z10) {
        this.f7047h = z10 ? 1 : 0;
        return this;
    }

    public boolean c() {
        return this.f7046g == 1;
    }

    public g d(int i10) {
        this.f7053n = i10;
        return this;
    }

    public g d(boolean z10) {
        this.f7048i = z10 ? 1 : 0;
        return this;
    }

    public String d() {
        return this.f7040a;
    }

    public int e() {
        if (this.f7042c) {
            return this.f7041b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public g e(int i10) {
        this.f7049j = i10;
        return this;
    }

    public g e(boolean z10) {
        this.f7056q = z10 ? 1 : 0;
        return this;
    }

    public boolean f() {
        return this.f7042c;
    }

    public int g() {
        if (this.f7044e) {
            return this.f7043d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public boolean h() {
        return this.f7044e;
    }

    public float i() {
        return this.f7058s;
    }

    public String j() {
        return this.f7051l;
    }

    public int k() {
        return this.f7052m;
    }

    public int l() {
        return this.f7053n;
    }

    public Layout.Alignment m() {
        return this.f7054o;
    }

    public Layout.Alignment n() {
        return this.f7055p;
    }

    public boolean o() {
        return this.f7056q == 1;
    }

    public b p() {
        return this.f7057r;
    }

    public int q() {
        return this.f7049j;
    }

    public float r() {
        return this.f7050k;
    }
}
