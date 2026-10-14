package ue;

import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public interface b<T> extends Cloneable {
    void a(d<T> dVar);

    void cancel();

    /* JADX INFO: renamed from: clone */
    b<T> mo144clone();

    boolean isCanceled();

    Request request();
}
