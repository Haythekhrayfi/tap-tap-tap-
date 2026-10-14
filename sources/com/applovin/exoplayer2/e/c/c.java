package com.applovin.exoplayer2.e.c;

import com.applovin.exoplayer2.e.g;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class c extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f5286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f5287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f5288d;

    public c() {
        super(new g());
        this.f5286b = -9223372036854775807L;
        this.f5287c = new long[0];
        this.f5288d = new long[0];
    }

    private static Object a(y yVar, int i10) {
        if (i10 == 0) {
            return d(yVar);
        }
        if (i10 == 1) {
            return c(yVar);
        }
        if (i10 == 2) {
            return e(yVar);
        }
        if (i10 == 3) {
            return g(yVar);
        }
        if (i10 == 8) {
            return h(yVar);
        }
        if (i10 == 10) {
            return f(yVar);
        }
        if (i10 != 11) {
            return null;
        }
        return i(yVar);
    }

    private static int b(y yVar) {
        return yVar.h();
    }

    private static Boolean c(y yVar) {
        return Boolean.valueOf(yVar.h() == 1);
    }

    private static Double d(y yVar) {
        return Double.valueOf(Double.longBitsToDouble(yVar.s()));
    }

    private static String e(y yVar) {
        int i10 = yVar.i();
        int iC = yVar.c();
        yVar.e(i10);
        return new String(yVar.d(), iC, i10);
    }

    private static ArrayList<Object> f(y yVar) {
        int iW = yVar.w();
        ArrayList<Object> arrayList = new ArrayList<>(iW);
        for (int i10 = 0; i10 < iW; i10++) {
            Object objA = a(yVar, b(yVar));
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }

    private static HashMap<String, Object> g(y yVar) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strE = e(yVar);
            int iB = b(yVar);
            if (iB == 9) {
                return map;
            }
            Object objA = a(yVar, iB);
            if (objA != null) {
                map.put(strE, objA);
            }
        }
    }

    private static HashMap<String, Object> h(y yVar) {
        int iW = yVar.w();
        HashMap<String, Object> map = new HashMap<>(iW);
        for (int i10 = 0; i10 < iW; i10++) {
            String strE = e(yVar);
            Object objA = a(yVar, b(yVar));
            if (objA != null) {
                map.put(strE, objA);
            }
        }
        return map;
    }

    private static Date i(y yVar) {
        Date date = new Date((long) d(yVar).doubleValue());
        yVar.e(2);
        return date;
    }

    public long a() {
        return this.f5286b;
    }

    @Override // com.applovin.exoplayer2.e.c.d
    public boolean a(y yVar) {
        return true;
    }

    @Override // com.applovin.exoplayer2.e.c.d
    public boolean a(y yVar, long j10) {
        if (b(yVar) != 2 || !"onMetaData".equals(e(yVar)) || b(yVar) != 8) {
            return false;
        }
        HashMap<String, Object> mapH = h(yVar);
        Object obj = mapH.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f5286b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapH.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f5287c = new long[size];
                this.f5288d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f5287c = new long[0];
                        this.f5288d = new long[0];
                        break;
                    }
                    this.f5287c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f5288d[i10] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public long[] b() {
        return this.f5287c;
    }

    public long[] c() {
        return this.f5288d;
    }
}
