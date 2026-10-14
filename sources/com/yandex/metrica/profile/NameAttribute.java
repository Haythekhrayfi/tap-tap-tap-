package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.Df;
import com.yandex.metrica.impl.ob.Nn;
import com.yandex.metrica.impl.ob.no;

/* JADX INFO: loaded from: classes.dex */
public class NameAttribute extends StringAttribute {
    public NameAttribute() {
        super("appmetrica_name", new Nn(100, "Name attribute"), new no(), new Df());
    }
}
