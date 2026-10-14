package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class po implements uo<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17149a;

    public po(String str) {
        this.f17149a = str;
    }

    @Override // com.yandex.metrica.impl.ob.uo
    public so a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return so.a(this);
        }
        return so.a(this, this.f17149a + " is empty.");
    }
}
