package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class a50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f18794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f18795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f18796d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f18797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f18798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f18799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f18800d;

        public final a a(float f10) {
            this.f18798b = f10;
            return this;
        }

        public final a50 a() {
            return new a50(this, 0);
        }

        public final void a(boolean z10) {
            this.f18799c = z10;
        }

        public final a b(boolean z10) {
            this.f18797a = z10;
            return this;
        }

        public final void b(float f10) {
            this.f18800d = f10;
        }
    }

    private a50(a aVar) {
        this.f18793a = aVar.f18797a;
        this.f18794b = aVar.f18798b;
        this.f18795c = aVar.f18799c;
        this.f18796d = aVar.f18800d;
    }

    public /* synthetic */ a50(a aVar, int i10) {
        this(aVar);
    }

    public final float a() {
        return this.f18794b;
    }

    public final float b() {
        return this.f18796d;
    }

    public final boolean c() {
        return this.f18795c;
    }

    public final boolean d() {
        return this.f18793a;
    }
}
