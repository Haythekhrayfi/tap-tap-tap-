package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class M5 extends ImageView {
    public static String[] A01 = {"", "xAgTXbjVi62PdicRvipr2yH2TBkp", "gkbD2s1xpJQg4uStKBrjHXnqoYLvnFUr", "soe6jIArtiQ", "3Vk7uiWTp4D98Qq5DBFXHdZ3JTbv3qUy", "5FE99nP0vOH07stjGxCxhCer", "JVbWipYt4YB", ""};
    public ImageView.ScaleType A00;

    public M5(C1337Xw c1337Xw) {
        super(c1337Xw);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    /* JADX WARN: Code duplicated, block: B:15:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int heightSpecSize;
        int heightSpecSize2;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int heightSpecSize3 = View.MeasureSpec.getMode(i10);
        if (heightSpecSize3 == 1073741824) {
            int mode = View.MeasureSpec.getMode(i11);
            String[] strArr = A01;
            String str = strArr[1];
            String str2 = strArr[5];
            int widthSpecSize = str.length();
            int heightSpecSize4 = str2.length();
            if (widthSpecSize == heightSpecSize4) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "LPpzUfvPRnl";
            strArr2[3] = "8xYze5Yy4ig";
            if (mode == 1073741824) {
                int heightSpecSize5 = Math.min(size2, size);
                setMeasuredDimension(heightSpecSize5, heightSpecSize5);
            } else {
                heightSpecSize = View.MeasureSpec.getMode(i10);
                if (heightSpecSize == 1073741824) {
                    if (size > 0) {
                        size2 = Math.min(size2, size);
                    }
                    setMeasuredDimension(size2, size2);
                } else {
                    heightSpecSize2 = View.MeasureSpec.getMode(i11);
                    if (heightSpecSize2 == 1073741824) {
                        if (size2 > 0) {
                            size = Math.min(size2, size);
                        }
                        setMeasuredDimension(size, size);
                    } else {
                        super.onMeasure(i10, i11);
                    }
                }
            }
        } else {
            heightSpecSize = View.MeasureSpec.getMode(i10);
            if (heightSpecSize == 1073741824) {
                if (size > 0) {
                    size2 = Math.min(size2, size);
                }
                setMeasuredDimension(size2, size2);
            } else {
                heightSpecSize2 = View.MeasureSpec.getMode(i11);
                if (heightSpecSize2 == 1073741824) {
                    if (size2 > 0) {
                        size = Math.min(size2, size);
                    }
                    setMeasuredDimension(size, size);
                } else {
                    super.onMeasure(i10, i11);
                }
            }
        }
        ImageView.ScaleType scaleType = this.A00;
        if (scaleType != null) {
            super.setScaleType(scaleType);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        this.A00 = scaleType;
    }
}
