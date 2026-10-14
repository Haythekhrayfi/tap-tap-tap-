package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class k extends e.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f1818d = new a();

    public static class a {
    }

    public static class b implements e.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f1819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m0.f f1820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f1821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f1822d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Handler f1823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Executor f1824f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f1825g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public e.h f1826h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ContentObserver f1827i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Runnable f1828j;

        public b(Context context, m0.f fVar, a aVar) {
            androidx.activity.i.f(context, "Context cannot be null");
            androidx.activity.i.f(fVar, "FontRequest cannot be null");
            this.f1819a = context.getApplicationContext();
            this.f1820b = fVar;
            this.f1821c = aVar;
        }

        @Override // androidx.emoji2.text.e.g
        public void a(e.h hVar) {
            synchronized (this.f1822d) {
                this.f1826h = hVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.f1822d) {
                this.f1826h = null;
                ContentObserver contentObserver = this.f1827i;
                if (contentObserver != null) {
                    a aVar = this.f1821c;
                    Context context = this.f1819a;
                    Objects.requireNonNull(aVar);
                    context.getContentResolver().unregisterContentObserver(contentObserver);
                    this.f1827i = null;
                }
                Handler handler = this.f1823e;
                if (handler != null) {
                    handler.removeCallbacks(this.f1828j);
                }
                this.f1823e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1825g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1824f = null;
                this.f1825g = null;
            }
        }

        public void c() {
            synchronized (this.f1822d) {
                if (this.f1826h == null) {
                    return;
                }
                if (this.f1824f == null) {
                    ThreadPoolExecutor threadPoolExecutorA = androidx.emoji2.text.b.a("emojiCompat");
                    this.f1825g = threadPoolExecutorA;
                    this.f1824f = threadPoolExecutorA;
                }
                final int i10 = 0;
                this.f1824f.execute(new Runnable(this) { // from class: androidx.emoji2.text.l

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ k.b f1830d;

                    {
                        this.f1830d = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                k.b bVar = this.f1830d;
                                synchronized (bVar.f1822d) {
                                    if (bVar.f1826h == null) {
                                        return;
                                    }
                                    try {
                                        m0.m mVarD = bVar.d();
                                        int i11 = mVarD.f33161e;
                                        if (i11 == 2) {
                                            synchronized (bVar.f1822d) {
                                            }
                                        }
                                        if (i11 != 0) {
                                            throw new RuntimeException("fetchFonts result is not OK. (" + i11 + ")");
                                        }
                                        try {
                                            int i12 = l0.j.f32096a;
                                            l0.j.a.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                            k.a aVar = bVar.f1821c;
                                            Context context = bVar.f1819a;
                                            Objects.requireNonNull(aVar);
                                            Typeface typefaceB = h0.j.f30466a.b(context, null, new m0.m[]{mVarD}, 0);
                                            ByteBuffer byteBufferD = h0.q.d(bVar.f1819a, null, mVarD.f33157a);
                                            if (byteBufferD == null || typefaceB == null) {
                                                throw new RuntimeException("Unable to open file.");
                                            }
                                            try {
                                                l0.j.a.a("EmojiCompat.MetadataRepo.create");
                                                n nVar = new n(typefaceB, m.a(byteBufferD));
                                                l0.j.a.b();
                                                l0.j.a.b();
                                                synchronized (bVar.f1822d) {
                                                    e.h hVar = bVar.f1826h;
                                                    if (hVar != null) {
                                                        hVar.b(nVar);
                                                    }
                                                    break;
                                                }
                                                bVar.b();
                                                return;
                                            } catch (Throwable th) {
                                                int i13 = l0.j.f32096a;
                                                l0.j.a.b();
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            int i14 = l0.j.f32096a;
                                            l0.j.a.b();
                                            throw th2;
                                        }
                                    } catch (Throwable th3) {
                                        synchronized (bVar.f1822d) {
                                            e.h hVar2 = bVar.f1826h;
                                            if (hVar2 != null) {
                                                hVar2.a(th3);
                                            }
                                            bVar.b();
                                            return;
                                        }
                                    }
                                    break;
                                }
                            default:
                                this.f1830d.c();
                                return;
                        }
                    }
                });
            }
        }

        public final m0.m d() {
            try {
                a aVar = this.f1821c;
                Context context = this.f1819a;
                m0.f fVar = this.f1820b;
                Objects.requireNonNull(aVar);
                m0.l lVarA = m0.e.a(context, fVar, null);
                if (lVarA.f33155a != 0) {
                    throw new RuntimeException(android.support.v4.media.b.a(defpackage.a.a("fetchFonts failed ("), lVarA.f33155a, ")"));
                }
                m0.m[] mVarArr = lVarA.f33156b;
                if (mVarArr == null || mVarArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return mVarArr[0];
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }

    public k(Context context, m0.f fVar) {
        super(new b(context, fVar, f1818d));
    }

    public k(Context context, m0.f fVar, a aVar) {
        super(new b(context, fVar, aVar));
    }
}
