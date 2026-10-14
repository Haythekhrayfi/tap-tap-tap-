package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public class f implements s<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f12854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f12855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Type f12856c;

    public f(g gVar, Class cls, Type type) {
        z yVar;
        this.f12855b = cls;
        this.f12856c = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            yVar = new v(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    yVar = new w(declaredMethod2, iIntValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    yVar = new x(declaredMethod3);
                }
            } catch (Exception unused3) {
                yVar = new y();
            }
        }
        this.f12854a = yVar;
    }

    @Override // com.google.gson.internal.s
    public Object a() {
        try {
            return this.f12854a.b(this.f12855b);
        } catch (Exception e10) {
            StringBuilder sbA = defpackage.a.a("Unable to invoke no-args constructor for ");
            sbA.append(this.f12856c);
            sbA.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(sbA.toString(), e10);
        }
    }
}
