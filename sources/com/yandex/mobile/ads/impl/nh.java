package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f23385b;

    public nh(String str, Map<String, String> map) {
        String lowerCase;
        fd.j0.i(str, "scheme");
        fd.j0.i(map, "authParams");
        this.f23384a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                fd.j0.h(locale, "US");
                lowerCase = key.toLowerCase(locale);
                fd.j0.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        fd.j0.h(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f23385b = mapUnmodifiableMap;
    }

    public final Charset a() {
        String str = this.f23385b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                fd.j0.h(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        fd.j0.h(charset, "ISO_8859_1");
        return charset;
    }

    public final String b() {
        return this.f23385b.get("realm");
    }

    public final String c() {
        return this.f23384a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nh) {
            nh nhVar = (nh) obj;
            if (fd.j0.d(nhVar.f23384a, this.f23384a) && fd.j0.d(nhVar.f23385b, this.f23385b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f23385b.hashCode() + z11.a(this.f23384a, 899, 31);
    }

    public final String toString() {
        return this.f23384a + " authParams=" + this.f23385b;
    }
}
