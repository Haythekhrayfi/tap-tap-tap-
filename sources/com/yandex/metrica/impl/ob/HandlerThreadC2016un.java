package com.yandex.metrica.impl.ob;

import android.os.HandlerThread;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class HandlerThreadC2016un extends HandlerThread implements InterfaceC1991tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f17588a;

    public HandlerThreadC2016un(String str) {
        super(str);
        this.f17588a = true;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1991tn
    public synchronized boolean c() {
        return this.f17588a;
    }
}
