package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.models.ad.JavaScriptResource;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class lb1 implements bg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JavaScriptResource f22673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, List<String>> f22675d;

    public lb1(String str, JavaScriptResource javaScriptResource, String str2, HashMap map) {
        this.f22672a = str;
        this.f22673b = javaScriptResource;
        this.f22674c = str2;
        this.f22675d = map;
    }

    @Override // com.yandex.mobile.ads.impl.bg1
    public final Map<String, List<String>> a() {
        return Collections.unmodifiableMap(this.f22675d);
    }

    public final JavaScriptResource b() {
        return this.f22673b;
    }

    public final String c() {
        return this.f22674c;
    }

    public final String d() {
        return this.f22672a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lb1.class != obj.getClass()) {
            return false;
        }
        lb1 lb1Var = (lb1) obj;
        if (!this.f22672a.equals(lb1Var.f22672a)) {
            return false;
        }
        JavaScriptResource javaScriptResource = this.f22673b;
        if (javaScriptResource == null ? lb1Var.f22673b != null : !javaScriptResource.equals(lb1Var.f22673b)) {
            return false;
        }
        String str = this.f22674c;
        if (str == null ? lb1Var.f22674c == null : str.equals(lb1Var.f22674c)) {
            return this.f22675d.equals(lb1Var.f22675d);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f22672a.hashCode() * 31;
        JavaScriptResource javaScriptResource = this.f22673b;
        int iHashCode2 = (iHashCode + (javaScriptResource != null ? javaScriptResource.hashCode() : 0)) * 31;
        String str = this.f22674c;
        return this.f22675d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
