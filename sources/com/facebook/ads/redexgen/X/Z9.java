package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Z9 extends C05732t {
    public static String[] A01 = {"qdMAGnvFuVn0ea0M3RnyzUUMgxm0S2Dt", "2PeyHnmE0bX58Ffgk0gx7OXrgxltyZLW", "2int", "nVrienaBQfkWnV6qIsNJmuY2fGTgVaBy", "EIAfoPo9YRxYx4hqHxVbjlkHHJjThpFm", "", "SPMlRY4DBSEQqdOiv1Q7wDslDeTbAa0F", "kfFOHzhabps7JVIWzUifit9US33gkwJk"};
    public final /* synthetic */ C3T A00;

    public Z9(C3T c3t) {
        this.A00 = c3t;
    }

    private boolean A00() {
        return this.A00.A01 != null && this.A00.A01.A05() > 1;
    }

    @Override // com.facebook.ads.redexgen.X.C05732t
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C3T.class.getName());
        accessibilityEvent.setScrollable(A00());
        if (accessibilityEvent.getEventType() == 4096 && this.A00.A01 != null) {
            accessibilityEvent.setItemCount(this.A00.A01.A05());
            accessibilityEvent.setFromIndex(this.A00.A00);
            accessibilityEvent.setToIndex(this.A00.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C05732t
    public final void A08(View view, C05843e c05843e) {
        super.A08(view, c05843e);
        c05843e.A0O(C3T.class.getName());
        c05843e.A0R(A00());
        if (this.A00.canScrollHorizontally(1)) {
            c05843e.A0N(4096);
        }
        if (this.A00.canScrollHorizontally(-1)) {
            c05843e.A0N(8192);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C05732t
    public final boolean A09(View view, int i10, Bundle bundle) {
        if (super.A09(view, i10, bundle)) {
            return true;
        }
        switch (i10) {
            case 4096:
                if (!this.A00.canScrollHorizontally(1)) {
                    return false;
                }
                C3T c3t = this.A00;
                c3t.setCurrentItem(c3t.A00 + 1);
                return true;
            case 8192:
                if (!this.A00.canScrollHorizontally(-1)) {
                    return false;
                }
                C3T c3t2 = this.A00;
                int i11 = c3t2.A00;
                String[] strArr = A01;
                if (strArr[3].charAt(13) != strArr[7].charAt(13)) {
                    throw new RuntimeException();
                }
                A01[4] = "Vr8sNFSEZwclN9wLDYuYxTMloU2ohTqa";
                c3t2.setCurrentItem(i11 - 1);
                return true;
            default:
                return false;
        }
    }
}
