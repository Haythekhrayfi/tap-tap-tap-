package s5;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import q5.g;
import q5.h;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements q5.f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35467a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JsonWriter f35468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, q5.e<?>> f35469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, g<?>> f35470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q5.e<Object> f35471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f35472f;

    public f(Writer writer, Map<Class<?>, q5.e<?>> map, Map<Class<?>, g<?>> map2, q5.e<Object> eVar, boolean z10) {
        this.f35468b = new JsonWriter(writer);
        this.f35469c = map;
        this.f35470d = map2;
        this.f35471e = eVar;
        this.f35472f = z10;
    }

    @Override // q5.f
    public q5.f a(q5.d dVar, Object obj) throws IOException {
        return h(dVar.f34779a, obj);
    }

    @Override // q5.f
    public q5.f b(q5.d dVar, int i10) throws IOException {
        String str = dVar.f34779a;
        i();
        this.f35468b.name(str);
        i();
        this.f35468b.value(i10);
        return this;
    }

    @Override // q5.f
    public q5.f c(q5.d dVar, long j10) throws IOException {
        String str = dVar.f34779a;
        i();
        this.f35468b.name(str);
        i();
        this.f35468b.value(j10);
        return this;
    }

    @Override // q5.f
    public q5.f d(q5.d dVar, boolean z10) throws IOException {
        String str = dVar.f34779a;
        i();
        this.f35468b.name(str);
        i();
        this.f35468b.value(z10);
        return this;
    }

    @Override // q5.h
    public h e(String str) throws IOException {
        i();
        this.f35468b.value(str);
        return this;
    }

    @Override // q5.h
    public h f(boolean z10) throws IOException {
        i();
        this.f35468b.value(z10);
        return this;
    }

    public f g(Object obj, boolean z10) throws IOException {
        int i10 = 0;
        if (z10) {
            if (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number)) {
                Object[] objArr = new Object[1];
                objArr[0] = obj == null ? null : obj.getClass();
                throw new q5.c(String.format("%s cannot be encoded inline", objArr));
            }
        }
        if (obj == null) {
            this.f35468b.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f35468b.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f35468b.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    g(it.next(), false);
                }
                this.f35468b.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f35468b.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        h((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new q5.c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f35468b.endObject();
                return this;
            }
            q5.e<?> eVar = this.f35469c.get(obj.getClass());
            if (eVar != null) {
                if (!z10) {
                    this.f35468b.beginObject();
                }
                eVar.encode(obj, this);
                if (!z10) {
                    this.f35468b.endObject();
                }
                return this;
            }
            g<?> gVar = this.f35470d.get(obj.getClass());
            if (gVar != null) {
                gVar.encode(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                i();
                this.f35468b.value(strName);
                return this;
            }
            q5.e<Object> eVar2 = this.f35471e;
            if (!z10) {
                this.f35468b.beginObject();
            }
            eVar2.encode(obj, this);
            if (!z10) {
                this.f35468b.endObject();
            }
            return this;
        }
        if (obj instanceof byte[]) {
            i();
            this.f35468b.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        this.f35468b.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                this.f35468b.value(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                long j10 = jArr[i10];
                i();
                this.f35468b.value(j10);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f35468b.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f35468b.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                g(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                g(obj2, false);
            }
        }
        this.f35468b.endArray();
        return this;
    }

    public f h(String str, Object obj) throws IOException {
        if (this.f35472f) {
            if (obj == null) {
                return this;
            }
            i();
            this.f35468b.name(str);
            return g(obj, false);
        }
        i();
        this.f35468b.name(str);
        if (obj != null) {
            return g(obj, false);
        }
        this.f35468b.nullValue();
        return this;
    }

    public final void i() throws IOException {
        if (!this.f35467a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
