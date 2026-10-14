package okhttp3;

import fd.j0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kc.f0;
import l1.e;

/* JADX INFO: loaded from: classes3.dex */
public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    /* JADX WARN: Illegal instructions before constructor call */
    public Challenge(String str, String str2) {
        j0.i(str, "scheme");
        j0.i(str2, "realm");
        Map mapSingletonMap = Collections.singletonMap("realm", str2);
        j0.h(mapSingletonMap, "singletonMap(\"realm\", realm)");
        this(str, (Map<String, String>) mapSingletonMap);
    }

    public Challenge(String str, Map<String, String> map) {
        String lowerCase;
        j0.i(str, "scheme");
        j0.i(map, "authParams");
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key == null) {
                lowerCase = null;
            } else {
                Locale locale = Locale.US;
                j0.h(locale, "US");
                lowerCase = key.toLowerCase(locale);
                j0.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        j0.h(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m26deprecated_authParams() {
        return this.authParams;
    }

    /* JADX INFO: renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m27deprecated_charset() {
        return charset();
    }

    /* JADX INFO: renamed from: -deprecated_realm, reason: not valid java name */
    public final String m28deprecated_realm() {
        return realm();
    }

    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m29deprecated_scheme() {
        return this.scheme;
    }

    public final Map<String, String> authParams() {
        return this.authParams;
    }

    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                j0.h(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        j0.h(charset, "ISO_8859_1");
        return charset;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (j0.d(challenge.scheme, this.scheme) && j0.d(challenge.authParams, this.authParams)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.authParams.hashCode() + e.a(this.scheme, 899, 31);
    }

    public final String realm() {
        return this.authParams.get("realm");
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    public final Challenge withCharset(Charset charset) {
        j0.i(charset, "charset");
        Map mapL = f0.l(this.authParams);
        String strName = charset.name();
        j0.h(strName, "charset.name()");
        mapL.put("charset", strName);
        return new Challenge(this.scheme, (Map<String, String>) mapL);
    }
}
