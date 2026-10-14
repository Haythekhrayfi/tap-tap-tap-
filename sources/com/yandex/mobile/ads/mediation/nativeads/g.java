package com.yandex.mobile.ads.mediation.nativeads;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.s20;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class g implements s20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediatedNativeAd f27588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.a f27590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f27591d;

    public g(h hVar, MediatedNativeAd mediatedNativeAd, int i10, h.a aVar) {
        this.f27591d = hVar;
        this.f27588a = mediatedNativeAd;
        this.f27589b = i10;
        this.f27590c = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.s20
    public final void a(Map<String, Bitmap> map) {
        h.a(this.f27591d, this.f27588a, map, this.f27589b, this.f27590c);
    }
}
