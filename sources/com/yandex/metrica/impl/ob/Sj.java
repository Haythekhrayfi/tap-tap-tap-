package com.yandex.metrica.impl.ob;

import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes.dex */
public class Sj implements InterfaceC2143zk<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1739jk f15027a;

    public Sj(C1739jk c1739jk) {
        this.f15027a = c1739jk;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    public Object a() {
        Integer numValueOf;
        int i10 = 2;
        if (this.f15027a.c()) {
            TelephonyManager telephonyManagerF = this.f15027a.f();
            if (telephonyManagerF != null) {
                try {
                    numValueOf = Integer.valueOf(telephonyManagerF.getCallState());
                } catch (Throwable unused) {
                    numValueOf = null;
                }
            } else {
                numValueOf = null;
            }
            int iIntValue = (numValueOf != null ? numValueOf : Integer.MIN_VALUE).intValue();
            if (iIntValue == 0) {
                i10 = 1;
            } else if (iIntValue != 1) {
                if (iIntValue != 2) {
                    i10 = 0;
                } else {
                    i10 = 3;
                }
            }
        } else {
            i10 = 0;
        }
        return Integer.valueOf(i10);
    }
}
