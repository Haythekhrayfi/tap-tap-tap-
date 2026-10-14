package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class wm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f26320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f26321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<oy> f26322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26323e;

    @Deprecated
    public wm0(int i10, byte[] bArr, Map map) {
        this(i10, bArr, map, true);
    }

    private wm0(int i10, byte[] bArr, Map map, List list, boolean z10) {
        this.f26319a = i10;
        this.f26320b = bArr;
        this.f26321c = map;
        this.f26322d = list == null ? null : Collections.unmodifiableList(list);
        this.f26323e = z10;
    }

    @Deprecated
    public wm0(int i10, byte[] bArr, Map map, boolean z10) {
        this(i10, bArr, map, a((Map<String, String>) map), z10);
    }

    public wm0(int i10, byte[] bArr, boolean z10, long j10, List<oy> list) {
        this(i10, bArr, a(list), list, z10);
    }

    @Deprecated
    public wm0(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false);
    }

    private static List<oy> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new oy(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private static Map<String, String> a(List<oy> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (oy oyVar : list) {
            treeMap.put(oyVar.a(), oyVar.b());
        }
        return treeMap;
    }
}
