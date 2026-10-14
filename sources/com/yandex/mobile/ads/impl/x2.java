package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w50 f26409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d40 f26410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g20 f26411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s40 f26412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dd1<VideoAd> f26413f;

    public x2(Context context, w50 w50Var, d40 d40Var, eq0 eq0Var, s40 s40Var, c3 c3Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(w50Var, "adBreak");
        fd.j0.i(d40Var, "adPlayerController");
        fd.j0.i(eq0Var, "imageProvider");
        fd.j0.i(s40Var, "adViewsHolderManager");
        fd.j0.i(c3Var, "playbackEventsListener");
        this.f26408a = context;
        this.f26409b = w50Var;
        this.f26410c = d40Var;
        this.f26411d = eq0Var;
        this.f26412e = s40Var;
        this.f26413f = c3Var;
    }

    public final w2 a() {
        g3 g3Var = new g3(this.f26408a, this.f26409b, this.f26410c, this.f26411d, this.f26412e, this.f26413f);
        List<sc1<VideoAd>> listC = this.f26409b.c();
        fd.j0.h(listC, "adBreak.videoAdInfoList");
        return new w2(g3Var.a(listC));
    }
}
