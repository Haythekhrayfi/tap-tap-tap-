package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class h30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mh1 f21293a = new mh1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nf f21294b = new nf();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hp f21295c = new hp();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap<FrameLayout, WeakReference<mf>> f21296d = new WeakHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakHashMap<FrameLayout, WeakReference<i30>> f21297e = new WeakHashMap<>();

    public final void a(FrameLayout frameLayout) {
        WeakReference<mf> weakReference = this.f21296d.get(frameLayout);
        mf mfVar = weakReference != null ? weakReference.get() : null;
        if (mfVar != null) {
            this.f21296d.remove(frameLayout);
            frameLayout.removeView(mfVar);
        }
        WeakReference<i30> weakReference2 = this.f21297e.get(frameLayout);
        i30 i30Var = weakReference2 != null ? weakReference2.get() : null;
        if (i30Var != null) {
            this.f21297e.remove(frameLayout);
            frameLayout.removeView(i30Var);
        }
    }

    public final void a(FrameLayout frameLayout, la1 la1Var, boolean z10) {
        i30 i30Var;
        WeakReference<mf> weakReference = this.f21296d.get(frameLayout);
        mf mfVar = weakReference != null ? weakReference.get() : null;
        if (mfVar == null) {
            mfVar = new mf(frameLayout.getContext(), this.f21295c);
            this.f21296d.put(frameLayout, new WeakReference<>(mfVar));
            frameLayout.addView(mfVar);
        }
        Objects.requireNonNull(this.f21294b);
        mfVar.setColor(z10 ? -65536 : -16711936);
        if (!z10) {
            WeakReference<i30> weakReference2 = this.f21297e.get(frameLayout);
            i30Var = weakReference2 != null ? weakReference2.get() : null;
            if (i30Var != null) {
                this.f21297e.remove(frameLayout);
                frameLayout.removeView(i30Var);
                return;
            }
            return;
        }
        WeakReference<i30> weakReference3 = this.f21297e.get(frameLayout);
        i30Var = weakReference3 != null ? weakReference3.get() : null;
        if (i30Var == null) {
            i30Var = new i30(frameLayout.getContext());
            this.f21297e.put(frameLayout, new WeakReference<>(i30Var));
            frameLayout.addView(i30Var);
        }
        i30Var.setDescription(this.f21293a.a(la1Var));
    }
}
