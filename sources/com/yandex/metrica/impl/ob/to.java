package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class to implements uo<List<so>> {
    @Override // com.yandex.metrica.impl.ob.uo
    public so a(List<so> list) {
        LinkedList linkedList = new LinkedList();
        boolean z10 = true;
        for (so soVar : list) {
            if (!soVar.b()) {
                linkedList.add(soVar.a());
                z10 = false;
            }
        }
        return z10 ? so.a(this) : so.a(this, TextUtils.join(", ", linkedList));
    }
}
