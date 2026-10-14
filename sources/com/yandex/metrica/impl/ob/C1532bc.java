package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1532bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1507ac f15827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC1596e1 f15828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15829c;

    public C1532bc() {
        this(null, EnumC1596e1.UNKNOWN, "identifier info has never been updated");
    }

    public C1532bc(C1507ac c1507ac, EnumC1596e1 enumC1596e1, String str) {
        this.f15827a = c1507ac;
        this.f15828b = enumC1596e1;
        this.f15829c = str;
    }

    public boolean a() {
        C1507ac c1507ac = this.f15827a;
        return (c1507ac == null || TextUtils.isEmpty(c1507ac.f15739b)) ? false : true;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("AdTrackingInfoResult{mAdTrackingInfo=");
        sbA.append(this.f15827a);
        sbA.append(", mStatus=");
        sbA.append(this.f15828b);
        sbA.append(", mErrorExplanation='");
        sbA.append(this.f15829c);
        sbA.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sbA.append('}');
        return sbA.toString();
    }
}
