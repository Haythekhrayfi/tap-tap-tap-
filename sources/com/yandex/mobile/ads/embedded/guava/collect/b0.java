package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.fs0;
import com.yandex.mobile.ads.impl.n51;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class b0<K, V> extends c<K, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient n51<? extends List<V>> f18294f;

    public b0(Map<K, Collection<V>> map, n51<? extends List<V>> n51Var) {
        super(map);
        this.f18294f = (n51) fs0.a(n51Var);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f18294f = (n51) objectInputStream.readObject();
        a((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f18294f);
        objectOutputStream.writeObject(c());
    }
}
