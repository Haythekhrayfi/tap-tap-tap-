package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class r7 implements sa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gp f24610b = new gp();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hp f24611c = new hp();

    public r7(Context context) {
        this.f24609a = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.sa0
    public final sa0.a a(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode != 0) {
            Context context = this.f24609a;
            int i12 = eh1.f20253b;
            int iMin = context.getResources().getDisplayMetrics().widthPixels;
            hp hpVar = this.f24611c;
            Context context2 = this.f24609a;
            Objects.requireNonNull(hpVar);
            int iA = hp.a(context2, 420.0f);
            int i13 = this.f24609a.getResources().getConfiguration().orientation;
            if (this.f24610b.a(this.f24609a) != 1 || i13 != 1) {
                iMin = Math.min(iMin, iA);
            }
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(iMin, size), 1073741824);
        }
        if (mode2 != 0) {
            Context context3 = this.f24609a;
            int i14 = eh1.f20253b;
            int i15 = context3.getResources().getDisplayMetrics().heightPixels;
            hp hpVar2 = this.f24611c;
            Context context4 = this.f24609a;
            Objects.requireNonNull(hpVar2);
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(Math.min(i15, hp.a(context4, 350.0f)), size2), 1073741824);
        }
        sa0.a aVar = new sa0.a();
        aVar.f25007b = i11;
        aVar.f25006a = i10;
        return aVar;
    }
}
