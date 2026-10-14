package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface lm extends im {

    public interface a {
        lm a();
    }

    long a(pm pmVar) throws IOException;

    void a(g81 g81Var);

    default Map<String, List<String>> b() {
        return Collections.emptyMap();
    }

    void close() throws IOException;

    Uri d();
}
