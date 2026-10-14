package ha;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import fa.t;
import gb.x;
import java.util.Objects;
import jc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends MaxNativeAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f31057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaxNativeAdLoader f31058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fa.o f31059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fd.i<x<w>> f31060d;

    /* JADX WARN: Multi-variable type inference failed */
    public j(o oVar, MaxNativeAdLoader maxNativeAdLoader, fa.o oVar2, fd.i<? super x<w>> iVar) {
        this.f31057a = oVar;
        this.f31058b = maxNativeAdLoader;
        this.f31059c = oVar2;
        this.f31060d = iVar;
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        Objects.requireNonNull(this.f31057a);
        this.f31059c.a();
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdExpired(MaxAd maxAd) {
        Objects.requireNonNull(this.f31057a);
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        Objects.requireNonNull(this.f31057a);
        fa.o oVar = this.f31059c;
        int code = maxError != null ? maxError.getCode() : -1;
        String message = maxError != null ? maxError.getMessage() : null;
        if (message == null) {
            message = "";
        }
        oVar.c(new t(code, message, "", null, 8, null));
        if (this.f31060d.a()) {
            fd.i<x<w>> iVar = this.f31060d;
            jc.i.a aVar = jc.i.f31813c;
            iVar.resumeWith(new x.b(new IllegalStateException(maxError != null ? maxError.getMessage() : null)));
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        this.f31057a.a(this.f31058b, maxAd);
        this.f31059c.d();
        if (this.f31060d.a()) {
            fd.i<x<w>> iVar = this.f31060d;
            jc.i.a aVar = jc.i.f31813c;
            iVar.resumeWith(new x.c(w.f31842a));
        }
    }
}
