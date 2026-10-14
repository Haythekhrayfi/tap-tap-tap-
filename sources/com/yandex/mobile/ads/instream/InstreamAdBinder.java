package com.yandex.mobile.ads.instream;

import android.content.Context;
import com.yandex.mobile.ads.impl.bc1;
import com.yandex.mobile.ads.impl.cc1;
import com.yandex.mobile.ads.impl.d40;
import com.yandex.mobile.ads.impl.dk;
import com.yandex.mobile.ads.impl.ec1;
import com.yandex.mobile.ads.impl.f40;
import com.yandex.mobile.ads.impl.f60;
import com.yandex.mobile.ads.impl.j91;
import com.yandex.mobile.ads.impl.kd1;
import com.yandex.mobile.ads.impl.ld1;
import com.yandex.mobile.ads.impl.n50;
import com.yandex.mobile.ads.impl.o30;
import com.yandex.mobile.ads.impl.p30;
import com.yandex.mobile.ads.impl.qc1;
import com.yandex.mobile.ads.impl.v50;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class InstreamAdBinder implements j91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InstreamAdPlayer f27451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VideoPlayer f27452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n50 f27453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f27454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p30 f27455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f40 f27456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f60 f27457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o30 f27458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ec1 f27459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ld1 f27460j;

    public InstreamAdBinder(Context context, InstreamAd instreamAd, InstreamAdPlayer instreamAdPlayer, VideoPlayer videoPlayer) {
        this.f27451a = instreamAdPlayer;
        this.f27452b = videoPlayer;
        c cVar = new c(context, a(instreamAd), new d40(instreamAdPlayer), new e(videoPlayer));
        this.f27454d = cVar;
        n50 n50Var = new n50();
        this.f27453c = n50Var;
        cVar.a(n50Var);
        o30 o30Var = new o30();
        this.f27458h = o30Var;
        ec1 ec1Var = new ec1();
        this.f27459i = ec1Var;
        cVar.a(new dk(ec1Var, o30Var));
        this.f27455e = p30.a();
        this.f27456f = new f40(this);
        this.f27457g = new f60(this);
        this.f27460j = new ld1();
    }

    private static v50 a(InstreamAd instreamAd) {
        if (instreamAd instanceof v50) {
            return (v50) instreamAd;
        }
        throw new IllegalArgumentException("You should pass InstreamAd received from InstreamAdLoader");
    }

    public final void a(bc1 bc1Var) {
        this.f27458h.a(bc1Var);
    }

    public final void a(cc1 cc1Var) {
        this.f27458h.a(cc1Var);
    }

    public final void a(InstreamAdView instreamAdView, List<qc1> list) {
        InstreamAdBinder instreamAdBinderA = this.f27455e.a(instreamAdView);
        if (!equals(instreamAdBinderA)) {
            if (instreamAdBinderA != null) {
                instreamAdBinderA.unbind();
            }
            if (this.f27455e.a(this)) {
                this.f27454d.d();
            }
            this.f27455e.a(instreamAdView, this);
        }
        this.f27456f.a(this.f27451a);
        this.f27457g.a(this.f27452b);
        this.f27454d.a(instreamAdView, list);
    }

    public void bind(InstreamAdView instreamAdView) {
        a(instreamAdView, Collections.emptyList());
    }

    @Override // com.yandex.mobile.ads.impl.j91
    public void invalidateAdPlayer() {
        this.f27456f.b(this.f27451a);
        this.f27454d.a();
    }

    public void invalidateVideoPlayer() {
        this.f27457g.b(this.f27452b);
        this.f27454d.b();
    }

    public void prepareAd() {
        this.f27454d.c();
    }

    public void setInstreamAdListener(InstreamAdListener instreamAdListener) {
        this.f27453c.a(instreamAdListener);
    }

    public void setVideoAdPlaybackListener(VideoAdPlaybackListener videoAdPlaybackListener) {
        kd1 kd1VarA;
        if (videoAdPlaybackListener != null) {
            Objects.requireNonNull(this.f27460j);
            kd1VarA = ld1.a(videoAdPlaybackListener);
        } else {
            kd1VarA = null;
        }
        this.f27459i.a(kd1VarA);
    }

    public void unbind() {
        if (this.f27455e.a(this)) {
            this.f27454d.d();
        }
    }
}
