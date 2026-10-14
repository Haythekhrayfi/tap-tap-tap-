package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.joran.action.Action;

/* JADX INFO: loaded from: classes3.dex */
public final class kj implements h81 {
    private static lj b(b90 b90Var, ej ejVar) {
        lj bVar;
        String strB = ejVar.b();
        try {
            int iOrdinal = ejVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    Integer numValueOf = Integer.valueOf(b90Var.b(-1, strB));
                    if (!(numValueOf.intValue() != -1)) {
                        numValueOf = null;
                    }
                    bVar = new lj.c(numValueOf != null ? String.valueOf(numValueOf.intValue()) : null);
                } else if (iOrdinal == 2) {
                    bVar = new lj.a(b90Var.b(-1, strB) != -1);
                } else if (iOrdinal == 3) {
                    bVar = new lj.d(b90Var.b(strB));
                } else {
                    if (iOrdinal != 4) {
                        throw new jc.g();
                    }
                    bVar = new lj.e(b90Var.b(strB));
                }
            } else {
                bVar = new lj.b(b90Var.b(strB));
            }
            return bVar;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.h81
    public final lj a(b90 b90Var, ej ejVar) {
        fd.j0.i(b90Var, "localStorage");
        fd.j0.i(ejVar, "type");
        if (!b90Var.contains(ejVar.b())) {
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
        ej ejVarB = str != null ? ej.a.b(str) : null;
        if (ejVarB != null) {
            return b(b90Var, ejVarB);
        }
        return null;
    }
}
