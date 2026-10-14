package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TH extends C1059Na {
    public static String[] A01 = {"ApYQLHiJfFoQxPLev3v1RnZtjL3Htxrs", "bo2sqrskjgNWasJuJCrp16cZ2XBNeh8X", "emwWE4rUfgFwy6LExYmEfzkDvXYAedhg", "bPVrpfjvf63ND9vhKC9W9DFqAg6wIvw3", "k6ukfOYu7hE0QQIPVs49Kdk3IYXWEofH", "fvCBaRVGvF6m5ZfwhdbeNg6rR0MmpiyE", "HEJk8ccdn4XKVem16EvPwrOEFwPjrKpO", "Ip6ocVLC"};
    public ImageView.ScaleType A00;

    public TH(C1337Xw c1337Xw) {
        super(c1337Xw);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int heightSpecSize;
        int heightSpecSize2;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int heightSpecSize3 = View.MeasureSpec.getMode(i10);
        if (heightSpecSize3 == 1073741824) {
            int heightSpecSize4 = View.MeasureSpec.getMode(i11);
            if (heightSpecSize4 == 1073741824) {
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
        int widthSpecSize = A01[5].charAt(24);
        if (widthSpecSize == 121) {
            throw new RuntimeException();
        }
        A01[1] = "60jXKIpbxaQwCHoxf9ChBAtjlKdb11wg";
        if (scaleType != null) {
            super.setScaleType(scaleType);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        this.A00 = scaleType;
    }
}
