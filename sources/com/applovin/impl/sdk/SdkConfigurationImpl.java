package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.List;
import lombok.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class SdkConfigurationImpl implements AppLovinSdkConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f10087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f10088b;

    public SdkConfigurationImpl(List<String> list, o oVar) {
        this.f10087a = list;
        this.f10088b = oVar;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState() {
        String str = this.f10088b.ay().getExtraParameters().get(AppLovinSdkExtraParameterKey.CONSENT_DIALOG_STATE);
        if (!StringUtils.isValidString(str)) {
            str = (String) this.f10088b.a(com.applovin.impl.sdk.c.b.gT);
        }
        if ("applies".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentDialogState.APPLIES;
        }
        return "does_not_apply".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY : AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public String getCountryCode() {
        return (String) this.f10088b.a(com.applovin.impl.sdk.c.b.gU);
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public List<String> getEnabledAmazonAdUnitIds() {
        return this.f10087a;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public boolean isTestModeEnabled() {
        return this.f10088b.as().a();
    }

    @NonNull
    public String toString() {
        StringBuilder sbA = defpackage.a.a("AppLovinSdkConfiguration{, countryCode=");
        sbA.append(getCountryCode());
        sbA.append(", enabledAmazonAdUnitIds=");
        sbA.append(getEnabledAmazonAdUnitIds());
        sbA.append(", testModeEnabled=");
        sbA.append(isTestModeEnabled());
        sbA.append('}');
        return sbA.toString();
    }
}
