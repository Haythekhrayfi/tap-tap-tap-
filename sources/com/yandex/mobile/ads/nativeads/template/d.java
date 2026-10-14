package com.yandex.mobile.ads.nativeads.template;

import com.yandex.mobile.ads.impl.zk0;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import com.yandex.mobile.ads.nativeads.NativeAdType;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeAdImage f27943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NativeAdImage f27944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NativeAdImage f27945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NativeAdMedia f27946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f27947e;

    public d(NativeAdAssets nativeAdAssets, NativeAdType nativeAdType) {
        this.f27943a = nativeAdAssets.getFavicon();
        this.f27944b = nativeAdAssets.getIcon();
        this.f27945c = nativeAdAssets.getImage();
        this.f27946d = nativeAdAssets.getMedia();
        this.f27947e = zk0.a(nativeAdType);
    }

    public static boolean a(NativeAdImage nativeAdImage) {
        return "large".equals(nativeAdImage.a()) || "wide".equals(nativeAdImage.a());
    }

    public final boolean a() {
        NativeAdImage nativeAdImage;
        return (e() || (nativeAdImage = this.f27945c) == null || !"fill".equals(nativeAdImage.a())) ? false : true;
    }

    public final boolean b() {
        NativeAdImage nativeAdImage;
        return (c() || this.f27943a == null || !(e() || (nativeAdImage = this.f27945c) == null || a(nativeAdImage))) ? false : true;
    }

    public final boolean c() {
        if (this.f27944b != null) {
            if ((2 == this.f27947e) || !f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        NativeAdImage nativeAdImage;
        return (e() || (nativeAdImage = this.f27945c) == null || !a(nativeAdImage)) ? false : true;
    }

    public final boolean e() {
        return this.f27946d != null;
    }

    public final boolean f() {
        NativeAdImage nativeAdImage;
        if (!e() && (nativeAdImage = this.f27945c) != null && !a(nativeAdImage)) {
            if (!(2 == this.f27947e)) {
                return true;
            }
        }
        return false;
    }
}
