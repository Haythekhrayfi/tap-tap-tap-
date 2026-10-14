package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class N extends AbstractC1871p2<Boolean> {
    public N(Context context, String str) {
        super(context, str, "bool");
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC1871p2
    public Boolean a(int i10) {
        return Boolean.valueOf(this.f17033a.getResources().getBoolean(i10));
    }
}
