package com.yandex.mobile.ads.impl;

import com.yandex.metrica.YandexMetrica;

/* JADX INFO: loaded from: classes3.dex */
public final class ba {
    public static void a() throws n60 {
        try {
            String libraryVersion = YandexMetrica.getLibraryVersion();
            fd.j0.h(libraryVersion, "try {\n            Yandex…CA_INTEGRATION)\n        }");
            if (new da(libraryVersion).compareTo(new da("4.0.0")) < 0) {
                throw new n60("Incorrect AppMetrica Version. Minimum supported AppMetrica SDK Version is 4.0.0. Please, check your AppMetrica integration.");
            }
        } catch (NoClassDefFoundError unused) {
            throw new n60("Incorrect AppMetrica Integration. Minimum supported AppMetrica SDK Version is 4.0.0. Please, check your AppMetrica integration.");
        }
    }
}
