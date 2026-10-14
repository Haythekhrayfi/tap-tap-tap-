package com.google.gson;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeAdapter<T> {

    /* JADX INFO: renamed from: com.google.gson.TypeAdapter$1, reason: invalid class name */
    public class AnonymousClass1 extends TypeAdapter<T> {
        public AnonymousClass1() {
        }

        @Override // com.google.gson.TypeAdapter
        public T b(o6.a aVar) throws IOException {
            if (aVar.V() != o6.b.NULL) {
                return (T) TypeAdapter.this.b(aVar);
            }
            aVar.O();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void c(o6.c cVar, T t10) throws IOException {
            if (t10 == null) {
                cVar.k();
            } else {
                TypeAdapter.this.c(cVar, t10);
            }
        }
    }

    public final TypeAdapter<T> a() {
        return new AnonymousClass1();
    }

    public abstract T b(o6.a aVar) throws IOException;

    public abstract void c(o6.c cVar, T t10) throws IOException;
}
