package h9;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import fd.j0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kc.w;
import kotlinx.coroutines.Deferred;
import org.json.JSONObject;
import y8.c0;
import y9.l1;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static long a(AtomicLong atomicLong, long j10) {
        long j11;
        do {
            j11 = atomicLong.get();
            if (j11 == RecyclerView.FOREVER_NS) {
                return RecyclerView.FOREVER_NS;
            }
        } while (!atomicLong.compareAndSet(j11, b(j11, j10)));
        return j11;
    }

    public static long b(long j10, long j11) {
        long j12 = j10 + j11;
        return j12 < 0 ? RecyclerView.FOREVER_NS : j12;
    }

    public static final boolean c(List<?>... listArr) {
        boolean z10;
        int length = listArr.length;
        int i10 = 0;
        do {
            z10 = true;
            if (i10 >= length) {
                return true;
            }
            List<?> list = listArr[i10];
            i10++;
            if (list != null && !list.isEmpty()) {
                z10 = false;
            }
        } while (z10);
        return false;
    }

    public static final <T> Object d(Deferred<? extends T>[] deferredArr, mc.d<? super List<? extends T>> dVar) {
        return deferredArr.length == 0 ? w.f32009c : new fd.c(deferredArr).a(dVar);
    }

    public static <T> void e(T t10, Class<T> cls) {
        if (t10 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static final Object f(Throwable th) {
        j0.i(th, "exception");
        return new jc.i.b(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int g(Activity activity) {
        j0.i(activity, "<this>");
        if (activity instanceof gb.f) {
            return ((gb.f) activity).a();
        }
        return -1;
    }

    public static final long h(l1.b bVar) {
        j0.i(bVar, "<this>");
        return -1L;
    }

    public static final <T> Class<T> i(cd.c<T> cVar) {
        j0.i(cVar, "<this>");
        Class<T> cls = (Class<T>) ((vc.d) cVar).a();
        j0.g(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    public static final <T> Class<T> j(cd.c<T> cVar) {
        j0.i(cVar, "<this>");
        Class<T> cls = (Class<T>) ((vc.d) cVar).a();
        if (!cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? cls : Double.class;
            case 104431:
                return !name.equals("int") ? cls : Integer.class;
            case 3039496:
                return !name.equals("byte") ? cls : Byte.class;
            case 3052374:
                return !name.equals("char") ? cls : Character.class;
            case 3327612:
                return !name.equals("long") ? cls : Long.class;
            case 3625364:
                return !name.equals("void") ? cls : Void.class;
            case 64711720:
                return !name.equals("boolean") ? cls : Boolean.class;
            case 97526364:
                return !name.equals("float") ? cls : Float.class;
            case 109413500:
                return !name.equals("short") ? cls : Short.class;
            default:
                return cls;
        }
    }

    public static final int k(zc.c cVar, bd.c cVar2) {
        if (cVar2.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + cVar2);
        }
        int i10 = cVar2.f3516d;
        if (i10 < Integer.MAX_VALUE) {
            return cVar.d(cVar2.f3515c, i10 + 1);
        }
        int i11 = cVar2.f3515c;
        return i11 > Integer.MIN_VALUE ? cVar.d(i11 - 1, i10) + 1 : cVar.b();
    }

    public static final Object l(JSONObject jSONObject, String str) {
        Object objOpt = jSONObject.opt(str);
        if (j0.d(objOpt, JSONObject.NULL)) {
            return null;
        }
        return objOpt;
    }

    public static long m(AtomicLong atomicLong, long j10) {
        long j11;
        long j12;
        do {
            j11 = atomicLong.get();
            if (j11 == RecyclerView.FOREVER_NS) {
                return RecyclerView.FOREVER_NS;
            }
            j12 = j11 - j10;
            if (j12 < 0) {
                dc.a.b(new IllegalStateException(androidx.viewpager2.adapter.a.a("More produced than requested: ", j12)));
                j12 = 0;
            }
        } while (!atomicLong.compareAndSet(j11, j12));
        return j12;
    }

    public static final <T> T n(JSONObject jSONObject, String str, m<T> mVar, u9.e eVar, u9.c cVar) {
        j0.i(jSONObject, "<this>");
        j0.i(str, Action.KEY_ATTRIBUTE);
        j0.i(mVar, "validator");
        j0.i(eVar, "logger");
        j0.i(cVar, "env");
        T t10 = (T) l(jSONObject, str);
        if (t10 == null) {
            throw c0.A(jSONObject, str);
        }
        if (mVar.d(t10)) {
            return t10;
        }
        throw c0.q(jSONObject, str, t10);
    }

    public static final byte[] p(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 < 0) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                j0.h(byteArray, "buffer.toByteArray()");
                return byteArray;
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static final long q(long j10) {
        if (j10 < 0) {
            return 0L;
        }
        long j11 = 100;
        if (j10 < 100) {
            j11 = 20;
        } else if (j10 >= 1000) {
            j11 = 2000;
            if (j10 < 2000) {
                j11 = 200;
            } else if (j10 < 5000) {
                j11 = 500;
            } else {
                if (j10 < AbstractComponentTracker.LINGERING_TIMEOUT) {
                    return (j10 / 1000) * 1000;
                }
                if (j10 >= 20000) {
                    if (j10 < 50000) {
                        return (j10 / 5000) * 5000;
                    }
                    return 50000L;
                }
            }
        }
        return j11 * (j10 / j11);
    }

    public static int r(int i10) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i10 - 1));
    }

    public static final void s(u9.f fVar) {
        if (fVar.f36171c != u9.g.MISSING_VALUE) {
            throw fVar;
        }
    }

    public static final void t(Object obj) {
        if (obj instanceof jc.i.b) {
            throw ((jc.i.b) obj).f31814c;
        }
    }
}
