package com.yandex.mobile.ads.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class wh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f26287d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f26289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Map<String, String> f26290c;

        public a(String str, String str2) {
            this.f26288a = str;
            this.f26289b = str2;
        }

        public final a a(Map<String, String> map) {
            this.f26290c = map;
            return this;
        }
    }

    private wh1(a aVar) {
        this.f26284a = "v2";
        this.f26285b = aVar.f26288a;
        this.f26286c = aVar.f26289b;
        this.f26287d = aVar.f26290c;
    }

    public /* synthetic */ wh1(a aVar, int i10) {
        this(aVar);
    }

    public final String a() {
        return this.f26284a;
    }

    public final String b() {
        return this.f26285b;
    }

    public final String c() {
        return this.f26286c;
    }

    public final Map<String, String> d() {
        return this.f26287d;
    }
}
