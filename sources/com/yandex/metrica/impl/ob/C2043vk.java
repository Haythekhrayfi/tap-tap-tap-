package com.yandex.metrica.impl.ob;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2043vk implements InterfaceC2143zk<List<C2013uk>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1739jk f17737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1634fe f17738b;

    public C2043vk(C1739jk c1739jk, C1634fe c1634fe) {
        this.f17737a = c1739jk;
        this.f17738b = c1634fe;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    private C2013uk a() {
        Integer numValueOf;
        Integer numValueOf2;
        Boolean boolValueOf;
        TelephonyManager telephonyManagerF = this.f17737a.f();
        String simOperatorName = null;
        if (telephonyManagerF != null) {
            try {
                String simOperator = telephonyManagerF.getSimOperator();
                String strSubstring = !TextUtils.isEmpty(simOperator) ? simOperator.substring(0, 3) : null;
                numValueOf = TextUtils.isEmpty(strSubstring) ? null : Integer.valueOf(Integer.parseInt(strSubstring));
            } catch (Throwable unused) {
            }
        }
        TelephonyManager telephonyManagerF2 = this.f17737a.f();
        if (telephonyManagerF2 != null) {
            try {
                String simOperator2 = telephonyManagerF2.getSimOperator();
                String strSubstring2 = !TextUtils.isEmpty(simOperator2) ? simOperator2.substring(3) : null;
                numValueOf2 = TextUtils.isEmpty(strSubstring2) ? null : Integer.valueOf(Integer.parseInt(strSubstring2));
            } catch (Throwable unused2) {
            }
        }
        TelephonyManager telephonyManagerF3 = this.f17737a.f();
        Boolean bool = Boolean.FALSE;
        if (telephonyManagerF3 != null) {
            try {
                if (this.f17738b.b(this.f17737a.e())) {
                    boolValueOf = Boolean.valueOf(telephonyManagerF3.isNetworkRoaming());
                } else {
                    boolValueOf = null;
                }
            } catch (Throwable unused3) {
            }
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            bool = boolValueOf;
        }
        boolean zBooleanValue = bool.booleanValue();
        TelephonyManager telephonyManagerF4 = this.f17737a.f();
        if (telephonyManagerF4 != null) {
            try {
                simOperatorName = telephonyManagerF4.getSimOperatorName();
            } catch (Throwable unused4) {
            }
        }
        return new C2013uk(numValueOf, numValueOf2, zBooleanValue, simOperatorName);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    public Object b() {
        ArrayList arrayList = new ArrayList();
        if (this.f17737a.d()) {
            if (U2.a(23)) {
                if (this.f17738b.b(this.f17737a.e())) {
                    arrayList.addAll(C2068wk.a(this.f17737a.e()));
                }
                if (arrayList.size() == 0) {
                    arrayList.add(a());
                }
            } else {
                arrayList.add(a());
            }
        }
        return arrayList;
    }
}
