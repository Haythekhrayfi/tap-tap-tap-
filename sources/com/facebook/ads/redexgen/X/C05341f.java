package com.facebook.ads.redexgen.X;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C05341f extends C3N {
    @Override // com.facebook.ads.redexgen.X.C05803a
    public Object A00(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10);
    }

    @Override // com.facebook.ads.redexgen.X.C05803a
    public Object A01(int i10, int i11, boolean z10, int i12) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10);
    }

    @Override // com.facebook.ads.redexgen.X.C05803a
    public final void A03(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) obj);
    }

    @Override // com.facebook.ads.redexgen.X.C05803a
    public final void A04(AccessibilityNodeInfo accessibilityNodeInfo, Object obj) {
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) obj);
    }
}
