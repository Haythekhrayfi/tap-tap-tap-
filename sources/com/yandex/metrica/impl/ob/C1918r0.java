package com.yandex.metrica.impl.ob;

import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1918r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U0 f17198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Boolean, String> f17199b = new HashMap();

    public C1918r0(U0 u10) {
        this.f17198a = u10;
    }

    private void a(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!U2.a(str, this.f17199b.get(Boolean.valueOf(!z10)))) {
            this.f17198a.a(str, z10);
        }
        this.f17199b.put(Boolean.valueOf(z10), str);
    }

    public void a(Intent intent) {
        if (intent != null) {
            a(intent.getDataString(), false);
        }
    }

    public void a(String str) {
        a(str, false);
    }

    public void b(String str) {
        a(str, true);
    }
}
