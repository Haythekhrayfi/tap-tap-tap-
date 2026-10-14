package com.facebook.ads.redexgen.X;

import com.facebook.ads.redexgen.X.C8W;
import com.facebook.ads.redexgen.X.C8Y;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8X, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8X<T extends C8Y, E extends C8W> {
    public static String[] A02 = {"WBmgDKUAJnOjRPVdo459bnYJXDnRSoZA", "OZ5TpfWbSmXE", "sC9WLlq1dd0W0qrWeGI0su3O22TcCAEW", "0Ub2X", "5m4s5CvbohnvtMuC", "JEGJTDHJWZGaFE0Bjwe", "ELtjylBnyGpGsAAS3nfDjHYeujv6lcAm", "LzmA2INjpudrbI3uXcOOEdZHAsdjx9ZW"};
    public final Map<Class<E>, List<WeakReference<T>>> A00 = new HashMap();
    public final Queue<E> A01 = new ArrayDeque();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A00(E e10) {
        List<WeakReference<T>> list;
        Map<Class<E>, List<WeakReference<T>>> map = this.A00;
        if (map == null || (list = map.get(e10.getClass())) == null) {
            return;
        }
        A01(list);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            C8Y c8y = (C8Y) ((WeakReference) it.next()).get();
            if (c8y != null && c8y.A00(e10)) {
                c8y.A03(e10);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized void A02(E e10) {
        if (this.A01.isEmpty()) {
            this.A01.add(e10);
            while (!this.A01.isEmpty()) {
                A00(this.A01.peek());
                this.A01.remove();
            }
        } else {
            this.A01.add(e10);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized boolean A05(T t10) {
        if (t10 == null) {
            return false;
        }
        Class<E> clsA01 = t10.A01();
        if (this.A00.get(clsA01) == null) {
            this.A00.put(clsA01, new ArrayList());
        }
        List<WeakReference<T>> list = this.A00.get(clsA01);
        A01(list);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).get() == t10) {
                return false;
            }
        }
        return list.add(new WeakReference<>(t10));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8X != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8Y, E extends com.facebook.ads.redexgen.X.8W> */
    private void A01(List<WeakReference<T>> list) {
        if (list != null) {
            int i10 = 0;
            for (int i11 = 0; i11 < writePtr; i11++) {
                WeakReference<T> weakReference = list.get(i11);
                T t10 = weakReference.get();
                int readPtr = A02[1].length();
                if (readPtr != 12) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[6] = "MDutMibHR0xfS0kHpIX6qzWASaThPw85";
                strArr[0] = "nvT9JaP2TDwXv3h3yDNvutMp299h55Zc";
                if (t10 != null) {
                    int writePtr = i10 + 1;
                    list.set(i10, weakReference);
                    i10 = writePtr;
                }
            }
            int writePtr2 = list.size();
            for (int writePtr3 = writePtr2 - 1; writePtr3 >= i10; writePtr3--) {
                list.remove(writePtr3);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8X != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8Y, E extends com.facebook.ads.redexgen.X.8W> */
    public final synchronized void A03(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t10 : subscribers) {
            A05(t10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8X != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8Y, E extends com.facebook.ads.redexgen.X.8W> */
    public final synchronized void A04(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t10 : subscribers) {
            A06(t10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8X != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8Y, E extends com.facebook.ads.redexgen.X.8W> */
    public final synchronized boolean A06(T subscriber) {
        if (subscriber == null) {
            return false;
        }
        List<WeakReference<T>> list = this.A00.get(subscriber.A01());
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).get() == subscriber) {
                list.get(i10).clear();
                return true;
            }
        }
        return false;
    }
}
