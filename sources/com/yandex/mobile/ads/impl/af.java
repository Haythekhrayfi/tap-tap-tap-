package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.instream.InstreamAdBinder;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<ViewGroup> f18917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<qc1> f18918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InstreamAdBinder f18919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.yandex.mobile.ads.instream.a f18920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InstreamAdView f18921e;

    public af(ViewGroup viewGroup, List<qc1> list, InstreamAdBinder instreamAdBinder) {
        this.f18919c = instreamAdBinder;
        this.f18920d = new com.yandex.mobile.ads.instream.a(instreamAdBinder);
        this.f18917a = new WeakReference<>(viewGroup);
        this.f18918b = list;
    }

    public final void a() {
        ViewGroup viewGroup = this.f18917a.get();
        if (viewGroup != null) {
            if (this.f18921e == null) {
                this.f18921e = new InstreamAdView(viewGroup.getContext());
                viewGroup.addView(this.f18921e, new ViewGroup.LayoutParams(-1, -1));
            }
            this.f18920d.a(this.f18921e, this.f18918b);
        }
    }

    public final void a(bc1 bc1Var) {
        this.f18920d.a(bc1Var);
    }

    public final void a(cc1 cc1Var) {
        this.f18920d.a(cc1Var);
    }

    public final void a(id1 id1Var) {
        this.f18919c.setVideoAdPlaybackListener(id1Var);
    }

    public final void b() {
        InstreamAdView instreamAdView;
        ViewGroup viewGroup = this.f18917a.get();
        if (viewGroup != null && (instreamAdView = this.f18921e) != null) {
            viewGroup.removeView(instreamAdView);
        }
        this.f18921e = null;
        this.f18919c.setInstreamAdListener(null);
        this.f18919c.unbind();
        this.f18919c.invalidateAdPlayer();
        this.f18919c.invalidateVideoPlayer();
    }
}
