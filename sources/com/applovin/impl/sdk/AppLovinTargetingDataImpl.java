package com.applovin.impl.sdk;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdContentRating;
import com.applovin.sdk.AppLovinGender;
import com.applovin.sdk.AppLovinTargetingData;
import com.google.android.gms.common.Scopes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinTargetingDataImpl implements AppLovinTargetingData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f10071a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10072b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f10073c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinGender f10074d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AppLovinAdContentRating f10075e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f10076f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f10077g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<String> f10078h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f10079i = null;

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f10072b) {
            if (StringUtils.isValidString(str2)) {
                this.f10071a.put(str, str2);
            } else {
                this.f10071a.remove(str);
            }
        }
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void clearAll() {
        synchronized (this.f10072b) {
            this.f10071a.clear();
        }
        this.f10073c = null;
        this.f10074d = null;
        this.f10075e = null;
        this.f10076f = null;
        this.f10077g = null;
        this.f10078h = null;
        this.f10079i = null;
    }

    public Map<String, String> getAllData() {
        Map<String, String> map;
        synchronized (this.f10072b) {
            map = CollectionUtils.map(this.f10071a);
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public String getEmail() {
        return this.f10076f;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public AppLovinGender getGender() {
        return this.f10074d;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public List<String> getInterests() {
        return this.f10079i;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public List<String> getKeywords() {
        return this.f10078h;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public AppLovinAdContentRating getMaximumAdContentRating() {
        return this.f10075e;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public String getPhoneNumber() {
        return this.f10077g;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public Integer getYearOfBirth() {
        return this.f10073c;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setEmail(String str) {
        a(Scopes.EMAIL, str != null ? StringUtils.toFullSHA1Hash(str.toLowerCase().trim()) : str);
        this.f10076f = str;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0017  */
    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setGender(AppLovinGender appLovinGender) {
        String str;
        if (appLovinGender == null) {
            str = null;
        } else if (appLovinGender == AppLovinGender.FEMALE) {
            str = "F";
        } else if (appLovinGender == AppLovinGender.MALE) {
            str = "M";
        } else if (appLovinGender == AppLovinGender.OTHER) {
            str = "O";
        } else {
            str = null;
        }
        a("gender", str);
        this.f10074d = appLovinGender;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setInterests(List<String> list) {
        a("interests", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f10079i = list;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setKeywords(List<String> list) {
        a("keywords", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f10078h = list;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setMaximumAdContentRating(AppLovinAdContentRating appLovinAdContentRating) {
        a("maximum_ad_content_rating", (appLovinAdContentRating == null || appLovinAdContentRating == AppLovinAdContentRating.NONE) ? null : Integer.toString(appLovinAdContentRating.ordinal()));
        this.f10075e = appLovinAdContentRating;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setPhoneNumber(String str) {
        a("phone_number", str != null ? StringUtils.toFullSHA1Hash(str.replaceAll("[^0-9]", "")) : str);
        this.f10077g = str;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setYearOfBirth(Integer num) {
        a("year_of_birth", num == null ? null : Integer.toString(num.intValue()));
        this.f10073c = num;
    }
}
