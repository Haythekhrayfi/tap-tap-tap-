package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eg1 f21093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lh0 f21094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f21 f21095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final us0 f21096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y40 f21097e;

    public gl(Context context, w50 w50Var, r50 r50Var, ec1 ec1Var, sc1 sc1Var, eg1 eg1Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(r50Var, "instreamVastAdPlayer");
        fd.j0.i(w50Var, "adBreak");
        fd.j0.i(sc1Var, "videoAdInfo");
        fd.j0.i(eg1Var, "videoTracker");
        fd.j0.i(ec1Var, "playbackListener");
        this.f21093a = eg1Var;
        this.f21094b = new lh0(r50Var);
        this.f21095c = new f21(r50Var, (VideoAd) sc1Var.c());
        this.f21096d = new us0();
        this.f21097e = new y40(w50Var, sc1Var);
    }

    public final void a(fc1 fc1Var, a50 a50Var) {
        fd.j0.i(fc1Var, "uiElements");
        fd.j0.i(a50Var, "controlsState");
        this.f21097e.a(fc1Var);
        this.f21094b.a(fc1Var, a50Var);
        View viewL = fc1Var.l();
        if (viewL != null) {
            this.f21095c.a(viewL, a50Var);
        }
        ProgressBar progressBarJ = fc1Var.j();
        if (progressBarJ != null) {
            Objects.requireNonNull(this.f21096d);
            us0.a(progressBarJ, a50Var);
        }
    }
}
