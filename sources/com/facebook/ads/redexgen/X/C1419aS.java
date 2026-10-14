package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1419aS implements InterfaceC05130j, InterfaceC05170o {
    public static byte[] A0A;
    public static String[] A0B = {"OTBhn", "woE0GsYsDC", "jJJsRhZ6eh", "RbmDZKGZyk", "MbYnCV2deeCvNEpfUSPgn7RvJuamywdV", "va4Mi1JJiq4w08mNkhVxy34L1bzftr4W", "QQZqW8pW387BdDH3gcXSwYVoWAeaIxNz", "E72k8"};
    public static final String A0C;
    public int A00;
    public AnonymousClass12 A01;
    public AnonymousClass13 A02;
    public J0 A03;
    public List<U7> A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C1337Xw A09;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0A = new byte[]{124, 89, 92, 77, 73, 88, 79, Ascii.GS, 92, 81, 79, 88, 92, 89, 68, Ascii.GS, 81, 82, 92, 89, 88, 89, Ascii.GS, 89, 92, 73, 92, 93, 114, 119, 125, 117, 62, 118, Ascii.DEL, 110, 110, 123, 112, 123, 122, 62, 113, 112, 62, 114, 113, 125, 117, 109, 125, 108, 123, 123, 112, 62, Ascii.DEL, 122, 104, 71, 66, 72, 64, 11, 71, 68, 76, 76, 78, 79, 45, Ascii.SUB, Ascii.SUB, 7, Ascii.SUB, 72, 13, 16, 13, 11, Ascii.GS, Ascii.FS, 1, 6, 15, 72, 9, 11, Ascii.FS, 1, 7, 6, 64, 66, 81, 71, 64, 77, 87, 54, 52, 39, 49, 60, 59, 49, 92, 75, 48, 45, 34, 51, 48, 43, 44, 55, 66, 93, 81, 67};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A06(Map<String, String> map, Map<String, String> map2) {
        try {
            new Handler().postDelayed(new C1420aT(this, map2, A03(map)), this.A01.A07() * 1000);
        } catch (Exception unused) {
        }
    }

    static {
        A04();
        A0C = C1419aS.class.getSimpleName();
    }

    public C1419aS(C1337Xw c1337Xw) {
        this(c1337Xw, new AnonymousClass12());
    }

    public C1419aS(C1337Xw c1337Xw, AnonymousClass12 anonymousClass12) {
        this.A00 = 200;
        this.A01 = anonymousClass12;
        this.A09 = c1337Xw;
    }

    private Map<String, String> A03(Map<String, String> map) {
        HashMap map2 = new HashMap();
        String strA02 = A02(116, 4, 94);
        if (map.containsKey(strA02)) {
            map2.put(strA02, map.get(strA02));
        }
        String strA03 = A02(108, 8, 41);
        if (map.containsKey(strA03)) {
            map2.put(strA03, map.get(strA03));
        }
        return map2;
    }

    private void A05(AnonymousClass12 anonymousClass12) {
        if (!this.A05) {
            this.A01 = anonymousClass12;
            List<AnonymousClass12> listA0f = anonymousClass12.A0f();
            if (listA0f != null && listA0f.size() > 0) {
                int size = listA0f.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    C1419aS adapter = new C1419aS(this.A09);
                    adapter.A05(listA0f.get(i10));
                    arrayList.add(new U7(this.A09, adapter, (C8E) null, this.A03));
                }
                this.A04 = arrayList;
            }
            this.A05 = true;
            this.A06 = A07();
            return;
        }
        throw new IllegalStateException(A02(0, 27, 87));
    }

    private boolean A07() {
        if (((!this.A01.A0h() && !TextUtils.isEmpty(this.A01.A0W())) || (!TextUtils.isEmpty(this.A01.A0T()) && this.A01.A0h())) && (this.A01.A0G() != null || this.A01.A0h())) {
            J1 j1A0F = this.A01.A0F();
            if (A0B[2].length() != 10) {
                throw new RuntimeException();
            }
            A0B[6] = "coz4LHwVNN2LSDndRSBnj9WvwXuRM5HO";
            if (j1A0F != null || A7V() == AdPlacementType.NATIVE_BANNER) {
                return true;
            }
        }
        return false;
    }

    public final int A08() {
        return this.A01.A02();
    }

    public final int A09() {
        return this.A01.A05();
    }

    public final int A0A() {
        int iA06 = this.A01.A06();
        if (iA06 < 0 || iA06 > 100) {
            return 0;
        }
        return iA06;
    }

    public final int A0B() {
        return this.A00;
    }

    public final int A0C() {
        return this.A01.A08();
    }

    public final int A0D() {
        return this.A01.A09();
    }

    public final AnonymousClass12 A0E() {
        return this.A01;
    }

    public final AnonymousClass13 A0F() {
        return this.A02;
    }

    public final String A0G() {
        return this.A01.A0a();
    }

    public final List<U7> A0H() {
        if (!A0T()) {
            return null;
        }
        return this.A04;
    }

    public final void A0I() {
        if (!this.A08) {
            String strA0b = A0E().A0b();
            if (A0B[2].length() != 10) {
                throw new RuntimeException();
            }
            A0B[5] = "8ArINtb0xmmgo9NmELWQk3NiIhKYvaDc";
            if (strA0b != null) {
                this.A09.A09().ADg(strA0b);
            }
            this.A08 = true;
        }
    }

    public final void A0J() {
        Iterator<U7> it;
        List<U7> list = this.A04;
        if (list == null) {
            return;
        }
        boolean zIsEmpty = list.isEmpty();
        if (A0B[6].charAt(13) != 'D') {
            throw new RuntimeException();
        }
        A0B[6] = "kj4WnsmCok25qDrlf1kxSYggARLvW33C";
        if (!zIsEmpty) {
            List<U7> list2 = this.A04;
            if (A0B[2].length() != 10) {
                it = list2.iterator();
            } else {
                A0B[2] = "wGXHpE1nya";
                it = list2.iterator();
            }
            while (true) {
                boolean zHasNext = it.hasNext();
                if (A0B[2].length() != 10) {
                    A0B[6] = "0lb5BUzW8n1EJDWyWAqaA7d0lZJNpkzV";
                    if (!zHasNext) {
                        return;
                    }
                } else {
                    A0B[5] = "QJQdkpg5cmGOeaue26HVF3aLtsB2qwfM";
                    if (!zHasNext) {
                        return;
                    }
                }
                it.next().unregisterView();
            }
        }
    }

    public final void A0K(AnonymousClass13 anonymousClass13) {
        this.A02 = anonymousClass13;
    }

    public final void A0L(C1337Xw c1337Xw, AnonymousClass13 anonymousClass13, InterfaceC0937Id interfaceC0937Id, C05461r c05461r, J0 j10) {
        int iA06;
        this.A02 = anonymousClass13;
        this.A03 = j10;
        JSONObject jSONObjectA03 = c05461r.A03();
        C8E c8eA01 = c05461r.A01();
        if (c8eA01 != null) {
            iA06 = c8eA01.A06();
        } else {
            iA06 = 200;
        }
        this.A00 = iA06;
        A05(AnonymousClass14.A00(c1337Xw, jSONObjectA03, C1000Kt.A02(jSONObjectA03, A02(106, 2, 85))));
        if (C05140k.A06(c1337Xw, this, interfaceC0937Id)) {
            c1337Xw.A0E().A4G();
            anonymousClass13.AC3(this, JD.A00(AdErrorType.NO_FILL));
        } else if (anonymousClass13 != null) {
            anonymousClass13.AC0(this);
        }
    }

    public final void A0M(Map<String, String> map) {
        if (!A0T()) {
            return;
        }
        boolean shouldBlockLockscreenClicks = IN.A1b(this.A09);
        if (shouldBlockLockscreenClicks) {
            boolean shouldBlockLockscreenClicks2 = LP.A03(map);
            if (shouldBlockLockscreenClicks2) {
                String str = A0C;
                if (A0B[4].charAt(15) != 'f') {
                    throw new RuntimeException();
                }
                A0B[6] = "D3JUlaax70Z19DqZX7Vx94n8SobUQcIP";
                Log.e(str, A02(27, 31, 116));
                return;
            }
        }
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        C0985Kc.A02(this.A09, A02(58, 12, 65));
        AnonymousClass13 anonymousClass13 = this.A02;
        if (anonymousClass13 != null) {
            anonymousClass13.ABz(this);
        }
        boolean shouldBlockLockscreenClicks3 = this.A01.A0h();
        if (shouldBlockLockscreenClicks3) {
            map2.put(A02(99, 7, 63), String.valueOf(A0E().A04()));
            map2.put(A02(92, 7, 73), String.valueOf(A0E().A03()));
        }
        C1337Xw c1337Xw = this.A09;
        AbstractC05100g abstractC05100gA00 = C05110h.A00(c1337Xw, c1337Xw.A09(), this.A01.A0Y(), this.A01.A0B(), map2);
        if (abstractC05100gA00 != null) {
            try {
                abstractC05100gA00.A0C();
            } catch (Exception e10) {
                Log.e(A0C, A02(70, 22, 2), e10);
            }
        }
    }

    public final void A0N(Map<String, String> extraData) {
        this.A09.A09().A9G(this.A01.A0Y(), extraData);
    }

    public final void A0O(Map<String, String> map) {
        if (A0T() && !this.A07) {
            AnonymousClass13 anonymousClass13 = this.A02;
            if (anonymousClass13 != null) {
                anonymousClass13.AC1(this);
            }
            HashMap map2 = new HashMap();
            if (map != null) {
                map2.putAll(map);
            }
            if (this.A01.A0h()) {
                map2.put(A02(99, 7, 63), String.valueOf(A0E().A04()));
                map2.put(A02(92, 7, 73), String.valueOf(A0E().A03()));
            }
            if (!TextUtils.isEmpty(A6M())) {
                if (!this.A01.A0h()) {
                    this.A09.A0E().A2f();
                    C2A.A00(this.A01.A0Z());
                }
                this.A09.A09().A9P(A6M(), map2);
            }
            if (A0V() || A0W()) {
                A06(map, map2);
            }
            this.A07 = true;
        }
    }

    public final void A0P(Map<String, String> extraData) {
        this.A09.A09().A9h(this.A01.A0Y(), extraData);
    }

    public final void A0Q(Map<String, String> extraData) {
        this.A09.A09().A9i(this.A01.A0Y(), extraData);
    }

    public final boolean A0R() {
        return true;
    }

    public final boolean A0S() {
        return A0T() && this.A01.A0B() != null;
    }

    public final boolean A0T() {
        return this.A05 && this.A06;
    }

    public final boolean A0U() {
        return this.A01.A0g();
    }

    public final boolean A0V() {
        if (IN.A1B(this.A09) && A0T()) {
            boolean zA0i = this.A01.A0i();
            if (A0B[4].charAt(15) != 'f') {
                throw new RuntimeException();
            }
            A0B[6] = "hsrOxssvGH6abDOIeI9T6FJFSNjQSl4a";
            if (zA0i) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0W() {
        if (IN.A1B(this.A09) && A0T()) {
            boolean zA0j = this.A01.A0j();
            String[] strArr = A0B;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0B[2] = "qputmJyOXU";
            if (zA0j) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05130j
    public final String A6M() {
        return this.A01.A0Y();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05130j
    public final Collection<String> A6f() {
        return A0E().A0e();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05130j
    public final EnumC05120i A76() {
        return A0E().A0C();
    }

    public AdPlacementType A7V() {
        return AdPlacementType.NATIVE;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05170o
    public final boolean AFh() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05170o
    public final void onDestroy() {
    }
}
