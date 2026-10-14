package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBinder;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InstreamAdPlayer f19257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final VideoPlayer f19258c;

    public bf(Context context, ls lsVar, cm1 cm1Var) {
        this.f19256a = context.getApplicationContext();
        this.f19257b = lsVar;
        this.f19258c = cm1Var;
    }

    public final af a(ViewGroup viewGroup, List<qc1> list, InstreamAd instreamAd) {
        return new af(viewGroup, list, new InstreamAdBinder(this.f19256a, instreamAd, this.f19257b, this.f19258c));
    }
}
