package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.SparseArray;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi"})
public class Xj implements InterfaceC2143zk<Vj> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"InlineApi"})
    private static final SparseArray<String> f15516d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1739jk f15517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1659ge f15518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1659ge f15519c;

    public class a extends SparseArray<String> {
        public a() {
            put(0, null);
            put(7, "1xRTT");
            put(4, "CDMA");
            put(2, "EDGE");
            put(14, "eHRPD");
            put(5, "EVDO rev.0");
            put(6, "EVDO rev.A");
            put(12, "EVDO rev.B");
            put(1, "GPRS");
            put(8, "HSDPA");
            put(10, "HSPA");
            put(15, "HSPA+");
            put(9, "HSUPA");
            put(11, "iDen");
            put(3, "UMTS");
            put(12, "EVDO rev.B");
            put(14, "eHRPD");
            put(13, "LTE");
            put(15, "HSPA+");
        }
    }

    public class b implements InterfaceC1659ge {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1634fe f15520a;

        public b(Xj xj, C1634fe c1634fe) {
            this.f15520a = c1634fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1659ge
        public boolean a(Context context) {
            Objects.requireNonNull(this.f15520a);
            return false;
        }
    }

    public class c implements InterfaceC1659ge {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1634fe f15521a;

        public c(Xj xj, C1634fe c1634fe) {
            this.f15521a = c1634fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1659ge
        public boolean a(Context context) {
            return this.f15521a.b(context);
        }
    }

    public class d implements InterfaceC1659ge {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1634fe f15522a;

        public d(Xj xj, C1634fe c1634fe) {
            this.f15522a = c1634fe;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1659ge
        public boolean a(Context context) {
            return this.f15522a.a(context);
        }
    }

    public class e implements InterfaceC1659ge {
        public e(Xj xj) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1659ge
        public boolean a(Context context) {
            return true;
        }
    }

    public Xj(C1739jk c1739jk, C1634fe c1634fe) {
        InterfaceC1659ge eVar;
        this.f15517a = c1739jk;
        if (U2.a(29)) {
            this.f15518b = new b(this, c1634fe);
            eVar = new c(this, c1634fe);
        } else {
            this.f15518b = new d(this, c1634fe);
            eVar = new e(this);
        }
        this.f15519c = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ca  */
    public Object b() {
        CellLocation cellLocation;
        int lac;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        String networkOperatorName;
        String str = null;
        if (!this.f15517a.c()) {
            return null;
        }
        Vj.a aVar = new Vj.a();
        TelephonyManager telephonyManagerF = this.f15517a.f();
        if (telephonyManagerF != null) {
            try {
                if (!this.f15518b.a(this.f15517a.e()) || (cellLocation = telephonyManagerF.getCellLocation()) == null || -1 == (lac = ((GsmCellLocation) cellLocation).getLac())) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(lac);
                }
            } catch (Throwable unused) {
            }
        } else {
            numValueOf = null;
        }
        Vj.a aVarC = aVar.c(numValueOf);
        TelephonyManager telephonyManagerF2 = this.f15517a.f();
        if (telephonyManagerF2 != null) {
            try {
                String networkOperator = telephonyManagerF2.getNetworkOperator();
                String strSubstring = !TextUtils.isEmpty(networkOperator) ? networkOperator.substring(0, 3) : null;
                if (TextUtils.isEmpty(strSubstring)) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = Integer.valueOf(Integer.parseInt(strSubstring));
                }
            } catch (Throwable unused2) {
            }
        } else {
            numValueOf2 = null;
        }
        Vj.a aVarI = aVarC.i(numValueOf2);
        TelephonyManager telephonyManagerF3 = this.f15517a.f();
        if (telephonyManagerF3 != null) {
            try {
                String networkOperator2 = telephonyManagerF3.getNetworkOperator();
                String strSubstring2 = !TextUtils.isEmpty(networkOperator2) ? networkOperator2.substring(3) : null;
                if (TextUtils.isEmpty(strSubstring2)) {
                    numValueOf3 = null;
                } else {
                    numValueOf3 = Integer.valueOf(Integer.parseInt(strSubstring2));
                }
            } catch (Throwable unused3) {
            }
        } else {
            numValueOf3 = null;
        }
        Vj.a aVarJ = aVarI.j(numValueOf3);
        TelephonyManager telephonyManagerF4 = this.f15517a.f();
        if (telephonyManagerF4 != null) {
            try {
                if (this.f15518b.a(this.f15517a.e())) {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) telephonyManagerF4.getCellLocation();
                    int cid = gsmCellLocation != null ? gsmCellLocation.getCid() : 1;
                    if (-1 != cid) {
                        numValueOf4 = Integer.valueOf(cid);
                    } else {
                        numValueOf4 = null;
                    }
                } else {
                    numValueOf4 = null;
                }
            } catch (Throwable unused4) {
            }
        } else {
            numValueOf4 = null;
        }
        Vj.a aVarB = aVarJ.b(numValueOf4);
        TelephonyManager telephonyManagerF5 = this.f15517a.f();
        if (telephonyManagerF5 != null) {
            try {
                networkOperatorName = telephonyManagerF5.getNetworkOperatorName();
            } catch (Throwable unused5) {
                networkOperatorName = null;
            }
        } else {
            networkOperatorName = null;
        }
        Vj.a aVarB2 = aVarB.b(networkOperatorName);
        TelephonyManager telephonyManagerF6 = this.f15517a.f();
        String str2 = AppLovinMediationProvider.UNKNOWN;
        if (telephonyManagerF6 != null) {
            try {
                str = this.f15519c.a(this.f15517a.e()) ? (String) f15516d.get(telephonyManagerF6.getNetworkType(), AppLovinMediationProvider.UNKNOWN) : AppLovinMediationProvider.UNKNOWN;
            } catch (Throwable unused6) {
            }
        }
        if (str != null) {
            str2 = str;
        }
        return new Vj(aVarB2.a(str2).a(0));
    }
}
