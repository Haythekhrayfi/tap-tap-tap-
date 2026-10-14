package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12418a;

    public ax(Context context) {
        this.f12418a = context;
    }

    private final SharedPreferences b() {
        return this.f12418a.getSharedPreferences("playcore_split_install_internal", 0);
    }

    public final synchronized Set<String> a() {
        Set<String> stringSet;
        try {
            stringSet = b().getStringSet("deferred_uninstall_module_list", new HashSet());
            if (stringSet == null) {
                stringSet = new HashSet<>();
            }
        } catch (Exception unused) {
            return new HashSet();
        }
        return stringSet;
    }

    public final synchronized void a(Collection<String> collection) {
        Set<String> setA = a();
        Iterator<String> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= setA.add(it.next());
        }
        if (zAdd) {
            try {
                b().edit().putStringSet("deferred_uninstall_module_list", setA).apply();
            } catch (Exception unused) {
            }
        }
    }
}
