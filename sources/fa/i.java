package fa;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f29483a;

    public i(o oVar) {
        this.f29483a = oVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        this.f29483a.a();
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        this.f29483a.b();
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        j0.i(loadAdError, "error");
        o oVar = this.f29483a;
        int code = loadAdError.getCode();
        String message = loadAdError.getMessage();
        j0.h(message, "error.message");
        oVar.c(new t(code, message, "", null, 8, null));
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        Objects.requireNonNull(this.f29483a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        this.f29483a.d();
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        this.f29483a.e();
    }
}
