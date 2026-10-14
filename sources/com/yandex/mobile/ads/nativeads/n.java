package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.t6;
import com.yandex.mobile.ads.impl.u60;
import com.yandex.mobile.ads.impl.x60;
import com.yandex.mobile.ads.nativeads.l0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n<T extends l0> extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f27794a;

    public n(Context context) {
        super(context);
    }

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public n(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    private void a(int i10) {
        x60.d(u60.a("onVisibilityChanged(), visibility = ", i10), new Object[0]);
        T t10 = this.f27794a;
        if (t10 != null) {
            StringBuilder sbA = androidx.appcompat.widget.r0.a("onVisibilityChanged(), visibility = ", i10, ", clazz = ");
            int i11 = t6.f25286b;
            sbA.append(t10.toString());
            x60.d(sbA.toString(), new Object[0]);
            if (i10 == 0) {
                t10.f();
            } else {
                t10.g();
            }
        }
    }

    public final void a(T t10) {
        this.f27794a = t10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T t10 = this.f27794a;
        if (t10 != null) {
            t10.f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        T t10 = this.f27794a;
        if (t10 != null) {
            t10.g();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        x60.d("onVisibilityChanged(), changedView = %s, viewVisibility = %s", view, Integer.valueOf(i10));
        a((i10 == 0 && isShown()) ? 0 : 8);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        x60.d("onWindowVisibilityChanged(), windowVisibility = %s, this.getVisibility = %s", Integer.valueOf(i10), Integer.valueOf(getVisibility()));
        a((i10 == 0 && getVisibility() == 0) ? 0 : 8);
        super.onWindowVisibilityChanged(i10);
    }
}
