package com.google.android.play.core.common;

import android.os.Bundle;
import com.google.android.play.core.internal.af;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class PlayCoreVersion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f12226a = new HashSet(Arrays.asList("review"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f12227b = new HashSet(Arrays.asList(PluginErrorDetails.Platform.NATIVE, PluginErrorDetails.Platform.UNITY));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Map<String, Integer>> f12228c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final af f12229d = new af("PlayCoreVersion");

    private PlayCoreVersion() {
    }

    public static Bundle a() {
        Bundle bundle = new Bundle();
        Map<String, Integer> mapA = a("review");
        bundle.putInt("playcore_version_code", mapA.get("java").intValue());
        if (mapA.containsKey(PluginErrorDetails.Platform.NATIVE)) {
            bundle.putInt("playcore_native_version", mapA.get(PluginErrorDetails.Platform.NATIVE).intValue());
        }
        if (mapA.containsKey(PluginErrorDetails.Platform.UNITY)) {
            bundle.putInt("playcore_unity_version", mapA.get(PluginErrorDetails.Platform.UNITY).intValue());
        }
        return bundle;
    }

    public static synchronized Map<String, Integer> a(String str) {
        Map<String, Map<String, Integer>> map;
        map = f12228c;
        if (!map.containsKey(str)) {
            HashMap map2 = new HashMap();
            map2.put("java", 10800);
            map.put(str, map2);
        }
        return map.get(str);
    }

    public static synchronized void addVersion(String str, String str2, int i10) {
        if (!f12226a.contains(str)) {
            f12229d.d("Illegal module name: %s", str);
        } else if (f12227b.contains(str2)) {
            a(str).put(str2, Integer.valueOf(i10));
        } else {
            f12229d.d("Illegal platform name: %s", str2);
        }
    }
}
