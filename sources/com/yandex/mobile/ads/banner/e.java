package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.impl.c21;
import com.yandex.mobile.ads.impl.cd;
import com.yandex.mobile.ads.impl.dd;
import com.yandex.mobile.ads.impl.ed;
import com.yandex.mobile.ads.impl.eh1;
import com.yandex.mobile.ads.impl.od;
import com.yandex.mobile.ads.impl.pz;
import com.yandex.mobile.ads.impl.sg1;
import com.yandex.mobile.ads.impl.ve1;
import com.yandex.mobile.ads.impl.w3;
import com.yandex.mobile.ads.impl.x60;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends j implements od {
    private final d A;
    private final VideoController B;
    private final ve1 C;
    private final cd D;
    private final pz E;
    private final g F;
    private final dd G;
    private ed H;
    private ed I;

    public e(Context context, g gVar, d dVar, w3 w3Var) {
        super(context, gVar, w3Var);
        this.A = dVar;
        this.F = gVar;
        a(gVar);
        this.G = new dd();
        ve1 ve1Var = new ve1();
        this.C = ve1Var;
        this.B = new VideoController(ve1Var);
        this.D = new cd();
        pz pzVar = new pz();
        this.E = pzVar;
        dVar.a(pzVar);
    }

    private static void a(g gVar) {
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setVisibility(8);
        gVar.setBackgroundColor(0);
    }

    public final ve1 A() {
        return this.C;
    }

    public final void a(BannerAdEventListener bannerAdEventListener) {
        a(this.A);
        this.A.a(bannerAdEventListener);
    }

    @Override // com.yandex.mobile.ads.impl.ae
    public final void a(AdResponse<String> adResponse) {
        super.a((AdResponse) adResponse);
        this.E.a(adResponse);
        Objects.requireNonNull(this.D);
        ed edVarA = cd.a(adResponse).a(this);
        this.I = edVarA;
        edVarA.a(this.f18884b, adResponse);
    }

    @Override // com.yandex.mobile.ads.impl.od
    public final void a(AdImpressionData adImpressionData) {
        this.A.b(adImpressionData);
    }

    @Override // com.yandex.mobile.ads.banner.j, com.yandex.mobile.ads.impl.ae
    public final void c() {
        super.c();
        this.A.a((BannerAdEventListener) null);
        sg1.a(this.F, true);
        this.F.setVisibility(8);
        g gVar = this.F;
        int i10 = eh1.f20253b;
        if (gVar != null) {
            try {
                if (gVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) gVar.getParent()).removeView(gVar);
                }
            } catch (Exception unused) {
            }
            try {
                gVar.removeAllViews();
            } catch (Exception unused2) {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.od
    public final void onLeftApplication() {
        this.A.e();
    }

    @Override // com.yandex.mobile.ads.impl.od
    public final void onReturnedToApplication() {
        this.A.f();
    }

    @Override // com.yandex.mobile.ads.impl.ae
    public final void p() {
        super.p();
        ed edVar = this.H;
        if (edVar != this.I) {
            for (ed edVar2 : new HashSet(Arrays.asList(edVar))) {
                if (edVar2 != null) {
                    edVar2.a(this.f18884b);
                }
            }
            this.H = this.I;
        }
        SizeInfo sizeInfoN = d().n();
        if (!(2 == (sizeInfoN != null ? sizeInfoN.d() : 0)) || this.F.getLayoutParams() == null) {
            return;
        }
        this.F.getLayoutParams().height = -2;
    }

    public final boolean w() {
        AdResponse<String> adResponseH = h();
        SizeInfo sizeInfoG = adResponseH != null ? adResponseH.G() : null;
        if (sizeInfoG == null) {
            return false;
        }
        SizeInfo sizeInfoN = this.f18888f.n();
        AdResponse<T> adResponse = this.f18902t;
        return (adResponse == 0 || sizeInfoN == null) ? false : c21.a(this.f18884b, adResponse, sizeInfoG, this.G, sizeInfoN);
    }

    public final void x() {
        for (ed edVar : new HashSet(Arrays.asList(this.H, this.I))) {
            if (edVar != null) {
                edVar.a(this.f18884b);
            }
        }
        c();
        x60.d("onDestroy(), clazz = " + e.class, new Object[0]);
    }

    public final g y() {
        return this.F;
    }

    public final VideoController z() {
        return this.B;
    }
}
