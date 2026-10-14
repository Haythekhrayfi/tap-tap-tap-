package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzfqw implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (zzfpc.zza(getKey(), entry.getKey()) && zzfpc.zza(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public abstract Object getKey();

    @Override // java.util.Map.Entry
    public abstract Object getValue();

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return j.a(String.valueOf(getKey()), "=", String.valueOf(getValue()));
    }
}
