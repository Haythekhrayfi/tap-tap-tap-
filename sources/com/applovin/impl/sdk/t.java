package com.applovin.impl.sdk;

import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11162a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f11164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f11165d;

    public t(String str, Map<String, String> map, Map<String, Object> map2) {
        this.f11163b = str;
        HashMap map3 = new HashMap();
        this.f11164c = map3;
        map3.putAll(map);
        map3.put("applovin_sdk_super_properties", map2);
        this.f11165d = System.currentTimeMillis();
    }

    public String a() {
        return this.f11163b;
    }

    public Map<String, Object> b() {
        return this.f11164c;
    }

    public long c() {
        return this.f11165d;
    }

    public String d() {
        return this.f11162a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f11165d != tVar.f11165d) {
            return false;
        }
        String str = this.f11163b;
        if (str == null ? tVar.f11163b != null : !str.equals(tVar.f11163b)) {
            return false;
        }
        Map<String, Object> map = this.f11164c;
        if (map == null ? tVar.f11164c != null : !map.equals(tVar.f11164c)) {
            return false;
        }
        String str2 = this.f11162a;
        String str3 = tVar.f11162a;
        if (str2 != null) {
            if (str2.equals(str3)) {
                return true;
            }
        } else if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f11163b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Object> map = this.f11164c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j10 = this.f11165d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str2 = this.f11162a;
        return i10 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Event{name='");
        l1.c.a(sbA, this.f11163b, CoreConstants.SINGLE_QUOTE_CHAR, ", id='");
        l1.c.a(sbA, this.f11162a, CoreConstants.SINGLE_QUOTE_CHAR, ", creationTimestampMillis=");
        sbA.append(this.f11165d);
        sbA.append(", parameters=");
        sbA.append(this.f11164c);
        sbA.append('}');
        return sbA.toString();
    }
}
