package ga;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.yandex.metrica.plugins.PluginErrorDetails;
import fa.o;
import fa.t;
import fd.j0;
import gb.x;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd.i<x<w>> f30169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f30170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f30171c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(fd.i<? super x<w>> iVar, o oVar, Context context) {
        this.f30169a = iVar;
        this.f30170b = oVar;
        this.f30171c = context;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        this.f30170b.a();
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        j0.i(loadAdError, "error");
        xe.a.c cVarB = xe.a.b("PremiumHelper");
        StringBuilder sbA = defpackage.a.a("AdMobNative: Failed to load ");
        sbA.append(loadAdError.getCode());
        sbA.append(" (");
        sbA.append(loadAdError.getMessage());
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        cVarB.b(sbA.toString(), new Object[0]);
        fa.g.f29433a.a(this.f30171c, PluginErrorDetails.Platform.NATIVE, loadAdError.getMessage());
        if (this.f30169a.a()) {
            fd.i<x<w>> iVar = this.f30169a;
            jc.i.a aVar = jc.i.f31813c;
            iVar.resumeWith(new x.b(new IllegalStateException(loadAdError.getMessage())));
        }
        o oVar = this.f30170b;
        int code = loadAdError.getCode();
        String message = loadAdError.getMessage();
        j0.h(message, "error.message");
        String domain = loadAdError.getDomain();
        j0.h(domain, "error.domain");
        AdError cause = loadAdError.getCause();
        oVar.c(new t(code, message, domain, cause != null ? cause.getMessage() : null));
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        if (this.f30169a.a()) {
            fd.i<x<w>> iVar = this.f30169a;
            jc.i.a aVar = jc.i.f31813c;
            iVar.resumeWith(new x.c(w.f31842a));
        }
        this.f30170b.d();
    }
}
