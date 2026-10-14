package com.applovin.impl.adview.activity.b;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.r0;
import com.applovin.adview.AppLovinAdView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.aw;
import com.applovin.exoplayer2.k.p;
import com.applovin.exoplayer2.l.ai;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.h;
import com.applovin.impl.adview.k;
import com.applovin.impl.adview.n;
import com.applovin.impl.adview.v;
import com.applovin.impl.adview.w;
import com.applovin.impl.adview.x;
import com.applovin.impl.sdk.e.ac;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.u;
import com.applovin.impl.sdk.utils.z;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.applovin.impl.adview.activity.b.a implements AppLovinCommunicatorSubscriber {
    public final com.applovin.impl.adview.a A;
    public final n B;
    public h C;
    public final ImageView D;
    public w E;
    public final ProgressBar F;
    public ProgressBar G;
    public final k H;
    public final k I;
    public boolean J;
    public long K;
    public int L;
    public boolean M;
    public boolean N;
    private final com.applovin.impl.adview.activity.a.c O;
    private final a P;
    private final Handler Q;
    private final Handler R;
    private final boolean S;
    private long T;
    private final AtomicBoolean U;
    private final AtomicBoolean V;
    private long W;
    private long X;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.applovin.exoplayer2.ui.g f8402y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final aw f8403z;

    public class a implements x.a {
        private a() {
        }

        @Override // com.applovin.impl.adview.x.a
        public void a(Uri uri, w wVar) {
            y yVar = e.this.f8352c;
            if (y.a()) {
                e.this.f8352c.b("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            u.a(uri, e.this.f8355f.getController(), e.this.f8351b);
        }

        @Override // com.applovin.impl.adview.x.a
        public void a(w wVar) {
            y yVar = e.this.f8352c;
            if (y.a()) {
                e.this.f8352c.b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            e.this.a(wVar.getAndClearLastClickLocation(), false);
        }

        @Override // com.applovin.impl.adview.x.a
        public void b(w wVar) {
            y yVar = e.this.f8352c;
            if (y.a()) {
                e.this.f8352c.b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            e.this.h();
        }

        @Override // com.applovin.impl.adview.x.a
        public void c(w wVar) {
            y yVar = e.this.f8352c;
            if (y.a()) {
                e.this.f8352c.b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            e.this.c();
        }

        @Override // com.applovin.impl.adview.x.a
        public void d(w wVar) {
            y yVar = e.this.f8352c;
            if (y.a()) {
                e.this.f8352c.b("AppLovinFullscreenActivity", "Attempting to install app from video button...");
            }
            e.this.a(wVar.getAndClearLastClickLocation(), true);
        }
    }

    public class b implements an.b, com.applovin.exoplayer2.ui.f.d, AppLovinTouchToClickListener.OnClickListener {
        private b() {
        }

        @Override // com.applovin.exoplayer2.ui.f.d
        public void a(int i10) {
            if (i10 == 0) {
                e.this.f8402y.b();
            }
        }

        @Override // com.applovin.exoplayer2.an.b
        public void a(ak akVar) {
            e.this.c("Video view error (" + akVar + ")");
            e.this.h();
        }

        @Override // com.applovin.exoplayer2.an.b
        public void b(int i10) {
            y yVar = e.this.f8352c;
            if (y.a()) {
                y yVar2 = e.this.f8352c;
                StringBuilder sbA = r0.a("Player state changed to state ", i10, " and will play when ready: ");
                sbA.append(e.this.f8403z.x());
                yVar2.b("AppLovinFullscreenActivity", sbA.toString());
            }
            if (i10 == 2) {
                e.this.y();
                e.this.f8353d.g();
                return;
            }
            if (i10 != 3) {
                if (i10 == 4) {
                    y yVar3 = e.this.f8352c;
                    if (y.a()) {
                        e.this.f8352c.b("AppLovinFullscreenActivity", "Video completed");
                    }
                    e eVar = e.this;
                    eVar.N = true;
                    if (!eVar.f8362m) {
                        eVar.B();
                        return;
                    } else {
                        if (eVar.u()) {
                            e.this.J();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            e eVar2 = e.this;
            eVar2.f8403z.a(!eVar2.J ? 1 : 0);
            e eVar3 = e.this;
            eVar3.f8363n = (int) TimeUnit.MILLISECONDS.toSeconds(eVar3.f8403z.H());
            e eVar4 = e.this;
            eVar4.c(eVar4.f8403z.H());
            e.this.v();
            y yVar4 = e.this.f8352c;
            if (y.a()) {
                y yVar5 = e.this.f8352c;
                StringBuilder sbA2 = defpackage.a.a("MediaPlayer prepared: ");
                sbA2.append(e.this.f8403z);
                yVar5.b("AppLovinFullscreenActivity", sbA2.toString());
            }
            e.this.H.a();
            e eVar5 = e.this;
            if (eVar5.B != null) {
                eVar5.D();
            }
            e.this.z();
            if (e.this.f8372w.c()) {
                e.this.e();
            }
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, PointF pointF) {
            e.this.a(pointF, false);
        }
    }

    public class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e eVar = e.this;
            if (view == eVar.B) {
                if (!eVar.t()) {
                    e.this.c();
                    return;
                }
                e.this.e();
                e.this.q();
                e.this.f8372w.b();
                return;
            }
            if (view == eVar.D) {
                eVar.A();
                return;
            }
            y yVar = eVar.f8352c;
            if (y.a()) {
                e.this.f8352c.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public e(com.applovin.impl.sdk.ad.e eVar, Activity activity, Map<String, Object> map, o oVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, map, oVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.O = new com.applovin.impl.adview.activity.a.c(this.f8350a, this.f8354e, this.f8351b);
        a aVar = new a();
        this.P = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.Q = handler;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.R = handler2;
        k kVar = new k(handler, this.f8351b);
        this.H = kVar;
        this.I = new k(handler2, this.f8351b);
        boolean zF = this.f8350a.f();
        this.S = zF;
        this.J = com.applovin.impl.sdk.utils.w.c(this.f8351b);
        this.T = -1L;
        this.U = new AtomicBoolean();
        this.V = new AtomicBoolean();
        this.W = -2L;
        this.X = 0L;
        if (!eVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        c cVar = new c();
        if (eVar.r() >= 0) {
            n nVar = new n(eVar.x(), activity);
            this.B = nVar;
            nVar.setVisibility(8);
            nVar.setOnClickListener(cVar);
        } else {
            this.B = null;
        }
        if (a(this.J, oVar)) {
            ImageView imageView = new ImageView(activity);
            this.D = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(cVar);
            d(this.J);
        } else {
            this.D = null;
        }
        String strC = eVar.C();
        if (StringUtils.isValidString(strC)) {
            x xVar = new x(oVar);
            xVar.a(new WeakReference<>(aVar));
            w wVar = new w(xVar, activity);
            this.E = wVar;
            wVar.a(strC);
        } else {
            this.E = null;
        }
        if (zF) {
            com.applovin.impl.adview.a aVar2 = new com.applovin.impl.adview.a(activity, ((Integer) oVar.a(com.applovin.impl.sdk.c.b.cY)).intValue(), R.attr.progressBarStyleLarge);
            this.A = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.A = null;
        }
        final int iM = m();
        boolean z10 = ((Boolean) oVar.a(com.applovin.impl.sdk.c.b.cI)).booleanValue() && iM > 0;
        if (this.C == null && z10) {
            this.C = new h(activity);
            int I = eVar.I();
            this.C.setTextColor(I);
            this.C.setTextSize(((Integer) oVar.a(com.applovin.impl.sdk.c.b.cH)).intValue());
            this.C.setFinishedStrokeColor(I);
            this.C.setFinishedStrokeWidth(((Integer) oVar.a(com.applovin.impl.sdk.c.b.cG)).intValue());
            this.C.setMax(iM);
            this.C.setProgress(iM);
            kVar.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new k.a() { // from class: com.applovin.impl.adview.activity.b.e.1
                @Override // com.applovin.impl.adview.k.a
                public void a() {
                    e eVar2 = e.this;
                    if (eVar2.C != null) {
                        long seconds = ((long) iM) - TimeUnit.MILLISECONDS.toSeconds(eVar2.f8402y.getPlayer().I());
                        if (seconds <= 0) {
                            e.this.f8364o = true;
                        } else if (e.this.E()) {
                            e.this.C.setProgress((int) seconds);
                        }
                    }
                }

                @Override // com.applovin.impl.adview.k.a
                public boolean b() {
                    return e.this.E();
                }
            });
        }
        if (eVar.R()) {
            Long l10 = (Long) oVar.a(com.applovin.impl.sdk.c.b.cV);
            final Integer num = (Integer) oVar.a(com.applovin.impl.sdk.c.b.cW);
            ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
            this.F = progressBar;
            a(progressBar, eVar.S(), num.intValue());
            kVar.a("PROGRESS_BAR", l10.longValue(), new k.a() { // from class: com.applovin.impl.adview.activity.b.e.4
                @Override // com.applovin.impl.adview.k.a
                public void a() {
                    e eVar2 = e.this;
                    if (eVar2.M) {
                        eVar2.F.setVisibility(8);
                    } else {
                        e.this.F.setProgress((int) ((eVar2.f8403z.I() / e.this.K) * num.intValue()));
                    }
                }

                @Override // com.applovin.impl.adview.k.a
                public boolean b() {
                    return !e.this.M;
                }
            });
        } else {
            this.F = null;
        }
        aw awVarA = new aw.a(activity).a();
        this.f8403z = awVarA;
        b bVar = new b();
        awVarA.a((an.b) bVar);
        awVarA.c(0);
        com.applovin.exoplayer2.ui.g gVar = new com.applovin.exoplayer2.ui.g(activity);
        this.f8402y = gVar;
        gVar.b();
        gVar.setControllerVisibilityListener(bVar);
        gVar.setPlayer(awVarA);
        gVar.setOnTouchListener(new AppLovinTouchToClickListener(oVar, com.applovin.impl.sdk.c.b.f10348bb, activity, bVar));
        C();
    }

    private void I() {
        w wVar;
        com.applovin.impl.adview.u uVarD = this.f8350a.D();
        if (uVarD == null || !uVarD.e() || this.M || (wVar = this.E) == null) {
            return;
        }
        final boolean z10 = wVar.getVisibility() == 4;
        final long jF = uVarD.f();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.8
            @Override // java.lang.Runnable
            public void run() {
                if (z10) {
                    com.applovin.impl.sdk.utils.x.a(e.this.E, jF, (Runnable) null);
                } else {
                    com.applovin.impl.sdk.utils.x.b(e.this.E, jF, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        this.O.a(this.f8358i);
        this.f8360k = SystemClock.elapsedRealtime();
    }

    private void a(ProgressBar progressBar, int i10, int i11) {
        progressBar.setMax(i11);
        progressBar.setPadding(0, 0, 0, 0);
        if (com.applovin.impl.sdk.utils.h.d()) {
            progressBar.setProgressTintList(ColorStateList.valueOf(i10));
        }
    }

    private static boolean a(boolean z10, o oVar) {
        if (!((Boolean) oVar.a(com.applovin.impl.sdk.c.b.cN)).booleanValue()) {
            return false;
        }
        if (!((Boolean) oVar.a(com.applovin.impl.sdk.c.b.cO)).booleanValue() || z10) {
            return true;
        }
        return ((Boolean) oVar.a(com.applovin.impl.sdk.c.b.cQ)).booleanValue();
    }

    public void A() {
        boolean z10 = !this.J;
        this.J = z10;
        this.f8403z.a(!z10 ? 1 : 0);
        d(this.J);
        a(this.J, 0L);
    }

    public void B() {
        F();
        final long jW = this.f8350a.W();
        if (jW > 0) {
            this.f8361l = 0L;
            final Long l10 = (Long) this.f8351b.a(com.applovin.impl.sdk.c.b.df);
            final Integer num = (Integer) this.f8351b.a(com.applovin.impl.sdk.c.b.di);
            ProgressBar progressBar = new ProgressBar(this.f8354e, null, R.attr.progressBarStyleHorizontal);
            this.G = progressBar;
            a(progressBar, this.f8350a.V(), num.intValue());
            this.I.a("POSTITIAL_PROGRESS_BAR", l10.longValue(), new k.a() { // from class: com.applovin.impl.adview.activity.b.e.2
                @Override // com.applovin.impl.adview.k.a
                public void a() {
                    e.this.G.setProgress((int) ((e.this.f8361l / jW) * num.intValue()));
                    e eVar = e.this;
                    eVar.f8361l = l10.longValue() + eVar.f8361l;
                }

                @Override // com.applovin.impl.adview.k.a
                public boolean b() {
                    return e.this.f8361l < jW;
                }
            });
            this.I.a();
        }
        this.O.a(this.f8357h, this.f8356g, this.f8355f, this.G);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("javascript:al_onPoststitialShow(");
        sb2.append(this.f8365p);
        sb2.append(",");
        a(android.support.v4.media.b.a(sb2, this.f8366q, ");"), this.f8350a.X());
        if (this.f8357h != null) {
            if (this.f8350a.t() >= 0) {
                a(this.f8357h, this.f8350a.t(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.3
                    @Override // java.lang.Runnable
                    public void run() {
                        e.this.f8360k = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f8357h.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        n nVar = this.f8357h;
        if (nVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(nVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        v vVar = this.f8356g;
        if (vVar != null && vVar.b()) {
            v vVar2 = this.f8356g;
            arrayList.add(new com.applovin.impl.sdk.a.d(vVar2, FriendlyObstructionPurpose.NOT_VISIBLE, vVar2.getIdentifier()));
        }
        ProgressBar progressBar2 = this.G;
        if (progressBar2 != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        this.f8350a.o().a(this.f8355f, arrayList);
        w();
        this.M = true;
    }

    public void C() {
        a(!this.S);
        Activity activity = this.f8354e;
        com.applovin.exoplayer2.h.u uVarA = new com.applovin.exoplayer2.h.u.a(new p(activity, ai.a((Context) activity, AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN))).a(ab.a(this.f8350a.h()));
        this.f8403z.a(!this.J ? 1 : 0);
        this.f8403z.a((com.applovin.exoplayer2.h.p) uVarA);
        this.f8403z.w();
        this.f8403z.a(false);
    }

    public void D() {
        if (this.V.compareAndSet(false, true)) {
            a(this.B, this.f8350a.r(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.7
                @Override // java.lang.Runnable
                public void run() {
                    e.this.W = -1L;
                    e.this.X = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    public boolean E() {
        return (this.f8364o || this.M || !this.f8402y.getPlayer().a()) ? false : true;
    }

    public void F() {
        this.L = H();
        this.f8403z.a(false);
    }

    public void G() {
        if (this.M) {
            if (y.a()) {
                this.f8352c.d("AppLovinFullscreenActivity", "Skip video resume - postitial shown");
                return;
            }
            return;
        }
        if (this.f8351b.U().isApplicationPaused()) {
            if (y.a()) {
                this.f8352c.d("AppLovinFullscreenActivity", "Skip video resume - app paused");
                return;
            }
            return;
        }
        long j10 = this.T;
        if (j10 < 0) {
            if (y.a()) {
                y yVar = this.f8352c;
                StringBuilder sbA = defpackage.a.a("Invalid last video position, isVideoPlaying=");
                sbA.append(this.f8403z.a());
                yVar.b("AppLovinFullscreenActivity", sbA.toString());
                return;
            }
            return;
        }
        if (y.a()) {
            y yVar2 = this.f8352c;
            StringBuilder sbA2 = i2.a.a("Resuming video at position ", j10, "ms for MediaPlayer: ");
            sbA2.append(this.f8403z);
            yVar2.b("AppLovinFullscreenActivity", sbA2.toString());
        }
        this.f8403z.a(true);
        this.H.a();
        this.T = -1L;
        if (this.f8403z.a()) {
            return;
        }
        y();
    }

    public int H() {
        aw awVar = this.f8403z;
        if (awVar == null) {
            return 0;
        }
        long jI = awVar.I();
        if (this.N) {
            return 100;
        }
        return jI > 0 ? (int) ((jI / this.K) * 100.0f) : this.L;
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
        if (y.a()) {
            this.f8352c.b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j10) {
        a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.9
            @Override // java.lang.Runnable
            public void run() {
                e.this.G();
            }
        }, j10);
    }

    public void a(PointF pointF, boolean z10) {
        if (!this.f8350a.E()) {
            I();
            return;
        }
        if (y.a()) {
            this.f8352c.b("AppLovinFullscreenActivity", "Clicking through video");
        }
        Uri uriK = this.f8350a.k();
        if (uriK != null) {
            AppLovinAdView appLovinAdView = this.f8355f;
            this.f8351b.v().trackAndLaunchVideoClick(this.f8350a, uriK, pointF, z10, this, appLovinAdView != null ? appLovinAdView.getContext() : o.au());
            com.applovin.impl.sdk.utils.o.a(this.f8369t, this.f8350a);
            this.f8353d.b();
            this.f8366q++;
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        this.O.a(this.D, this.B, this.E, this.A, this.F, this.C, this.f8402y, this.f8355f, this.f8356g, null, viewGroup);
        v vVar = this.f8356g;
        if (vVar != null) {
            vVar.a();
        }
        this.f8403z.a(true);
        if (this.f8350a.ar()) {
            this.f8372w.a(this.f8350a, new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.5
                @Override // java.lang.Runnable
                public void run() {
                    e.this.a(250L);
                }
            });
        }
        if (this.S) {
            y();
        }
        this.f8355f.renderAd(this.f8350a);
        this.f8353d.b(this.S ? 1L : 0L);
        if (this.B != null) {
            this.f8351b.G().a(new ac(this.f8351b, "scheduleSkipButton", new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.6
                @Override // java.lang.Runnable
                public void run() {
                    e.this.D();
                }
            }), r.b.MAIN, this.f8350a.s(), true);
        }
        super.b(this.J);
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
        if (y.a()) {
            this.f8352c.b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        c();
    }

    public void c() {
        this.W = SystemClock.elapsedRealtime() - this.X;
        if (y.a()) {
            this.f8352c.b("AppLovinFullscreenActivity", android.support.v4.media.session.e.a(defpackage.a.a("Skipping video with skip time: "), this.W, "ms"));
        }
        this.f8353d.f();
        this.f8365p++;
        if (this.f8350a.y()) {
            h();
        } else {
            B();
        }
    }

    public void c(long j10) {
        this.K = j10;
    }

    public void c(String str) {
        if (y.a()) {
            y yVar = this.f8352c;
            StringBuilder sbA = androidx.activity.result.c.a("Encountered media error: ", str, " for ad: ");
            sbA.append(this.f8350a);
            yVar.e("AppLovinFullscreenActivity", sbA.toString());
        }
        if (this.U.compareAndSet(false, true)) {
            AppLovinAdDisplayListener appLovinAdDisplayListener = this.f8370u;
            if (appLovinAdDisplayListener instanceof com.applovin.impl.sdk.ad.h) {
                ((com.applovin.impl.sdk.ad.h) appLovinAdDisplayListener).onAdDisplayFailed(str);
            }
            h();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void c(boolean z10) {
        super.c(z10);
        if (z10) {
            a(0L);
            if (this.M) {
                this.I.a();
                return;
            }
            return;
        }
        if (this.M) {
            this.I.c();
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    public void d(boolean z10) {
        if (com.applovin.impl.sdk.utils.h.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f8354e.getDrawable(z10 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.D.setScaleType(ImageView.ScaleType.FIT_XY);
                this.D.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri uriAJ = z10 ? this.f8350a.aJ() : this.f8350a.aK();
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.D.setImageURI(uriAJ);
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
        y yVar;
        String strA;
        if (y.a()) {
            this.f8352c.b("AppLovinFullscreenActivity", "Pausing video");
        }
        if (this.f8403z.a()) {
            this.T = this.f8403z.I();
            this.f8403z.a(false);
            this.H.c();
            if (!y.a()) {
                return;
            }
            yVar = this.f8352c;
            strA = android.support.v4.media.session.e.a(defpackage.a.a("Paused video at position "), this.T, "ms");
        } else {
            if (!y.a()) {
                return;
            }
            yVar = this.f8352c;
            strA = "Nothing to pause";
        }
        yVar.b("AppLovinFullscreenActivity", strA);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdExoPlayerPresenter";
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        this.H.b();
        this.I.b();
        this.Q.removeCallbacksAndMessages(null);
        this.R.removeCallbacksAndMessages(null);
        n();
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void k() {
        if (((Boolean) this.f8351b.a(com.applovin.impl.sdk.c.b.gH)).booleanValue()) {
            z.a(this.E);
            this.E = null;
        }
        this.f8403z.E();
        if (this.S) {
            AppLovinCommunicator.getInstance(this.f8354e).unsubscribe(this, "video_caching_failed");
        }
        super.k();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void n() {
        super.a(H(), this.S, s(), this.W);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j10 = messageData.getLong("ad_id");
            if (((Boolean) this.f8351b.a(com.applovin.impl.sdk.c.b.go)).booleanValue() && j10 == this.f8350a.getAdIdNumber() && this.S) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i10 >= 200 && i10 < 300) || this.N || this.f8403z.a()) {
                    return;
                }
                c("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean s() {
        return this.f8350a != null && H() >= this.f8350a.T();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean t() {
        return u() && !s();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void v() {
        long jAj;
        long millis;
        if (this.f8350a.ai() >= 0 || this.f8350a.aj() >= 0) {
            if (this.f8350a.ai() >= 0) {
                jAj = this.f8350a.ai();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.f8350a;
                long j10 = this.K;
                long j11 = j10 > 0 ? 0 + j10 : 0L;
                if (aVar.ak()) {
                    int iL = (int) ((com.applovin.impl.sdk.ad.a) this.f8350a).l();
                    if (iL > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iL);
                    } else {
                        int iT = (int) aVar.t();
                        if (iT > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iT);
                        }
                    }
                    j11 += millis;
                }
                jAj = (long) ((((double) this.f8350a.aj()) / 100.0d) * j11);
            }
            b(jAj);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void x() {
        super.x();
        this.O.a(this.E);
        this.O.a((View) this.B);
        if (!u() || this.M) {
            J();
        }
    }

    public void y() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.10
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.adview.a aVar = e.this.A;
                if (aVar != null) {
                    aVar.a();
                }
            }
        });
    }

    public void z() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.e.11
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.adview.a aVar = e.this.A;
                if (aVar != null) {
                    aVar.b();
                }
            }
        });
    }
}
