package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.n;
import com.applovin.impl.adview.p;
import com.applovin.impl.adview.q;
import com.applovin.impl.adview.v;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.e.ac;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.s;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.utils.x;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements AppLovinBroadcastManager.Receiver, com.applovin.impl.sdk.b.b.a {
    private final j.a A;
    private long D;
    private boolean E;
    private final k H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.sdk.ad.e f8350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f8351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f8352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.applovin.impl.sdk.d.d f8353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Activity f8354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AppLovinAdView f8355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v f8356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f8357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f8358i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f8361l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8362m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8363n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8364o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8368s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AppLovinAdClickListener f8369t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AppLovinAdDisplayListener f8370u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AppLovinAdVideoPlaybackListener f8371v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.applovin.impl.sdk.b.b f8372w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public t f8373x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final com.applovin.impl.sdk.utils.a f8375z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Handler f8374y = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f8359j = SystemClock.elapsedRealtime();
    private final AtomicBoolean B = new AtomicBoolean();
    private final AtomicBoolean C = new AtomicBoolean();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f8360k = -1;
    private int F = 0;
    private final ArrayList<Long> G = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8365p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8366q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8367r = j.f10703a;
    private boolean I = false;

    /* JADX INFO: renamed from: com.applovin.impl.adview.activity.b.a$6, reason: invalid class name */
    public class AnonymousClass6 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n f8383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f8384b;

        public AnonymousClass6(n nVar, Runnable runnable) {
            this.f8383a = nVar;
            this.f8384b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.6.1
                @Override // java.lang.Runnable
                public void run() {
                    x.a(AnonymousClass6.this.f8383a, 400L, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.6.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass6.this.f8383a.bringToFront();
                            AnonymousClass6.this.f8384b.run();
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.adview.activity.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0110a {
        void a(a aVar);

        void a(String str, Throwable th);
    }

    public class b implements View.OnClickListener, AppLovinAdClickListener {
        private b() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            y yVar = a.this.f8352c;
            if (y.a()) {
                a.this.f8352c.b("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            com.applovin.impl.sdk.utils.o.a(a.this.f8369t, appLovinAd);
            a.this.f8353d.b();
            a.this.f8366q++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (view != aVar.f8357h || !((Boolean) aVar.f8351b.a(com.applovin.impl.sdk.c.b.cL)).booleanValue()) {
                y yVar = a.this.f8352c;
                if (y.a()) {
                    a.this.f8352c.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            a.b(a.this);
            if (a.this.f8350a.aa()) {
                a aVar2 = a.this;
                StringBuilder sbA = defpackage.a.a("javascript:al_onCloseButtonTapped(");
                sbA.append(a.this.F);
                sbA.append(",");
                sbA.append(a.this.f8365p);
                sbA.append(",");
                sbA.append(a.this.f8366q);
                sbA.append(");");
                aVar2.b(sbA.toString());
            }
            List<Integer> listU = a.this.f8350a.u();
            y yVar2 = a.this.f8352c;
            if (y.a()) {
                y yVar3 = a.this.f8352c;
                StringBuilder sbA2 = defpackage.a.a("Handling close button tap ");
                sbA2.append(a.this.F);
                sbA2.append(" with multi close delay: ");
                sbA2.append(listU);
                yVar3.b("AppLovinFullscreenActivity", sbA2.toString());
            }
            if (listU == null || listU.size() <= a.this.F) {
                a.this.h();
                return;
            }
            a.this.G.add(Long.valueOf(SystemClock.elapsedRealtime() - a.this.f8360k));
            List<com.applovin.impl.adview.j.a> listW = a.this.f8350a.w();
            if (listW != null && listW.size() > a.this.F) {
                a aVar3 = a.this;
                aVar3.f8357h.a(listW.get(aVar3.F));
            }
            y yVar4 = a.this.f8352c;
            if (y.a()) {
                y yVar5 = a.this.f8352c;
                StringBuilder sbA3 = defpackage.a.a("Scheduling next close button with delay: ");
                sbA3.append(listU.get(a.this.F));
                yVar5.b("AppLovinFullscreenActivity", sbA3.toString());
            }
            a.this.f8357h.setVisibility(8);
            a aVar4 = a.this;
            aVar4.a(aVar4.f8357h, listU.get(aVar4.F).intValue(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f8360k = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    public a(com.applovin.impl.sdk.ad.e eVar, Activity activity, Map<String, Object> map, o oVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f8350a = eVar;
        this.f8351b = oVar;
        this.f8352c = oVar.F();
        this.f8354e = activity;
        this.f8369t = appLovinAdClickListener;
        this.f8370u = appLovinAdDisplayListener;
        this.f8371v = appLovinAdVideoPlaybackListener;
        com.applovin.impl.sdk.b.b bVar = new com.applovin.impl.sdk.b.b(activity, oVar);
        this.f8372w = bVar;
        bVar.a(this);
        com.applovin.impl.sdk.d.d dVar = new com.applovin.impl.sdk.d.d(eVar, oVar);
        this.f8353d = dVar;
        this.H = new k(oVar);
        b bVar2 = new b();
        if (((Boolean) oVar.a(com.applovin.impl.sdk.c.b.f10361dd)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        com.applovin.impl.adview.o oVar2 = new com.applovin.impl.adview.o(oVar.aA(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f8355f = oVar2;
        oVar2.setAdClickListener(bVar2);
        this.f8355f.setAdDisplayListener(new AppLovinAdDisplayListener() { // from class: com.applovin.impl.adview.activity.b.a.1
            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adDisplayed(AppLovinAd appLovinAd) {
                y yVar = a.this.f8352c;
                if (y.a()) {
                    a.this.f8352c.b("AppLovinFullscreenActivity", "Web content rendered");
                }
            }

            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adHidden(AppLovinAd appLovinAd) {
                y yVar = a.this.f8352c;
                if (y.a()) {
                    a.this.f8352c.b("AppLovinFullscreenActivity", "Closing from WebView");
                }
                a.this.h();
            }
        });
        this.f8355f.getController().a(dVar);
        if (((Boolean) oVar.a(com.applovin.impl.sdk.c.b.ay)).booleanValue()) {
            this.f8356g = new v(new p(map, oVar), activity);
        }
        oVar.v().trackImpression(eVar);
        List<Integer> listU = eVar.u();
        if (eVar.t() >= 0 || listU != null) {
            n nVar = new n(eVar.v(), activity);
            this.f8357h = nVar;
            nVar.setVisibility(8);
            nVar.setOnClickListener(bVar2);
        } else {
            this.f8357h = null;
        }
        n nVar2 = new n(com.applovin.impl.adview.j.a.WHITE_ON_TRANSPARENT, activity);
        this.f8358i = nVar2;
        nVar2.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.activity.b.a.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                a.this.h();
            }
        });
        if (eVar.aq()) {
            this.A = new j.a() { // from class: com.applovin.impl.adview.activity.b.a.3
                @Override // com.applovin.impl.sdk.j.a
                public void a(int i10) {
                    String str;
                    a aVar = a.this;
                    if (aVar.f8367r != j.f10703a) {
                        aVar.f8368s = true;
                    }
                    com.applovin.impl.adview.d dVarS = aVar.f8355f.getController().s();
                    if (!j.a(i10) || j.a(a.this.f8367r)) {
                        str = i10 == 2 ? "javascript:al_muteSwitchOff();" : "javascript:al_muteSwitchOn();";
                        a.this.f8367r = i10;
                    }
                    dVarS.a(str);
                    a.this.f8367r = i10;
                }
            };
        } else {
            this.A = null;
        }
        if (((Boolean) oVar.a(com.applovin.impl.sdk.c.b.f10376gd)).booleanValue()) {
            this.f8375z = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.adview.activity.b.a.4
                @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity2, Bundle bundle) {
                    if (a.this.C.get()) {
                        return;
                    }
                    if (activity2.getClass().getName().equals(w.b(activity2.getApplicationContext()))) {
                        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                y.j("AppLovinFullscreenActivity", "Dismissing on-screen ad due to app relaunched via launcher.");
                                try {
                                    a.this.h();
                                } catch (Throwable th) {
                                    y.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
                                    try {
                                        a.this.o();
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        });
                    }
                }
            };
        } else {
            this.f8375z = null;
        }
    }

    public static void a(com.applovin.impl.sdk.ad.e eVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map<String, Object> map, o oVar, Activity activity, InterfaceC0110a interfaceC0110a) {
        a bVar;
        boolean zAO = eVar.aO();
        if (eVar instanceof com.applovin.impl.c.a) {
            if (zAO) {
                try {
                    bVar = new c(eVar, activity, map, oVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th) {
                    oVar.F();
                    if (y.a()) {
                        oVar.F().a("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th);
                    }
                    try {
                        bVar = new d(eVar, activity, map, oVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (Throwable th2) {
                        interfaceC0110a.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + oVar + " and throwable: " + th2.getMessage(), th2);
                        return;
                    }
                }
            } else {
                try {
                    bVar = new d(eVar, activity, map, oVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th3) {
                    interfaceC0110a.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + oVar + " and throwable: " + th3.getMessage(), th3);
                    return;
                }
            }
        } else if (!eVar.hasVideoUrl()) {
            try {
                bVar = new com.applovin.impl.adview.activity.b.b(eVar, activity, map, oVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th4) {
                interfaceC0110a.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + oVar + " and throwable: " + th4.getMessage(), th4);
                return;
            }
        } else if (eVar.aR()) {
            try {
                bVar = new g(eVar, activity, map, oVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th5) {
                interfaceC0110a.a("Failed to create FullscreenWebVideoAdPresenter with sdk: " + oVar + " and throwable: " + th5.getMessage(), th5);
                return;
            }
        } else if (zAO) {
            try {
                bVar = new e(eVar, activity, map, oVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th6) {
                oVar.F();
                if (y.a()) {
                    oVar.F().a("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th6);
                }
                try {
                    bVar = new f(eVar, activity, map, oVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th7) {
                    interfaceC0110a.a("Failed to create FullscreenVideoAdExoPlayerPresenter with sdk: " + oVar + " and throwable: " + th7.getMessage(), th7);
                    return;
                }
            }
        } else {
            try {
                bVar = new f(eVar, activity, map, oVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th8) {
                interfaceC0110a.a("Failed to create FullscreenVideoAdPresenter with sdk: " + oVar + " and throwable: " + th8.getMessage(), th8);
                return;
            }
        }
        bVar.c();
        interfaceC0110a.a(bVar);
    }

    public static /* synthetic */ int b(a aVar) {
        int i10 = aVar.F;
        aVar.F = i10 + 1;
        return i10;
    }

    private void c() {
        if (this.A != null) {
            this.f8351b.Z().a(this.A);
        }
        if (this.f8375z != null) {
            this.f8351b.E().a(this.f8375z);
        }
    }

    public void a(int i10, KeyEvent keyEvent) {
        if (this.f8352c == null || !y.a()) {
            return;
        }
        this.f8352c.c("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i10 + ", " + keyEvent);
    }

    public void a(int i10, boolean z10, boolean z11, long j10) {
        if (this.B.compareAndSet(false, true)) {
            if (this.f8350a.hasVideoUrl() || u()) {
                com.applovin.impl.sdk.utils.o.a(this.f8371v, this.f8350a, i10, z11);
            }
            if (this.f8350a.hasVideoUrl()) {
                this.f8353d.c(i10);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8359j;
            this.f8351b.v().trackVideoEnd(this.f8350a, TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime), i10, z10);
            long jElapsedRealtime2 = this.f8360k != -1 ? SystemClock.elapsedRealtime() - this.f8360k : -1L;
            this.f8351b.v().trackFullScreenAdClosed(this.f8350a, jElapsedRealtime2, this.G, j10, this.f8368s, this.f8367r);
            if (y.a()) {
                y yVar = this.f8352c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Video ad ended at percent: ");
                sb2.append(i10);
                sb2.append("%, elapsedTime: ");
                sb2.append(jElapsedRealtime);
                r.e.a(sb2, "ms, skipTimeMillis: ", j10, "ms, closeTimeMillis: ");
                yVar.b("AppLovinFullscreenActivity", android.support.v4.media.session.e.a(sb2, jElapsedRealtime2, "ms"));
            }
        }
    }

    public abstract void a(long j10);

    public void a(Configuration configuration) {
        if (y.a()) {
            this.f8352c.c("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public abstract void a(ViewGroup viewGroup);

    public void a(n nVar, long j10, Runnable runnable) {
        if (j10 >= ((Long) this.f8351b.a(com.applovin.impl.sdk.c.b.cK)).longValue()) {
            return;
        }
        this.f8351b.G().a(new ac(this.f8351b, "fadeInCloseButton", new AnonymousClass6(nVar, runnable)), r.b.MAIN, TimeUnit.SECONDS.toMillis(j10), true);
    }

    public void a(Runnable runnable, long j10) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j10, this.f8374y);
    }

    public void a(String str) {
        if (this.f8350a.ab()) {
            a(str, 0L);
        }
    }

    public void a(final String str, long j10) {
        if (j10 >= 0) {
            a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.5
                @Override // java.lang.Runnable
                public void run() {
                    AppLovinAdView appLovinAdView;
                    com.applovin.impl.adview.d dVarS;
                    if (!StringUtils.isValidString(str) || (appLovinAdView = a.this.f8355f) == null || (dVarS = appLovinAdView.getController().s()) == null) {
                        return;
                    }
                    dVarS.a(str);
                }
            }, j10);
        }
    }

    public void a(boolean z10) {
        List<Uri> listA = w.a(z10, this.f8350a, this.f8351b, this.f8354e);
        if (listA.isEmpty()) {
            return;
        }
        if (!((Boolean) this.f8351b.a(com.applovin.impl.sdk.c.b.gi)).booleanValue()) {
            if (y.a()) {
                this.f8352c.e("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + listA);
            }
            this.f8350a.a();
            return;
        }
        if (y.a()) {
            this.f8352c.e("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + listA);
        }
        q.a(this.f8350a, this.f8370u, "Missing ad resources", null, null);
        h();
    }

    public void a(boolean z10, long j10) {
        if (this.f8350a.Z()) {
            a(z10 ? "javascript:al_mute();" : "javascript:al_unmute();", j10);
        }
    }

    public void b(long j10) {
        if (y.a()) {
            y yVar = this.f8352c;
            StringBuilder sbA = defpackage.a.a("Scheduling report reward in ");
            sbA.append(TimeUnit.MILLISECONDS.toSeconds(j10));
            sbA.append(" seconds...");
            yVar.b("AppLovinFullscreenActivity", sbA.toString());
        }
        this.f8373x = t.a(j10, this.f8351b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.7
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f8350a.al().getAndSet(true)) {
                    return;
                }
                a aVar = a.this;
                a.this.f8351b.G().a(new com.applovin.impl.sdk.e.y(aVar.f8350a, aVar.f8351b), r.b.REWARD);
            }
        });
    }

    public void b(String str) {
        a(str, 0L);
    }

    public void b(boolean z10) {
        a(z10, ((Long) this.f8351b.a(com.applovin.impl.sdk.c.b.f10358da)).longValue());
        com.applovin.impl.sdk.utils.o.a(this.f8370u, this.f8350a);
        this.f8351b.V().a(this.f8350a);
        if (this.f8350a.hasVideoUrl() || u()) {
            com.applovin.impl.sdk.utils.o.a(this.f8371v, this.f8350a);
        }
        new com.applovin.impl.adview.activity.b(this.f8354e).a(this.f8350a);
        this.f8353d.a();
        this.f8350a.setHasShown(true);
    }

    public void c(boolean z10) {
        if (y.a()) {
            this.f8352c.c("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z10);
        }
        a("javascript:al_onWindowFocusChanged( " + z10 + " );");
    }

    public abstract void d();

    public abstract void e();

    public void f() {
        if (y.a()) {
            this.f8352c.c("AppLovinFullscreenActivity", "onResume()");
        }
        this.f8353d.d(SystemClock.elapsedRealtime() - this.D);
        a("javascript:al_onAppResumed();");
        r();
        if (this.f8372w.c()) {
            this.f8372w.a();
        }
    }

    public void g() {
        if (y.a()) {
            this.f8352c.c("AppLovinFullscreenActivity", "onPause()");
        }
        this.D = SystemClock.elapsedRealtime();
        a("javascript:al_onAppPaused();");
        if (this.f8372w.c()) {
            this.f8372w.a();
        }
        q();
    }

    public void h() {
        this.E = true;
        if (y.a()) {
            this.f8352c.c("AppLovinFullscreenActivity", "dismiss()");
        }
        com.applovin.impl.sdk.ad.e eVar = this.f8350a;
        if (eVar != null) {
            eVar.o().e();
        }
        this.f8374y.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.f8350a.Y());
        o();
        this.f8353d.c();
        this.H.a();
        if (this.A != null) {
            this.f8351b.Z().b(this.A);
        }
        if (this.f8375z != null) {
            this.f8351b.E().b(this.f8375z);
        }
        if (p()) {
            this.f8354e.finish();
            return;
        }
        this.f8351b.F();
        if (y.a()) {
            this.f8351b.F().b("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        k();
    }

    public boolean i() {
        return this.E;
    }

    public void j() {
        if (y.a()) {
            this.f8352c.c("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public void k() {
        AppLovinAdView appLovinAdView = this.f8355f;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f8355f.destroy();
            this.f8355f = null;
            if ((parent instanceof ViewGroup) && p()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        n();
        o();
        this.f8369t = null;
        this.f8370u = null;
        this.f8371v = null;
        this.f8354e = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void l() {
        if (y.a()) {
            this.f8352c.c("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.I) {
            h();
        }
        if (this.f8350a.aa()) {
            b("javascript:onBackPressed();");
        }
    }

    public int m() {
        int iH = this.f8350a.H();
        return (iH <= 0 && ((Boolean) this.f8351b.a(com.applovin.impl.sdk.c.b.cZ)).booleanValue()) ? this.f8363n + 1 : iH;
    }

    public abstract void n();

    public void o() {
        if (this.C.compareAndSet(false, true)) {
            com.applovin.impl.sdk.utils.o.b(this.f8370u, this.f8350a);
            this.f8351b.V().b(this.f8350a);
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        if (!"com.applovin.render_process_gone".equals(intent.getAction()) || this.f8362m) {
            return;
        }
        x();
    }

    public boolean p() {
        return this.f8354e instanceof AppLovinFullscreenActivity;
    }

    public void q() {
        t tVar = this.f8373x;
        if (tVar != null) {
            tVar.b();
        }
    }

    public void r() {
        t tVar = this.f8373x;
        if (tVar != null) {
            tVar.c();
        }
    }

    public abstract boolean s();

    public abstract boolean t();

    public boolean u() {
        return AppLovinAdType.INCENTIVIZED == this.f8350a.getType() || AppLovinAdType.AUTO_INCENTIVIZED == this.f8350a.getType();
    }

    public abstract void v();

    public void w() {
        com.applovin.impl.adview.d dVarS;
        if (this.f8355f == null || !this.f8350a.G() || (dVarS = this.f8355f.getController().s()) == null) {
            return;
        }
        this.H.a(dVarS, new k.a() { // from class: com.applovin.impl.adview.activity.b.a.8
            @Override // com.applovin.impl.sdk.k.a
            public void a(View view) {
                n nVar;
                a.this.f8351b.ag().a(s.a.BLACK_VIEW, CollectionUtils.map("clcode", a.this.f8350a.getClCode()));
                if (((Boolean) a.this.f8351b.a(com.applovin.impl.sdk.c.b.gA)).booleanValue()) {
                    a.this.h();
                    return;
                }
                a aVar = a.this;
                aVar.I = ((Boolean) aVar.f8351b.a(com.applovin.impl.sdk.c.b.gB)).booleanValue();
                if (!((Boolean) a.this.f8351b.a(com.applovin.impl.sdk.c.b.gC)).booleanValue() || (nVar = a.this.f8357h) == null) {
                    return;
                }
                nVar.setVisibility(0);
            }
        });
    }

    public void x() {
        if (y.a()) {
            this.f8352c.c("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f8362m = true;
    }
}
