package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinUserSegment;

/* JADX INFO: loaded from: classes.dex */
class i implements AppLovinUserSegment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10702a;

    @Override // com.applovin.sdk.AppLovinUserSegment
    public String getName() {
        return this.f10702a;
    }

    @Override // com.applovin.sdk.AppLovinUserSegment
    public void setName(String str) {
        if (str != null) {
            if (str.length() > 32) {
                y.j("AppLovinUserSegment", "Setting name greater than 32 characters: " + str);
            }
            if (!StringUtils.isAlphaNumeric(str)) {
                y.j("AppLovinUserSegment", "Setting name that is not alphanumeric: " + str);
            }
        }
        this.f10702a = str;
    }

    public String toString() {
        return s.a.a(defpackage.a.a("AppLovinUserSegment{name="), getName(), '}');
    }
}
