package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.graphics.PointF;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.impl.adview.h;
import com.applovin.impl.adview.n;
import com.applovin.impl.adview.v;
import com.applovin.impl.adview.w;
import com.applovin.impl.c.k;
import com.applovin.impl.c.l;
import com.applovin.impl.c.m;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.u;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class d extends f {
    private final com.applovin.impl.c.a M;
    private final Set<k> N;

    public d(com.applovin.impl.sdk.ad.e eVar, final Activity activity, Map<String, Object> map, final o oVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, map, oVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.N = hashSet;
        com.applovin.impl.c.a aVar = (com.applovin.impl.c.a) eVar;
        this.M = aVar;
        if (aVar.aX()) {
            ImageView imageViewA = com.applovin.impl.c.g.a(aVar.aW().a(), activity, oVar);
            ((f) this).G = imageViewA;
            imageViewA.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.activity.b.d.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Uri uriB = d.this.M.aW().b();
                    if (uriB != null) {
                        y yVar = d.this.f8352c;
                        if (y.a()) {
                            d.this.f8352c.b("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + uriB);
                        }
                        d.this.a(com.applovin.impl.c.a.c.INDUSTRY_ICON_CLICK);
                        u.a(uriB, activity, oVar);
                    }
                }
            });
        }
        com.applovin.impl.c.a.c cVar = com.applovin.impl.c.a.c.VIDEO;
        hashSet.addAll(aVar.a(cVar, l.f8928a));
        a(com.applovin.impl.c.a.c.IMPRESSION);
        a(cVar, "creativeView");
        aVar.o().d();
    }

    private void E() {
        if (!s() || this.N.isEmpty()) {
            return;
        }
        if (y.a()) {
            y yVar = this.f8352c;
            StringBuilder sbA = defpackage.a.a("Firing ");
            sbA.append(this.N.size());
            sbA.append(" un-fired video progress trackers when video was completed.");
            yVar.d("AppLovinFullscreenActivity", sbA.toString());
        }
        a(this.N);
    }

    private boolean F() {
        return ((f) this).G != null && this.M.aX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.c.a.c cVar) {
        a(cVar, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void a(com.applovin.impl.c.a.c cVar, com.applovin.impl.c.f fVar) {
        a(cVar, "", fVar);
    }

    private void a(com.applovin.impl.c.a.c cVar, String str) {
        a(cVar, str, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void a(com.applovin.impl.c.a.c cVar, String str, com.applovin.impl.c.f fVar) {
        a(this.M.a(cVar, str), fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Set<k> set) {
        a(set, com.applovin.impl.c.f.UNSPECIFIED);
    }

    private void a(Set<k> set, com.applovin.impl.c.f fVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(((f) this).f8425y.getCurrentPosition());
        com.applovin.impl.c.o oVarAU = this.M.aU();
        Uri uriA = oVarAU != null ? oVarAU.a() : null;
        if (y.a()) {
            y yVar = this.f8352c;
            StringBuilder sbA = defpackage.a.a("Firing ");
            sbA.append(set.size());
            sbA.append(" tracker(s): ");
            sbA.append(set);
            yVar.b("AppLovinFullscreenActivity", sbA.toString());
        }
        m.a(set, seconds, uriA, fVar, this.f8351b);
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void A() {
        super.A();
        a(com.applovin.impl.c.a.c.VIDEO, this.J ? "mute" : "unmute");
        this.M.o().a(this.J);
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void B() {
        E();
        if (!m.c(this.M)) {
            if (y.a()) {
                this.f8352c.b("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            h();
        } else {
            if (this.L) {
                return;
            }
            a(com.applovin.impl.c.a.c.COMPANION, "creativeView");
            this.M.o().i();
            super.B();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void a(PointF pointF, boolean z10) {
        a(com.applovin.impl.c.a.c.VIDEO_CLICK);
        this.M.o().o();
        super.a(pointF, z10);
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        if (F()) {
            a(com.applovin.impl.c.a.c.INDUSTRY_ICON_IMPRESSION);
            ((f) this).G.setVisibility(0);
        }
        ((f) this).H.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new com.applovin.impl.adview.k.a() { // from class: com.applovin.impl.adview.activity.b.d.2
            @Override // com.applovin.impl.adview.k.a
            public void a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(d.this.K - ((long) (((f) d.this).f8425y.getDuration() - ((f) d.this).f8425y.getCurrentPosition())));
                int iD = d.this.D();
                HashSet hashSet = new HashSet();
                for (k kVar : new HashSet(d.this.N)) {
                    if (kVar.a(seconds, iD)) {
                        hashSet.add(kVar);
                        d.this.N.remove(kVar);
                    }
                }
                d.this.a(hashSet);
                if (iD >= 25 && iD < 50) {
                    d.this.M.o().f();
                    return;
                }
                if (iD >= 50 && iD < 75) {
                    d.this.M.o().g();
                } else if (iD >= 75) {
                    d.this.M.o().h();
                }
            }

            @Override // com.applovin.impl.adview.k.a
            public boolean b() {
                return !d.this.L;
            }
        });
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.a aVar = ((f) this).f8426z;
        if (aVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(aVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        n nVar = ((f) this).A;
        if (nVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(nVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        h hVar = ((f) this).B;
        if (hVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(hVar, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = ((f) this).E;
        if (progressBar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = ((f) this).F;
        if (progressBar2 != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = ((f) this).C;
        if (imageView != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        w wVar = ((f) this).D;
        if (wVar != null) {
            arrayList.add(new com.applovin.impl.sdk.a.d(wVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        v vVar = this.f8356g;
        if (vVar != null && vVar.b()) {
            v vVar2 = this.f8356g;
            arrayList.add(new com.applovin.impl.sdk.a.d(vVar2, FriendlyObstructionPurpose.NOT_VISIBLE, vVar2.getIdentifier()));
        }
        this.M.o().a(((f) this).f8425y, arrayList);
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void c() {
        a(com.applovin.impl.c.a.c.VIDEO, "skip");
        this.M.o().n();
        super.c();
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void c(long j10) {
        super.c(j10);
        this.M.o().a(TimeUnit.MILLISECONDS.toSeconds(j10), com.applovin.impl.sdk.utils.w.c(this.f8351b));
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void c(String str) {
        a(com.applovin.impl.c.a.c.ERROR, com.applovin.impl.c.f.MEDIA_FILE_ERROR);
        this.M.o().a(str);
        super.c(str);
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void e() {
        ((f) this).H.c();
        super.e();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void f() {
        super.f();
        a(this.L ? com.applovin.impl.c.a.c.COMPANION : com.applovin.impl.c.a.c.VIDEO, "resume");
        this.M.o().k();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void g() {
        super.g();
        a(this.L ? com.applovin.impl.c.a.c.COMPANION : com.applovin.impl.c.a.c.VIDEO, "pause");
        this.M.o().j();
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void h() {
        if (this.M != null) {
            a(com.applovin.impl.c.a.c.VIDEO, "close");
            a(com.applovin.impl.c.a.c.COMPANION, "close");
        }
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.f, com.applovin.impl.adview.activity.b.a
    public void v() {
        long jAj;
        int iT;
        long millis = 0;
        if (this.M.ai() >= 0 || this.M.aj() >= 0) {
            if (this.M.ai() >= 0) {
                jAj = this.M.ai();
            } else {
                com.applovin.impl.c.a aVar = this.M;
                com.applovin.impl.c.n nVarAT = aVar.aT();
                if (nVarAT == null || nVarAT.b() <= 0) {
                    long j10 = this.K;
                    if (j10 > 0) {
                        millis = 0 + j10;
                    }
                } else {
                    millis = 0 + TimeUnit.SECONDS.toMillis(nVarAT.b());
                }
                if (aVar.ak() && (iT = (int) aVar.t()) > 0) {
                    millis += TimeUnit.SECONDS.toMillis(iT);
                }
                jAj = (long) ((((double) this.M.aj()) / 100.0d) * millis);
            }
            b(jAj);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void y() {
        super.y();
        com.applovin.impl.c.a aVar = this.M;
        if (aVar != null) {
            aVar.o().l();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.f
    public void z() {
        super.z();
        com.applovin.impl.c.a aVar = this.M;
        if (aVar != null) {
            aVar.o().m();
        }
    }
}
