package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.StackTraceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.q7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1901q7 {
    public static final C1876p7 a(String str, String str2, List<? extends StackTraceItem> list, String str3, String str4, Map<String, String> map, String str5, Boolean bool) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(kc.m.j(list, 10));
            for (StackTraceItem stackTraceItem : list) {
                arrayList.add(new C1776l7(stackTraceItem.getClassName(), stackTraceItem.getFileName(), stackTraceItem.getLine(), stackTraceItem.getColumn(), stackTraceItem.getMethodName(), null));
            }
        } else {
            arrayList = null;
        }
        return new C1876p7(new C1826n7(str, str2, arrayList, null, null), null, null, str3, str4, map, str5, bool);
    }

    public static final C1876p7 a(Throwable th, C1602e7 c1602e7, List<StackTraceElement> list, String str, Boolean bool) {
        ArrayList arrayList = null;
        C1826n7 c1826n7A = th != null ? C1851o7.a(th) : null;
        if (list != null) {
            arrayList = new ArrayList(kc.m.j(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C1776l7((StackTraceElement) it.next()));
            }
        }
        return new C1876p7(c1826n7A, c1602e7, arrayList, null, null, null, str, bool);
    }
}
