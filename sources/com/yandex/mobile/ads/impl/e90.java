package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class e90 {
    public static String a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb2 = new StringBuilder(language);
        String script = locale.getScript();
        if (!TextUtils.isEmpty(script)) {
            sb2.append(CoreConstants.DASH_CHAR);
            sb2.append(script);
        }
        if (!TextUtils.isEmpty(country)) {
            sb2.append('_');
            sb2.append(country);
        }
        return sb2.toString();
    }
}
