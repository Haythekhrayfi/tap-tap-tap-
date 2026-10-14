package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.joran.action.Action;

/* JADX INFO: loaded from: classes3.dex */
public final class jj implements h81 {
    private static lj b(b90 b90Var, ej ejVar) {
        String strA = ejVar.a();
        try {
            int iOrdinal = ejVar.ordinal();
            if (iOrdinal == 0) {
                return new lj.b(b90Var.b(strA));
            }
            if (iOrdinal == 1) {
                return new lj.c(b90Var.b(strA));
            }
            if (iOrdinal == 2) {
                return new lj.a(b90Var.getBoolean(strA, false));
            }
            if (iOrdinal == 3) {
                return new lj.d(b90Var.b(strA));
            }
            if (iOrdinal == 4) {
                return new lj.e(b90Var.b(strA));
            }
            throw new jc.g();
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.h81
    public final lj a(b90 b90Var, ej ejVar) {
        fd.j0.i(b90Var, "localStorage");
        fd.j0.i(ejVar, "type");
        if (!b90Var.contains(ejVar.a())) {
            ejVar = null;
        }
        if (ejVar != null) {
            return b(b90Var, ejVar);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.h81
    public final lj a(b90 b90Var, String str) {
        fd.j0.i(b90Var, "localStorage");
        fd.j0.i(str, Action.KEY_ATTRIBUTE);
        if (!b90Var.contains(str)) {
            str = null;
        }
        ej ejVarA = str != null ? ej.a.a(str) : null;
        if (ejVarA != null) {
            return b(b90Var, ejVarA);
        }
        return null;
    }
}
