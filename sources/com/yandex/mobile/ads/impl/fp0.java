package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class fp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp0 f20774a = new hp0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gp0 f20775b = new gp0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ep0 f20776c = new ep0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i01 f20777d = i01.b();

    public final int a(View view, Rect rect) {
        nz0 nz0VarA = this.f20777d.a(view.getContext());
        if (nz0VarA == null || !nz0VarA.T()) {
            return 0;
        }
        ArrayList<View> arrayListA = this.f20774a.a(view);
        Objects.requireNonNull(this.f20775b);
        ArrayList<Rect> arrayList = new ArrayList();
        for (View view2 : arrayListA) {
            Rect rect2 = new Rect();
            if (view2.getGlobalVisibleRect(rect2)) {
                arrayList.add(rect2);
            }
        }
        for (Rect rect3 : arrayList) {
            int i10 = rect3.left;
            int i11 = rect.left;
            rect3.left = Math.min(Math.max(i10, i11), rect.right);
            int i12 = rect3.top;
            int i13 = rect.top;
            rect3.top = Math.min(Math.max(i12, i13), rect.bottom);
            int i14 = rect3.right;
            int i15 = rect.left;
            rect3.right = Math.min(Math.max(i14, i15), rect.right);
            int i16 = rect3.bottom;
            int i17 = rect.top;
            rect3.bottom = Math.min(Math.max(i16, i17), rect.bottom);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Rect rect4 : arrayList) {
            if (rect4.width() > 0 && rect4.height() > 0) {
                arrayList2.add(rect4);
            }
        }
        int size = arrayList2.size();
        List listSubList = arrayList2;
        if (size > 100) {
            listSubList = arrayList2.subList(0, 100);
        }
        Objects.requireNonNull(this.f20776c);
        return ep0.a(rect, listSubList);
    }
}
