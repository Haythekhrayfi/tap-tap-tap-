package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.i;
import com.google.gson.internal.r;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.s;
import i.f;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeAdapters {
    public static final s A;
    public static final s B;
    public static final TypeAdapter<i> C;
    public static final s D;
    public static final s E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f12795a = new AnonymousClass32(Class.class, new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
        @Override // com.google.gson.TypeAdapter
        public Class b(o6.a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.TypeAdapter
        public void c(o6.c cVar, Class cls) throws IOException {
            StringBuilder sbA = defpackage.a.a("Attempted to serialize java.lang.Class: ");
            sbA.append(cls.getName());
            sbA.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(sbA.toString());
        }
    }.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f12796b = new AnonymousClass32(BitSet.class, new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
        /* JADX WARN: Code duplicated, block: B:23:0x005d  */
        @Override // com.google.gson.TypeAdapter
        public BitSet b(o6.a aVar) throws IOException {
            BitSet bitSet = new BitSet();
            aVar.a();
            o6.b bVarV = aVar.V();
            int i10 = 0;
            while (bVarV != o6.b.END_ARRAY) {
                int i11 = a.f12836a[bVarV.ordinal()];
                boolean zN = true;
                if (i11 != 1) {
                    if (i11 == 2) {
                        zN = aVar.n();
                    } else {
                        if (i11 != 3) {
                            throw new q("Invalid bitset value type: " + bVarV);
                        }
                        String strR = aVar.R();
                        try {
                            if (Integer.parseInt(strR) == 0) {
                                zN = false;
                            }
                        } catch (NumberFormatException unused) {
                            throw new q(f.a("Error: Expecting: bitset number value (1, 0), Found: ", strR));
                        }
                    }
                } else if (aVar.q() == 0) {
                    zN = false;
                }
                if (zN) {
                    bitSet.set(i10);
                }
                i10++;
                bVarV = aVar.V();
            }
            aVar.g();
            return bitSet;
        }

        @Override // com.google.gson.TypeAdapter
        public void c(o6.c cVar, BitSet bitSet) throws IOException {
            BitSet bitSet2 = bitSet;
            cVar.b();
            int length = bitSet2.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.q(bitSet2.get(i10) ? 1L : 0L);
            }
            cVar.g();
        }
    }.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TypeAdapter<Boolean> f12797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f12798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f12799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f12800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s f12801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s f12802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s f12803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s f12804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final TypeAdapter<Number> f12805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final TypeAdapter<Number> f12806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final TypeAdapter<Number> f12807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f12808n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f12809o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final TypeAdapter<BigDecimal> f12810p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final TypeAdapter<BigInteger> f12811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f12812r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f12813s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f12814t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f12815u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s f12816v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s f12817w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f12818x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s f12819y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final s f12820z;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$29, reason: invalid class name */
    public static class AnonymousClass29 extends TypeAdapter<i> {
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public i b(o6.a aVar) throws IOException {
            switch (a.f12836a[aVar.V().ordinal()]) {
                case 1:
                    return new n(new com.google.gson.internal.q(aVar.R()));
                case 2:
                    return new n(Boolean.valueOf(aVar.n()));
                case 3:
                    return new n(aVar.R());
                case 4:
                    aVar.O();
                    return k.f12897a;
                case 5:
                    com.google.gson.f fVar = new com.google.gson.f();
                    aVar.a();
                    while (aVar.k()) {
                        i iVarB = b(aVar);
                        if (iVarB == null) {
                            iVarB = k.f12897a;
                        }
                        fVar.f12733c.add(iVarB);
                    }
                    aVar.g();
                    return fVar;
                case 6:
                    l lVar = new l();
                    aVar.b();
                    while (aVar.k()) {
                        String strJ = aVar.J();
                        i iVarB2 = b(aVar);
                        if (iVarB2 == null) {
                            iVarB2 = k.f12897a;
                        }
                        lVar.f12898a.put(strJ, iVarB2);
                    }
                    aVar.h();
                    return lVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(o6.c cVar, i iVar) throws IOException {
            if (iVar == null || (iVar instanceof k)) {
                cVar.k();
                return;
            }
            if (iVar instanceof n) {
                n nVarD = iVar.d();
                Object obj = nVarD.f12900a;
                if (obj instanceof Number) {
                    cVar.J(nVarD.f());
                    return;
                } else if (obj instanceof Boolean) {
                    cVar.O(nVarD.e());
                    return;
                } else {
                    cVar.K(nVarD.g());
                    return;
                }
            }
            boolean z10 = iVar instanceof com.google.gson.f;
            if (z10) {
                cVar.b();
                if (!z10) {
                    throw new IllegalStateException("Not a JSON Array: " + iVar);
                }
                Iterator<i> it = ((com.google.gson.f) iVar).iterator();
                while (it.hasNext()) {
                    c(cVar, it.next());
                }
                cVar.g();
                return;
            }
            boolean z11 = iVar instanceof l;
            if (!z11) {
                StringBuilder sbA = defpackage.a.a("Couldn't write ");
                sbA.append(iVar.getClass());
                throw new IllegalArgumentException(sbA.toString());
            }
            cVar.c();
            if (!z11) {
                throw new IllegalStateException("Not a JSON Object: " + iVar);
            }
            r rVar = r.this;
            r.e eVar = rVar.f12873g.f12885f;
            int i10 = rVar.f12872f;
            while (true) {
                r.e eVar2 = rVar.f12873g;
                if (!(eVar != eVar2)) {
                    cVar.h();
                    return;
                }
                if (eVar == eVar2) {
                    throw new NoSuchElementException();
                }
                if (rVar.f12872f != i10) {
                    throw new ConcurrentModificationException();
                }
                r.e eVar3 = eVar.f12885f;
                cVar.i((String) eVar.f12887h);
                c(cVar, (i) eVar.f12888i);
                eVar = eVar3;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$31, reason: invalid class name */
    final class AnonymousClass31 implements s {
        @Override // com.google.gson.s
        public <T> TypeAdapter<T> b(Gson gson, n6.a<T> aVar) {
            aVar.equals(null);
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$32, reason: invalid class name */
    public static class AnonymousClass32 implements s {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f12822c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f12823d;

        public AnonymousClass32(Class cls, TypeAdapter typeAdapter) {
            this.f12822c = cls;
            this.f12823d = typeAdapter;
        }

        @Override // com.google.gson.s
        public <T> TypeAdapter<T> b(Gson gson, n6.a<T> aVar) {
            if (aVar.rawType == this.f12822c) {
                return this.f12823d;
            }
            return null;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Factory[type=");
            sbA.append(this.f12822c.getName());
            sbA.append(",adapter=");
            sbA.append(this.f12823d);
            sbA.append("]");
            return sbA.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$33, reason: invalid class name */
    public static class AnonymousClass33 implements s {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f12824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Class f12825d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f12826e;

        public AnonymousClass33(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.f12824c = cls;
            this.f12825d = cls2;
            this.f12826e = typeAdapter;
        }

        @Override // com.google.gson.s
        public <T> TypeAdapter<T> b(Gson gson, n6.a<T> aVar) {
            Class<? super T> cls = aVar.rawType;
            if (cls == this.f12824c || cls == this.f12825d) {
                return this.f12826e;
            }
            return null;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Factory[type=");
            sbA.append(this.f12825d.getName());
            sbA.append("+");
            sbA.append(this.f12824c.getName());
            sbA.append(",adapter=");
            sbA.append(this.f12826e);
            sbA.append("]");
            return sbA.toString();
        }
    }

    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, T> f12834a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<T, String> f12835b = new HashMap();

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (T t10 : cls.getEnumConstants()) {
                    String strName = t10.name();
                    k6.b bVar = (k6.b) cls.getField(strName).getAnnotation(k6.b.class);
                    if (bVar != null) {
                        strName = bVar.value();
                        for (String str : bVar.alternate()) {
                            this.f12834a.put(str, t10);
                        }
                    }
                    this.f12834a.put(strName, t10);
                    this.f12835b.put(t10, strName);
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public Object b(o6.a aVar) throws IOException {
            if (aVar.V() != o6.b.NULL) {
                return this.f12834a.get(aVar.R());
            }
            aVar.O();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void c(o6.c cVar, Object obj) throws IOException {
            Enum r10 = (Enum) obj;
            cVar.K(r10 == null ? null : this.f12835b.get(r10));
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12836a;

        static {
            int[] iArr = new int[o6.b.values().length];
            f12836a = iArr;
            try {
                iArr[o6.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12836a[o6.b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12836a[o6.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12836a[o6.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12836a[o6.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12836a[o6.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12836a[o6.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12836a[o6.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12836a[o6.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12836a[o6.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            public Boolean b(o6.a aVar) throws IOException {
                o6.b bVarV = aVar.V();
                if (bVarV != o6.b.NULL) {
                    return Boolean.valueOf(bVarV == o6.b.STRING ? Boolean.parseBoolean(aVar.R()) : aVar.n());
                }
                aVar.O();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, Boolean bool) throws IOException {
                cVar.C(bool);
            }
        };
        f12797c = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            public Boolean b(o6.a aVar) throws IOException {
                if (aVar.V() != o6.b.NULL) {
                    return Boolean.valueOf(aVar.R());
                }
                aVar.O();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, Boolean bool) throws IOException {
                Boolean bool2 = bool;
                cVar.K(bool2 == null ? "null" : bool2.toString());
            }
        };
        f12798d = new AnonymousClass33(Boolean.TYPE, Boolean.class, typeAdapter);
        f12799e = new AnonymousClass33(Byte.TYPE, Byte.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            public Number b(o6.a aVar) throws IOException {
                if (aVar.V() == o6.b.NULL) {
                    aVar.O();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) aVar.q());
                } catch (NumberFormatException e10) {
                    throw new q(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, Number number) throws IOException {
                cVar.J(number);
            }
        });
        f12800f = new AnonymousClass33(Short.TYPE, Short.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            public Number b(o6.a aVar) throws IOException {
                if (aVar.V() == o6.b.NULL) {
                    aVar.O();
                    return null;
                }
                try {
                    return Short.valueOf((short) aVar.q());
                } catch (NumberFormatException e10) {
                    throw new q(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, Number number) throws IOException {
                cVar.J(number);
            }
        });
        f12801g = new AnonymousClass33(Integer.TYPE, Integer.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            public Number b(o6.a aVar) throws IOException {
                if (aVar.V() == o6.b.NULL) {
                    aVar.O();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.q());
                } catch (NumberFormatException e10) {
                    throw new q(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, Number number) throws IOException {
                cVar.J(number);
            }
        });
        f12802h = new AnonymousClass32(AtomicInteger.class, new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            public AtomicInteger b(o6.a aVar) throws IOException {
                try {
                    return new AtomicInteger(aVar.q());
                } catch (NumberFormatException e10) {
                    throw new q(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, AtomicInteger atomicInteger) throws IOException {
                cVar.q(atomicInteger.get());
            }
        }.a());
        f12803i = new AnonymousClass32(AtomicBoolean.class, new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            public AtomicBoolean b(o6.a aVar) throws IOException {
                return new AtomicBoolean(aVar.n());
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, AtomicBoolean atomicBoolean) throws IOException {
                cVar.O(atomicBoolean.get());
            }
        }.a());
        f12804j = new AnonymousClass32(AtomicIntegerArray.class, new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            public AtomicIntegerArray b(o6.a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.k()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.q()));
                    } catch (NumberFormatException e10) {
                        throw new q(e10);
                    }
                }
                aVar.g();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
                AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
                cVar.b();
                int length = atomicIntegerArray2.length();
                for (int i10 = 0; i10 < length; i10++) {
                    cVar.q(atomicIntegerArray2.get(i10));
                }
                cVar.g();
            }
        }.a());
        f12805k = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            public Number b(o6.a aVar) throws IOException {
                if (aVar.V() == o6.b.NULL) {
                    aVar.O();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.C());
                } catch (NumberFormatException e10) {
                    throw new q(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, Number number) throws IOException {
                cVar.J(number);
            }
        };
        f12806l = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            public Number b(o6.a aVar) throws IOException {
                if (aVar.V() != o6.b.NULL) {
                    return Float.valueOf((float) aVar.p());
                }
                aVar.O();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, Number number) throws IOException {
                cVar.J(number);
            }
        };
        f12807m = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            public Number b(o6.a aVar) throws IOException {
                if (aVar.V() != o6.b.NULL) {
                    return Double.valueOf(aVar.p());
                }
                aVar.O();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, Number number) throws IOException {
                cVar.J(number);
            }
        };
        f12808n = new AnonymousClass32(Number.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            public Number b(o6.a aVar) throws IOException {
                o6.b bVarV = aVar.V();
                int i10 = a.f12836a[bVarV.ordinal()];
                if (i10 == 1 || i10 == 3) {
                    return new com.google.gson.internal.q(aVar.R());
                }
                if (i10 == 4) {
                    aVar.O();
                    return null;
                }
                throw new q("Expecting number, got: " + bVarV);
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, Number number) throws IOException {
                cVar.J(number);
            }
        });
        f12809o = new AnonymousClass33(Character.TYPE, Character.class, new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            public Character b(o6.a aVar) throws IOException {
                if (aVar.V() == o6.b.NULL) {
                    aVar.O();
                    return null;
                }
                String strR = aVar.R();
                if (strR.length() == 1) {
                    return Character.valueOf(strR.charAt(0));
                }
                throw new q(f.a("Expecting character, got: ", strR));
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, Character ch2) throws IOException {
                Character ch3 = ch2;
                cVar.K(ch3 == null ? null : String.valueOf(ch3));
            }
        });
        TypeAdapter<String> typeAdapter2 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            public String b(o6.a aVar) throws IOException {
                o6.b bVarV = aVar.V();
                if (bVarV != o6.b.NULL) {
                    return bVarV == o6.b.BOOLEAN ? Boolean.toString(aVar.n()) : aVar.R();
                }
                aVar.O();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, String str) throws IOException {
                cVar.K(str);
            }
        };
        f12810p = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            public BigDecimal b(o6.a aVar) throws IOException {
                if (aVar.V() == o6.b.NULL) {
                    aVar.O();
                    return null;
                }
                try {
                    return new BigDecimal(aVar.R());
                } catch (NumberFormatException e10) {
                    throw new q(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, BigDecimal bigDecimal) throws IOException {
                cVar.J(bigDecimal);
            }
        };
        f12811q = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            public BigInteger b(o6.a aVar) throws IOException {
                if (aVar.V() == o6.b.NULL) {
                    aVar.O();
                    return null;
                }
                try {
                    return new BigInteger(aVar.R());
                } catch (NumberFormatException e10) {
                    throw new q(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, BigInteger bigInteger) throws IOException {
                cVar.J(bigInteger);
            }
        };
        f12812r = new AnonymousClass32(String.class, typeAdapter2);
        f12813s = new AnonymousClass32(StringBuilder.class, new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            public StringBuilder b(o6.a aVar) throws IOException {
                if (aVar.V() != o6.b.NULL) {
                    return new StringBuilder(aVar.R());
                }
                aVar.O();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, StringBuilder sb2) throws IOException {
                StringBuilder sb3 = sb2;
                cVar.K(sb3 == null ? null : sb3.toString());
            }
        });
        f12814t = new AnonymousClass32(StringBuffer.class, new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            public StringBuffer b(o6.a aVar) throws IOException {
                if (aVar.V() != o6.b.NULL) {
                    return new StringBuffer(aVar.R());
                }
                aVar.O();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, StringBuffer stringBuffer) throws IOException {
                StringBuffer stringBuffer2 = stringBuffer;
                cVar.K(stringBuffer2 == null ? null : stringBuffer2.toString());
            }
        });
        f12815u = new AnonymousClass32(URL.class, new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            public URL b(o6.a aVar) throws IOException {
                if (aVar.V() == o6.b.NULL) {
                    aVar.O();
                    return null;
                }
                String strR = aVar.R();
                if ("null".equals(strR)) {
                    return null;
                }
                return new URL(strR);
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, URL url) throws IOException {
                URL url2 = url;
                cVar.K(url2 == null ? null : url2.toExternalForm());
            }
        });
        f12816v = new AnonymousClass32(URI.class, new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            public URI b(o6.a aVar) throws IOException {
                if (aVar.V() == o6.b.NULL) {
                    aVar.O();
                    return null;
                }
                try {
                    String strR = aVar.R();
                    if ("null".equals(strR)) {
                        return null;
                    }
                    return new URI(strR);
                } catch (URISyntaxException e10) {
                    throw new j(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, URI uri) throws IOException {
                URI uri2 = uri;
                cVar.K(uri2 == null ? null : uri2.toASCIIString());
            }
        });
        final TypeAdapter<InetAddress> typeAdapter3 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            public InetAddress b(o6.a aVar) throws IOException {
                if (aVar.V() != o6.b.NULL) {
                    return InetAddress.getByName(aVar.R());
                }
                aVar.O();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, InetAddress inetAddress) throws IOException {
                InetAddress inetAddress2 = inetAddress;
                cVar.K(inetAddress2 == null ? null : inetAddress2.getHostAddress());
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        f12817w = new s() { // from class: com.google.gson.internal.bind.TypeAdapters.35
            @Override // com.google.gson.s
            public <T2> TypeAdapter<T2> b(Gson gson, n6.a<T2> aVar) {
                final Class<? super T2> cls2 = aVar.rawType;
                if (cls.isAssignableFrom(cls2)) {
                    return (TypeAdapter<T2>) new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.35.1
                        @Override // com.google.gson.TypeAdapter
                        public Object b(o6.a aVar2) throws IOException {
                            Object objB = typeAdapter3.b(aVar2);
                            if (objB == null || cls2.isInstance(objB)) {
                                return objB;
                            }
                            StringBuilder sbA = defpackage.a.a("Expected a ");
                            sbA.append(cls2.getName());
                            sbA.append(" but was ");
                            sbA.append(objB.getClass().getName());
                            throw new q(sbA.toString());
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void c(o6.c cVar, Object obj) throws IOException {
                            typeAdapter3.c(cVar, obj);
                        }
                    };
                }
                return null;
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("Factory[typeHierarchy=");
                sbA.append(cls.getName());
                sbA.append(",adapter=");
                sbA.append(typeAdapter3);
                sbA.append("]");
                return sbA.toString();
            }
        };
        f12818x = new AnonymousClass32(UUID.class, new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            public UUID b(o6.a aVar) throws IOException {
                if (aVar.V() != o6.b.NULL) {
                    return UUID.fromString(aVar.R());
                }
                aVar.O();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, UUID uuid) throws IOException {
                UUID uuid2 = uuid;
                cVar.K(uuid2 == null ? null : uuid2.toString());
            }
        });
        f12819y = new AnonymousClass32(Currency.class, new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            public Currency b(o6.a aVar) throws IOException {
                return Currency.getInstance(aVar.R());
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, Currency currency) throws IOException {
                cVar.K(currency.getCurrencyCode());
            }
        }.a());
        f12820z = new s() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.s
            public <T> TypeAdapter<T> b(Gson gson, n6.a<T> aVar) {
                if (aVar.rawType != Timestamp.class) {
                    return null;
                }
                Objects.requireNonNull(gson);
                final TypeAdapter<T> typeAdapterD = gson.d(new n6.a<>(Date.class));
                return (TypeAdapter<T>) new TypeAdapter<Timestamp>(this) { // from class: com.google.gson.internal.bind.TypeAdapters.26.1
                    @Override // com.google.gson.TypeAdapter
                    public Timestamp b(o6.a aVar2) throws IOException {
                        Date date = (Date) typeAdapterD.b(aVar2);
                        if (date != null) {
                            return new Timestamp(date.getTime());
                        }
                        return null;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public void c(o6.c cVar, Timestamp timestamp) throws IOException {
                        typeAdapterD.c(cVar, timestamp);
                    }
                };
            }
        };
        final TypeAdapter<Calendar> typeAdapter4 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            public Calendar b(o6.a aVar) throws IOException {
                if (aVar.V() == o6.b.NULL) {
                    aVar.O();
                    return null;
                }
                aVar.b();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (aVar.V() != o6.b.END_OBJECT) {
                    String strJ = aVar.J();
                    int iQ = aVar.q();
                    if ("year".equals(strJ)) {
                        i10 = iQ;
                    } else if ("month".equals(strJ)) {
                        i11 = iQ;
                    } else if ("dayOfMonth".equals(strJ)) {
                        i12 = iQ;
                    } else if ("hourOfDay".equals(strJ)) {
                        i13 = iQ;
                    } else if ("minute".equals(strJ)) {
                        i14 = iQ;
                    } else if ("second".equals(strJ)) {
                        i15 = iQ;
                    }
                }
                aVar.h();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, Calendar calendar) throws IOException {
                Calendar calendar2 = calendar;
                if (calendar2 == null) {
                    cVar.k();
                    return;
                }
                cVar.c();
                cVar.i("year");
                cVar.q(calendar2.get(1));
                cVar.i("month");
                cVar.q(calendar2.get(2));
                cVar.i("dayOfMonth");
                cVar.q(calendar2.get(5));
                cVar.i("hourOfDay");
                cVar.q(calendar2.get(11));
                cVar.i("minute");
                cVar.q(calendar2.get(12));
                cVar.i("second");
                cVar.q(calendar2.get(13));
                cVar.h();
            }
        };
        final Class<Calendar> cls2 = Calendar.class;
        final Class<GregorianCalendar> cls3 = GregorianCalendar.class;
        A = new s() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.s
            public <T> TypeAdapter<T> b(Gson gson, n6.a<T> aVar) {
                Class<? super T> cls4 = aVar.rawType;
                if (cls4 == cls2 || cls4 == cls3) {
                    return typeAdapter4;
                }
                return null;
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("Factory[type=");
                sbA.append(cls2.getName());
                sbA.append("+");
                sbA.append(cls3.getName());
                sbA.append(",adapter=");
                sbA.append(typeAdapter4);
                sbA.append("]");
                return sbA.toString();
            }
        };
        B = new AnonymousClass32(Locale.class, new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // com.google.gson.TypeAdapter
            public Locale b(o6.a aVar) throws IOException {
                if (aVar.V() == o6.b.NULL) {
                    aVar.O();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.R(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar, Locale locale) throws IOException {
                Locale locale2 = locale;
                cVar.K(locale2 == null ? null : locale2.toString());
            }
        });
        final AnonymousClass29 anonymousClass29 = new AnonymousClass29();
        C = anonymousClass29;
        final Class<i> cls4 = i.class;
        D = new s() { // from class: com.google.gson.internal.bind.TypeAdapters.35
            @Override // com.google.gson.s
            public <T2> TypeAdapter<T2> b(Gson gson, n6.a<T2> aVar) {
                final Class cls5 = aVar.rawType;
                if (cls4.isAssignableFrom(cls5)) {
                    return (TypeAdapter<T2>) new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.35.1
                        @Override // com.google.gson.TypeAdapter
                        public Object b(o6.a aVar2) throws IOException {
                            Object objB = anonymousClass29.b(aVar2);
                            if (objB == null || cls5.isInstance(objB)) {
                                return objB;
                            }
                            StringBuilder sbA = defpackage.a.a("Expected a ");
                            sbA.append(cls5.getName());
                            sbA.append(" but was ");
                            sbA.append(objB.getClass().getName());
                            throw new q(sbA.toString());
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void c(o6.c cVar, Object obj) throws IOException {
                            anonymousClass29.c(cVar, obj);
                        }
                    };
                }
                return null;
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("Factory[typeHierarchy=");
                sbA.append(cls4.getName());
                sbA.append(",adapter=");
                sbA.append(anonymousClass29);
                sbA.append("]");
                return sbA.toString();
            }
        };
        E = new s() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.s
            public <T> TypeAdapter<T> b(Gson gson, n6.a<T> aVar) {
                Class<? super T> superclass = aVar.rawType;
                if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                    return null;
                }
                if (!superclass.isEnum()) {
                    superclass = superclass.getSuperclass();
                }
                return new EnumTypeAdapter(superclass);
            }
        };
    }

    public static <TT> s a(Class<TT> cls, TypeAdapter<TT> typeAdapter) {
        return new AnonymousClass32(cls, typeAdapter);
    }

    public static <TT> s b(Class<TT> cls, Class<TT> cls2, TypeAdapter<? super TT> typeAdapter) {
        return new AnonymousClass33(cls, cls2, typeAdapter);
    }
}
