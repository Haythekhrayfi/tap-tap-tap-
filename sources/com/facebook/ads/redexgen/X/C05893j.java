package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05893j {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3h] */
    public static C05873h A00(final InterfaceC05883i interfaceC05883i) {
        return new AccessibilityNodeProvider() { // from class: com.facebook.ads.redexgen.X.3h
            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
                return (AccessibilityNodeInfo) interfaceC05883i.A4S(i10);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
                return interfaceC05883i.A5b(str, i10);
            }

            @Override // android.view.accessibility.AccessibilityNodeProvider
            public final boolean performAction(int i10, int i11, Bundle bundle) {
                return interfaceC05883i.ADc(i10, i11, bundle);
            }
        };
    }
}
