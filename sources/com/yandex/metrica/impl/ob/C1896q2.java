package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.yandex.metrica.Revenue;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1896q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Revenue f17158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Pn<String> f17159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Pn<String> f17160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Pn<String> f17161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Im f17162e;

    public C1896q2(Revenue revenue, Im im) {
        this.f17162e = im;
        this.f17158a = revenue;
        this.f17159b = new Mn(30720, "revenue payload", im);
        this.f17160c = new On(new Mn(184320, "receipt data", im), "<truncated data was not sent, see METRIKALIB-4568>");
        this.f17161d = new On(new Nn(1000, "receipt signature", im), "<truncated data was not sent, see METRIKALIB-4568>");
    }

    public Pair<byte[], Integer> a() {
        Zf zf = new Zf();
        zf.f15657d = this.f17158a.currency.getCurrencyCode().getBytes();
        if (U2.a(this.f17158a.price)) {
            zf.f15656c = this.f17158a.price.doubleValue();
        }
        if (U2.a(this.f17158a.priceMicros)) {
            zf.f15661h = this.f17158a.priceMicros.longValue();
        }
        zf.f15658e = O2.d(new Nn(200, "revenue productID", this.f17162e).a(this.f17158a.productID));
        Integer num = this.f17158a.quantity;
        if (num == null) {
            num = 1;
        }
        zf.f15655b = num.intValue();
        zf.f15659f = O2.d(this.f17159b.a(this.f17158a.payload));
        int length = 0;
        if (U2.a(this.f17158a.receipt)) {
            Zf.a aVar = new Zf.a();
            String strA = this.f17160c.a(this.f17158a.receipt.data);
            length = C1694i.a(this.f17158a.receipt.data, strA) ? this.f17158a.receipt.data.length() + 0 : 0;
            String strA2 = this.f17161d.a(this.f17158a.receipt.signature);
            aVar.f15667b = O2.d(strA);
            aVar.f15668c = O2.d(strA2);
            zf.f15660g = aVar;
        }
        return new Pair<>(AbstractC1594e.a(zf), Integer.valueOf(length));
    }
}
