package com.google.android.play.core.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class bp<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f12275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Field f12276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class<T> f12277c;

    public bp(Object obj, Field field, Class<T> cls) {
        this.f12275a = obj;
        this.f12276b = field;
        this.f12277c = cls;
    }

    public bp(Object obj, Field field, Class cls, byte[] bArr) {
        this(obj, field, Array.newInstance((Class<?>) cls, 0).getClass());
    }

    private Class c() {
        return b().getType().getComponentType();
    }

    public final T a() {
        try {
            return this.f12277c.cast(this.f12276b.get(this.f12275a));
        } catch (Exception e10) {
            throw new br(String.format("Failed to get value of field %s of type %s on object of type %s", this.f12276b.getName(), this.f12275a.getClass().getName(), this.f12277c.getName()), e10);
        }
    }

    public final void a(T t10) {
        try {
            this.f12276b.set(this.f12275a, t10);
        } catch (Exception e10) {
            throw new br(String.format("Failed to set value of field %s of type %s on object of type %s", this.f12276b.getName(), this.f12275a.getClass().getName(), this.f12277c.getName()), e10);
        }
    }

    public void a(Collection collection) {
        Object[] objArr = (Object[]) a();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) c(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[length] = it.next();
            length++;
        }
        a(objArr2);
    }

    public final Field b() {
        return this.f12276b;
    }

    public void b(Collection collection) {
        Object[] objArr = (Object[]) a();
        int i10 = 0;
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) c(), collection.size() + (objArr == null ? 0 : objArr.length));
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[i10] = it.next();
            i10++;
        }
        a(objArr2);
    }
}
