package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PW extends RelativeLayout {
    public static String[] A03 = {"Z7YDROQZDOzGgLZ6JRzm0VB6SZj4zDor", "PEDxZ1hmcJv2HtokqPZuboN03zqPqfuu", "ZN3aiXgGzfL", "UoQOzdqMFdmvRVk6jZTbQbhJ01APWmUd", "BWydKlRDXGFiivyHlYlBLR13h8bygoZy", "calSGpe10AH6YV6oPZJsWkhcYoOFDSm8", "CqyCvSup05V", "6oqVw1T1HmkJfSZKyFG8rr7XXeYSScI0"};
    public C06606h A00;
    public WeakReference<PV> A01;
    public final QM A02;

    /* JADX WARN: Multi-variable type inference failed */
    public PW(C1337Xw c1337Xw, QM qm) {
        super(c1337Xw);
        this.A02 = qm;
        LO.A0J((View) qm);
        addView(qm.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A00(PN pn) {
        addView(pn, new RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (C06606h) pn;
    }

    public final void A01(PN pn) {
        LO.A0J(pn);
        this.A00 = null;
    }

    public final boolean A02() {
        return this.A02.A8R();
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ((View) this.A02).layout(0, 0, getWidth(), getHeight());
        C06606h c06606h = this.A00;
        if (c06606h != null) {
            c06606h.layout(0, 0, getWidth(), getHeight());
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = false;
        int videoWidth = this.A02.getVideoWidth();
        int heightSpecSize = this.A02.getVideoHeight();
        int defaultSize = getDefaultSize(videoWidth, i10);
        int height = getDefaultSize(heightSpecSize, i11);
        if (videoWidth > 0 && heightSpecSize > 0) {
            z10 = true;
            int widthSpecMode = View.MeasureSpec.getMode(i10);
            String[] strArr = A03;
            String str = strArr[5];
            String str2 = strArr[4];
            int mVideoWidth = str.charAt(24);
            if (mVideoWidth == str2.charAt(24)) {
                throw new RuntimeException();
            }
            A03[1] = "CDDJeYuNvDEJubiWpvjZnzRFdpaPIWUA";
            int widthSpecSize = View.MeasureSpec.getSize(i10);
            int mVideoHeight = View.MeasureSpec.getMode(i11);
            int mVideoWidth2 = View.MeasureSpec.getSize(i11);
            if (widthSpecMode != 1073741824 || mVideoHeight != 1073741824) {
                if (widthSpecMode == 1073741824) {
                    defaultSize = widthSpecSize;
                    height = (defaultSize * heightSpecSize) / videoWidth;
                    if (mVideoHeight == Integer.MIN_VALUE && height > mVideoWidth2) {
                        height = mVideoWidth2;
                    }
                } else if (mVideoHeight == 1073741824) {
                    height = mVideoWidth2;
                    defaultSize = (height * videoWidth) / heightSpecSize;
                    String[] strArr2 = A03;
                    String str3 = strArr2[7];
                    String str4 = strArr2[0];
                    int mVideoHeight2 = str3.charAt(1);
                    int mVideoWidth3 = str4.charAt(1);
                    if (mVideoHeight2 != mVideoWidth3) {
                        String[] strArr3 = A03;
                        strArr3[7] = "6OY3VkVRTo9gTvB5T4EFQBtDC7FaIDf0";
                        strArr3[0] = "lXHmnICBdoyL7DjWTMRRGmshSxtLnfI6";
                        if (widthSpecMode == Integer.MIN_VALUE) {
                            if (defaultSize > widthSpecSize) {
                                defaultSize = widthSpecSize;
                            }
                        }
                    } else if (widthSpecMode == Integer.MIN_VALUE) {
                        if (defaultSize > widthSpecSize) {
                            defaultSize = widthSpecSize;
                        }
                    }
                } else {
                    defaultSize = videoWidth;
                    height = heightSpecSize;
                    if (mVideoHeight == Integer.MIN_VALUE && height > mVideoWidth2) {
                        height = mVideoWidth2;
                        defaultSize = (height * videoWidth) / heightSpecSize;
                    }
                    if (widthSpecMode == Integer.MIN_VALUE && defaultSize > widthSpecSize) {
                        defaultSize = widthSpecSize;
                        height = (defaultSize * heightSpecSize) / videoWidth;
                    }
                }
            } else {
                defaultSize = widthSpecSize;
                height = mVideoWidth2;
                int mVideoWidth4 = defaultSize * heightSpecSize;
                if (videoWidth * height < mVideoWidth4) {
                    defaultSize = (height * videoWidth) / heightSpecSize;
                } else {
                    int i12 = videoWidth * height;
                    int i13 = defaultSize * heightSpecSize;
                    if (A03[3].charAt(9) != 104) {
                        A03[3] = "fC7LLJ1Dm89Wzyv9Y7CU7RKyEHK0kUw2";
                        if (i12 > i13) {
                            height = (defaultSize * heightSpecSize) / videoWidth;
                        }
                    } else if (i12 > i13) {
                        height = (defaultSize * heightSpecSize) / videoWidth;
                    }
                }
            }
        }
        setMeasuredDimension(defaultSize, height);
        int mVideoWidth5 = A03[3].charAt(9);
        if (mVideoWidth5 != 104) {
            A03[1] = "jUvlMuc6V7f2FSIr4bukaecFyxTPY1HC";
            if (!z10) {
                return;
            }
        } else if (!z10) {
            return;
        }
        WeakReference<PV> weakReference = this.A01;
        if (weakReference != null && weakReference.get() != null) {
            this.A01.get().ADE();
        }
    }

    public void setViewImplInflationListener(PV pv) {
        this.A01 = new WeakReference<>(pv);
    }
}
