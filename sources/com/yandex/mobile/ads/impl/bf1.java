package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class bf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19262b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f19263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f19264b;

        public final a a() {
            this.f19264b = true;
            return this;
        }

        public final a a(int i10) {
            this.f19263a = i10;
            return this;
        }
    }

    private bf1(a aVar) {
        this.f19261a = aVar.f19263a;
        this.f19262b = aVar.f19264b;
    }

    public /* synthetic */ bf1(a aVar, int i10) {
        this(aVar);
    }

    public final boolean a() {
        return this.f19262b;
    }

    public final int b() {
        return this.f19261a;
    }
}
