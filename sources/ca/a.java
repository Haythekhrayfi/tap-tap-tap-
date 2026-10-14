package ca;

import android.support.v4.media.session.e;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.yandex.metrica.billing_interface.c f3651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3655e;

    public a(com.yandex.metrica.billing_interface.c cVar, String str, String str2, long j10, long j11) {
        this.f3651a = cVar;
        this.f3652b = str;
        this.f3653c = str2;
        this.f3654d = j10;
        this.f3655e = j11;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("BillingInfo{type=");
        sbA.append(this.f3651a);
        sbA.append("sku='");
        sbA.append(this.f3652b);
        sbA.append("'purchaseToken='");
        sbA.append(this.f3653c);
        sbA.append("'purchaseTime=");
        sbA.append(this.f3654d);
        sbA.append("sendTime=");
        return e.a(sbA, this.f3655e, "}");
    }
}
