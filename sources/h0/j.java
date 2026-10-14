package h0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f30466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q.f<String, Typeface> f30467b;

    public static class a extends m0.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g0.f.e f30468a;

        public a(g0.f.e eVar) {
            this.f30468a = eVar;
        }

        @Override // m0.n
        public void a(int i10) {
            g0.f.e eVar = this.f30468a;
            if (eVar != null) {
                eVar.lambda$callbackFailAsync$1(i10);
            }
        }

        @Override // m0.n
        public void b(Typeface typeface) {
            g0.f.e eVar = this.f30468a;
            if (eVar != null) {
                eVar.lambda$callbackSuccessAsync$0(typeface);
            }
        }
    }

    static {
        p lVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            lVar = new o();
        } else if (i10 >= 28) {
            lVar = new n();
        } else if (i10 >= 26) {
            lVar = new m();
        } else {
            Method method = l.f30476d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            lVar = method != null ? new l() : new k();
        }
        f30466a = lVar;
        f30467b = new q.f<>(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    public static Typeface a(Context context, g0.e.b bVar, Resources resources, int i10, String str, int i11, int i12, g0.f.e eVar, Handler handler, boolean z10) {
        Typeface typefaceA;
        Typeface typefaceCreate;
        if (bVar instanceof g0.e.C0262e) {
            g0.e.C0262e c0262e = (g0.e.C0262e) bVar;
            String str2 = c0262e.f29674d;
            typefaceA = null;
            boolean z11 = false;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                if (eVar != null) {
                    eVar.callbackSuccessAsync(typefaceCreate, handler);
                }
                return typefaceCreate;
            }
            if (!z10 ? eVar == null : c0262e.f29673c == 0) {
                z11 = true;
            }
            int i13 = z10 ? c0262e.f29672b : -1;
            Handler handler2 = g0.f.e.getHandler(handler);
            a aVar = new a(eVar);
            m0.f fVar = c0262e.f29671a;
            m0.c cVar = new m0.c(aVar, handler2);
            if (z11) {
                q.f<String, Typeface> fVar2 = m0.k.f33149a;
                String str3 = fVar.f33138f + "-" + i12;
                Typeface typeface = m0.k.f33149a.get(str3);
                if (typeface != null) {
                    handler2.post(new m0.a(cVar, aVar, typeface));
                    typefaceA = typeface;
                } else if (i13 == -1) {
                    m0.k.a aVarA = m0.k.a(str3, context, fVar, i12);
                    cVar.a(aVarA);
                    typefaceA = aVarA.f33153a;
                } else {
                    try {
                        try {
                            try {
                                m0.k.a aVar2 = (m0.k.a) m0.k.f33150b.submit(new m0.g(str3, context, fVar, i12)).get(i13, TimeUnit.MILLISECONDS);
                                cVar.a(aVar2);
                                typefaceA = aVar2.f33153a;
                            } catch (ExecutionException e10) {
                                throw new RuntimeException(e10);
                            }
                        } catch (InterruptedException e11) {
                            throw e11;
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        cVar.f33124b.post(new m0.b(cVar, cVar.f33123a, -3));
                    }
                }
            } else {
                q.f<String, Typeface> fVar3 = m0.k.f33149a;
                String str4 = fVar.f33138f + "-" + i12;
                Typeface typeface2 = m0.k.f33149a.get(str4);
                if (typeface2 != null) {
                    handler2.post(new m0.a(cVar, aVar, typeface2));
                    typefaceA = typeface2;
                } else {
                    m0.h hVar = new m0.h(cVar);
                    synchronized (m0.k.f33151c) {
                        q.h<String, ArrayList<o0.a<m0.k.a>>> hVar2 = m0.k.f33152d;
                        ArrayList<o0.a<m0.k.a>> arrayList = hVar2.get(str4);
                        if (arrayList != null) {
                            arrayList.add(hVar);
                        } else {
                            ArrayList<o0.a<m0.k.a>> arrayList2 = new ArrayList<>();
                            arrayList2.add(hVar);
                            hVar2.put(str4, arrayList2);
                            ((ThreadPoolExecutor) m0.k.f33150b).execute(new m0.p(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new m0.i(str4, context, fVar, i12), new m0.j(str4)));
                        }
                    }
                }
            }
        } else {
            typefaceA = f30466a.a(context, (g0.e.c) bVar, resources, i12);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.callbackSuccessAsync(typefaceA, handler);
                } else {
                    eVar.callbackFailAsync(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f30467b.put(c(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface b(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceD = f30466a.d(context, resources, i10, str, i12);
        if (typefaceD != null) {
            f30467b.put(c(resources, i10, str, i11, i12), typefaceD);
        }
        return typefaceD;
    }

    public static String c(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + CoreConstants.DASH_CHAR + str + CoreConstants.DASH_CHAR + i11 + CoreConstants.DASH_CHAR + i10 + CoreConstants.DASH_CHAR + i12;
    }
}
