package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class g21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s40 f20933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.yandex.mobile.ads.instream.player.ad.a f20934b;

    public g21(s40 s40Var) {
        fd.j0.i(s40Var, "viewHolderManager");
        this.f20933a = s40Var;
        this.f20934b = new com.yandex.mobile.ads.instream.player.ad.a();
    }

    public final void a() {
        fc1 fc1VarA;
        fc1 fc1VarA2;
        InstreamAdView instreamAdViewB;
        InstreamAdView instreamAdViewB2;
        r40 r40VarA = this.f20933a.a();
        if (r40VarA == null || (instreamAdViewB2 = r40VarA.b()) == null) {
            fc1VarA = null;
        } else {
            Objects.requireNonNull(this.f20934b);
            fc1VarA = com.yandex.mobile.ads.instream.player.ad.a.a(instreamAdViewB2);
        }
        TextView textViewK = fc1VarA != null ? fc1VarA.k() : null;
        if (textViewK != null) {
            textViewK.setVisibility(8);
        }
        r40 r40VarA2 = this.f20933a.a();
        if (r40VarA2 == null || (instreamAdViewB = r40VarA2.b()) == null) {
            fc1VarA2 = null;
        } else {
            Objects.requireNonNull(this.f20934b);
            fc1VarA2 = com.yandex.mobile.ads.instream.player.ad.a.a(instreamAdViewB);
        }
        View viewL = fc1VarA2 != null ? fc1VarA2.l() : null;
        if (viewL != null) {
            viewL.setVisibility(0);
            viewL.setEnabled(true);
        }
    }

    public final void a(long j10, long j11) {
        fc1 fc1VarA;
        InstreamAdView instreamAdViewB;
        r40 r40VarA = this.f20933a.a();
        if (r40VarA == null || (instreamAdViewB = r40VarA.b()) == null) {
            fc1VarA = null;
        } else {
            Objects.requireNonNull(this.f20934b);
            fc1VarA = com.yandex.mobile.ads.instream.player.ad.a.a(instreamAdViewB);
        }
        TextView textViewK = fc1VarA != null ? fc1VarA.k() : null;
        int i10 = ((int) ((j10 - j11) / ((long) 1000))) + 1;
        if (textViewK != null) {
            textViewK.setText(String.valueOf(i10));
            textViewK.setVisibility(0);
        }
    }
}
