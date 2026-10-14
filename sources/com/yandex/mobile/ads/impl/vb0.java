package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class vb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Float f25938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f25939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f25940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25941i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f25943b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f25944c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f25945d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f25946e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Float f25947f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f25948g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f25949h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f25950i;

        public final a a(String str) {
            this.f25946e = str;
            return this;
        }

        public final vb0 a() {
            return new vb0(this);
        }

        public final a b(String str) {
            this.f25944c = wb0.a(str);
            return this;
        }

        public final a c(String str) {
            try {
                this.f25948g = Integer.valueOf(str).intValue();
            } catch (Exception unused) {
            }
            return this;
        }

        public final a d(String str) {
            this.f25942a = str;
            return this;
        }

        public final a e(String str) {
            this.f25945d = str;
            return this;
        }

        public final a f(String str) {
            this.f25943b = str;
            return this;
        }

        public final a g(String str) {
            Float fValueOf;
            int i10 = t6.f25286b;
            try {
                fValueOf = Float.valueOf(Float.parseFloat(str));
            } catch (Exception unused) {
                fValueOf = null;
            }
            this.f25947f = fValueOf;
            return this;
        }

        public final a h(String str) {
            try {
                this.f25949h = Integer.valueOf(str).intValue();
            } catch (Exception unused) {
            }
            return this;
        }
    }

    public vb0(a aVar) {
        this.f25933a = aVar.f25942a;
        this.f25934b = aVar.f25943b;
        this.f25935c = aVar.f25944c;
        this.f25939g = aVar.f25948g;
        this.f25941i = aVar.f25950i;
        this.f25940h = aVar.f25949h;
        this.f25936d = aVar.f25945d;
        this.f25937e = aVar.f25946e;
        this.f25938f = aVar.f25947f;
    }

    public final String a() {
        return this.f25937e;
    }

    public final int b() {
        return this.f25939g;
    }

    public final String c() {
        return this.f25936d;
    }

    public final String d() {
        return this.f25934b;
    }

    public final Float e() {
        return this.f25938f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vb0.class != obj.getClass()) {
            return false;
        }
        vb0 vb0Var = (vb0) obj;
        if (this.f25939g != vb0Var.f25939g || this.f25940h != vb0Var.f25940h || this.f25941i != vb0Var.f25941i || this.f25935c != vb0Var.f25935c) {
            return false;
        }
        String str = this.f25933a;
        if (str == null ? vb0Var.f25933a != null : !str.equals(vb0Var.f25933a)) {
            return false;
        }
        String str2 = this.f25936d;
        if (str2 == null ? vb0Var.f25936d != null : !str2.equals(vb0Var.f25936d)) {
            return false;
        }
        String str3 = this.f25934b;
        if (str3 == null ? vb0Var.f25934b != null : !str3.equals(vb0Var.f25934b)) {
            return false;
        }
        String str4 = this.f25937e;
        if (str4 == null ? vb0Var.f25937e != null : !str4.equals(vb0Var.f25937e)) {
            return false;
        }
        Float f10 = this.f25938f;
        Float f11 = vb0Var.f25938f;
        return f10 == null ? f11 == null : f10.equals(f11);
    }

    public final int f() {
        return this.f25940h;
    }

    public final int hashCode() {
        String str = this.f25933a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f25934b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i10 = this.f25935c;
        int iA = (((((((iHashCode2 + (i10 != 0 ? a6.a(i10) : 0)) * 31) + this.f25939g) * 31) + this.f25940h) * 31) + this.f25941i) * 31;
        String str3 = this.f25936d;
        int iHashCode3 = (iA + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f25937e;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Float f10 = this.f25938f;
        return iHashCode4 + (f10 != null ? f10.hashCode() : 0);
    }
}
