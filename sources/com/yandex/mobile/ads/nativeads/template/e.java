package com.yandex.mobile.ads.nativeads.template;

import com.yandex.mobile.ads.impl.zk0;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdType;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NativeAdImage f27950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Float f27951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f27952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f27953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f27954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f27955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f27956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f27957j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f27958k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final NativeAdImage f27959l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final NativeAdImage f27960m;

    public e(NativeAdAssets nativeAdAssets, NativeAdType nativeAdType) {
        this.f27949b = nativeAdAssets.getCallToAction();
        this.f27950c = nativeAdAssets.getImage();
        this.f27951d = nativeAdAssets.getRating();
        this.f27952e = nativeAdAssets.getReviewCount();
        this.f27953f = nativeAdAssets.getWarning();
        this.f27954g = nativeAdAssets.getAge();
        this.f27955h = nativeAdAssets.getSponsored();
        this.f27956i = nativeAdAssets.getTitle();
        this.f27957j = nativeAdAssets.getBody();
        this.f27958k = nativeAdAssets.getDomain();
        this.f27959l = nativeAdAssets.getIcon();
        this.f27960m = nativeAdAssets.getFavicon();
        this.f27948a = zk0.a(nativeAdType);
    }

    private boolean e() {
        return !((this.f27951d == null && this.f27952e == null) ? false : true);
    }

    public final boolean a() {
        return (this.f27956i == null && this.f27957j == null && this.f27958k == null && this.f27959l == null && this.f27960m == null) ? false : true;
    }

    public final boolean b() {
        if (this.f27949b != null) {
            return 1 == this.f27948a || e();
        }
        return false;
    }

    public final boolean c() {
        NativeAdImage nativeAdImage = this.f27950c;
        return nativeAdImage != null && ("large".equals(nativeAdImage.a()) || "wide".equals(this.f27950c.a()));
    }

    public final boolean d() {
        return (this.f27954g == null && this.f27955h == null && !a()) ? false : true;
    }

    public final boolean f() {
        if (this.f27949b != null) {
            return true;
        }
        return this.f27951d != null || this.f27952e != null;
    }

    public final boolean g() {
        return (this.f27949b != null) && (b() || c());
    }

    public final boolean h() {
        return this.f27953f != null;
    }

    public final boolean i() {
        return b() || (c() && e());
    }
}
