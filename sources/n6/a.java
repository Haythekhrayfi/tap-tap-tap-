package n6;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class a<T> {
    public final int hashCode;
    public final Class<? super T> rawType;
    public final Type type;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type typeA = com.google.gson.internal.a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.type = typeA;
        this.rawType = (Class<? super T>) com.google.gson.internal.a.e(typeA);
        this.hashCode = typeA.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && com.google.gson.internal.a.c(this.type, ((a) obj).type);
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final String toString() {
        return com.google.gson.internal.a.i(this.type);
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type typeA = com.google.gson.internal.a.a(type);
        this.type = typeA;
        this.rawType = (Class<? super T>) com.google.gson.internal.a.e(typeA);
        this.hashCode = typeA.hashCode();
    }
}
