package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class hp0 {
    /* JADX WARN: Code duplicated, block: B:14:0x0036 A[PHI: r4
  0x0036: PHI (r4v1 java.lang.Object) = (r4v3 java.lang.Object), (r4v4 java.lang.Object) binds: [B:5:0x000d, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    private static ArrayList b(View view) {
        Object obj;
        ViewGroup viewGroup;
        ArrayList arrayList = new ArrayList();
        if (!eh1.d(view)) {
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
                if (eh1.e(viewGroup)) {
                    obj = view;
                    obj = viewGroup;
                    obj = view;
                    arrayList.add(obj);
                } else {
                    obj = view;
                    obj = viewGroup;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        arrayList2.addAll(b(viewGroup.getChildAt(i10)));
                    }
                    arrayList.addAll(arrayList2);
                }
            } else {
                obj = view;
                obj = viewGroup;
                obj = view;
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final ArrayList a(View view) {
        ?? r10;
        ArrayList<View> arrayList;
        ?? r11;
        ArrayList arrayList2 = new ArrayList();
        int i10 = eh1.f20253b;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            arrayList = arrayList2;
            r10 = view;
            r10 = (ViewGroup) parent;
            r11 = r10;
        } else {
            r10 = view;
            r10 = 0;
            arrayList = arrayList2;
            r11 = view;
        }
        while (r10 != 0) {
            int iIndexOfChild = r10.indexOfChild(r10);
            while (true) {
                iIndexOfChild++;
                if (iIndexOfChild >= r10.getChildCount()) {
                    break;
                }
                arrayList.addAll(b(r10.getChildAt(iIndexOfChild)));
            }
            ViewParent parent2 = r10.getParent();
            if (parent2 instanceof ViewGroup) {
                r10 = (ViewGroup) parent2;
            } else {
                r10 = 0;
                arrayList = arrayList;
                r11 = r11;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        float z10 = r11.getZ();
        for (View view2 : arrayList) {
            if (z10 <= view2.getZ()) {
                arrayList3.add(view2);
            }
        }
        return arrayList3;
    }
}
