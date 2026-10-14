package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class ux0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DecimalFormat f25756a;

    public ux0() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator(' ');
        this.f25756a = new DecimalFormat("#,###,###", decimalFormatSymbols);
    }

    public final String a(String str) throws zi0 {
        try {
            return this.f25756a.format(Long.valueOf(!TextUtils.isEmpty(str) ? str.replaceAll(" ", "") : str));
        } catch (NumberFormatException e10) {
            x60.c(String.format("Could not parse review count value. Review Count value is %s", str), e10);
            throw new zi0("Native Ad json has not required attributes");
        }
    }
}
