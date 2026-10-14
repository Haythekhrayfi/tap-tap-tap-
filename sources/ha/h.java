package ha;

import ch.qos.logback.core.CoreConstants;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaxNativeAdLoader f31053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaxAd f31054b;

    public h(MaxNativeAdLoader maxNativeAdLoader, MaxAd maxAd) {
        j0.i(maxNativeAdLoader, "adLoader");
        j0.i(maxAd, "nativeAd");
        this.f31053a = maxNativeAdLoader;
        this.f31054b = maxAd;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return j0.d(this.f31053a, hVar.f31053a) && j0.d(this.f31054b, hVar.f31054b);
    }

    public int hashCode() {
        return this.f31054b.hashCode() + (this.f31053a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AppLovinNativeAdWrapper(adLoader=");
        sbA.append(this.f31053a);
        sbA.append(", nativeAd=");
        sbA.append(this.f31054b);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
