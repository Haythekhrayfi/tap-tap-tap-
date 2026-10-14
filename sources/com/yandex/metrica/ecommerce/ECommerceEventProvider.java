package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.ob.Ab;
import com.yandex.metrica.impl.ob.Bb;
import com.yandex.metrica.impl.ob.C1681hb;
import com.yandex.metrica.impl.ob.C1805mb;
import com.yandex.metrica.impl.ob.C2029vb;
import com.yandex.metrica.impl.ob.C2059wb;
import com.yandex.metrica.impl.ob.C2084xb;
import com.yandex.metrica.impl.ob.C2134zb;
import com.yandex.metrica.impl.ob.Cb;
import com.yandex.metrica.impl.ob.Eb;
import com.yandex.metrica.impl.ob.Gb;
import com.yandex.metrica.impl.ob.Hb;
import com.yandex.metrica.impl.ob.Ib;
import com.yandex.metrica.impl.ob.Jb;
import com.yandex.metrica.impl.ob.Kb;

/* JADX INFO: loaded from: classes.dex */
public class ECommerceEventProvider {
    public ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C2134zb(4, new Ab(eCommerceCartItem), new C1681hb());
    }

    public ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return new Bb(6, new Cb(eCommerceOrder), new C1805mb());
    }

    public ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return new Bb(7, new Cb(eCommerceOrder), new C1805mb());
    }

    public ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C2134zb(5, new Ab(eCommerceCartItem), new C1681hb());
    }

    public ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return new Ib(new Eb(eCommerceProduct), new Hb(eCommerceScreen), new C2029vb());
    }

    public ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        return new Jb(new Eb(eCommerceProduct), eCommerceReferrer == null ? null : new Gb(eCommerceReferrer), new C2059wb());
    }

    public ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return new Kb(new Hb(eCommerceScreen), new C2084xb());
    }
}
