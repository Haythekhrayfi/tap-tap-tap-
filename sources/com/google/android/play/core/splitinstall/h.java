package com.google.android.play.core.splitinstall;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Map<String, String>> f12434a;

    public final Map<String, Set<String>> a(Collection<String> collection) {
        Set setUnmodifiableSet;
        HashMap map = new HashMap();
        for (String str : this.f12434a.keySet()) {
            if (this.f12434a.containsKey(str)) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<String, String> entry : this.f12434a.get(str).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add(entry.getValue());
                    }
                }
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                setUnmodifiableSet = Collections.emptySet();
            }
            map.put(str, setUnmodifiableSet);
        }
        return map;
    }
}
