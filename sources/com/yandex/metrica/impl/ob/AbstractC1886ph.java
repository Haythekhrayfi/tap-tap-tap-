package com.yandex.metrica.impl.ob;

import android.net.Uri;
import com.yandex.metrica.impl.ob.C1587dh;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1886ph<T extends C1587dh> implements InterfaceC1836nh<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1693hn f17138a;

    public void a(Uri.Builder builder) {
        if (this.f17138a != null) {
            builder.appendQueryParameter("encrypted_request", "1");
        }
    }

    public void a(C1693hn c1693hn) {
        this.f17138a = c1693hn;
    }
}
