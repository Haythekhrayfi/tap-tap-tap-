package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05772x {
    public static String[] A05 = {"efs8eZdEWHsCfUb6qOzicmMnQm4SneBY", "GPD1kjm6fR3i7blABsL8PkfqVt5tQ0ec", "1ZMAOqgxiysbgCK2QhJ8YR6mzQdOOVTU", "tADzoHnDRwqyF4JfOWpRm", "", "2dCxtsKJi8key4A0", "YZUwpVg0T4azRRaUQd2X9mlkfrI9cQeh", "C6BrW2LKkOXM7XSn"};
    public ViewParent A00;
    public ViewParent A01;
    public boolean A02;
    public int[] A03;
    public final View A04;

    public C05772x(View view) {
        this.A04 = view;
    }

    private ViewParent A00(int i10) {
        switch (i10) {
            case 0:
                return this.A01;
            case 1:
                return this.A00;
            default:
                return null;
        }
    }

    private void A01(int i10, ViewParent viewParent) {
        switch (i10) {
            case 0:
                this.A01 = viewParent;
                break;
            case 1:
                this.A00 = viewParent;
                break;
        }
    }

    public final void A02() {
        A03(0);
    }

    public final void A03(int i10) {
        ViewParent viewParentA00 = A00(i10);
        if (viewParentA00 != null) {
            C3V.A02(viewParentA00, this.A04, i10);
            A01(i10, null);
        }
    }

    public final void A04(boolean z10) {
        if (this.A02) {
            C3F.A08(this.A04);
        }
        this.A02 = z10;
    }

    public final boolean A05() {
        return A09(0);
    }

    public final boolean A06() {
        return this.A02;
    }

    public final boolean A07(float f10, float f11) {
        ViewParent viewParentA00;
        if (!A06() || (viewParentA00 = A00(0)) == null) {
            return false;
        }
        return C3V.A06(viewParentA00, this.A04, f10, f11);
    }

    public final boolean A08(float f10, float f11, boolean z10) {
        ViewParent viewParentA00;
        if (!A06() || (viewParentA00 = A00(0)) == null) {
            return false;
        }
        return C3V.A07(viewParentA00, this.A04, f10, f11, z10);
    }

    public final boolean A09(int i10) {
        return A00(i10) != null;
    }

    public final boolean A0A(int i10) {
        return A0B(i10, 0);
    }

    public final boolean A0B(int i10, int i11) {
        if (A09(i11)) {
            return true;
        }
        if (A06()) {
            if (A05[0].charAt(13) == 't') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "WHooJguTbRSPJrOooyt3LEnarcCTCzBe";
            strArr[1] = "8Bjeqw0rr3DdKBFvYwfvH0FxnGa8049d";
            View view = this.A04;
            for (ViewParent parent = this.A04.getParent(); parent != null; parent = parent.getParent()) {
                if (C3V.A08(parent, view, this.A04, i10, i11)) {
                    A01(i11, parent);
                    C3V.A05(parent, view, this.A04, i10, i11);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean A0C(int i10, int i11, int i12, int i13, int[] iArr) {
        return A0D(i10, i11, i12, i13, iArr, 0);
    }

    public final boolean A0D(int i10, int i11, int i12, int i13, int[] iArr, int startX) {
        ViewParent viewParentA00;
        if (!A06() || (viewParentA00 = A00(startX)) == null) {
            return false;
        }
        if (i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
            int i14 = 0;
            int i15 = 0;
            if (iArr != null) {
                this.A04.getLocationInWindow(iArr);
                i14 = iArr[0];
                i15 = iArr[1];
            }
            C3V.A03(viewParentA00, this.A04, i10, i11, i12, i13, startX);
            if (iArr != null) {
                this.A04.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - i14;
                iArr[1] = iArr[1] - i15;
            }
            return true;
        }
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return false;
    }

    public final boolean A0E(int i10, int i11, int[] iArr, int[] iArr2) {
        return A0F(i10, i11, iArr, iArr2, 0);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    public final boolean A0F(int startX, int startY, int[] iArr, int[] iArr2, int i10) {
        ViewParent parent;
        int[] consumed = iArr;
        if (!A06() || (parent = A00(i10)) == null) {
            return false;
        }
        if (startX != 0 || startY != 0) {
            int i11 = 0;
            int i12 = 0;
            if (A05[3].length() != 9) {
                A05[0] = "3VbjZKhXDsexEmt2meqPVZABMNEQkFPW";
                if (iArr2 != null) {
                    this.A04.getLocationInWindow(iArr2);
                    i11 = iArr2[0];
                    i12 = iArr2[1];
                }
                if (consumed == null) {
                    int[] iArr3 = this.A03;
                    String[] strArr = A05;
                    if (strArr[5].length() != strArr[7].length()) {
                        A05[4] = "";
                        if (iArr3 == null) {
                            this.A03 = new int[2];
                        }
                    } else {
                        String[] strArr2 = A05;
                        strArr2[5] = "gHL5QaZEq3qu3ZW6";
                        strArr2[7] = "on2hgQBHubksAtN0";
                        if (iArr3 == null) {
                            this.A03 = new int[2];
                        }
                    }
                    consumed = this.A03;
                }
                consumed[0] = 0;
                consumed[1] = 0;
                C3V.A04(parent, this.A04, startX, startY, consumed, i10);
                if (iArr2 != null) {
                    this.A04.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i11;
                    iArr2[1] = iArr2[1] - i12;
                }
                return (consumed[0] == 0 && consumed[1] == 0) ? false : true;
            }
            throw new RuntimeException();
        }
        if (iArr2 != null) {
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        return false;
    }
}
