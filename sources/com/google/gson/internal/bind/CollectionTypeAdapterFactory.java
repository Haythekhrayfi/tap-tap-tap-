package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.g;
import com.google.gson.s;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f12756c;

    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeAdapter<E> f12757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.gson.internal.s<? extends Collection<E>> f12758b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, com.google.gson.internal.s<? extends Collection<E>> sVar) {
            this.f12757a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f12758b = sVar;
        }

        @Override // com.google.gson.TypeAdapter
        public Object b(o6.a aVar) throws IOException {
            if (aVar.V() == o6.b.NULL) {
                aVar.O();
                return null;
            }
            Collection<E> collectionA = this.f12758b.a();
            aVar.a();
            while (aVar.k()) {
                collectionA.add(this.f12757a.b(aVar));
            }
            aVar.g();
            return collectionA;
        }

        @Override // com.google.gson.TypeAdapter
        public void c(o6.c cVar, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                cVar.k();
                return;
            }
            cVar.b();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f12757a.c(cVar, it.next());
            }
            cVar.g();
        }
    }

    public CollectionTypeAdapterFactory(g gVar) {
        this.f12756c = gVar;
    }

    @Override // com.google.gson.s
    public <T> TypeAdapter<T> b(Gson gson, n6.a<T> aVar) {
        Type type = aVar.type;
        Class<? super T> cls = aVar.rawType;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type typeF = com.google.gson.internal.a.f(type, cls, Collection.class);
        if (typeF instanceof WildcardType) {
            typeF = ((WildcardType) typeF).getUpperBounds()[0];
        }
        Type type2 = typeF instanceof ParameterizedType ? ((ParameterizedType) typeF).getActualTypeArguments()[0] : Object.class;
        return new Adapter(gson, type2, gson.d(new n6.a<>(type2)), this.f12756c.a(aVar));
    }
}
