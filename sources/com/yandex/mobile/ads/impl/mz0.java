package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class mz0 extends w51 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f23179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f23180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f23181d;

    public mz0() {
        super(new br());
        this.f23179b = -9223372036854775807L;
        this.f23180c = new long[0];
        this.f23181d = new long[0];
    }

    private static Serializable a(int i10, mp0 mp0Var) {
        if (i10 == 8) {
            return a(mp0Var);
        }
        if (i10 == 10) {
            int iX = mp0Var.x();
            ArrayList arrayList = new ArrayList(iX);
            for (int i11 = 0; i11 < iX; i11++) {
                Serializable serializableA = a(mp0Var.t(), mp0Var);
                if (serializableA != null) {
                    arrayList.add(serializableA);
                }
            }
            return arrayList;
        }
        if (i10 == 11) {
            Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(mp0Var.p())).doubleValue());
            mp0Var.f(2);
            return date;
        }
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(mp0Var.p()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(mp0Var.t() == 1);
        }
        if (i10 == 2) {
            int iZ = mp0Var.z();
            int iD = mp0Var.d();
            mp0Var.f(iZ);
            return new String(mp0Var.c(), iD, iZ);
        }
        if (i10 != 3) {
            return null;
        }
        HashMap map = new HashMap();
        while (true) {
            int iZ2 = mp0Var.z();
            int iD2 = mp0Var.d();
            mp0Var.f(iZ2);
            String str = new String(mp0Var.c(), iD2, iZ2);
            int iT = mp0Var.t();
            if (iT == 9) {
                return map;
            }
            Serializable serializableA2 = a(iT, mp0Var);
            if (serializableA2 != null) {
                map.put(str, serializableA2);
            }
        }
    }

    private static HashMap<String, Object> a(mp0 mp0Var) {
        int iX = mp0Var.x();
        HashMap<String, Object> map = new HashMap<>(iX);
        for (int i10 = 0; i10 < iX; i10++) {
            int iZ = mp0Var.z();
            int iD = mp0Var.d();
            mp0Var.f(iZ);
            String str = new String(mp0Var.c(), iD, iZ);
            Serializable serializableA = a(mp0Var.t(), mp0Var);
            if (serializableA != null) {
                map.put(str, serializableA);
            }
        }
        return map;
    }

    public final long a() {
        return this.f23179b;
    }

    public final boolean a(long j10, mp0 mp0Var) {
        if (mp0Var.t() != 2) {
            return false;
        }
        int iZ = mp0Var.z();
        int iD = mp0Var.d();
        mp0Var.f(iZ);
        if (!"onMetaData".equals(new String(mp0Var.c(), iD, iZ)) || mp0Var.a() == 0 || mp0Var.t() != 8) {
            return false;
        }
        HashMap<String, Object> mapA = a(mp0Var);
        Object obj = mapA.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f23179b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapA.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f23180c = new long[size];
                this.f23181d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f23180c = new long[0];
                        this.f23181d = new long[0];
                        break;
                    }
                    this.f23180c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f23181d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public final long[] b() {
        return this.f23181d;
    }

    public final long[] c() {
        return this.f23180c;
    }
}
