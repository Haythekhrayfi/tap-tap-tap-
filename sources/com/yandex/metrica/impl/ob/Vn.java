package com.yandex.metrica.impl.ob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class Vn extends Rn<Map<String, String>, Hn> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Un f15362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Un f15363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Comparator<Map.Entry<String, String>> f15364d;

    public class a implements Comparator<Map.Entry<String, String>> {
        public a(Vn vn) {
        }

        @Override // java.util.Comparator
        public int compare(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
            String value = entry.getValue();
            String value2 = entry2.getValue();
            int length = O2.c(value).length;
            int length2 = O2.c(value2).length;
            if (length < length2) {
                return -1;
            }
            return length == length2 ? 0 : 1;
        }
    }

    public Vn(int i10, int i11, int i12) {
        this(i10, new Un(i11), new Un(i12));
    }

    public Vn(int i10, Un un, Un un2) {
        super(i10);
        this.f15364d = new a(this);
        this.f15362b = un;
        this.f15363c = un2;
    }

    @Override // com.yandex.metrica.impl.ob.Rn
    public Qn<Map<String, String>, Hn> a(Map<String, String> map) {
        HashMap map2;
        int iA;
        int i10 = 0;
        if (map != null) {
            map2 = new HashMap();
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) setEntrySet.toArray(new Map.Entry[setEntrySet.size()]);
            Arrays.sort(entryArr, this.f15364d);
            int length = entryArr.length;
            iA = 0;
            int i11 = 0;
            boolean z10 = false;
            int i12 = 0;
            while (i10 < length) {
                Map.Entry entry = entryArr[i10];
                Qn<String, Fn> qnA = this.f15362b.a((String) entry.getKey());
                Qn<String, Fn> qnA2 = this.f15363c.a((String) entry.getValue());
                int length2 = O2.c((String) entry.getKey()).length + O2.c((String) entry.getValue()).length;
                int length3 = O2.c(qnA.f14828a).length + O2.c(qnA2.f14828a).length;
                if (z10 || length3 + i12 > a()) {
                    i11++;
                    iA += length2;
                    z10 = true;
                } else {
                    iA = qnA2.f14829b.a() + qnA.f14829b.a() + iA;
                    int length4 = O2.c(qnA.f14828a).length + O2.c(qnA2.f14828a).length + i12;
                    map2.put(qnA.f14828a, qnA2.f14828a);
                    i12 = length4;
                }
                i10++;
            }
            i10 = i11;
        } else {
            map2 = null;
            iA = 0;
        }
        return new Qn<>(map2, new Hn(i10, iA));
    }
}
