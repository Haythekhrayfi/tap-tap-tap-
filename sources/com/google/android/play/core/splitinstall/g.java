package com.google.android.play.core.splitinstall;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Map<String, String>> f12433a = new HashMap();

    public final h a() {
        HashMap map = new HashMap();
        for (Map.Entry<String, Map<String, String>> entry : this.f12433a.entrySet()) {
            map.put(entry.getKey(), Collections.unmodifiableMap(new HashMap(entry.getValue())));
        }
        return new h(Collections.unmodifiableMap(map));
    }

    public final void a(String str, String str2, String str3) {
        if (!this.f12433a.containsKey(str2)) {
            this.f12433a.put(str2, new HashMap());
        }
        this.f12433a.get(str2).put(str, str3);
    }
}
