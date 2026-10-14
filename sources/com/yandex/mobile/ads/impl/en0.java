package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class en0 {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f20295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final bi1 f20296b;

        private a(String str, bi1 bi1Var) {
            this.f20295a = str;
            this.f20296b = bi1Var;
        }

        public /* synthetic */ a(String str, bi1 bi1Var, int i10) {
            this(str, bi1Var);
        }
    }

    public static wm0 a(mw0<?> mw0Var, long j10, List<oy> list) {
        eg.a aVarD = mw0Var.d();
        if (aVarD == null) {
            return new wm0(304, (byte[]) null, true, j10, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<oy> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<oy> list2 = aVarD.f20246h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (oy oyVar : aVarD.f20246h) {
                    if (!treeSet.contains(oyVar.a())) {
                        arrayList.add(oyVar);
                    }
                }
            }
        } else if (!aVarD.f20245g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVarD.f20245g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new oy(entry.getKey(), entry.getValue()));
                }
            }
        }
        return new wm0(304, aVarD.f20239a, true, j10, (List<oy>) arrayList);
    }

    public static void a(long j10, mw0<?> mw0Var, byte[] bArr, int i10) {
        if (ci1.f19511a || j10 > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = mw0Var;
            objArr[1] = Long.valueOf(j10);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(i10);
            objArr[4] = Integer.valueOf(mw0Var.i().a());
            x60.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    public static byte[] a(InputStream inputStream, int i10, ag agVar) throws Throwable {
        byte[] bArrA;
        xr0 xr0Var = new xr0(agVar, i10);
        try {
            bArrA = agVar.a(1024);
            while (true) {
                try {
                    int i11 = inputStream.read(bArrA);
                    if (i11 == -1) {
                        break;
                    }
                    xr0Var.write(bArrA, 0, i11);
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        boolean z10 = ci1.f19511a;
                        x60.e("Error occurred when closing InputStream", new Object[0]);
                    }
                    agVar.a(bArrA);
                    xr0Var.close();
                    throw th;
                }
            }
            byte[] byteArray = xr0Var.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                boolean z11 = ci1.f19511a;
                x60.e("Error occurred when closing InputStream", new Object[0]);
            }
            agVar.a(bArrA);
            xr0Var.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArrA = null;
        }
    }
}
