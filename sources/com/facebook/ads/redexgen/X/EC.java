package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EC extends AbstractC1349Yi {
    public static String[] A02 = {"C44Ajl3kvJruV1G0pt7gVRuztfjSJyFq", "J5x5lFquh7whloqA7FngbvBzLsCb", "NWBvU5bW0Pue", "3", "BTAVkHunqM91yRRN2KcoYuZCergWfboL", "2NY5ANPTvwBPWrnTgdotgLNYCmp8", "bg7eF9CjngMlwdFplTojabi", "lLeEucKPPYu6Z0yxrpg2o1MG4v3W39r2"};
    public C4K A00;
    public C4K A01;

    private int A00(AbstractC06054a abstractC06054a, View view, C4K c4k) {
        int containerCenter;
        int iA0F = c4k.A0F(view) + (c4k.A0D(view) / 2);
        if (abstractC06054a.A1X()) {
            int iA0A = c4k.A0A();
            int childCenter = c4k.A0B();
            containerCenter = iA0A + (childCenter / 2);
        } else {
            int childCenter2 = c4k.A06();
            containerCenter = childCenter2 / 2;
        }
        return iA0F - containerCenter;
    }

    private View A01(AbstractC06054a abstractC06054a, C4K c4k) {
        int childCenter;
        int iA0W = abstractC06054a.A0W();
        if (iA0W == 0) {
            return null;
        }
        View view = null;
        if (abstractC06054a.A1X()) {
            int iA0A = c4k.A0A();
            int iA0B = c4k.A0B();
            if (A02[3].length() != 1) {
                throw new RuntimeException();
            }
            A02[4] = "QSrTWOl4jyYASaYHeqwJw7nAVlZS9nVf";
            int childCount = iA0B / 2;
            childCenter = iA0A + childCount;
        } else {
            int childCount2 = c4k.A06();
            childCenter = childCount2 / 2;
        }
        int i10 = Integer.MAX_VALUE;
        for (int absClosest = 0; absClosest < iA0W; absClosest++) {
            View viewA0t = abstractC06054a.A0t(absClosest);
            int iA0F = c4k.A0F(viewA0t);
            int childCount3 = c4k.A0D(viewA0t);
            int childCount4 = Math.abs((iA0F + (childCount3 / 2)) - childCenter);
            if (childCount4 < i10) {
                i10 = childCount4;
                view = viewA0t;
            }
        }
        return view;
    }

    private View A02(AbstractC06054a abstractC06054a, C4K c4k) {
        int iA0W = abstractC06054a.A0W();
        if (iA0W == 0) {
            return null;
        }
        View closestChild = null;
        int childStart = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < iA0W; i10++) {
            View viewA0t = abstractC06054a.A0t(i10);
            int childCount = c4k.A0F(viewA0t);
            if (childCount < childStart) {
                childStart = childCount;
                if (A02[3].length() != 1) {
                    throw new RuntimeException();
                }
                A02[3] = "0";
                closestChild = viewA0t;
            }
        }
        return closestChild;
    }

    private C4K A03(AbstractC06054a abstractC06054a) {
        C4K c4k = this.A00;
        if (c4k == null || c4k.A02 != abstractC06054a) {
            this.A00 = C4K.A00(abstractC06054a);
        }
        return this.A00;
    }

    private C4K A04(AbstractC06054a abstractC06054a) {
        C4K c4k = this.A01;
        if (c4k == null || c4k.A02 != abstractC06054a) {
            this.A01 = C4K.A01(abstractC06054a);
        }
        return this.A01;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.X.AbstractC1349Yi
    public final int A0C(AbstractC06054a abstractC06054a, int i10, int i11) {
        int centerPosition;
        boolean reverseLayout;
        int iA0Z = abstractC06054a.A0Z();
        if (iA0Z == 0) {
            return -1;
        }
        View viewA02 = null;
        if (abstractC06054a.A25()) {
            viewA02 = A02(abstractC06054a, A04(abstractC06054a));
        } else if (abstractC06054a.A24()) {
            C4K c4kA03 = A03(abstractC06054a);
            if (A02[3].length() != 1) {
                throw new RuntimeException();
            }
            A02[4] = "gb7KateBwDTMhlVKT6fWGE4qrSBelOuo";
            viewA02 = A02(abstractC06054a, c4kA03);
        }
        if (viewA02 == null || (centerPosition = abstractC06054a.A0p(viewA02)) == -1) {
            return -1;
        }
        if (abstractC06054a.A24()) {
            reverseLayout = i10 > 0;
        } else {
            reverseLayout = i11 > 0;
        }
        boolean z10 = false;
        if (abstractC06054a instanceof InterfaceC06164m) {
            int itemCount = iA0Z - 1;
            PointF pointFA4K = ((InterfaceC06164m) abstractC06054a).A4K(itemCount);
            if (A02[3].length() != 1) {
                String[] strArr = A02;
                strArr[6] = "yuw4mNpzW34AqVSRehlxNeo";
                strArr[2] = "wkUUhZpWZ02e";
                if (pointFA4K != null) {
                    z10 = pointFA4K.x >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || pointFA4K.y < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                }
            } else {
                A02[0] = "mSLQWLSJnMsLfeZB8hd0gvJZQvTgwPgU";
                if (pointFA4K != null) {
                    z10 = pointFA4K.x >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD || pointFA4K.y < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                }
            }
        }
        if (z10) {
            return reverseLayout ? centerPosition - 1 : centerPosition;
        }
        return reverseLayout ? centerPosition + 1 : centerPosition;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1349Yi
    public final View A0D(AbstractC06054a abstractC06054a) {
        if (abstractC06054a.A25()) {
            return A01(abstractC06054a, A04(abstractC06054a));
        }
        if (abstractC06054a.A24()) {
            return A01(abstractC06054a, A03(abstractC06054a));
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1349Yi
    public final C1363Yx A0E(AbstractC06054a abstractC06054a) {
        if (!(abstractC06054a instanceof InterfaceC06164m)) {
            return null;
        }
        return new ED(this, super.A00.getContext());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1349Yi
    public final int[] A0H(AbstractC06054a abstractC06054a, View view) {
        int[] iArr = new int[2];
        if (abstractC06054a.A24()) {
            iArr[0] = A00(abstractC06054a, view, A03(abstractC06054a));
        } else {
            iArr[0] = 0;
        }
        boolean zA25 = abstractC06054a.A25();
        String[] strArr = A02;
        if (strArr[1].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A02[0] = "E62MX6H1I4NpqQbgkpQnwXfK7jhgOp7C";
        if (zA25) {
            iArr[1] = A00(abstractC06054a, view, A04(abstractC06054a));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
