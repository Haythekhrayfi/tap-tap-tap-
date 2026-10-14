package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class cn1 implements gm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f19572a = new int[2];

    @Override // com.yandex.mobile.ads.impl.gm1
    public final JSONObject a(View view) {
        if (view == null) {
            return rm1.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f19572a);
        int[] iArr = this.f19572a;
        return rm1.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.yandex.mobile.ads.impl.gm1
    public final void a(View view, JSONObject jSONObject, gm1.a aVar, boolean z10, boolean z11) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i10 = 0;
            if (!z10) {
                while (i10 < viewGroup.getChildCount()) {
                    ((i81) aVar).a(viewGroup.getChildAt(i10), this, jSONObject, z11);
                    i10++;
                }
                return;
            }
            HashMap map = new HashMap();
            while (i10 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i10);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i10++;
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) map.get((Float) it.next())).iterator();
                while (it2.hasNext()) {
                    ((i81) aVar).a((View) it2.next(), this, jSONObject, z11);
                }
            }
        }
    }
}
