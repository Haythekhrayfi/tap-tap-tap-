package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.SizeInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class sg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final jc.e f25101a = jc.f.b(a.f25102a);

    public static final class a extends vc.l implements uc.a<Handler> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f25102a = new a();

        public a() {
            super(0);
        }

        @Override // uc.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final void a(ViewGroup viewGroup, View view, Context context, SizeInfo sizeInfo, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(view, "contentView");
        ((Handler) f25101a.getValue()).post(new jo1(viewGroup, view, context, sizeInfo, onPreDrawListener));
    }

    public static final void a(ViewGroup viewGroup, boolean z10) {
        ((Handler) f25101a.getValue()).post(new com.applovin.exoplayer2.b.e0(viewGroup, z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ViewGroup viewGroup, View view, Context context, SizeInfo sizeInfo, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        fd.j0.i(view, "$contentView");
        fd.j0.i(context, "$context");
        if (viewGroup == null || viewGroup.indexOfChild(view) != -1) {
            return;
        }
        RelativeLayout.LayoutParams layoutParamsA = m5.a(context, sizeInfo);
        fd.j0.h(layoutParamsA, "adLayoutParams(context, sizeInfo)");
        view.setVisibility(0);
        viewGroup.addView(view, layoutParamsA);
        if (onPreDrawListener != null) {
            eh1.a(view, onPreDrawListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ViewGroup viewGroup, boolean z10) {
        int childCount;
        if (viewGroup == null || viewGroup.getChildCount() <= 0 || (childCount = viewGroup.getChildCount() - (!z10 ? 1 : 0)) <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(childCount);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof oe) {
                arrayList.add(childAt);
            }
        }
        viewGroup.removeViews(0, childCount);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((oe) arrayList.get(i11)).e();
        }
        arrayList.clear();
    }
}
