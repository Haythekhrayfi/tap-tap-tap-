package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class yk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f26865a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f26866b = new ArrayList();

    public static void a(yk ykVar, long j10) {
        Long lValueOf = Long.valueOf(j10);
        HashMap map = ykVar.f26865a;
        Objects.requireNonNull(lValueOf);
        map.put("exo_len", lValueOf);
        ykVar.f26866b.remove("exo_len");
    }

    public static void a(yk ykVar, Uri uri) {
        if (uri == null) {
            ykVar.f26866b.add("exo_redir");
            ykVar.f26865a.remove("exo_redir");
            return;
        }
        String string = uri.toString();
        HashMap map = ykVar.f26865a;
        Objects.requireNonNull(string);
        map.put("exo_redir", string);
        ykVar.f26866b.remove("exo_redir");
    }

    public final Map<String, Object> a() {
        HashMap map = new HashMap(this.f26865a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public final List<String> b() {
        return Collections.unmodifiableList(new ArrayList(this.f26866b));
    }
}
