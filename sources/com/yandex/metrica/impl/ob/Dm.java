package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
public class Dm implements Hm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f13846a;

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"PrivateApi"})
    public String a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (String) cls.getMethod("getProcessName", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public String b() {
        if (this.f13846a != null) {
            return this.f13846a;
        }
        synchronized (this) {
            if (this.f13846a == null) {
                this.f13846a = a();
            }
        }
        return this.f13846a;
    }
}
