package com.facebook.ads.redexgen.X;

import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedAdListener;
import java.lang.ref.WeakReference;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.21, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass21 {
    public long A00 = -1;
    public InterstitialAd A01;
    public InterstitialAdListener A02;
    public RewardData A03;
    public RewardedAdListener A04;
    public String A05;
    public String A06;
    public String A07;
    public EnumSet<CacheFlag> A08;
    public final C1337Xw A09;
    public final String A0A;
    public final WeakReference<InterstitialAd> A0B;

    public AnonymousClass21(C1337Xw c1337Xw, InterstitialAd interstitialAd, String str) {
        this.A09 = c1337Xw;
        this.A0A = str;
        this.A01 = interstitialAd;
        this.A0B = new WeakReference<>(interstitialAd);
    }

    public final long A00() {
        return this.A00;
    }

    public final InterstitialAd A01() {
        InterstitialAd interstitialAd = this.A01;
        return interstitialAd != null ? interstitialAd : this.A0B.get();
    }

    public final InterstitialAdListener A02() {
        return this.A02;
    }

    public final RewardData A03() {
        return this.A03;
    }

    public final RewardedAdListener A04() {
        return this.A04;
    }

    public final C1337Xw A05() {
        return this.A09;
    }

    public final String A06() {
        return this.A05;
    }

    public final String A07() {
        return this.A06;
    }

    public final String A08() {
        return this.A07;
    }

    public final String A09() {
        return this.A0A;
    }

    public final EnumSet<CacheFlag> A0A() {
        return this.A08;
    }

    public final void A0B(long j10) {
        this.A00 = j10;
    }

    public final void A0C(InterstitialAd interstitialAd) {
        if (interstitialAd == null && !IN.A0q(this.A09)) {
            return;
        }
        this.A01 = interstitialAd;
    }

    public final void A0D(InterstitialAdListener interstitialAdListener) {
        this.A02 = interstitialAdListener;
    }

    public final void A0E(RewardData rewardData) {
        this.A03 = rewardData;
    }

    public final void A0F(RewardedAdListener rewardedAdListener) {
        this.A04 = rewardedAdListener;
    }

    public final void A0G(String str) {
        this.A05 = str;
    }

    public final void A0H(String str) {
        this.A06 = str;
    }

    public final void A0I(String str) {
        this.A07 = str;
    }

    public final void A0J(EnumSet<CacheFlag> flags) {
        this.A08 = flags;
    }
}
