package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Y7 implements InterfaceC06485s {
    public static byte[] A03;
    public static String[] A04 = {"Yyt8Jrp", "FvQHlihhdkZe9tXm7YLHdG4gIBqm", "h7ITXytSbKbsxwMfZDKdUPEvMsTrizAq", "0TuNzKSIMRKA8K3EzRQL94hbriXTa7QT", "ySuQOOQJHVodSpCznPaDLfXVVxuxvbGA", "XYB8XYCfCTfWBGtKG07Wi1HuHmIQx2qC", "71D0xe3tljOi7f3b0iOVOXaXnoSWhNo4", "dwdYeokke3ChTNA3vTF4hdqHGwVronGN"};
    public final InterfaceC1159Qw A01;
    public Set<InterfaceC06515v> A00 = new HashSet();
    public final List<InterfaceC06505u> A02 = new ArrayList();

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-72, -72, -67, 11, -46, -72, -67, 11, 41, 59, 59, 45, 60, 59};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public synchronized void A03() {
        if (!this.A01.A8z()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<InterfaceC06515v> setA01 = A01(this.A01.A6a());
        if (!this.A00.equals(setA01) && setA01 != null) {
            this.A00 = setA01;
            Iterator<InterfaceC06505u> it = this.A02.iterator();
            while (it.hasNext()) {
                it.next().A3Y();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (InterfaceC06515v interfaceC06515v : this.A00) {
                String.format(Locale.US, A00(0, 8, 45), interfaceC06515v.A83(), interfaceC06515v.getUrl());
            }
        }
    }

    static {
        A02();
    }

    public Y7(InterfaceC0887Gc interfaceC0887Gc) {
        InterfaceC1159Qw interfaceC1159QwA4d = interfaceC0887Gc.A4d(EnumC1160Qx.A0B);
        this.A01 = interfaceC1159QwA4d;
        interfaceC1159QwA4d.A3M(new Y8(this));
        A03();
    }

    public static Set<InterfaceC06515v> A01(JSONObject jSONObject) {
        Y6 y6A00;
        HashSet hashSet = new HashSet();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A00(8, 6, 93));
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject == null || (y6A00 = Y6.A00(jSONObjectOptJSONObject)) == null) {
                return null;
            }
            hashSet.add(y6A00);
            if (A04[1].length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "2zeGpFgTpOohtr7xv9EhLTO87hKhrQIZ";
            strArr[3] = "Z45Lb0RXWpRaUi2IX7mXCACeVe5qt7dU";
        }
        return hashSet;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06485s
    public final void A3K(InterfaceC06505u interfaceC06505u) {
        this.A02.add(interfaceC06505u);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06485s
    public final synchronized Set<InterfaceC06515v> A5w() {
        return new HashSet(this.A00);
    }
}
