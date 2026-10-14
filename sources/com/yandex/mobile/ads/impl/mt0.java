package com.yandex.mobile.ads.impl;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class mt0 implements sa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sa0.a f23138a = new sa0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oa f23139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f23140c;

    public mt0(float f10) {
        this.f23140c = f10;
        this.f23139b = new oa(f10);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    @Override // com.yandex.mobile.ads.impl.sa0
    public final sa0.a a(int i10, int i11) {
        int iB;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824) {
            if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
                int iA = this.f23139b.a(size);
                if (mode2 == Integer.MIN_VALUE) {
                    iA = Math.min(size2, iA);
                }
                i11 = View.MeasureSpec.makeMeasureSpec(iA, 1073741824);
            } else if (mode2 != 1073741824) {
                if (mode != Integer.MIN_VALUE || mode == 0) {
                    iB = this.f23139b.b(size2);
                    if (mode == Integer.MIN_VALUE) {
                        iB = Math.min(size, iB);
                    }
                    i10 = View.MeasureSpec.makeMeasureSpec(iB, 1073741824);
                } else if (mode2 == Integer.MIN_VALUE) {
                    if (size / size2 > this.f23140c) {
                        i10 = View.MeasureSpec.makeMeasureSpec(this.f23139b.b(size2), 1073741824);
                        i11 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                    } else {
                        int iA2 = this.f23139b.a(size);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        i11 = View.MeasureSpec.makeMeasureSpec(iA2, 1073741824);
                        i10 = iMakeMeasureSpec;
                    }
                }
            } else if (mode2 == Integer.MIN_VALUE) {
                if (size / size2 > this.f23140c) {
                    i10 = View.MeasureSpec.makeMeasureSpec(this.f23139b.b(size2), 1073741824);
                    i11 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                } else {
                    int iA3 = this.f23139b.a(size);
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                    i11 = View.MeasureSpec.makeMeasureSpec(iA3, 1073741824);
                    i10 = iMakeMeasureSpec2;
                }
            }
        } else if (mode2 != 1073741824) {
            if (mode != Integer.MIN_VALUE || mode == 0) {
                iB = this.f23139b.b(size2);
                if (mode == Integer.MIN_VALUE) {
                    iB = Math.min(size, iB);
                }
                i10 = View.MeasureSpec.makeMeasureSpec(iB, 1073741824);
            } else if (mode2 == Integer.MIN_VALUE) {
                if (size / size2 > this.f23140c) {
                    i10 = View.MeasureSpec.makeMeasureSpec(this.f23139b.b(size2), 1073741824);
                    i11 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                } else {
                    int iA4 = this.f23139b.a(size);
                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                    i11 = View.MeasureSpec.makeMeasureSpec(iA4, 1073741824);
                    i10 = iMakeMeasureSpec3;
                }
            }
        } else if (mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 != 0 && size != 0) {
            if (size / size2 > this.f23140c) {
                i10 = View.MeasureSpec.makeMeasureSpec(this.f23139b.b(size2), 1073741824);
                i11 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            } else {
                int iA5 = this.f23139b.a(size);
                int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i11 = View.MeasureSpec.makeMeasureSpec(iA5, 1073741824);
                i10 = iMakeMeasureSpec4;
            }
        }
        sa0.a aVar = this.f23138a;
        aVar.f25006a = i10;
        aVar.f25007b = i11;
        return aVar;
    }
}
