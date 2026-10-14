package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdResponse<String> f23655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dl1 f23656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NativeAd f23657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23658d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AdResponse<String> f23659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private dl1 f23660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private NativeAd f23661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f23662d = 0;

        public a(AdResponse<String> adResponse) {
            this.f23659a = adResponse;
        }

        public final a a(int i10) {
            this.f23662d = i10;
            return this;
        }

        public final a a(dl1 dl1Var) {
            this.f23660b = dl1Var;
            return this;
        }

        public final a a(NativeAd nativeAd) {
            this.f23661c = nativeAd;
            return this;
        }
    }

    public o0(a aVar) {
        this.f23655a = aVar.f23659a;
        this.f23656b = aVar.f23660b;
        this.f23657c = aVar.f23661c;
        this.f23658d = aVar.f23662d;
    }

    public final AdResponse<String> a() {
        return this.f23655a;
    }

    public final NativeAd b() {
        return this.f23657c;
    }

    public final int c() {
        return this.f23658d;
    }

    public final dl1 d() {
        return this.f23656b;
    }
}
