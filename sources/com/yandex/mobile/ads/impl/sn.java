package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class sn {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final sn f25141c = new sn(Collections.emptyMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, byte[]> f25143b;

    public sn() {
        this(Collections.emptyMap());
    }

    public sn(Map<String, byte[]> map) {
        this.f25143b = Collections.unmodifiableMap(map);
    }

    public final sn a(yk ykVar) {
        byte[] bytes;
        HashMap map = new HashMap(this.f25143b);
        List<String> listB = ykVar.b();
        boolean z10 = false;
        for (int i10 = 0; i10 < listB.size(); i10++) {
            map.remove(listB.get(i10));
        }
        for (Map.Entry<String, Object> entry : ykVar.a().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value).longValue()).array();
            } else if (value instanceof String) {
                bytes = ((String) value).getBytes(qh.f24496c);
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bytes = (byte[]) value;
            }
            map.put(key, bytes);
        }
        Map<String, byte[]> map2 = this.f25143b;
        if (map2.size() == map.size()) {
            for (Map.Entry<String, byte[]> entry2 : map2.entrySet()) {
                if (!Arrays.equals(entry2.getValue(), (byte[]) map.get(entry2.getKey()))) {
                }
            }
            z10 = true;
        }
        return z10 ? this : new sn(map);
    }

    public final Set<Map.Entry<String, byte[]>> a() {
        return this.f25143b.entrySet();
    }

    public final long b() {
        byte[] bArr = this.f25143b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public final String c() {
        byte[] bArr = this.f25143b.get("exo_redir");
        if (bArr != null) {
            return new String(bArr, qh.f24496c);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sn.class != obj.getClass()) {
            return false;
        }
        Map<String, byte[]> map = this.f25143b;
        Map<String, byte[]> map2 = ((sn) obj).f25143b;
        if (map.size() == map2.size()) {
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f25142a == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f25143b.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f25142a = iHashCode;
        }
        return this.f25142a;
    }
}
