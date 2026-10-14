package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.sdk.AppLovinUserService;

/* JADX INFO: loaded from: classes.dex */
public class UserServiceImpl implements AppLovinUserService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10098a;

    public UserServiceImpl(o oVar) {
        this.f10098a = oVar;
    }

    @Override // com.applovin.sdk.AppLovinUserService
    public void preloadConsentDialog() {
        this.f10098a.O().c();
    }

    @Override // com.applovin.sdk.AppLovinUserService
    public void showConsentDialog(Activity activity, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        this.f10098a.O().a(activity, onConsentDialogDismissListener);
    }

    public String toString() {
        return "UserService{}";
    }
}
