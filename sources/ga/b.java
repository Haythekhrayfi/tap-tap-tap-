package ga;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import fa.o;
import fa.t;
import fd.j0;
import gb.x;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f30121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fd.i<x<? extends View>> f30122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f30123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdView f30124d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(o oVar, fd.i<? super x<? extends View>> iVar, Context context, AdView adView) {
        this.f30121a = oVar;
        this.f30122b = iVar;
        this.f30123c = context;
        this.f30124d = adView;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        this.f30121a.a();
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        this.f30121a.b();
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        j0.i(loadAdError, "error");
        xe.a.c cVarB = xe.a.b("PremiumHelper");
        StringBuilder sbA = defpackage.a.a("AdMobBanner: Failed to load ");
        sbA.append(Integer.valueOf(loadAdError.getCode()));
        sbA.append(" (");
        sbA.append(loadAdError.getMessage());
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        cVarB.b(sbA.toString(), new Object[0]);
        if (this.f30122b.a()) {
            int code = loadAdError.getCode();
            String message = loadAdError.getMessage();
            if (message == null) {
                message = "";
            }
            String str = message;
            String domain = loadAdError.getDomain();
            if (domain == null) {
                domain = AdError.UNDEFINED_DOMAIN;
            }
            t tVar = new t(code, str, domain, null, 8, null);
            fa.g.f29433a.a(this.f30123c, "banner", tVar.f29504b);
            this.f30121a.c(tVar);
            fd.i<x<? extends View>> iVar = this.f30122b;
            jc.i.a aVar = jc.i.f31813c;
            iVar.resumeWith(new x.b(new IllegalStateException(tVar.f29504b)));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        xe.a.c cVarB = xe.a.b("PremiumHelper");
        StringBuilder sbA = defpackage.a.a("AdMobBanner: loaded ad from ");
        ResponseInfo responseInfo = this.f30124d.getResponseInfo();
        sbA.append(responseInfo != null ? responseInfo.getMediationAdapterClassName() : null);
        cVarB.a(sbA.toString(), new Object[0]);
        if (this.f30122b.a()) {
            this.f30121a.d();
            fd.i<x<? extends View>> iVar = this.f30122b;
            jc.i.a aVar = jc.i.f31813c;
            iVar.resumeWith(new x.c(this.f30124d));
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        this.f30121a.e();
    }
}
