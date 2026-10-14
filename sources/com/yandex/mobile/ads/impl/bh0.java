package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class bh0 {
    public static double a(List list) {
        Object next;
        List listB;
        fd.j0.i(list, "imageValues");
        ArrayList arrayList = new ArrayList(kc.m.j(list, 10));
        Iterator it = list.iterator();
        while (true) {
            double dE = 0.0d;
            if (!it.hasNext()) {
                break;
            }
            j20 j20Var = (j20) it.next();
            if (j20Var.a() != 0) {
                dE = ((double) j20Var.e()) / ((double) j20Var.a());
            }
            arrayList.add(Double.valueOf(dE));
        }
        ArrayList arrayList2 = new ArrayList(kc.m.j(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(xc.b.b(((Number) it2.next()).doubleValue() * ((double) 1000))));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList2.iterator();
        while (true) {
            int iIntValue = 1;
            if (!it3.hasNext()) {
                break;
            }
            int iIntValue2 = ((Number) it3.next()).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue2);
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(iIntValue2));
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            linkedHashMap.put(numValueOf, Integer.valueOf(iIntValue));
        }
        Iterator it4 = linkedHashMap.entrySet().iterator();
        if (it4.hasNext()) {
            next = it4.next();
            if (it4.hasNext()) {
                int iIntValue3 = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it4.next();
                    int iIntValue4 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (iIntValue3 < iIntValue4) {
                        next = next2;
                        iIntValue3 = iIntValue4;
                    }
                } while (it4.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        Integer num2 = entry != null ? (Integer) entry.getValue() : null;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it5 = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean z10 = false;
            if (!it5.hasNext()) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it5.next();
            int iIntValue5 = ((Number) entry2.getValue()).intValue();
            if (num2 != null && iIntValue5 == num2.intValue()) {
                z10 = true;
            }
            if (z10) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
        Iterator it6 = linkedHashMap2.entrySet().iterator();
        while (it6.hasNext()) {
            arrayList3.add(Double.valueOf(((double) ((Number) ((Map.Entry) it6.next()).getKey()).intValue()) / ((double) 1000)));
        }
        fd.j0.i(arrayList3, "<this>");
        if (arrayList3.size() <= 1) {
            listB = kc.t.H(arrayList3);
        } else {
            Object[] array = arrayList3.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            fd.j0.i(comparableArr, "<this>");
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            listB = kc.i.b(array);
        }
        int size = listB.size();
        int i10 = size / 2;
        if (arrayList3.isEmpty()) {
            return 0.0d;
        }
        int i11 = size % 2;
        if (i11 + ((((i11 ^ 2) & ((-i11) | i11)) >> 31) & 2) == 1) {
            return ((Number) listB.get(i10)).doubleValue();
        }
        return (((Number) listB.get(i10 - 1)).doubleValue() + ((Number) listB.get(i10)).doubleValue()) / ((double) 2);
    }
}
