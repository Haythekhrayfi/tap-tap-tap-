package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.r;
import com.google.gson.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f12768b = new s() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
        @Override // com.google.gson.s
        public <T> TypeAdapter<T> b(Gson gson, n6.a<T> aVar) {
            if (aVar.rawType == Object.class) {
                return new ObjectTypeAdapter(gson);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f12769a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12770a;

        static {
            int[] iArr = new int[o6.b.values().length];
            f12770a = iArr;
            try {
                iArr[o6.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12770a[o6.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12770a[o6.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12770a[o6.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12770a[o6.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12770a[o6.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ObjectTypeAdapter(Gson gson) {
        this.f12769a = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public Object b(o6.a aVar) throws IOException {
        switch (a.f12770a[aVar.V().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.k()) {
                    arrayList.add(b(aVar));
                }
                aVar.g();
                return arrayList;
            case 2:
                r rVar = new r();
                aVar.b();
                while (aVar.k()) {
                    rVar.put(aVar.J(), b(aVar));
                }
                aVar.h();
                return rVar;
            case 3:
                return aVar.R();
            case 4:
                return Double.valueOf(aVar.p());
            case 5:
                return Boolean.valueOf(aVar.n());
            case 6:
                aVar.O();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void c(o6.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.k();
            return;
        }
        Gson gson = this.f12769a;
        Class<?> cls = obj.getClass();
        Objects.requireNonNull(gson);
        TypeAdapter typeAdapterD = gson.d(new n6.a(cls));
        if (!(typeAdapterD instanceof ObjectTypeAdapter)) {
            typeAdapterD.c(cVar, obj);
        } else {
            cVar.c();
            cVar.h();
        }
    }
}
