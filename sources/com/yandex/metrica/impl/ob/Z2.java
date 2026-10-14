package com.yandex.metrica.impl.ob;

import java.util.Collection;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f15611e;

    public Z2(String str, String str2, boolean z10, int i10, Long l10) {
        this.f15607a = str;
        this.f15608b = str2;
        this.f15609c = z10;
        this.f15610d = i10;
        this.f15611e = l10;
    }

    public static JSONArray a(Collection<Z2> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            for (Z2 z10 : collection) {
                Objects.requireNonNull(z10);
                JSONObject jSONObjectPut = null;
                try {
                    jSONObjectPut = new JSONObject().put("mac", z10.f15607a).put("ssid", z10.f15608b).put("signal_strength", z10.f15610d).put("is_connected", z10.f15609c).put("last_visible_offset_seconds", z10.f15611e);
                } catch (Throwable unused) {
                }
                if (jSONObjectPut != null) {
                    jSONArray.put(jSONObjectPut);
                }
            }
        }
        return jSONArray;
    }
}
