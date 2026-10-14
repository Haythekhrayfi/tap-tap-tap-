package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1466bK {
    public final Map<View, C1473bR> A00 = new WeakHashMap();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized C1473bR A00(View view) {
        C1473bR c1473bR = this.A00.get(view);
        if (c1473bR != null) {
            return c1473bR;
        }
        return C1473bR.A08;
    }

    public final synchronized void A01(View view) {
        this.A00.remove(view);
    }

    public final synchronized void A02(View view, C1473bR c1473bR) {
        this.A00.put(view, c1473bR);
    }

    public final synchronized void A03(Collection<View> result) {
        Iterator<View> it = this.A00.keySet().iterator();
        while (it.hasNext()) {
            result.add(it.next());
        }
    }
}
