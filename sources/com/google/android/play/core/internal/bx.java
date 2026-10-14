package com.google.android.play.core.internal;

import android.content.Context;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class bx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12278a;

    public bx(Context context) {
        this.f12278a = context;
    }

    private static String a(Locale locale) {
        String strConcat;
        String strValueOf = String.valueOf(locale.getLanguage());
        if (locale.getCountry().isEmpty()) {
            strConcat = "";
        } else {
            String strValueOf2 = String.valueOf(locale.getCountry());
            strConcat = strValueOf2.length() != 0 ? "_".concat(strValueOf2) : new String("_");
        }
        String strValueOf3 = String.valueOf(strConcat);
        return strValueOf3.length() != 0 ? strValueOf.concat(strValueOf3) : new String(strValueOf);
    }

    public final List<String> a() {
        LocaleList locales = this.f12278a.getResources().getConfiguration().getLocales();
        ArrayList arrayList = new ArrayList(locales.size());
        for (int i10 = 0; i10 < locales.size(); i10++) {
            arrayList.add(a(locales.get(i10)));
        }
        return arrayList;
    }
}
