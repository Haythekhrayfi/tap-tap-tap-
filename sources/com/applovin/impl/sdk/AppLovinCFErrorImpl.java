package com.applovin.impl.sdk;

import ch.qos.logback.core.CoreConstants;
import com.applovin.sdk.AppLovinCFError;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinCFErrorImpl implements AppLovinCFError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10064b;

    public AppLovinCFErrorImpl(int i10, String str) {
        this.f10063a = i10;
        this.f10064b = str;
    }

    @Override // com.applovin.sdk.AppLovinCFError
    public int getCode() {
        return this.f10063a;
    }

    @Override // com.applovin.sdk.AppLovinCFError
    public String getMessage() {
        return this.f10064b;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AppLovinConsentFlowErrorImpl{code=");
        sbA.append(this.f10063a);
        sbA.append(", message='");
        sbA.append(this.f10064b);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append('}');
        return sbA.toString();
    }
}
