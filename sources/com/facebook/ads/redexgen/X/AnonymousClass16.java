package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.16, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass16 extends BroadcastReceiver {
    public static String[] A03 = {"JgmY627JJ4fVvMUsUI7dBJzvca", "2Fivc7ze9Y6M7vLBAhVCw66dd2zEUTp", "oqNyJxLxp23hnAfKGRpFUMlaCTnSy4au", "HRO7fC4J0U3bXqsrOiWljP6J940cuLTJ", "rhEs9JkkityiMJcgD18RNPKtdGmllPs6", "c8I5EiJJKjWgwuyghylYWruaZ4nXJiut", "YeKDqRnNq5JcEGU0HYsnt6sxK1D4K6hE", "zIQMBMVVQmczFglCifMrZtV9RNUhKeCf"};
    public AbstractC1408aH A00;
    public AnonymousClass15 A01;
    public String A02;

    public AnonymousClass16(String str, AbstractC1408aH abstractC1408aH, AnonymousClass15 anonymousClass15) {
        this.A00 = abstractC1408aH;
        this.A01 = anonymousClass15;
        this.A02 = str;
    }

    public final IntentFilter A00() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(EnumC1113Pc.A06.A03(this.A02));
        intentFilter.addAction(EnumC1113Pc.A09.A03(this.A02));
        intentFilter.addAction(EnumC1113Pc.A04.A03(this.A02));
        intentFilter.addAction(EnumC1113Pc.A0A.A03(this.A02));
        intentFilter.addAction(EnumC1113Pc.A05.A03(this.A02));
        intentFilter.addAction(EnumC1113Pc.A0C.A03(this.A02));
        intentFilter.addAction(EnumC1113Pc.A0B.A03(this.A02));
        intentFilter.addAction(EnumC1113Pc.A03.A03(this.A02));
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        EnumC1113Pc enumC1113Pc = EnumC1113Pc.A06;
        String action2 = this.A02;
        if (enumC1113Pc.A03(action2).equals(action)) {
            AnonymousClass15 anonymousClass15 = this.A01;
            AbstractC1408aH abstractC1408aH = this.A00;
            String action3 = A03[1];
            if (action3.length() != 11) {
                A03[0] = "z37hhVYNur1y5njE4t22VYTMbB";
                anonymousClass15.ACe(abstractC1408aH);
                return;
            }
        } else {
            EnumC1113Pc enumC1113Pc2 = EnumC1113Pc.A09;
            String action4 = this.A02;
            if (enumC1113Pc2.A03(action4).equals(action)) {
                boolean zA1V = IN.A1V(context);
                String[] strArr = A03;
                if (strArr[3].charAt(16) != strArr[4].charAt(16)) {
                    A03[0] = "a2nbOp8yH430aeg70B0MHQFnwN";
                    if (zA1V) {
                        AnonymousClass15 anonymousClass16 = this.A01;
                        AbstractC1408aH abstractC1408aH2 = this.A00;
                        AdError adError = AdError.AD_PRESENTATION_ERROR;
                        String[] strArr2 = A03;
                        if (strArr2[3].charAt(16) != strArr2[4].charAt(16)) {
                            String[] strArr3 = A03;
                            strArr3[2] = "Smm3aT6IchFgLH9ob00fwQqxHFnPPG6O";
                            strArr3[5] = "wzZfDEncWZ9M4YUYJFr8Gzf2lfnMb6hd";
                            anonymousClass16.ACf(abstractC1408aH2, adError);
                            return;
                        }
                        String[] strArr4 = A03;
                        strArr4[6] = "douVyTcHxmEKv1YyJqQbVTsvWWCOpXBn";
                        strArr4[7] = "x6yn97aV8hj96Z0WREVv4HAdEeLr9VIY";
                        anonymousClass16.ACf(abstractC1408aH2, adError);
                        return;
                    }
                    this.A01.ACf(this.A00, AdError.INTERNAL_ERROR);
                    return;
                }
            } else {
                EnumC1113Pc enumC1113Pc3 = EnumC1113Pc.A04;
                String action5 = this.A02;
                if (enumC1113Pc3.A03(action5).equals(action)) {
                    this.A01.ACb(this.A00);
                    return;
                }
                EnumC1113Pc enumC1113Pc4 = EnumC1113Pc.A0A;
                String action6 = this.A02;
                if (enumC1113Pc4.A03(action6).equals(action)) {
                    this.A01.ACd(this.A00);
                    return;
                }
                EnumC1113Pc enumC1113Pc5 = EnumC1113Pc.A05;
                String action7 = this.A02;
                if (enumC1113Pc5.A03(action7).equals(action)) {
                    this.A01.onRewardedVideoClosed();
                    return;
                }
                EnumC1113Pc enumC1113Pc6 = EnumC1113Pc.A0B;
                String action8 = this.A02;
                if (enumC1113Pc6.A03(action8).equals(action)) {
                    this.A01.ACZ(this.A00);
                    return;
                }
                EnumC1113Pc enumC1113Pc7 = EnumC1113Pc.A0C;
                String action9 = this.A02;
                if (enumC1113Pc7.A03(action9).equals(action)) {
                    this.A01.ACa(this.A00);
                    return;
                }
                EnumC1113Pc enumC1113Pc8 = EnumC1113Pc.A03;
                String action10 = this.A02;
                if (!enumC1113Pc8.A03(action10).equals(action)) {
                    return;
                }
                this.A01.onRewardedVideoActivityDestroyed();
                return;
            }
        }
        throw new RuntimeException();
    }
}
