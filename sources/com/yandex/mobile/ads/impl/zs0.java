package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zs0 implements td1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s40 f27406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.yandex.mobile.ads.instream.player.ad.a f27407b = new com.yandex.mobile.ads.instream.player.ad.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final us0 f27408c = new us0();

    public zs0(s40 s40Var) {
        this.f27406a = s40Var;
    }

    @Override // com.yandex.mobile.ads.impl.td1
    public final void a(long j10, long j11) {
        r40 r40VarA = this.f27406a.a();
        ProgressBar progressBarJ = null;
        InstreamAdView instreamAdViewB = r40VarA != null ? r40VarA.b() : null;
        if (instreamAdViewB != null) {
            Objects.requireNonNull(this.f27407b);
            fc1 fc1VarA = com.yandex.mobile.ads.instream.player.ad.a.a(instreamAdViewB);
            if (fc1VarA != null) {
                progressBarJ = fc1VarA.j();
            }
        }
        ProgressBar progressBar = progressBarJ;
        if (progressBar != null) {
            this.f27408c.a(progressBar, j11, j10);
        }
    }
}
