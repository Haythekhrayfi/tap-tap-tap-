package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class Sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Float, Integer> f15028a = new HashMap();

    public Sk(TreeSet<Float> treeSet) {
        Iterator<Float> it = treeSet.descendingSet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            this.f15028a.put(it.next(), Integer.valueOf(i10));
            i10++;
        }
    }

    public void a(El el) {
        el.f13938s = this.f15028a.get(el.f13932m);
    }
}
