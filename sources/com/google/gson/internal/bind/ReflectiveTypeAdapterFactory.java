package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.d;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.g;
import com.google.gson.q;
import com.google.gson.s;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f12771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f12772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Excluder f12773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f12774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m6.b f12775g = m6.b.f33225a;

    public static final class Adapter<T> extends TypeAdapter<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.gson.internal.s<T> f12776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, a> f12777b;

        public Adapter(com.google.gson.internal.s<T> sVar, Map<String, a> map) {
            this.f12776a = sVar;
            this.f12777b = map;
        }

        @Override // com.google.gson.TypeAdapter
        public T b(o6.a aVar) throws IOException {
            if (aVar.V() == o6.b.NULL) {
                aVar.O();
                return null;
            }
            T tA = this.f12776a.a();
            try {
                aVar.b();
                while (aVar.k()) {
                    a aVar2 = this.f12777b.get(aVar.J());
                    if (aVar2 == null || !aVar2.f12780c) {
                        aVar.e0();
                    } else {
                        aVar2.a(aVar, tA);
                    }
                }
                aVar.h();
                return tA;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (IllegalStateException e11) {
                throw new q(e11);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void c(o6.c cVar, T t10) throws IOException {
            if (t10 == null) {
                cVar.k();
                return;
            }
            cVar.c();
            try {
                for (a aVar : this.f12777b.values()) {
                    if (aVar.c(t10)) {
                        cVar.i(aVar.f12778a);
                        aVar.b(cVar, t10);
                    }
                }
                cVar.h();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f12779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f12780c;

        public a(String str, boolean z10, boolean z11) {
            this.f12778a = str;
            this.f12779b = z10;
            this.f12780c = z11;
        }

        public abstract void a(o6.a aVar, Object obj) throws IllegalAccessException, IOException;

        public abstract void b(o6.c cVar, Object obj) throws IllegalAccessException, IOException;

        public abstract boolean c(Object obj) throws IllegalAccessException, IOException;
    }

    public ReflectiveTypeAdapterFactory(g gVar, d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f12771c = gVar;
        this.f12772d = dVar;
        this.f12773e = excluder;
        this.f12774f = jsonAdapterAnnotationTypeAdapterFactory;
    }

    public boolean a(Field field, boolean z10) {
        boolean z11;
        Excluder excluder = this.f12773e;
        Class<?> type = field.getType();
        if (excluder.c(type) || excluder.d(type, z10)) {
            return false;
        }
        if ((excluder.f12736d & field.getModifiers()) == 0 && ((excluder.f12735c == -1.0d || excluder.g((k6.c) field.getAnnotation(k6.c.class), (k6.d) field.getAnnotation(k6.d.class))) && !field.isSynthetic() && ((excluder.f12737e || !excluder.f(field.getType())) && !excluder.e(field.getType())))) {
            List<com.google.gson.a> list = z10 ? excluder.f12738f : excluder.f12739g;
            if (!list.isEmpty()) {
                com.google.gson.b bVar = new com.google.gson.b(field);
                Iterator<com.google.gson.a> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().a(bVar)) {
                            z11 = true;
                        }
                    }
                }
            }
            z11 = false;
        } else {
            z11 = true;
        }
        return !z11;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // com.google.gson.s
    public <T> com.google.gson.TypeAdapter<T> b(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r35v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */
}
