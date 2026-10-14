package com.yandex.metrica.rtm.wrapper;

import android.content.Context;
import com.yandex.metrica.rtm.client.ExceptionProcessor;

/* JADX INFO: loaded from: classes.dex */
public class e implements ea.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExceptionProcessor f18125a;

    public e(ea.d dVar, Context context) throws Throwable {
        this.f18125a = new ExceptionProcessor(context, new a(dVar));
    }

    @Override // ea.b
    public void reportException(String str, Throwable th) {
        try {
            this.f18125a.onException(str, th);
        } catch (Throwable unused) {
        }
    }
}
