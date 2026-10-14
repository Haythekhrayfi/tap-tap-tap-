package t5;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements q5.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f35685f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q5.d f35686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q5.d f35687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q5.e<Map.Entry<Object, Object>> f35688i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f35689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, q5.e<?>> f35690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, q5.g<?>> f35691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q5.e<Object> f35692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f35693e = new h(this);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35694a;

        static {
            int[] iArr = new int[d.a.values().length];
            f35694a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35694a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35694a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t5.a aVar = new t5.a();
        aVar.f35679a = 1;
        d dVarA = aVar.a();
        HashMap map = new HashMap();
        map.put(dVarA.annotationType(), dVarA);
        f35686g = new q5.d(Action.KEY_ATTRIBUTE, com.google.android.datatransport.runtime.a.a(map), null);
        t5.a aVar2 = new t5.a();
        aVar2.f35679a = 2;
        d dVarA2 = aVar2.a();
        HashMap map2 = new HashMap();
        map2.put(dVarA2.annotationType(), dVarA2);
        f35687h = new q5.d("value", com.google.android.datatransport.runtime.a.a(map2), null);
        f35688i = new q5.e() { // from class: t5.e
            @Override // q5.b
            public final void encode(Object obj, q5.f fVar) throws IOException {
                Map.Entry entry = (Map.Entry) obj;
                q5.f fVar2 = fVar;
                fVar2.a(f.f35686g, entry.getKey());
                fVar2.a(f.f35687h, entry.getValue());
            }
        };
    }

    public f(OutputStream outputStream, Map<Class<?>, q5.e<?>> map, Map<Class<?>, q5.g<?>> map2, q5.e<Object> eVar) {
        this.f35689a = outputStream;
        this.f35690b = map;
        this.f35691c = map2;
        this.f35692d = eVar;
    }

    public static ByteBuffer h(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static d j(q5.d dVar) {
        d dVar2 = (d) ((Annotation) dVar.f34780b.get(d.class));
        if (dVar2 != null) {
            return dVar2;
        }
        throw new q5.c("Field has no @Protobuf config");
    }

    public static int k(q5.d dVar) {
        d dVar2 = (d) ((Annotation) dVar.f34780b.get(d.class));
        if (dVar2 != null) {
            return ((t5.a.C0416a) dVar2).f35681a;
        }
        throw new q5.c("Field has no @Protobuf config");
    }

    @Override // q5.f
    public q5.f a(q5.d dVar, Object obj) throws IOException {
        return e(dVar, obj, true);
    }

    @Override // q5.f
    public q5.f b(q5.d dVar, int i10) throws IOException {
        f(dVar, i10, true);
        return this;
    }

    @Override // q5.f
    public q5.f c(q5.d dVar, long j10) throws IOException {
        g(dVar, j10, true);
        return this;
    }

    @Override // q5.f
    public q5.f d(q5.d dVar, boolean z10) throws IOException {
        f(dVar, z10 ? 1 : 0, true);
        return this;
    }

    public q5.f e(q5.d dVar, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            l((k(dVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f35685f);
            l(bytes.length);
            this.f35689a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                e(dVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i(f35688i, dVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (!z10 || dDoubleValue != 0.0d) {
                l((k(dVar) << 3) | 1);
                this.f35689a.write(h(8).putDouble(dDoubleValue).array());
            }
            return this;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (!z10 || fFloatValue != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                l((k(dVar) << 3) | 5);
                this.f35689a.write(h(4).putFloat(fFloatValue).array());
            }
            return this;
        }
        if (obj instanceof Number) {
            g(dVar, ((Number) obj).longValue(), z10);
            return this;
        }
        if (obj instanceof Boolean) {
            f(dVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            l((k(dVar) << 3) | 2);
            l(bArr.length);
            this.f35689a.write(bArr);
            return this;
        }
        q5.e<?> eVar = this.f35690b.get(obj.getClass());
        if (eVar != null) {
            i(eVar, dVar, obj, z10);
            return this;
        }
        q5.g<?> gVar = this.f35691c.get(obj.getClass());
        if (gVar != null) {
            h hVar = this.f35693e;
            hVar.f35702a = false;
            hVar.f35704c = dVar;
            hVar.f35703b = z10;
            gVar.encode(obj, hVar);
            return this;
        }
        if (obj instanceof c) {
            f(dVar, ((c) obj).getNumber(), true);
            return this;
        }
        if (obj instanceof Enum) {
            f(dVar, ((Enum) obj).ordinal(), true);
            return this;
        }
        i(this.f35692d, dVar, obj, z10);
        return this;
    }

    public f f(q5.d dVar, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return this;
        }
        t5.a.C0416a c0416a = (t5.a.C0416a) j(dVar);
        int i11 = a.f35694a[c0416a.f35682b.ordinal()];
        if (i11 == 1) {
            l(c0416a.f35681a << 3);
            l(i10);
        } else if (i11 == 2) {
            l(c0416a.f35681a << 3);
            l((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            l((c0416a.f35681a << 3) | 5);
            this.f35689a.write(h(4).putInt(i10).array());
        }
        return this;
    }

    public f g(q5.d dVar, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return this;
        }
        t5.a.C0416a c0416a = (t5.a.C0416a) j(dVar);
        int i10 = a.f35694a[c0416a.f35682b.ordinal()];
        if (i10 == 1) {
            l(c0416a.f35681a << 3);
            m(j10);
        } else if (i10 == 2) {
            l(c0416a.f35681a << 3);
            m((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            l((c0416a.f35681a << 3) | 1);
            this.f35689a.write(h(8).putLong(j10).array());
        }
        return this;
    }

    public final <T> f i(q5.e<T> eVar, q5.d dVar, T t10, boolean z10) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f35689a;
            this.f35689a = bVar;
            try {
                eVar.encode(t10, this);
                this.f35689a = outputStream;
                long j10 = bVar.f35683c;
                bVar.close();
                if (z10 && j10 == 0) {
                    return this;
                }
                l((k(dVar) << 3) | 2);
                m(j10);
                eVar.encode(t10, this);
                return this;
            } catch (Throwable th) {
                this.f35689a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f35689a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f35689a.write(i10 & 127);
    }

    public final void m(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f35689a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f35689a.write(((int) j10) & 127);
    }
}
