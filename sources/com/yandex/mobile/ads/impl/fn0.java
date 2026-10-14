package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class fn0 {
    public static InputStream a(ex0 ex0Var) {
        fd.j0.i(ex0Var, "response");
        ix0 ix0VarA = ex0Var.a();
        if (ix0VarA != null) {
            return ix0VarA.a();
        }
        return null;
    }

    public static URL a(mw0 mw0Var, q91 q91Var) throws IOException {
        fd.j0.i(mw0Var, "request");
        String strM = mw0Var.m();
        if (q91Var != null) {
            String strA = q91Var.a(strM);
            if (strA == null) {
                throw new IOException(fn1.a("URL blocked by rewriter: ", strM));
            }
            strM = strA;
        }
        return new URL(strM);
    }

    public static ArrayList a(TreeMap treeMap) {
        fd.j0.i(treeMap, "requestHeaders");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                arrayList.add(new oy(str, (String) it.next()));
            }
        }
        return arrayList;
    }

    public static boolean a(int i10, int i11) {
        if (i10 != 4) {
            if (!(100 <= i11 && i11 < 200) && i11 != 204 && i11 != 304) {
                return true;
            }
        }
        return false;
    }
}
