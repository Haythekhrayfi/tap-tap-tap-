package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class Wd extends Vd {
    public Wd(String str) {
        super(a(str));
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri uri = Uri.parse(str);
        return "http".equals(uri.getScheme()) ? uri.buildUpon().scheme("https").build().toString() : str;
    }
}
