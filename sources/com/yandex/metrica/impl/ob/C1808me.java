package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1808me implements InterfaceC1584de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<String> f16897a;

    public C1808me(List<C1709ie> list) {
        if (list == null) {
            this.f16897a = new HashSet();
            return;
        }
        this.f16897a = new HashSet(list.size());
        for (C1709ie c1709ie : list) {
            if (c1709ie.f16346b) {
                this.f16897a.add(c1709ie.f16345a);
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1584de
    public boolean a(String str) {
        return this.f16897a.contains(str);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("StartupBasedPermissionStrategy{mEnabledPermissions=");
        sbA.append(this.f16897a);
        sbA.append('}');
        return sbA.toString();
    }
}
