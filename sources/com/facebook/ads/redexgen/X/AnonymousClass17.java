package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.17, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass17 extends BroadcastReceiver {
    public static byte[] A03;
    public static String[] A04 = {"X1IVw5mZrPwWgp59pDL9aLZ3Fov3W2Wm", "N1AsLxATz8LfRIPBbwS0prqi9bKFNGwZ", "KvfN8PD7zJtQDsMeVTqT5dRzLvhiPQFs", "CwJ4sBopjGul5sxVyPsrv7O0APgi12j8", "riYYfsMk5nddhbnpPSj9znzkTr5bDpPf", "Be1xHvNUMQ0R9QZ", "t7JwnvsmbbV8km6q46", "oSYhwD14tF3vT8zAS1lFRiV2H2FAfEUD"};
    public Context A00;
    public AD A01;
    public boolean A02 = false;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Ascii.EM, 3, 15, 13, 78, 6, 1, 3, 5, 2, 15, 15, 11, 78, 1, 4, 19, 78, 9, 14, 20, 5, 18, 19, 20, 9, 20, 9, 1, 12, 78, 4, 9, 19, 16, 12, 1, Ascii.EM, 5, 4, 19, Ascii.US, Ascii.GS, 94, 22, 17, 19, 21, 18, Ascii.US, Ascii.US, Ascii.ESC, 94, 17, 20, 3, 94, Ascii.EM, Ascii.RS, 4, 21, 2, 3, 4, Ascii.EM, 4, Ascii.EM, 17, Ascii.FS, 94, 20, Ascii.EM, 3, 0, Ascii.FS, 17, 9, 21, 20, 74, 18, 1, 18, Ascii.EM, 3, 81, 68, 83, 71, 78, 83, 76, 98, 85, 64, 98, 77, 72, 66, 74, 83, 70, 81, 69, 76, 81, 78, 96, 87, 66, 96, 79, 74, 64, 72, Ascii.EM, 45, 50, 63, 62, 52, 18, 53, 47, 62, 41, 40, 47, 50, 47, 58, 55, Ascii.RS, 45, 62, 53, 47, 2, Ascii.GS, 16, 17, Ascii.ESC, 61, Ascii.SUB, 0, 17, 6, 7, 0, Ascii.GS, 0, 21, Ascii.CAN, 49, 2, 17, Ascii.SUB, 0, 78};
    }

    static {
        A01();
    }

    public AnonymousClass17(AD ad2, Context context) {
        this.A01 = ad2;
        this.A00 = context;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(40, 40, 17) + this.A01.getUniqueId());
        intentFilter.addAction(A00(137, 22, 21) + this.A01.getUniqueId());
        intentFilter.addAction(A00(100, 16, 66) + this.A01.getUniqueId());
        C05552a.A00(this.A00).A06(this, intentFilter);
    }

    public final void A03() {
        try {
            C05552a.A00(this.A00).A05(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        String action2 = A00(0, 1, 66);
        String[] strArrSplit = action.split(action2);
        if (strArrSplit.length != 2) {
            return;
        }
        String str = strArrSplit[1];
        String action3 = this.A01.getUniqueId();
        if (!str.equals(action3)) {
            return;
        }
        String str2 = strArrSplit[0];
        String action4 = A00(1, 39, 1);
        if (str2.equals(action4)) {
            if (this.A01.getListener() != null) {
                this.A01.getListener().AB4();
                this.A01.getListener().ADN();
                return;
            }
            return;
        }
        String str3 = strArrSplit[0];
        String[] split = A04;
        if (split[2].charAt(17) != 'T') {
            throw new RuntimeException();
        }
        A04[7] = "czH1g8WXqBVBzZgoSLVA20jYFFcQLh15";
        String action5 = A00(116, 21, 58);
        if (str3.equals(action5)) {
            String action6 = A00(80, 5, 22);
            Serializable serializableExtra = intent.getSerializableExtra(action6);
            if (serializableExtra instanceof M1) {
                if (this.A01.getListener() != null) {
                    this.A01.getListener().ABA();
                    this.A01.getListener().ADN();
                }
                if (this.A02) {
                    this.A01.A0Y(1);
                } else {
                    this.A01.A0Y(((M1) serializableExtra).A01());
                }
                this.A01.setVisibility(0);
                this.A01.A0b(PZ.A04, 1);
                return;
            }
            if (serializableExtra instanceof NI) {
                if (this.A01.getListener() == null) {
                    return;
                }
                InterfaceC1028Lv listener = this.A01.getListener();
                String[] split2 = A04;
                if (split2[4].charAt(15) != 'p') {
                    throw new RuntimeException();
                }
                A04[0] = "WizhEabCQfIhxCPZxjxQrLo8096TZ2te";
                listener.ABH();
                return;
            }
            if (serializableExtra instanceof C1055Mw) {
                if (this.A01.getListener() == null) {
                    return;
                }
                this.A01.getListener().ABJ();
                return;
            }
            if (serializableExtra instanceof AnonymousClass73) {
                if (this.A01.getListener() != null) {
                    this.A01.getListener().AAi();
                }
                this.A02 = true;
                return;
            }
            if (serializableExtra instanceof MC) {
                if (this.A01.getListener() != null) {
                    InterfaceC1028Lv listener2 = this.A01.getListener();
                    String[] split3 = A04;
                    String action7 = split3[5];
                    if (action7.length() != 15) {
                        A04[5] = "OhpiyJuLhpOH2Z5";
                        listener2.ACA();
                    } else {
                        A04[1] = "rjxpcIZarLCWG40Y5u8euDt94bevKfNO";
                        listener2.ACA();
                    }
                }
                this.A02 = false;
                return;
            }
            if (!(serializableExtra instanceof AnonymousClass70) || this.A01.getListener() == null) {
                return;
            }
            this.A01.getListener().onPause();
            return;
        }
        String str4 = strArrSplit[0];
        String action8 = A00(85, 15, 64);
        if (!str4.equals(action8)) {
            return;
        }
        this.A01.A0m();
    }
}
