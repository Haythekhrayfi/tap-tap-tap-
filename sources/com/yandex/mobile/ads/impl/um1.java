package com.yandex.mobile.ads.impl;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes3.dex */
public abstract class um1 extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f25703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f25704b;

    public interface a {
    }

    public interface b {
    }

    public um1(b bVar) {
        this.f25704b = bVar;
    }

    public final void a(a aVar) {
        this.f25703a = aVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f25703a;
        if (aVar != null) {
            ((zm1) aVar).a();
        }
    }
}
