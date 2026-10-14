package fa;

import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements AppLovinSdk.SdkInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.ads.a f29423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mc.d<Boolean> f29424b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(com.zipoapps.ads.a aVar, mc.d<? super Boolean> dVar) {
        this.f29423a = aVar;
        this.f29424b = dVar;
    }

    @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
    public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        this.f29423a.d().k(3, null, "AppLovin onInitialization complete called", new Object[0]);
        mc.d<Boolean> dVar = this.f29424b;
        jc.i.a aVar = jc.i.f31813c;
        dVar.resumeWith(Boolean.TRUE);
    }
}
