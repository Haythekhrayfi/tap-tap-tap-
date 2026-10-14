package com.google.gson.internal;

import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z {
    public static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder sbA = defpackage.a.a("Interface can't be instantiated! Interface name: ");
            sbA.append(cls.getName());
            throw new UnsupportedOperationException(sbA.toString());
        }
        if (Modifier.isAbstract(modifiers)) {
            StringBuilder sbA2 = defpackage.a.a("Abstract class can't be instantiated! Class name: ");
            sbA2.append(cls.getName());
            throw new UnsupportedOperationException(sbA2.toString());
        }
    }

    public abstract <T> T b(Class<T> cls) throws Exception;
}
