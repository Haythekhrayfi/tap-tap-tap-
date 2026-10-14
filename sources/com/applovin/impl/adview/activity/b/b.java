package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.adview.n;
import com.applovin.impl.adview.v;
import com.applovin.impl.sdk.e.ac;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {
    private long A;
    private final AtomicBoolean B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final com.applovin.impl.adview.activity.a.b f8392y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.applovin.impl.sdk.utils.f f8393z;

    public b(com.applovin.impl.sdk.ad.e eVar, Activity activity, Map<String, Object> map, o oVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, map, oVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f8392y = new com.applovin.impl.adview.activity.a.b(this.f8350a, this.f8354e, this.f8351b);
        this.B = new AtomicBoolean();
    }

    private long c() {
        com.applovin.impl.sdk.ad.e eVar = this.f8350a;
        if (!(eVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float fL = ((com.applovin.impl.sdk.ad.a) eVar).l();
        if (fL <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            fL = this.f8350a.t();
        }
        return (long) ((((double) this.f8350a.U()) / 100.0d) * w.b(fL));
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j10) {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        this.f8392y.a(this.f8357h, this.f8356g, this.f8355f, viewGroup);
        a(false);
        v vVar = this.f8356g;
        if (vVar != null) {
            vVar.a();
        }
        this.f8355f.renderAd(this.f8350a);
        a("javascript:al_onPoststitialShow();", this.f8350a.X());
        if (u()) {
            long jC = c();
            this.A = jC;
            if (jC > 0) {
                if (y.a()) {
                    this.f8352c.b("AppLovinFullscreenActivity", android.support.v4.media.session.e.a(defpackage.a.a("Scheduling timer for ad fully watched in "), this.A, "ms..."));
                }
                this.f8393z = com.applovin.impl.sdk.utils.f.a(this.A, this.f8351b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        y yVar = b.this.f8352c;
                        if (y.a()) {
                            b.this.f8352c.b("AppLovinFullscreenActivity", "Marking ad as fully watched");
                        }
                        b.this.B.set(true);
                    }
                });
            }
        }
        if (this.f8357h != null) {
            if (this.f8350a.t() >= 0) {
                a(this.f8357h, this.f8350a.t(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.f8360k = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f8357h.setVisibility(0);
            }
        }
        v();
        this.f8351b.G().a(new ac(this.f8351b, "updateMainViewOM", new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.3
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                n nVar = b.this.f8357h;
                if (nVar != null) {
                    arrayList.add(new com.applovin.impl.sdk.a.d(nVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
                }
                v vVar2 = b.this.f8356g;
                if (vVar2 != null && vVar2.b()) {
                    v vVar3 = b.this.f8356g;
                    arrayList.add(new com.applovin.impl.sdk.a.d(vVar3, FriendlyObstructionPurpose.NOT_VISIBLE, vVar3.getIdentifier()));
                }
                b.this.f8350a.o().a(b.this.f8355f, arrayList);
            }
        }), r.b.MAIN, TimeUnit.SECONDS.toMillis(1L));
        w();
        super.b(w.c(this.f8351b));
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        n();
        com.applovin.impl.sdk.utils.f fVar = this.f8393z;
        if (fVar != null) {
            fVar.a();
            this.f8393z = null;
        }
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void n() {
        com.applovin.impl.sdk.utils.f fVar;
        boolean zS = s();
        int iMin = 100;
        if (u()) {
            if (!zS && (fVar = this.f8393z) != null) {
                iMin = (int) Math.min(100.0d, ((this.A - fVar.b()) / this.A) * 100.0d);
            }
            if (y.a()) {
                this.f8352c.b("AppLovinFullscreenActivity", "Ad engaged at " + iMin + "%");
            }
        }
        super.a(iMin, false, zS, -2L);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean s() {
        if (u()) {
            return this.B.get();
        }
        return true;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean t() {
        return false;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void v() {
        long jAj;
        int iL;
        long millis = 0;
        if (this.f8350a.ai() >= 0 || this.f8350a.aj() >= 0) {
            if (this.f8350a.ai() >= 0) {
                jAj = this.f8350a.ai();
            } else {
                if (this.f8350a.ak() && ((iL = (int) ((com.applovin.impl.sdk.ad.a) this.f8350a).l()) > 0 || (iL = (int) this.f8350a.t()) > 0)) {
                    millis = 0 + TimeUnit.SECONDS.toMillis(iL);
                }
                jAj = (long) ((((double) this.f8350a.aj()) / 100.0d) * millis);
            }
            b(jAj);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void x() {
        super.x();
        this.f8392y.a(this.f8358i);
        this.f8360k = SystemClock.elapsedRealtime();
        this.B.set(true);
    }
}
