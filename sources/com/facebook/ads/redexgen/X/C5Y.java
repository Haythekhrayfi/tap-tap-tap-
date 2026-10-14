package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5Y, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C5Y implements NativeAdsManagerApi {
    public static final String A0A = NativeAdsManager.class.getSimpleName();
    public NativeAdsManager.Listener A01;
    public C1379Zo A02;
    public String A03;
    public final int A06;
    public final C1337Xw A07;
    public final String A08;
    public final List<NativeAd> A09;
    public int A00 = -1;
    public boolean A04 = false;
    public boolean A05 = false;

    public C5Y(Context context, String str, int i10) {
        this.A07 = C5O.A02(context);
        this.A08 = str;
        this.A06 = Math.max(i10, 0);
        this.A09 = new ArrayList(i10);
    }

    public final NativeAdsManager.Listener A00() {
        return this.A01;
    }

    public final C1379Zo A01() {
        return this.A02;
    }

    public final void A02() {
        this.A09.clear();
    }

    public final void A03(int i10) {
        this.A00 = i10;
    }

    public final void A04(NativeAd nativeAd) {
        this.A09.add(nativeAd);
    }

    public final void A05(boolean z10) {
        this.A04 = z10;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void disableAutoRefresh() {
        this.A05 = true;
        C1379Zo c1379Zo = this.A02;
        if (c1379Zo != null) {
            c1379Zo.A06();
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final int getUniqueNativeAdCount() {
        return this.A09.size();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final boolean isLoaded() {
        return this.A04;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds() {
        loadAds(NativeAdBase.MediaCacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        JI ji = JI.A05;
        int i10 = this.A06;
        C1379Zo c1379Zo = this.A02;
        C1379Zo c1379Zo2 = new C1379Zo(this.A07, this.A08, ji, null, i10);
        this.A02 = c1379Zo2;
        if (this.A05) {
            c1379Zo2.A06();
        }
        this.A02.A09(this.A03);
        this.A02.A08(new YJ(this, this.A07, mediaCacheFlag));
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final NativeAd nextNativeAd() {
        return nextNativeAd(null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final NativeAd nextNativeAd(NativeAdListener nativeAdListener) {
        if (this.A09.size() == 0) {
            return null;
        }
        int i10 = this.A00;
        this.A00 = i10 + 1;
        List<NativeAd> list = this.A09;
        int pos = list.size();
        NativeAd nativeAd = list.get(i10 % pos);
        if (nativeAdListener != null) {
            ((U7) nativeAd.getInternalNativeAd()).A1R(nativeAd, nativeAdListener);
        }
        int pos2 = this.A09.size();
        if (i10 >= pos2) {
            return new NativeAd(this.A07, nativeAd);
        }
        return nativeAd;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setExtraHints(String str) {
        this.A03 = str;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setListener(NativeAdsManager.Listener listener) {
        this.A01 = listener;
    }
}
