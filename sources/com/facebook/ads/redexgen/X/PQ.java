package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PQ {
    public static byte[] A09;
    public static String[] A0A = {"gG8B5BBzXX0tXn8mAXm3GrlCsmKREgEL", "fszKDaGs6AGUXXOQg2WnNIBtS95Yz1Wh", "pnaE4meNhzrzHKSDh8PgaIlwU76aGgw8", "2ARCPk0NRRRG", "SMbVAXo8eG5PUWUAvoNRrVLTO99Zprm", "yA01QlsAfT3JJVyfy2ZKp77MLzjsBWHz", "Xgpz8alFBhAPNTQJpcXFzk4NTQQyuYWJ", "Svb9BuXOcdwLltO0M440Yd8RGfHrN1wk"};
    public final C1337Xw A00;
    public final InterfaceC0937Id A01;
    public final RN A02;
    public final OR A03;
    public final AbstractC1063Ne A04;
    public final MN A05;
    public final C1173Rk A06;
    public final String A07;
    public final Map<String, String> A08;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A09 = new byte[]{62, 42, 57, 53, 61, 43};
    }

    static {
        A08();
    }

    public PQ(C1337Xw c1337Xw, InterfaceC0937Id interfaceC0937Id, RN rn, String str, Map<String, String> extraParams) {
        AbstractC1063Ne abstractC1063Ne = new AbstractC1063Ne() { // from class: com.facebook.ads.redexgen.X.7D
            public static String[] A01 = {"m3H5fDZT", "tfUidThth72U8se7Apa4PT2ZGwk9ZGOU", "C7sqCneijRx2oiAJ7jgCjnbvSplD6Hvu", "CUEN1UWJGCJ8qOG4MMTMPK9Ub", "uwIe", "I7QxkSDWYBotgEGySbiUy5NvkBUV0QEh", "dizwBFytggLGpocgnk6CXcKxg", "vsUFvcPPfrfWhSaT8AiBmEZ9b5CjjyAT"};

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass71 anonymousClass71) {
                C1174Rl c1174Rl = new C1174Rl(this.A00.A07, anonymousClass71.A03(), anonymousClass71.A01(), anonymousClass71.A02());
                if (anonymousClass71.A00() >= 0.05d) {
                    c1174Rl.A06(anonymousClass71.A01());
                }
                this.A00.A06.A0C(c1174Rl);
                String[] strArr = A01;
                if (strArr[6].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[2] = "q64iGrGvaw5ijPmr6ZKPys7vT4QnDerr";
                strArr2[5] = "OAtIhinrRl4iSEKbz1e7g3lvuawk4XhB";
            }
        };
        this.A04 = abstractC1063Ne;
        MN mn = new MN() { // from class: com.facebook.ads.redexgen.X.7B
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass70 anonymousClass70) {
                this.A00.A09();
            }
        };
        this.A05 = mn;
        OR or = new OR() { // from class: com.facebook.ads.redexgen.X.7A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8Y
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass73 anonymousClass73) {
                this.A00.A09();
            }
        };
        this.A03 = or;
        this.A00 = c1337Xw;
        this.A01 = interfaceC0937Id;
        this.A07 = str;
        this.A08 = extraParams;
        this.A02 = rn;
        this.A06 = new C1173Rk(str);
        rn.getEventBus().A03(abstractC1063Ne, mn, or);
    }

    private Map<String, String> A07(String str) {
        HashMap map = new HashMap();
        Map<String, String> map2 = this.A08;
        if (map2 != null) {
            map.putAll(map2);
        }
        map.put(A05(0, 6, 56), str);
        return map;
    }

    public final void A09() {
        String strA04 = C1173Rk.A04(this.A06.A0B());
        if (strA04 != null) {
            InterfaceC0937Id interfaceC0937Id = this.A01;
            if (A0A[4].length() == 13) {
                throw new RuntimeException();
            }
            A0A[3] = "qc6G14080U";
            String encodedFrameData = this.A07;
            interfaceC0937Id.A9c(encodedFrameData, A07(strA04));
        }
    }

    public final void A0A() {
        RS rs = new RS(this);
        if (this.A02.A0l()) {
            LI.A00(rs);
        } else {
            this.A02.getStateHandler().post(rs);
        }
    }
}
