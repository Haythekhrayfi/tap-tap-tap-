package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.sdk.AppLovinCFError;
import com.applovin.sdk.AppLovinCFService;
import com.applovin.sdk.AppLovinSdkConfiguration;

/* JADX INFO: loaded from: classes.dex */
class h implements AppLovinCFService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f10699a;

    public h(o oVar) {
        this.f10699a = oVar;
    }

    @Override // com.applovin.sdk.AppLovinCFService
    public AppLovinCFService.CFType getCFType() {
        String str = (String) this.f10699a.a(com.applovin.impl.sdk.c.b.gT);
        if ("applies".equalsIgnoreCase(str)) {
            return AppLovinCFService.CFType.DETAILED;
        }
        return "does_not_apply".equalsIgnoreCase(str) ? AppLovinCFService.CFType.STANDARD : AppLovinCFService.CFType.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinCFService
    public void scf(Activity activity, final AppLovinCFService.OnCFCompletionCallback onCFCompletionCallback) {
        if (this.f10699a.aD().getConsentDialogState() != AppLovinSdkConfiguration.ConsentDialogState.APPLIES) {
            onCFCompletionCallback.onFlowCompleted(new AppLovinCFErrorImpl(-300, "Re-showing a consent flow is only allowed in GDPR region."));
        } else {
            this.f10699a.aa().a(true);
            this.f10699a.aa().a(activity, new AppLovinCFService.OnCFCompletionCallback() { // from class: com.applovin.impl.sdk.h.1
                @Override // com.applovin.sdk.AppLovinCFService.OnCFCompletionCallback
                public void onFlowCompleted(AppLovinCFError appLovinCFError) {
                    onCFCompletionCallback.onFlowCompleted(appLovinCFError);
                }
            });
        }
    }
}
