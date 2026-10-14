package com.applovin.impl.adview.activity.b;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
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
import com.applovin.adview.AppLovinAdView;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.adview.h;
import com.applovin.impl.adview.k;
import com.applovin.impl.adview.n;
import com.applovin.impl.adview.v;
import com.applovin.impl.adview.w;
import com.applovin.impl.adview.x;
import com.applovin.impl.sdk.e.ac;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.u;
import com.applovin.impl.sdk.utils.z;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class f extends com.applovin.impl.adview.activity.b.a implements AppLovinCommunicatorSubscriber {
    public final n A;
    public h B;
    public final ImageView C;
    public w D;
    public final ProgressBar E;
    public ProgressBar F;
    public ImageView G;
    public final k H;
    public final k I;
    public boolean J;
    public long K;
    public boolean L;
    private final com.applovin.impl.adview.activity.a.c M;
    private MediaPlayer N;
    private final b O;
    private final a P;
    private final Handler Q;
    private final Handler R;
    private final boolean S;
    private int T;
    private int U;
    private boolean V;
    private final AtomicBoolean W;
    private final AtomicBoolean X;
    private long Y;
    private long Z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AppLovinVideoView f8425y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final com.applovin.impl.adview.a f8426z;

    public class a implements x.a {
        private a() {
        }

        @Override // com.applovin.impl.adview.x.a
        public void a(Uri uri, w wVar) {
            y yVar = f.this.f8352c;
            if (y.a()) {
                f.this.f8352c.b("AppLovinFullscreenActivity", "Attempting to load a url from video button...");
            }
            u.a(uri, f.this.f8355f.getController(), f.this.f8351b);
        }

        @Override // com.applovin.impl.adview.x.a
        public void a(w wVar) {
            y yVar = f.this.f8352c;
            if (y.a()) {
                f.this.f8352c.b("AppLovinFullscreenActivity", "Clicking through from video button...");
            }
            f.this.a(wVar.getAndClearLastClickLocation(), false);
        }

        @Override // com.applovin.impl.adview.x.a
        public void b(w wVar) {
            y yVar = f.this.f8352c;
            if (y.a()) {
                f.this.f8352c.b("AppLovinFullscreenActivity", "Closing ad from video button...");
            }
            f.this.h();
        }

        @Override // com.applovin.impl.adview.x.a
        public void c(w wVar) {
            y yVar = f.this.f8352c;
            if (y.a()) {
                f.this.f8352c.b("AppLovinFullscreenActivity", "Skipping video from video button...");
            }
            f.this.c();
        }

        @Override // com.applovin.impl.adview.x.a
        public void d(w wVar) {
            y yVar = f.this.f8352c;
            if (y.a()) {
                f.this.f8352c.b("AppLovinFullscreenActivity", "Attempting to install app from video button...");
            }
            f.this.a(wVar.getAndClearLastClickLocation(), true);
        }
    }

    public class b implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, AppLovinTouchToClickListener.OnClickListener {
        private b() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, PointF pointF) {
            f.this.a(pointF, false);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            y yVar = f.this.f8352c;
            if (y.a()) {
                f.this.f8352c.b("AppLovinFullscreenActivity", "Video completed");
            }
            f.this.V = true;
            f fVar = f.this;
            if (!fVar.f8362m) {
                fVar.B();
            } else if (fVar.u()) {
                f.this.H();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            f.this.c(j1.e.a("Video view error (", i10, ",", i11, ")"));
            f.this.f8425y.start();
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            y yVar = f.this.f8352c;
            if (y.a()) {
                f.this.f8352c.b("AppLovinFullscreenActivity", j1.e.a("MediaPlayer Info: (", i10, ", ", i11, ")"));
            }
            if (i10 == 701) {
                f.this.y();
                f.this.f8353d.g();
                return false;
            }
            if (i10 != 3) {
                if (i10 != 702) {
                    return false;
                }
                f.this.z();
                return false;
            }
            f.this.H.a();
            f fVar = f.this;
            if (fVar.A != null) {
                fVar.E();
            }
            f.this.z();
            if (!f.this.f8372w.c()) {
                return false;
            }
            f.this.e();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            f.this.N = mediaPlayer;
            mediaPlayer.setOnInfoListener(f.this.O);
            mediaPlayer.setOnErrorListener(f.this.O);
            float f10 = !f.this.J ? 1 : 0;
            mediaPlayer.setVolume(f10, f10);
            f.this.f8363n = (int) TimeUnit.MILLISECONDS.toSeconds(mediaPlayer.getDuration());
            f.this.c(mediaPlayer.getDuration());
            f.this.v();
            y yVar = f.this.f8352c;
            if (y.a()) {
                y yVar2 = f.this.f8352c;
                StringBuilder sbA = defpackage.a.a("MediaPlayer prepared: ");
                sbA.append(f.this.N);
                yVar2.b("AppLovinFullscreenActivity", sbA.toString());
            }
        }
    }

    public class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f fVar = f.this;
            if (view == fVar.A) {
                if (!fVar.t()) {
                    f.this.c();
                    return;
                }
                f.this.e();
                f.this.q();
                f.this.f8372w.b();
                return;
            }
            if (view == fVar.C) {
                fVar.A();
                return;
            }
            y yVar = fVar.f8352c;
            if (y.a()) {
                f.this.f8352c.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public f(com.applovin.impl.sdk.ad.e eVar, Activity activity, Map<String, Object> map, o oVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, map, oVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.M = new com.applovin.impl.adview.activity.a.c(this.f8350a, this.f8354e, this.f8351b);
        this.G = null;
        b bVar = new b();
        this.O = bVar;
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
        this.U = -1;
        this.W = new AtomicBoolean();
        this.X = new AtomicBoolean();
        this.Y = -2L;
        this.Z = 0L;
        if (!eVar.hasVideoUrl()) {
            throw new IllegalStateException("Attempting to use fullscreen video ad presenter for non-video ad");
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(activity);
        this.f8425y = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(bVar);
        appLovinVideoView.setOnCompletionListener(bVar);
        appLovinVideoView.setOnErrorListener(bVar);
        appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(oVar, com.applovin.impl.sdk.c.b.f10348bb, activity, bVar));
        c cVar = new c();
        if (eVar.r() >= 0) {
            n nVar = new n(eVar.x(), activity);
            this.A = nVar;
            nVar.setVisibility(8);
            nVar.setOnClickListener(cVar);
        } else {
            this.A = null;
        }
        if (a(this.J, oVar)) {
            ImageView imageView = new ImageView(activity);
            this.C = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(cVar);
            e(this.J);
        } else {
            this.C = null;
        }
        String strC = eVar.C();
        if (StringUtils.isValidString(strC)) {
            x xVar = new x(oVar);
            xVar.a(new WeakReference<>(aVar));
            w wVar = new w(xVar, activity);
            this.D = wVar;
            wVar.a(strC);
        } else {
            this.D = null;
        }
        if (zF) {
            com.applovin.impl.adview.a aVar2 = new com.applovin.impl.adview.a(activity, ((Integer) oVar.a(com.applovin.impl.sdk.c.b.cY)).intValue(), R.attr.progressBarStyleLarge);
            this.f8426z = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            aVar2.setBackgroundColor(Color.parseColor("#00000000"));
            aVar2.setVisibility(8);
            AppLovinCommunicator.getInstance(activity).subscribe(this, "video_caching_failed");
        } else {
            this.f8426z = null;
        }
        final int iM = m();
        boolean z10 = ((Boolean) oVar.a(com.applovin.impl.sdk.c.b.cI)).booleanValue() && iM > 0;
        if (this.B == null && z10) {
            this.B = new h(activity);
            int I = eVar.I();
            this.B.setTextColor(I);
            this.B.setTextSize(((Integer) oVar.a(com.applovin.impl.sdk.c.b.cH)).intValue());
            this.B.setFinishedStrokeColor(I);
            this.B.setFinishedStrokeWidth(((Integer) oVar.a(com.applovin.impl.sdk.c.b.cG)).intValue());
            this.B.setMax(iM);
            this.B.setProgress(iM);
            kVar.a("COUNTDOWN_CLOCK", TimeUnit.SECONDS.toMillis(1L), new k.a() { // from class: com.applovin.impl.adview.activity.b.f.1
                @Override // com.applovin.impl.adview.k.a
                public void a() {
                    f fVar = f.this;
                    if (fVar.B != null) {
                        long seconds = ((long) iM) - TimeUnit.MILLISECONDS.toSeconds(fVar.f8425y.getCurrentPosition());
                        if (seconds <= 0) {
                            f.this.f8364o = true;
                        } else if (f.this.C()) {
                            f.this.B.setProgress((int) seconds);
                        }
                    }
                }

                @Override // com.applovin.impl.adview.k.a
                public boolean b() {
                    return f.this.C();
                }
            });
        }
        if (!eVar.R()) {
            this.E = null;
            return;
        }
        Long l10 = (Long) oVar.a(com.applovin.impl.sdk.c.b.cV);
        final Integer num = (Integer) oVar.a(com.applovin.impl.sdk.c.b.cW);
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
        this.E = progressBar;
        a(progressBar, eVar.S(), num.intValue());
        kVar.a("PROGRESS_BAR", l10.longValue(), new k.a() { // from class: com.applovin.impl.adview.activity.b.f.5
            @Override // com.applovin.impl.adview.k.a
            public void a() {
                f fVar = f.this;
                if (fVar.L) {
                    fVar.E.setVisibility(8);
                } else {
                    f.this.E.setProgress((int) ((fVar.f8425y.getCurrentPosition() / f.this.K) * num.intValue()));
                }
            }

            @Override // com.applovin.impl.adview.k.a
            public boolean b() {
                return !f.this.L;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        if (this.X.compareAndSet(false, true)) {
            a(this.A, this.f8350a.r(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.8
                @Override // java.lang.Runnable
                public void run() {
                    f.this.Y = -1L;
                    f.this.Z = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    private void F() {
        w wVar;
        com.applovin.impl.adview.u uVarD = this.f8350a.D();
        if (uVarD == null || !uVarD.e() || this.L || (wVar = this.D) == null) {
            return;
        }
        final boolean z10 = wVar.getVisibility() == 4;
        final long jF = uVarD.f();
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.9
            @Override // java.lang.Runnable
            public void run() {
                if (z10) {
                    com.applovin.impl.sdk.utils.x.a(f.this.D, jF, (Runnable) null);
                } else {
                    com.applovin.impl.sdk.utils.x.b(f.this.D, jF, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        if (this.L) {
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
        if (this.U < 0) {
            if (y.a()) {
                this.f8352c.b("AppLovinFullscreenActivity", "Invalid last video position");
                return;
            }
            return;
        }
        if (y.a()) {
            y yVar = this.f8352c;
            StringBuilder sbA = defpackage.a.a("Resuming video at position ");
            sbA.append(this.U);
            sbA.append("ms for MediaPlayer: ");
            sbA.append(this.N);
            yVar.b("AppLovinFullscreenActivity", sbA.toString());
        }
        this.f8425y.seekTo(this.U);
        this.f8425y.start();
        this.H.a();
        this.U = -1;
        a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.11
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.adview.a aVar = f.this.f8426z;
                if (aVar != null) {
                    aVar.a();
                    f.this.a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.11.1
                        @Override // java.lang.Runnable
                        public void run() {
                            f.this.f8426z.b();
                        }
                    }, 2000L);
                }
            }
        }, 250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.M.a(this.f8358i);
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

    private void d(boolean z10) {
        this.T = D();
        if (z10) {
            this.f8425y.pause();
        } else {
            this.f8425y.stopPlayback();
        }
    }

    private void e(boolean z10) {
        if (com.applovin.impl.sdk.utils.h.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f8354e.getDrawable(z10 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.C.setScaleType(ImageView.ScaleType.FIT_XY);
                this.C.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri uriAJ = z10 ? this.f8350a.aJ() : this.f8350a.aK();
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.C.setImageURI(uriAJ);
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    public void A() {
        MediaPlayer mediaPlayer = this.N;
        if (mediaPlayer == null) {
            return;
        }
        try {
            float f10 = !this.J ? 0 : 1;
            mediaPlayer.setVolume(f10, f10);
            boolean z10 = this.J ? false : true;
            this.J = z10;
            e(z10);
            a(this.J, 0L);
        } catch (Throwable unused) {
        }
    }

    public void B() {
        if (y.a()) {
            this.f8352c.b("AppLovinFullscreenActivity", "Showing postitial...");
        }
        d(this.f8350a.aQ());
        final long jW = this.f8350a.W();
        if (jW > 0) {
            this.f8361l = 0L;
            final Long l10 = (Long) this.f8351b.a(com.applovin.impl.sdk.c.b.df);
            final Integer num = (Integer) this.f8351b.a(com.applovin.impl.sdk.c.b.di);
            ProgressBar progressBar = new ProgressBar(this.f8354e, null, R.attr.progressBarStyleHorizontal);
            this.F = progressBar;
            a(progressBar, this.f8350a.V(), num.intValue());
            this.I.a("POSTITIAL_PROGRESS_BAR", l10.longValue(), new k.a() { // from class: com.applovin.impl.adview.activity.b.f.3
                @Override // com.applovin.impl.adview.k.a
                public void a() {
                    f.this.F.setProgress((int) ((f.this.f8361l / jW) * num.intValue()));
                    f fVar = f.this;
                    fVar.f8361l = l10.longValue() + fVar.f8361l;
                }

                @Override // com.applovin.impl.adview.k.a
                public boolean b() {
                    return f.this.f8361l < jW;
                }
            });
            this.I.a();
        }
        this.M.a(this.f8357h, this.f8356g, this.f8355f, this.F);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("javascript:al_onPoststitialShow(");
        sb2.append(this.f8365p);
        sb2.append(",");
        a(android.support.v4.media.b.a(sb2, this.f8366q, ");"), this.f8350a.X());
        if (this.f8357h != null) {
            if (this.f8350a.t() >= 0) {
                a(this.f8357h, this.f8350a.t(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.4
                    @Override // java.lang.Runnable
                    public void run() {
                        f.this.f8360k = SystemClock.elapsedRealtime();
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
        ProgressBar progressBar2 = this.F;
        if (progressBar2 != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        this.f8350a.o().a(this.f8355f, arrayList);
        w();
        this.L = true;
    }

    public boolean C() {
        return (this.f8364o || this.L || !this.f8425y.isPlaying()) ? false : true;
    }

    public int D() {
        long currentPosition = this.f8425y.getCurrentPosition();
        if (this.V) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.K) * 100.0f) : this.T;
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
        if (y.a()) {
            this.f8352c.b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j10) {
        a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.10
            @Override // java.lang.Runnable
            public void run() {
                f.this.G();
            }
        }, j10);
    }

    public void a(PointF pointF, boolean z10) {
        if (!this.f8350a.E()) {
            F();
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
        String str;
        this.M.a(this.C, this.A, this.D, this.f8426z, this.E, this.B, this.f8425y, this.f8355f, this.f8356g, this.G, viewGroup);
        if (com.applovin.impl.sdk.utils.h.g() && (str = this.f8351b.ay().getExtraParameters().get(AppLovinSdkExtraParameterKey.AUDIO_FOCUS_REQUEST)) != null) {
            this.f8425y.setAudioFocusRequest(Integer.parseInt(str));
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        a(!this.S);
        this.f8425y.setVideoURI(this.f8350a.h());
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (this.f8350a.ar()) {
            this.f8372w.a(this.f8350a, new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.6
                @Override // java.lang.Runnable
                public void run() {
                    f.this.a(250L);
                }
            });
        }
        v vVar = this.f8356g;
        if (vVar != null) {
            vVar.a();
        }
        this.f8425y.start();
        if (this.S) {
            y();
        }
        this.f8355f.renderAd(this.f8350a);
        this.f8353d.b(this.S ? 1L : 0L);
        if (this.A != null) {
            this.f8351b.G().a(new ac(this.f8351b, "scheduleSkipButton", new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.7
                @Override // java.lang.Runnable
                public void run() {
                    f.this.E();
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
        this.Y = SystemClock.elapsedRealtime() - this.Z;
        if (y.a()) {
            this.f8352c.b("AppLovinFullscreenActivity", android.support.v4.media.session.e.a(defpackage.a.a("Skipping video with skip time: "), this.Y, "ms"));
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
        if (this.W.compareAndSet(false, true)) {
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
            if (this.L) {
                this.I.a();
                return;
            }
            return;
        }
        if (this.L) {
            this.I.c();
        } else {
            e();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
        if (y.a()) {
            this.f8352c.b("AppLovinFullscreenActivity", "Pausing video");
        }
        this.U = this.f8425y.getCurrentPosition();
        this.f8425y.pause();
        this.H.c();
        if (y.a()) {
            y yVar = this.f8352c;
            StringBuilder sbA = defpackage.a.a("Paused video at position ");
            sbA.append(this.U);
            sbA.append("ms");
            yVar.b("AppLovinFullscreenActivity", sbA.toString());
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "FullscreenVideoAdPresenter";
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
    @SuppressLint({"LongLogTag"})
    public void k() {
        if (y.a()) {
            this.f8352c.c("AppLovinFullscreenActivity", "Destroying video components");
        }
        try {
            if (((Boolean) this.f8351b.a(com.applovin.impl.sdk.c.b.gH)).booleanValue()) {
                z.a(this.D);
                this.D = null;
            }
            if (this.S) {
                AppLovinCommunicator.getInstance(this.f8354e).unsubscribe(this, "video_caching_failed");
            }
            AppLovinVideoView appLovinVideoView = this.f8425y;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.f8425y.stopPlayback();
            }
            MediaPlayer mediaPlayer = this.N;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        } catch (Throwable th) {
            y.c("AppLovinFullscreenActivity", "Unable to destroy presenter", th);
        }
        super.k();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void n() {
        super.a(D(), this.S, s(), this.Y);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            long j10 = messageData.getLong("ad_id");
            if (((Boolean) this.f8351b.a(com.applovin.impl.sdk.c.b.go)).booleanValue() && j10 == this.f8350a.getAdIdNumber() && this.S) {
                int i10 = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && i10 >= 200 && i10 < 300) || this.V || this.f8425y.isPlaying()) {
                    return;
                }
                c("Video cache error during stream. ResponseCode=" + i10 + ", exception=" + string);
            }
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean s() {
        return D() >= this.f8350a.T();
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
        this.M.a(this.D);
        this.M.a((View) this.A);
        if (!u() || this.L) {
            H();
        }
    }

    public void y() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.12
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.adview.a aVar = f.this.f8426z;
                if (aVar != null) {
                    aVar.a();
                }
            }
        });
    }

    public void z() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.f.2
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.adview.a aVar = f.this.f8426z;
                if (aVar != null) {
                    aVar.b();
                }
            }
        });
    }
}
