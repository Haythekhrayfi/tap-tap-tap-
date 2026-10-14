package com.applovin.impl.adview.activity.b;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.applovin.impl.adview.n;
import com.applovin.impl.adview.v;
import com.applovin.impl.sdk.e.ac;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class g extends com.applovin.impl.adview.activity.b.a implements com.applovin.impl.adview.g {
    private final ImageView A;
    private final com.applovin.impl.adview.a B;
    private final boolean C;
    private double D;
    private double E;
    private final AtomicBoolean F;
    private final AtomicBoolean G;
    private boolean H;
    private long I;
    private long J;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final com.applovin.impl.adview.activity.a.d f8450y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final n f8451z;

    public class a implements View.OnClickListener {
        private a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == g.this.f8451z) {
                if (!g.this.t()) {
                    g.this.y();
                    return;
                } else {
                    g.this.q();
                    g.this.f8372w.b();
                    return;
                }
            }
            if (view == g.this.A) {
                g.this.A();
                return;
            }
            y yVar = g.this.f8352c;
            if (y.a()) {
                g.this.f8352c.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public g(com.applovin.impl.sdk.ad.e eVar, Activity activity, Map<String, Object> map, o oVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, map, oVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f8450y = new com.applovin.impl.adview.activity.a.d(this.f8350a, this.f8354e, this.f8351b);
        boolean zF = this.f8350a.f();
        this.C = zF;
        this.F = new AtomicBoolean();
        this.G = new AtomicBoolean();
        this.H = w.c(this.f8351b);
        this.I = -2L;
        this.J = 0L;
        a aVar = new a();
        if (eVar.r() >= 0) {
            n nVar = new n(eVar.x(), activity);
            this.f8451z = nVar;
            nVar.setVisibility(8);
            nVar.setOnClickListener(aVar);
        } else {
            this.f8451z = null;
        }
        if (a(this.H, oVar)) {
            ImageView imageView = new ImageView(activity);
            this.A = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(aVar);
            d(this.H);
        } else {
            this.A = null;
        }
        if (!zF) {
            this.B = null;
            return;
        }
        com.applovin.impl.adview.a aVar2 = new com.applovin.impl.adview.a(activity, ((Integer) oVar.a(com.applovin.impl.sdk.c.b.cY)).intValue(), R.attr.progressBarStyleLarge);
        this.B = aVar2;
        aVar2.setColor(Color.parseColor("#75FFFFFF"));
        aVar2.setBackgroundColor(Color.parseColor("#00000000"));
        aVar2.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        if (this.G.compareAndSet(false, true)) {
            a(this.f8451z, this.f8350a.r(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.3
                @Override // java.lang.Runnable
                public void run() {
                    g.this.I = -1L;
                    g.this.J = SystemClock.elapsedRealtime();
                }
            });
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
        if (h.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f8354e.getDrawable(z10 ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.A.setScaleType(ImageView.ScaleType.FIT_XY);
                this.A.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri uriAJ = z10 ? this.f8350a.aJ() : this.f8350a.aK();
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.A.setImageURI(uriAJ);
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    public void A() {
        this.H = !this.H;
        StringBuilder sbA = defpackage.a.a("javascript:al_setVideoMuted(");
        sbA.append(this.H);
        sbA.append(");");
        b(sbA.toString());
        d(this.H);
        a(this.H, 0L);
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
        if (y.a()) {
            this.f8352c.b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    @Override // com.applovin.impl.adview.g
    public void a(double d10) {
        StringBuilder sbA = defpackage.a.a("javascript:al_setVideoMuted(");
        sbA.append(this.H);
        sbA.append(");");
        b(sbA.toString());
        com.applovin.impl.adview.a aVar = this.B;
        if (aVar != null) {
            aVar.b();
        }
        if (this.f8451z != null) {
            B();
        }
        this.f8355f.getController().m();
        this.E = d10;
        v();
        if (this.f8350a.ar()) {
            this.f8372w.a(this.f8350a, (Runnable) null);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j10) {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        this.f8450y.a(this.A, this.f8451z, this.f8357h, this.B, this.f8356g, this.f8355f, viewGroup);
        this.f8355f.getController().a(this);
        a(false);
        com.applovin.impl.adview.a aVar = this.B;
        if (aVar != null) {
            aVar.a();
        }
        v vVar = this.f8356g;
        if (vVar != null) {
            vVar.a();
        }
        this.f8355f.renderAd(this.f8350a);
        if (this.f8451z != null) {
            this.f8351b.G().a(new ac(this.f8351b, "scheduleSkipButton", new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.1
                @Override // java.lang.Runnable
                public void run() {
                    g.this.B();
                }
            }), r.b.MAIN, this.f8350a.s(), true);
        }
        this.f8351b.G().a(new ac(this.f8351b, "updateMainViewOM", new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.2
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                n nVar = g.this.f8357h;
                if (nVar != null) {
                    arrayList.add(new com.applovin.impl.sdk.a.d(nVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
                }
                v vVar2 = g.this.f8356g;
                if (vVar2 != null && vVar2.b()) {
                    v vVar3 = g.this.f8356g;
                    arrayList.add(new com.applovin.impl.sdk.a.d(vVar3, FriendlyObstructionPurpose.NOT_VISIBLE, vVar3.getIdentifier()));
                }
                g.this.f8350a.o().a(g.this.f8355f, arrayList);
            }
        }), r.b.MAIN, 500L);
        super.b(this.H);
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
        if (y.a()) {
            this.f8352c.b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        y();
    }

    @Override // com.applovin.impl.adview.g
    public void b(double d10) {
        this.D = d10;
    }

    @Override // com.applovin.impl.adview.g
    public void c() {
        com.applovin.impl.adview.a aVar = this.B;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
    }

    @Override // com.applovin.impl.adview.g
    public void g_() {
        z();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        n();
        super.h();
    }

    @Override // com.applovin.impl.adview.g
    public void h_() {
        com.applovin.impl.adview.a aVar = this.B;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void n() {
        super.a((int) this.D, this.C, s(), this.I);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean s() {
        return this.D >= ((double) this.f8350a.T());
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
                double d10 = this.E;
                long millis2 = d10 > 0.0d ? 0 + TimeUnit.SECONDS.toMillis((long) d10) : 0L;
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
                    millis2 += millis;
                }
                jAj = (long) ((((double) this.f8350a.aj()) / 100.0d) * millis2);
            }
            b(jAj);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void x() {
        super.x();
        this.f8450y.a(this.f8358i);
        this.f8360k = SystemClock.elapsedRealtime();
        this.D = 100.0d;
    }

    public void y() {
        this.I = SystemClock.elapsedRealtime() - this.J;
        if (y.a()) {
            this.f8352c.b("AppLovinFullscreenActivity", android.support.v4.media.session.e.a(defpackage.a.a("Skipping video with skip time: "), this.I, "ms"));
        }
        this.f8353d.f();
        this.f8365p++;
        if (this.f8350a.y()) {
            h();
        } else {
            z();
        }
    }

    public void z() {
        if (this.F.compareAndSet(false, true)) {
            if (y.a()) {
                this.f8352c.b("AppLovinFullscreenActivity", "Showing postitial...");
            }
            b("javascript:al_showPostitial();");
            n nVar = this.f8451z;
            if (nVar != null) {
                nVar.setVisibility(8);
            }
            ImageView imageView = this.A;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            com.applovin.impl.adview.a aVar = this.B;
            if (aVar != null) {
                aVar.b();
            }
            if (this.f8357h != null) {
                if (this.f8350a.t() >= 0) {
                    a(this.f8357h, this.f8350a.t(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.4
                        @Override // java.lang.Runnable
                        public void run() {
                            g.this.f8360k = SystemClock.elapsedRealtime();
                        }
                    });
                } else {
                    this.f8357h.setVisibility(0);
                }
            }
            this.f8355f.getController().n();
            w();
        }
    }
}
