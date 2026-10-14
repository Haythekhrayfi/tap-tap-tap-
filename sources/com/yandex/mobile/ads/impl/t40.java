package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdsLoader;
import com.google.android.exoplayer2.ui.AdOverlayInfo;
import com.google.android.exoplayer2.ui.AdViewProvider;
import com.google.android.exoplayer2.util.Util;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class t40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h6 f25260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d4 f25261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4 f25262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bf f25263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final cf f25264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z80 f25265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ys f25266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ps f25267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final es0 f25268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final lr0 f25269j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Player.Listener f25270k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final id1 f25271l = new id1();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private InstreamAd f25272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Player f25273n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Object f25274o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f25275p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f25276q;

    public class a implements z80.b {
        private a() {
        }

        public /* synthetic */ a(t40 t40Var, int i10) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.z80.b
        public final void a() {
            t40.this.f25276q = false;
            t40.this.f25261b.a(AdPlaybackState.NONE);
        }

        @Override // com.yandex.mobile.ads.impl.z80.b
        public final void a(ViewGroup viewGroup, List<qc1> list, InstreamAd instreamAd) {
            t40.this.f25276q = false;
            t40.this.f25272m = instreamAd;
            if (instreamAd instanceof v50) {
                v50 v50Var = (v50) t40.this.f25272m;
                Objects.requireNonNull(t40.this);
                v50Var.a();
            }
            af afVarA = t40.this.f25263d.a(viewGroup, list, instreamAd);
            t40.this.f25264e.a(afVarA);
            afVarA.a(t40.this.f25271l);
            afVarA.a(t40.h(t40.this));
            afVarA.a(t40.i(t40.this));
            if (t40.this.f25266g.b()) {
                t40.this.f25275p = true;
                t40.a(t40.this, instreamAd);
            }
        }
    }

    public t40(g6 g6Var, e4 e4Var, bf bfVar, cf cfVar, z80 z80Var, kr0 kr0Var, ps psVar, es0 es0Var, vs vsVar) {
        this.f25260a = g6Var.b();
        this.f25261b = g6Var.c();
        this.f25262c = e4Var;
        this.f25263d = bfVar;
        this.f25264e = cfVar;
        this.f25265f = z80Var;
        this.f25267h = psVar;
        this.f25268i = es0Var;
        this.f25266g = kr0Var.c();
        this.f25269j = kr0Var.d();
        this.f25270k = vsVar;
    }

    public static void a(t40 t40Var, InstreamAd instreamAd) {
        t40Var.f25261b.a(t40Var.f25262c.a(instreamAd, t40Var.f25274o));
    }

    public static /* synthetic */ bc1 h(t40 t40Var) {
        Objects.requireNonNull(t40Var);
        return null;
    }

    public static /* synthetic */ cc1 i(t40 t40Var) {
        Objects.requireNonNull(t40Var);
        return null;
    }

    public final void a() {
        this.f25276q = false;
        this.f25275p = false;
        this.f25272m = null;
        this.f25268i.a((ir0) null);
        this.f25260a.a();
        this.f25260a.a((pr0) null);
        this.f25264e.c();
        this.f25261b.b();
        this.f25265f.a();
        this.f25271l.a(null);
        af afVarA = this.f25264e.a();
        if (afVarA != null) {
            afVarA.a((bc1) null);
        }
        af afVarA2 = this.f25264e.a();
        if (afVarA2 != null) {
            afVarA2.a((cc1) null);
        }
    }

    public final void a(int i10, int i11) {
        this.f25267h.a(i10, i11);
    }

    public final void a(int i10, int i11, IOException iOException) {
        this.f25267h.b(i10, i11, iOException);
    }

    public final void a(ViewGroup viewGroup, List<qc1> list) {
        if (this.f25276q || this.f25272m != null || viewGroup == null) {
            return;
        }
        this.f25276q = true;
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f25265f.a(viewGroup, list, new a(this, 0));
    }

    public final void a(Player player) {
        this.f25273n = player;
    }

    public final void a(AdsLoader.EventListener eventListener, AdViewProvider adViewProvider, Object obj) {
        Player player = this.f25273n;
        this.f25266g.a(player);
        this.f25274o = obj;
        if (player != null) {
            player.addListener(this.f25270k);
            this.f25261b.a(eventListener);
            this.f25268i.a(new ir0(player, this.f25269j));
            if (this.f25275p) {
                this.f25261b.a(this.f25261b.a());
                af afVarA = this.f25264e.a();
                if (afVarA != null) {
                    afVarA.a();
                    return;
                }
                return;
            }
            InstreamAd instreamAd = this.f25272m;
            if (instreamAd != null) {
                this.f25261b.a(this.f25262c.a(instreamAd, this.f25274o));
            } else if (adViewProvider != null) {
                ViewGroup adViewGroup = adViewProvider.getAdViewGroup();
                ArrayList arrayList = new ArrayList();
                Iterator it = adViewProvider.getAdOverlayInfos().iterator();
                while (it.hasNext()) {
                    arrayList.add(ks.a((AdOverlayInfo) it.next()));
                }
                a(adViewGroup, arrayList);
            }
        }
    }

    public final void a(VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f25271l.a(videoAdPlaybackListener);
    }

    public final void b() {
        Player playerA = this.f25266g.a();
        if (playerA != null) {
            if (this.f25272m != null) {
                long jMsToUs = Util.msToUs(playerA.getCurrentPosition());
                if (!this.f25269j.c()) {
                    jMsToUs = 0;
                }
                this.f25261b.a(this.f25261b.a().withAdResumePositionUs(jMsToUs));
            }
            playerA.removeListener(this.f25270k);
            this.f25261b.a((AdsLoader.EventListener) null);
            this.f25266g.a((Player) null);
            this.f25275p = true;
        }
    }
}
