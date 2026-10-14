package com.yandex.mobile.ads.impl;

import com.yandex.metrica.YandexMetrica;

/* JADX INFO: loaded from: classes3.dex */
public final class ea {
    public static String a() {
        try {
            return YandexMetrica.getLibraryVersion();
        } catch (Exception e10) {
            x60.a(e10, e10.getMessage(), new Object[0]);
            return null;
        }
    }
}
